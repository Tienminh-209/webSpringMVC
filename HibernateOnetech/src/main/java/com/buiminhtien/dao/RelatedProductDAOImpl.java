package com.buiminhtien.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.buiminhtien.model.Product;
import com.buiminhtien.model.Related;

@Repository
public class RelatedProductDAOImpl implements RelatedProductDAO {
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(RelatedProductDAOImpl.class);
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	@SuppressWarnings("unchecked")
	public List<Related> listProductRelated(int id_product) {
		Session session = this.sessionFactory.getCurrentSession();
		Product b = (Product) session.load(Product.class, new Integer(id_product));
	    List<Related> list_related=b.getRelated();
		for (Related p : list_related) {
			logger.info("Related List::" + p);
		}
		return list_related;
	}
}
