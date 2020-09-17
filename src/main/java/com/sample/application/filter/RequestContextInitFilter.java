package com.sample.application.filter;

import com.sample.application.context.ContextProvider;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;

@Provider
public class RequestContextInitFilter implements ContainerRequestFilter {

    @Override
    public void filter(ContainerRequestContext containerRequestContext) {
        String path = containerRequestContext.getUriInfo().getPath();
        ContextProvider.setPath(path);
    }
}
