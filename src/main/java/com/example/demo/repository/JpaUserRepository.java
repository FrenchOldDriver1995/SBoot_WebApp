package com.example.demo.repository;

import com.example.demo.business.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Transactional
public class JpaUserRepository  implements UserRepository{

    @PersistenceContext
    EntityManager em;
    @Override
    public void add(User user) {
        em.persist(user);
    }
}
