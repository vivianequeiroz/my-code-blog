package com.spring.mycodeblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableEncryptableProperties
public class MycodeblogApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycodeblogApplication.class, args);
	}

}
