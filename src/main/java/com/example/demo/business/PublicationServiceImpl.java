package com.example.demo.business;

import java.util.List;

import com.example.demo.repository.StoryRepository;

public class PublicationServiceImpl implements PublicationService {

	private StoryRepository storyRepository;
//	@Override
//	public List findAll() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	
	public PublicationServiceImpl(StoryRepository storyRepository) {
        this.storyRepository = storyRepository;
    }
	
	@Override
	public void share(Story story) {
		// TODO Auto-generated method stub
		storyRepository.save(story);
		
	}


//	@Override
//	public void save(Story story) {
//		// TODO Auto-generated method stub
//		
//	}

}
