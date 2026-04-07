package com.example.SpringSecurityApp.SpringApplication.services;


import com.example.SpringSecurityApp.SpringApplication.dto.PostDTO;

import java.util.List;

public interface PostService {

    List<PostDTO> getAllPosts();

    PostDTO createNewPost(PostDTO inputPost);

    PostDTO getPostById(Long postId);
}
