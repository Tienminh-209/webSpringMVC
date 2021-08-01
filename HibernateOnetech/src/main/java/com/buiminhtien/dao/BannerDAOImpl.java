package com.buiminhtien.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.buiminhtien.model.Banner;


	@Repository
	public class BannerDAOImpl implements BannerDAO {
		private final org.slf4j.Logger logger = LoggerFactory.getLogger(BannerDAOImpl.class);
		private SessionFactory sessionFactory;
		public void setSessionFactory(SessionFactory sf) {
			this.sessionFactory = sf;
		}
		@SuppressWarnings("unchecked")
		public List<Banner> listBannerbot() {
			Session session = this.sessionFactory.getCurrentSession();
			List<Banner> bannerbots = session.createQuery("from Banner where type = 1").list();
			for (Banner b : bannerbots) {
				logger.info("Banner List::" + b);
			}
			return bannerbots;
		}
		@SuppressWarnings("unchecked")
		public List<Banner> listBannertop() {
			Session session = this.sessionFactory.getCurrentSession();
			List<Banner> bannertops = session.createQuery("from Banner where type = 2").list();
			for (Banner b : bannertops) {
				logger.info("Banner List::" + b);
			}
			return bannertops;
		}
}
