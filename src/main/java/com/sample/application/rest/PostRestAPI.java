package com.sample.application.rest;

import com.sample.application.model.api.request.PostRequest;
import com.sample.application.model.api.response.PostResponse;
import com.sample.application.model.dao.Post;
import com.sample.application.rest.response.ResponseBuilder;

import com.sample.application.service.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Component
@Path("/post")
public class PostRestAPI {
    private static final Logger LOGGER = LoggerFactory.getLogger(PostRestAPI.class);
    private final PostService postService;

    @Autowired
    public PostRestAPI(PostService postService) {
        this.postService = postService;
    }

    @POST
    @Path("/create")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createPost(PostRequest request) {
        try {
            LOGGER.info("request is {}", request);
            Post post = this.postService.createPost(request);
            return ResponseBuilder.success(post);
        } catch (Exception ex) {
            ex.printStackTrace();
            LOGGER.error("Error while creating post", ex);
            return ResponseBuilder.error(Response.Status.INTERNAL_SERVER_ERROR, null);
        }
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getPost(@PathParam("id") Long id) {
        try {
            PostResponse post = this.postService.getPost(id);
            return ResponseBuilder.success(post);
        } catch (Exception ex) {
            ex.printStackTrace();
            LOGGER.error("Error while getting post", ex);
            return ResponseBuilder.error(Response.Status.INTERNAL_SERVER_ERROR, null);
        }
    }

}