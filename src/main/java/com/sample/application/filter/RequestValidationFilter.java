package com.sample.application.filter;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.ext.Provider;

@Provider
@PreMatching
public class RequestValidationFilter implements ContainerRequestFilter {
    @Override
    public void filter(ContainerRequestContext containerRequestContext) {

    }
}
