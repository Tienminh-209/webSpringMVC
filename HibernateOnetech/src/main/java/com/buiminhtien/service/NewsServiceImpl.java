package com.buiminhtien.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.buiminhtien.dao.NewsDAO;
import com.buiminhtien.model.News;
import com.buiminhtien.model.Product;

@Service
public class NewsServiceImpl implements NewsService {
	@Autowired
	private NewsDAO newsDAO;
	public void setNewsDAO(NewsDAO newsDAO) {
		this.newsDAO = newsDAO;
	}
	@Transactional
	public List<News> ListNews() {
		return this.newsDAO.ListNews();
	}
	@Transactional
	public News getNews(int id_news) {
		return this.newsDAO.getNews(id_news);
	}
	@Transactional
	public void addnews(News n) {
		this.newsDAO.addnews(n);
	}
	@Transactional
	public void removeNews_admin(int id_news) {
		this.newsDAO.removeNews_admin(id_news);
	}
	@Transactional
	public void updateNews(News n) {
		this.newsDAO.updateNews(n);
	}

}
