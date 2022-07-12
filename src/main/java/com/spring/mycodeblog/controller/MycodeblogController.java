package com.spring.mycodeblog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mycodeblog.entities.Post;
import com.spring.mycodeblog.services.MycodeblogService;

@RestController
public class MycodeblogController {

  @Autowired
  MycodeblogService mycodeblogService;

  @RequestMapping(value = "/posts", method = RequestMethod.GET)
  public ModelAndView getPosts() {
    ModelAndView modelAndView = new ModelAndView("posts");

    List<Post> posts = mycodeblogService.findAll();

    modelAndView.addObject("posts", posts);
    return modelAndView;
  }
}
