package com.spring.mycodeblog.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mycodeblog.entities.Post;
import com.spring.mycodeblog.repositories.MycodeblogRepository;
import com.spring.mycodeblog.services.MycodeblogService;

@Service
public class MycodeblogServiceImpl implements MycodeblogService {

  @Autowired
  MycodeblogRepository mycodeblogRepository;

  @Override
  public List<Post> findAll() {
    return mycodeblogRepository.findAll();
  }

  @Override
  public Post findById(Long id) {
    return mycodeblogRepository.findById(id).get();
  }

  @Override
  public Post save(Post post) {
    return mycodeblogRepository.save(post);
  }

}