package com.sample.application.model.dao;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Post {
    private String postText;


    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postText='" + postText + '\'' +
                '}';
    }
}
