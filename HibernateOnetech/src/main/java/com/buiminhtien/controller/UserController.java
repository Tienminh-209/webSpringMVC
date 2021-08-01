package com.buiminhtien.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.buiminhtien.model.User;
import com.buiminhtien.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	public void setUserService(UserService us) {
		this.userService = us;
	}

	@RequestMapping(value = "/dang-ki", method = RequestMethod.GET)
	public ModelAndView Register() {
		ModelAndView mv = new ModelAndView("register/register");
		mv.addObject("user", new User());
		return mv;
	}

	@RequestMapping(value = "/dang-ki", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("user") User user) 
	{
		ModelAndView mv=new ModelAndView("register/register");
		if(user.getId()==0 && userService.checkCreate(user)!=null)
		{
			this.userService.addUser(user);
			mv.addObject("status","Successful registration!!!");
		}
		return "redirect:/";
	}
	
//dang nhap 
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView Login(HttpSession session,HttpServletRequest request){
		ModelAndView mv=null;
		if(session.getAttribute("username")==null)
		{
			mv=new ModelAndView("login/login");
			mv.addObject("user",new User());
		}
		else
		{
			mv=new ModelAndView("redirect:/");
		}
		return mv;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	  public ModelAndView executeLogin(HttpSession session,HttpServletRequest request,
	            @ModelAttribute("user") User user)
	{
		ModelAndView mvi=new ModelAndView("login/login");
	    user=userService.checkAccount(user);
	    if(user!=null)
	    {
	       session.setAttribute("Login", user);
	       session.setAttribute("username", user.getUsername());
	       mvi=new ModelAndView("redirect:/");
	    }
	    else
	    {
	    	mvi.addObject("messageLogin","Đăng nhập không thành công!!!");
	    }
		return mvi;
	}
	@RequestMapping(value = "/Logout", method = RequestMethod.GET)
	public String Logout(HttpSession session,HttpServletRequest request) {
		session.removeAttribute("Login");
		session.removeAttribute("username");
		return "redirect:/";
	}
}
