package com.buiminhtien.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.buiminhtien.model.News;
import com.buiminhtien.model.Product;
import com.buiminhtien.service.NewsService;
import com.buiminhtien.service.ProductService;

@Controller
public class AdminController {
	@Autowired
	private ProductService productService;

	public void setProductService(ProductService pr) {
		this.productService = pr;
	}
	@Autowired
	private NewsService newsService;
	
	public void setNewsService(NewsService n) {
		this.newsService = n;
	}
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String Admin(Model model) {
		model.addAttribute("product", new Product());
		return "admin/admin";
	}
//Product
	@RequestMapping(value = "/admin/product", method = RequestMethod.GET)
	public String QuanlyProduct(Model model) {
		model.addAttribute("product", new Product());
		model.addAttribute("allproduct", this.productService.listProductAllproduct());
		return "admin/product/product";
	}
	@RequestMapping(value = "/admin/addproduct", method = RequestMethod.GET)
	public String Quanly_CreateAdd(Model model) {
		model.addAttribute("product", new Product());
		return "admin/product/addproduct";
	}
	@RequestMapping(value = "/admin/addproduct", method = RequestMethod.POST,produces="application/x-www-form-urlencoded;charset=UTF-8")
	public String Quanly_Add(Model model ,@ModelAttribute("product") Product p) {
		  this.productService.addProduct(p);
		  model.addAttribute("allproduct", this.productService.listProductAllproduct());
		return "admin/product/product";
	}
	
	@RequestMapping("/remove/{id}")
	public ModelAndView Quanly_Remove(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("admin/product/product");
		this.productService.removeProduct_admin(id);
		mv.addObject("allproduct", this.productService.listProductAllproduct());
		return mv;
	}
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String editProduct_Create(@PathVariable("id") int id, Model model) {
		model.addAttribute("product", this.productService.getProductById(id));
	    return "admin/product/editproduct";
	}
	@RequestMapping(value = "/editproduct", method = RequestMethod.POST)
	public String editProduct( Model model,@ModelAttribute("product") Product p) {
		  this.productService.updateProduct(p);
		  model.addAttribute("allproduct", this.productService.listProductAllproduct());
		return "admin/product/product";
	}
	//News<------------------------------------------------------------------------------->
	@RequestMapping(value = "/admin/news", method = RequestMethod.GET)
	public String Quanly_News(Model model) {
		model.addAttribute("news", new News());
		model.addAttribute("allnews", this.newsService.ListNews());
		return "admin/news/news";
	}
	@RequestMapping(value = "/admin/addnews", method = RequestMethod.GET)
	public String Quanly_CreateAdd_News(Model model) {
		model.addAttribute("news", new News());
		return "admin/news/addnews";
	}
	@RequestMapping(value = "/admin/addnews", method = RequestMethod.POST,produces="application/x-www-form-urlencoded;charset=UTF-8")
	public String Quanly_Add_News(Model model ,@ModelAttribute("news") News n) {
		  this.newsService.addnews(n);
		  model.addAttribute("news", new News());
		  model.addAttribute("allnews", this.newsService.ListNews());
			return "admin/news/news";
	}

	@RequestMapping("/remove_news/{id_news}")
	public ModelAndView Quanly_Remove_News(@PathVariable("id_news") int id_news) {
		ModelAndView mv1 = new ModelAndView("admin/news/news");
		this.newsService.removeNews_admin(id_news);
		mv1.addObject("allnews", this.newsService.ListNews());
		return mv1;
	}
	@RequestMapping(value = "/edit_news/{id_news}", method = RequestMethod.GET)
	public String editProduct_Create_News(@PathVariable("id_news") int id_news, Model model) {
		model.addAttribute("news", this.newsService.getNews(id_news));
	    return "admin/news/editnews";
	}
	@RequestMapping(value = "/editnews", method = RequestMethod.POST)
	public String editProduct_News( Model model,@ModelAttribute("news") News n) {
		  this.newsService.updateNews(n);
		  model.addAttribute("allnews", this.newsService.ListNews());
		  return "admin/news/news";
	}
	
}
