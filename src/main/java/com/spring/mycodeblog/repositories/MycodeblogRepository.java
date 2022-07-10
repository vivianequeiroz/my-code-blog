package com.spring.mycodeblog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.mycodeblog.entities.Post;

public interface MycodeblogRepository extends JpaRepository<Post, Long> {

}
