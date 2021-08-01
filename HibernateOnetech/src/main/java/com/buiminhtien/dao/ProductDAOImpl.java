package com.buiminhtien.dao;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import com.buiminhtien.model.Product;
@Repository
public class ProductDAOImpl implements ProductDAO {
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ProductDAOImpl.class);
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	@SuppressWarnings("unchecked")
	public List<Product> listProductsdealsofweek() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Product> producthotdeals = session.createQuery("from Product P where P.hot_deal = true").list();
		for (Product p : producthotdeals) {
			logger.info("Products List::" + p);
		}
		return producthotdeals;
	}
	@SuppressWarnings("unchecked")
	public List<Product> listProductHotNewArrivals() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Product> producthotnewarrivals = session.createQuery("from Product P where P.hot_new = true").list();
		for (Product p : producthotnewarrivals) {
			logger.info("Products List::" + p);
		}
		return producthotnewarrivals;
	}
	@SuppressWarnings("unchecked")
	public List<Product> listProductHotNewArrivalsCover() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Product> producthotnewarrivalscover = session.createQuery("from Product P where P.cover = true and P.hot_deal=true").list();
		for (Product p : producthotnewarrivalscover) {
			logger.info("Products List::" + p);
		}
		return producthotnewarrivalscover;
	}
	@SuppressWarnings("unchecked")
	public List<Product> listProductAdvert() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Product> productadvert = session.createQuery("from Product P where P.hot_best = true").list();
		for (Product p : productadvert) {
			logger.info("Products List::" + p);
		}
		return productadvert;
	}
	@SuppressWarnings("unchecked")
	public List<Product> listProductBestseller() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Product> productbestseller = session.createQuery("from Product P where P.trend = true").list();
		for (Product p : productbestseller) {
			logger.info("Products List::" + p);
		}
		return productbestseller;
	}
	@SuppressWarnings("unchecked")
	public List<Product> listProductTrends() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Product> producttrends = session.createQuery("from Product P where P.latest_review = true").list();
		for (Product p : producttrends) {
			logger.info("Products List::" + p);
		}
		return producttrends;
	}
	@SuppressWarnings("unchecked")
	public List<Product> listProductViews() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Product> productviews = session.createQuery("from Product P where P.cover = true and hot_new=true ").list();
		for (Product p : productviews) {
			logger.info("Products List::" + p);
		}
		return productviews;
	}
	@SuppressWarnings("unchecked")
	public List<Product> listProductsFeaturesOfweeks() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Product> productfeatureofweeks = session.createQuery("from Product P where hot_deal=true and hot_best=true ").list();
		for (Product p : productfeatureofweeks) {
			logger.info("Products List::" + p);
		}
		return productfeatureofweeks;
	}
	@SuppressWarnings("unchecked")
	public List<Product> listProductReviews() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Product> productreviews = session.createQuery("from Product P where latest_review=true and id_category=5 ").list();
		for (Product p : productreviews) {
			logger.info("Products List::" + p);
		}
		return productreviews;
	}
	@SuppressWarnings("unchecked")
	public List<Product> listProductBrands(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Product b = (Product) session.load(Product.class, new Integer(id));
		List<Product> productreviews = session.createQuery("from Product where brand='"+b.getBrand()+"'and id<>'"+b.getId()+"'").list();
		for (Product p : productreviews) {
			logger.info("Products List::" + p);
		}
		return productreviews;
	}
	@SuppressWarnings("unchecked")
	public Product getProduct(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Product p = (Product) session.load(Product.class, new Integer(id));
		logger.info("Product loaded successfully, Product details=" + p);
		return p;
	}
	@SuppressWarnings("unchecked")
	public List<Product> listProductAllproduct() {
		Session session = this.sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Product> productallproduct = session.createQuery("from Product").list();
		for (Product p : productallproduct) {
			logger.info("Products List::" + p);
		}
		return productallproduct;
	}
	@SuppressWarnings("unchecked")
	public void removeProduct_admin(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Product p = (Product) session.load(Product.class, new Integer(id));
		if (null != p) {
			session.delete(p);
		}
		logger.info("Phone deleted successfully, product details=" + p);
	}
	@SuppressWarnings("unchecked")
	public void addProduct(Product p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Product saved successfully, Product Details=" + p);
		
	}
	@SuppressWarnings("unchecked")
	public Product getProductById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Product p = (Product) session.load(Product.class, new Integer(id));
		logger.info("Product loaded successfully, Product details=" + p);
		return p;
	}

	public void updateProduct(Product p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Product updated successfully, Product Details=" + p);
		
	}
}
