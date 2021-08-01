package com.buiminhtien.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.buiminhtien.model.Cart;
import com.buiminhtien.service.CartService;
@Controller
public class CartController {
	@Autowired
	private CartService cartService;
	public void setCartService(CartService cart) {
		this.cartService = cart;
	}
	@RequestMapping(value = "/cart", method = RequestMethod.GET)
	public String CartShoping(Model model) {
	  
		return "shopingcart/cart";
	}
	@RequestMapping(value = "AddCart/{id}", method = RequestMethod.GET)
	public String AddCart(HttpServletRequest request,HttpSession session,@PathVariable int id) {
		HashMap<Integer,Cart> cart=(HashMap<Integer,Cart>)session.getAttribute("CART");
		if(cart==null) {
			cart=new HashMap<Integer,Cart>();
		}
		cart = cartService.AddCart( id, cart);
		session.setAttribute("CART", cart);
		session.setAttribute("Total_Quanty_Cart",cartService.TotalQuanty(cart));
		session.setAttribute("Total_Price_Cart", cartService.TotalPrice(cart));
		return "redirect:"+request.getHeader("Referer");
	}
	@RequestMapping(value = "DeleteCart/{id}", method = RequestMethod.GET)
	public String DeleteCart(HttpServletRequest request,HttpSession session,@PathVariable int id) {
		HashMap<Integer,Cart> cart=(HashMap<Integer,Cart>)session.getAttribute("CART");
		if(cart==null) {
			cart=new HashMap<Integer,Cart>();
		}
		cart = cartService.DeleteCart( id, cart);
		session.setAttribute("CART", cart);
		session.setAttribute("Total_Quanty_Cart",cartService.TotalQuanty(cart));
		session.setAttribute("Total_Price_Cart", cartService.TotalPrice(cart));
		return "redirect:"+request.getHeader("Referer");
	}
	@RequestMapping(value = "EditCart/{id}/{quanty}", method = RequestMethod.GET)
	public String EditCart(HttpServletRequest request,HttpSession session,@PathVariable int id,@PathVariable int quanty) {
		HashMap<Integer,Cart> cart=(HashMap<Integer,Cart>)session.getAttribute("CART");
		if(cart==null) {
			cart=new HashMap<Integer,Cart>();
		}
		cart = cartService.EditCart( id,quanty, cart);
		session.setAttribute("CART", cart);
		session.setAttribute("Total_Quanty_Cart",cartService.TotalQuanty(cart));
		session.setAttribute("Total_Price_Cart", cartService.TotalPrice(cart));
		return "redirect:"+request.getHeader("Referer");
	}
//	@RequestMapping(value = "AddCartMull/{id}", method = RequestMethod.GET)
//	public String AddCartMull(HttpServletRequest request,HttpSession session,@PathVariable int id) {
//		HashMap<Integer,Cart> cart=(HashMap<Integer,Cart>)session.getAttribute("CART");
//		if(cart==null) {
//			cart=new HashMap<Integer,Cart>();
//		}
//		cart = cartService.AddCart( id, cart);
//		session.setAttribute("CART", cart);
//		session.setAttribute("Total_Quanty_Cart",cartService.TotalQuanty(cart));
//		session.setAttribute("Total_Price_Cart", cartService.TotalPrice(cart));
//		return "redirect:"+request.getHeader("Referer");
//	}
}
