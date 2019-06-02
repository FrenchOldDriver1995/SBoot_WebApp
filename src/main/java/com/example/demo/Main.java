package com.example.demo;

import com.example.demo.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.repository.StoryRepository;


public class Main {
	public void testDansLeCours() {
		ApplicationContext context = SpringApplication.run(AppConfig.class);
		StoryRepository storyRepository = context.getBean(StoryRepository.class);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
