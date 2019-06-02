package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.business.PublicationService;
import com.example.demo.business.PublicationServiceImpl;
import com.example.demo.repository.InMemoryStoryRepository;
import com.example.demo.repository.StoryRepository;


public class MyObjectFactory {
	
	private Map<Class, Object> map = new HashMap<>();
	
	public MyObjectFactory() {
		InMemoryStoryRepository storyRepository = new InMemoryStoryRepository();
		map.put(StoryRepository.class, new InMemoryStoryRepository());
		map.put(PublicationService.class, new PublicationServiceImpl(storyRepository));
	}
	public <T> T getByType(Class<T> classZ) {
		return (T) map.get(classZ);
	}

}
