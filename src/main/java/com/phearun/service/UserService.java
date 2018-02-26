package com.phearun.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phearun.model.User;

@Service
@Transactional
public class UserService {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<User> getUsers() {
		Criteria criteria = sessionFactory.openSession().createCriteria(User.class);
		return criteria.list();
	}
	
	
	public void save(User user){
		sessionFactory.openSession().save(user);
	}
	
	
	
}
