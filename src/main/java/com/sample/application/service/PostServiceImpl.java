package com.sample.application.service;

import com.sample.application.model.api.request.PostRequest;
import com.sample.application.model.api.response.PostResponse;
import com.sample.application.model.dao.Post;

public class PostServiceImpl implements PostService {
    @Override
    public Post createPost(PostRequest req) {
        Post p = new Post();
        p.setPostText(req.getPostText());
        return p;
    }

    @Override
    public PostResponse getPost(Long id) {
        PostResponse postResponse = new PostResponse();
        postResponse.setText("this is sample post");
        return postResponse;
    }
}
