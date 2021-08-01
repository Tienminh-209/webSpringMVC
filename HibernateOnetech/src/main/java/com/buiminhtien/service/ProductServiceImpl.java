package com.buiminhtien.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.buiminhtien.dao.ProductDAO;
import com.buiminhtien.model.Product;
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDAO productDAO;
	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}
	@Transactional
	public List<Product> listProductsdealsofweek() {
		return this.productDAO.listProductsdealsofweek();
	}
	@Transactional
	public List<Product> listProductHotNewArrivals() {
		return this.productDAO.listProductHotNewArrivals();
}
	@Transactional
	public List<Product> listProductHotNewArrivalsCover() {
		return this.productDAO.listProductHotNewArrivalsCover();
}
	@Transactional
	public List<Product> listProductAdvert() {
		return this.productDAO.listProductAdvert();
}

	@Transactional
	public List<Product> listProductBestseller() {
		return this.productDAO.listProductBestseller();
}
	@Transactional
	public List<Product> listProductTrends() {
		return this.productDAO.listProductTrends();
}	
	@Transactional
	public List<Product> listProductViews() {
		return this.productDAO.listProductViews();
}	
	@Transactional
	public List<Product> listProductsFeaturesOfweeks() {
		return this.productDAO.listProductViews();
}	
	
	@Transactional
	public List<Product> listProductReviews() {
		return this.productDAO.listProductReviews();
}	
	@Transactional
	public List<Product> listProductAllproduct() {
		return this.productDAO.listProductAllproduct();
}	
	@Transactional
	public Product getProduct(int id) {
		return this.productDAO.getProduct(id);
	}
	@Transactional
	public void removeProduct_admin(int id) {
		this.productDAO.removeProduct_admin(id);
	}
	@Transactional
	public void addProduct(Product p) {
		this.productDAO.addProduct(p);
	}
	@Transactional
	public Product getProductById(int id) {
		return this.productDAO.getProductById(id);
	}
	@Transactional
	public void updateProduct(Product p) {
		this.productDAO.updateProduct(p);
	}
	

}
