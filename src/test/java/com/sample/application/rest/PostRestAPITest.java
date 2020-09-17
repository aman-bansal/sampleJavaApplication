package com.sample.application.rest;

import com.sample.application.BaseTest;
import com.sample.application.model.api.request.PostRequest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.core.Response;

public class PostRestAPITest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger(PostRestAPITest.class);
    @Autowired
    private PostRestAPI postRestAPI;

    @Test
    public void testCreate() {
        PostRequest req = new PostRequest();
        Response post = postRestAPI.createPost(req);
        logger.info("response is {}", post.getEntity());
    }

    @Test
    public void testGet() {
        Response post = postRestAPI.getPost(898447987856900096L);
        logger.info("response is {}", post.getEntity());
    }
}
