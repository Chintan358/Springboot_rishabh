package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void addorUpdateUser(User u) {
		
		Session s  = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();
		s.saveOrUpdate(u);
		tx.commit();

	}

	@Override
	public List<User> viewAllUser() {
		
		Session s  = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();
		return s.createQuery("from User").list();
	}

	@Override
	public User userById(int id) {
		
		Session s  = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();
		return s.load(User.class, id);
	}

	@Override
	public void deleteUser(int id) {
		
		Session s  = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();
		User u =  s.load(User.class, id);
		s.delete(u);
		tx.commit();
	}

}
