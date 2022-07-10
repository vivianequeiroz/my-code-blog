package com.spring.mycodeblog.services;

import java.util.List;

import com.spring.mycodeblog.entities.Post;

public interface MycodeblogService {

  List<Post> findAll();

  Post findById(Long id);

  Post save(Post post);

}
