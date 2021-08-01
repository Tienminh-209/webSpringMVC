package com.buiminhtien.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import com.buiminhtien.model.User;

@Repository
public class UsersDaoImpl implements UsersDao{
	private static final Logger logger = LoggerFactory.getLogger(UsersDaoImpl.class);
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	public void addUser(User user) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(user);
		logger.info("User saved successfully, User Details=" + user);
	}
	
	public void updateUser(User user) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(user);
		logger.info("User updated successfully, User Details=" + user);
	}
	@SuppressWarnings("unchecked")

	public List<User> listUser() {
		Session session = this.sessionFactory.getCurrentSession();
		List<User> UserList = session.createQuery("from User").list();
		for (User user : UserList) {
			logger.info("User List::" + user);
		}
		return UserList;
	}

	public User getUserById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		User user = (User) session.load(User.class, new Integer(id));
		logger.info("Users loaded successfully, User details=" + user);
		return user;
	}

	@SuppressWarnings("unchecked")
	public User getUser(User user) {
		Session session=null;
		try
		{
			session=sessionFactory.openSession();
			List<User>getuser=new ArrayList<User>();
			//
			getuser=session.createQuery("from User where username=?").setParameter(0,user.getUsername()).list();
			if(getuser.size()>0)
			{
				return getuser.get(0);
			}
		}catch(HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public User getUserbyUsername(String username) {
		Session session=null;
		try
		{
			session=sessionFactory.openSession();
			List<User>user=new ArrayList<User>();
			user=session.createQuery("from User where username=?").setParameter(0, username).list();
			if(user.size()>0)
			{
				return user.get(0);
			}
		}catch(HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void removeUser(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		User user = (User) session.load(User.class, new Integer(id));
		if (null != user) {
			session.delete(user);
		}
		logger.info("User deleted successfully, phone details=" + user);
		
	}

}
