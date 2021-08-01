package com.buiminhtien.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import com.buiminhtien.model.News;

@Repository
public class NewsDAOImpl implements NewsDAO{
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(NewsDAOImpl.class);
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	@SuppressWarnings("unchecked")
	public List<News> ListNews() {
		Session session = this.sessionFactory.getCurrentSession();
		List<News> allnews = session.createQuery("from News").list();
		for (News n : allnews) {
			logger.info("News List::" + n);
		}
		return allnews;
}
	@SuppressWarnings("unchecked")
	public News getNews(int id_news) {
		Session session = this.sessionFactory.getCurrentSession();
		News n = (News) session.load(News.class, new Integer(id_news));
		logger.info("Product loaded successfully, Product details=" + n);
		return n;
	}
	@SuppressWarnings("unchecked")
	public void addnews(News n) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(n);
		logger.info("News saved successfully, Product Details=" + n);
		
	}
	public void removeNews_admin(int id_news) {
		Session session = this.sessionFactory.getCurrentSession();
		News n = (News) session.load(News.class, new Integer(id_news));
		if (null != n) {
			session.delete(n);
		}
		logger.info("News deleted successfully, product details=" + n);
	}
	public void updateNews(News n) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(n);
		logger.info("News updated successfully, Product Details=" + n);
		
	}
}
