package com.buiminhtien.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "NEWS")
public class News {
		@Id
		@Column(name = "id_news")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	    protected int id_news;
		@Column(name = "name_news")
	    protected String name_news;
		@Column(name = "description_news")
	    protected String description_news;
		@Column(name = "images_news")
	    protected String images_news;
		 public News() {  }
		    public News(int id_news, String name_news, String description_news,String images_news ) {
		        this.id_news = id_news;
		        this.name_news = name_news;
		        this.description_news = description_news;
		        this.images_news = images_news;
		    }
			public int getId_news() {
				return id_news;
			}
			public void setId_news(int id_news) {
				this.id_news = id_news;
			}
			public String getName_news() {
				return name_news;
			}
			public void setName_news(String name_news) {
				this.name_news = name_news;
			}
			public String getDescription_news() {
				return description_news;
			}
			public void setDescription_news(String description_news) {
				this.description_news = description_news;
			}
			public String getImages_news() {
				return images_news;
			}
			public void setImages_news(String images_news) {
				this.images_news = images_news;
			}
			
		    
}

