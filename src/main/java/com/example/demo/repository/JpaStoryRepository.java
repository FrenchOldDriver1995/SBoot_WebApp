package com.example.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.example.demo.business.Story;

@Transactional
public class JpaStoryRepository implements StoryRepository{

	@PersistenceContext
	//EntityManager entityManager;
	EntityManager em;
	
	
	@Override
	public List<Story> findAll() {
		Query query = em.createQuery("SELECT s FROM Story s");

		return query.getResultList();
	}

	@Override
	public void save(Story story) {
		// TODO Auto-generated method stub
		em.persist(story);
		
	}
	
	
	
	
}
