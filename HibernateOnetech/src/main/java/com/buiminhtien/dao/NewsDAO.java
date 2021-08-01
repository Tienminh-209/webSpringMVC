package com.buiminhtien.dao;

import java.util.List;

import com.buiminhtien.model.News;

public interface NewsDAO {
	public List<News> ListNews();

	public News getNews(int id_news);

	public void addnews(News n);

	public void removeNews_admin(int id_news);

	public void updateNews(News n);

}
