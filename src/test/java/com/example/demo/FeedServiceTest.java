package com.example.demo;


import org.junit.Test;

import com.example.demo.business.FeedService;
import com.example.demo.business.FeedServiceImpl;
import com.example.demo.business.Story;
import com.example.demo.repository.InMemoryStoryRepository;
import com.example.demo.repository.StoryRepository;

import java.util.List;

import org.junit.Assert;
import static java.util.Arrays.asList;
public class FeedServiceTest {
	@Test
	public void should_fetch_user_feed() {
		//Given
		StoryRepository storyRepository=new InMemoryStoryRepository();
		FeedService feedService = new FeedServiceImpl(storyRepository);
		Story story1 = new Story("hello PSG");
		Story story2 = new Story("hello Marseille");
		storyRepository.save(story1);
		storyRepository.save(story2);
		//when
		List stories = feedService.fetchAll();
		
		//then
		Assert.assertEquals(2, stories.size());
		Assert.assertEquals(asList(story1,story2), stories);
	}
	
}
