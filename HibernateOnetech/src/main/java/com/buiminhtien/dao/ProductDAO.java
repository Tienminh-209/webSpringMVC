package com.buiminhtien.dao;

import java.util.List;
import com.buiminhtien.model.Product;


public interface ProductDAO {
	public List<Product> listProductsdealsofweek();
	public List<Product> listProductHotNewArrivals();
	public List<Product> listProductHotNewArrivalsCover();
	public List<Product> listProductAdvert();
	public List<Product> listProductBestseller();
	public List<Product> listProductTrends();
	public List<Product> listProductViews();
	public List<Product> listProductsFeaturesOfweeks();
	public List<Product> listProductReviews();
	public List<Product> listProductAllproduct();
	public Product getProduct(int id);
	public void removeProduct_admin(int id);
	public void addProduct(Product p);
	public Product getProductById(int id);
	public void updateProduct(Product p);

}
