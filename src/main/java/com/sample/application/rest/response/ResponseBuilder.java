package com.sample.application.rest.response;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

public class ResponseBuilder {
    public static Response success(Object entity) {
        try {
            String resp = new ObjectMapper().writeValueAsString(entity);
            return Response.status(Status.OK).entity(resp).build();
        } catch (JsonProcessingException ex) {
            return Response.status(Status.INTERNAL_SERVER_ERROR).entity(null).build();
        }
    }

    public static Response error(Status status, Object entity) {
        try {
            String resp = new ObjectMapper().writeValueAsString(entity);
            return Response.status(status).entity(resp).build();
        } catch (JsonProcessingException ex) {
            return Response.status(Status.INTERNAL_SERVER_ERROR).entity(null).build();
        }
    }
}
