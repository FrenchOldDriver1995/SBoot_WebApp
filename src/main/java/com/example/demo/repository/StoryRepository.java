package com.example.demo.repository;

import java.util.List;

import com.example.demo.business.Story;

public interface StoryRepository {

	List<Story> findAll();
	void save(Story story);

}
