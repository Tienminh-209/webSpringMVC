package com.buiminhtien.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.buiminhtien.model.News;
import com.buiminhtien.service.NewsService;
@Controller
public class NewsController {
	@Autowired
	private NewsService newsService;
	public void setNewsService(NewsService n) {
		this.newsService = n;
	}
	@RequestMapping(value = "/news", method = RequestMethod.GET)
	public String News(Model model) {
		model.addAttribute("news", new News());
		model.addAttribute("allnews", this.newsService.ListNews());
		return "news/new";
	}
	@RequestMapping(value = "/detail/{id_news}", method = RequestMethod.GET)
	public String NewsDetail(@PathVariable("id_news") int id_news, Model model) {
		//product
		model.addAttribute("news", new News());
		model.addAttribute("news", this.newsService.getNews(id_news));
		return "news/news_detail";
	}
	
}
