package com.buiminhtien.service;

import java.util.List;

import com.buiminhtien.model.News;

public interface NewsService {
	
    public List<News> ListNews();
	public News getNews(int id_news);
	public void addnews(News n);
	public void removeNews_admin(int id_news);
	public void updateNews(News n);
	  
}
