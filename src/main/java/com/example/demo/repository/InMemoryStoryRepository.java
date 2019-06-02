package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.business.Story;

public class InMemoryStoryRepository implements StoryRepository{
	private List<Story> stories = new ArrayList<>();

	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return stories;
	}
	
	public void save(Story story) {
		stories.add(story);
	}
}
