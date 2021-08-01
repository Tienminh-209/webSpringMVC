package com.buiminhtien.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.buiminhtien.model.Banner;
import com.buiminhtien.model.Category;
import com.buiminhtien.model.Product;
import com.buiminhtien.service.BannerService;
import com.buiminhtien.service.CategoryService;
import com.buiminhtien.service.ProductService;
import com.buiminhtien.service.RelatedProductService;

@Controller
public class HomeController { 
	@Autowired
	private RelatedProductService relatedproductService;
	public void setRelatedProductService(RelatedProductService related) {
		this.relatedproductService = related;
	}
	
	@Autowired
	private ProductService productService;
	public void setProductService(ProductService pr) {
		this.productService = pr;
	}
	@Autowired
	private BannerService bannerService;
	public void setBannerService(BannerService bn) {
		this.bannerService = bn;
	}
	@Autowired
	private CategoryService categoryService;
	public void setCategoryService(CategoryService c) {
		this.categoryService = c;
	}
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String Productsdealsofweek(Model model) {
		//product
		model.addAttribute("product", new Product());
		model.addAttribute("dealsOfWeek", this.productService.listProductsdealsofweek());
		model.addAttribute("featuresOfWeek", this.productService.listProductsFeaturesOfweeks());
		model.addAttribute("newarrivals", this.productService.listProductHotNewArrivals());
		model.addAttribute("newarrivalscover", this.productService.listProductHotNewArrivalsCover());
		model.addAttribute("adv", this.productService.listProductAdvert());
		model.addAttribute("bestseller", this.productService.listProductBestseller());
		model.addAttribute("trend", this.productService.listProductTrends());
		model.addAttribute("viewed", this.productService.listProductViews());
		model.addAttribute("review", this.productService.listProductReviews());
		
		//Banner
		model.addAttribute("banner", new Banner());
		model.addAttribute("bannerbot", this.bannerService.listBannerbot());
		model.addAttribute("bannertop", this.bannerService.listBannertop());
		//Category
		model.addAttribute("category", new Category());
		model.addAttribute("categories", this.categoryService.listCategory());
		//product details
		
		return "home/home";
	}
	//PRODUCT DETAILS
			@RequestMapping(value = "/{id}", method = RequestMethod.GET)
			public String ProductRelated(@PathVariable("id") int id, Model model) {
				//product
				model.addAttribute("product", new Product());
				model.addAttribute("dealsOfWeek", this.productService.listProductsdealsofweek());
				model.addAttribute("featuresOfWeek", this.productService.listProductsFeaturesOfweeks());
				model.addAttribute("newarrivals", this.productService.listProductHotNewArrivals());
				model.addAttribute("newarrivalscover", this.productService.listProductHotNewArrivalsCover());
				model.addAttribute("adv", this.productService.listProductAdvert());
				model.addAttribute("bestseller", this.productService.listProductBestseller());
				model.addAttribute("trend", this.productService.listProductTrends());
				model.addAttribute("viewed", this.productService.listProductViews());
				model.addAttribute("review", this.productService.listProductReviews());
				model.addAttribute("allproduct", this.productService.listProductAllproduct());
				//related product
				model.addAttribute("product_related", this.relatedproductService.listProductRelated(id));
				
				//product details
				model.addAttribute("product", this.productService.getProduct(id));
				return "product/product";
			}
	
}

