package com.sample.application.model.api.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PostRequest {
    private String postText;


    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    @Override
    public String toString() {
        return "PostRequest{" +
                "postText='" + postText + '\'' +
                '}';
    }
}
