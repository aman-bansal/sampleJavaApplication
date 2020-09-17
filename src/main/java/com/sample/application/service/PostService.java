package com.sample.application.service;

import com.sample.application.model.api.request.PostRequest;
import com.sample.application.model.api.response.PostResponse;
import com.sample.application.model.dao.Post;

public interface PostService {
    Post createPost(PostRequest req);
    PostResponse getPost(Long id);
}
