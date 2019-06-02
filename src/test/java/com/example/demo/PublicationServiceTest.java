package com.example.demo;

import java.util.Arrays;
import java.util.List;

import com.example.demo.config.AppConfig;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

import com.example.demo.business.PublicationService;
import com.example.demo.business.PublicationServiceImpl;
import com.example.demo.business.Story;
import com.example.demo.repository.InMemoryStoryRepository;
import com.example.demo.repository.StoryRepository;

import org.springframework.boot.SpringApplication;



import org.junit.Assert;


public class PublicationServiceTest {
	
	MyObjectFactory myObjectFactory = new MyObjectFactory();
	@Test
	public void should_save_story() {
		
		
		//Given
		StoryRepository storyRepository=new InMemoryStoryRepository();
		PublicationService publicationService = new PublicationServiceImpl(storyRepository);
		Story story1 = new Story("hello PSG");
		Story story2 = new Story("hello Marseille");
		//when
		publicationService.share(story1);
		publicationService.share(story2);
		//then
		List stories = storyRepository.findAll();
//		stories.add(story1);
//		stories.add(story2);
		Assert.assertEquals(2, stories.size());
		Assert.assertEquals(Arrays.asList(story1,story2), stories);
		
		
	}
	@Test
	@Ignore
	public void should_save_story2() {
		ApplicationContext context = SpringApplication.run(AppConfig.class);
		//Given
		StoryRepository storyRepository = context.getBean(StoryRepository.class);
		PublicationService publicationService = context.getBean(PublicationService.class);

		Story story1 = new Story("hello PSG");
		Story story2 = new Story("hello Marseille");
		//when
		publicationService.share(story1);
		publicationService.share(story2);
		//then
		List stories = storyRepository.findAll();
		Assert.assertEquals(2, stories.size());
		Assert.assertEquals(Arrays.asList(story1,story2), stories);

	}


}
