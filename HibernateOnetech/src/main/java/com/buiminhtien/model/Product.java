package com.buiminhtien.model;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.CascadeType;

@Entity
@Table(name = "PRODUCTS")
public class Product {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;
	@Column(name = "title")
    protected String title;
	@Column(name = "description")
    protected String description;
	@Column(name = "price")
    protected double price;
	@Column(name = "price_net")
    protected double price_net; 
	@Column(name = "brand")
    protected String brand;
	@Column(name = "available")
    protected int available;
	@Column(name = "sold")
    protected int sold;
	@Column(name = "deal_timer")
    protected Timestamp deal_timer;
	@Column(name = "discount")
    protected int discount;
	@Column(name = "image")
    protected String image;
	@Column(name = "cover")
    protected boolean cover;
	@Column(name = "hot_deal")
    protected boolean hot_deal;
	@Column(name = "hot_new")
    protected boolean hot_new;
	@Column(name = "hot_best")
    protected boolean hot_best;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + available;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + (cover ? 1231 : 1237);
		result = prime * result + ((deal_timer == null) ? 0 : deal_timer.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + discount;
		result = prime * result + (hot_best ? 1231 : 1237);
		result = prime * result + (hot_deal ? 1231 : 1237);
		result = prime * result + (hot_new ? 1231 : 1237);
		result = prime * result + id;
		result = prime * result + id_category;
		result = prime * result + ((image == null) ? 0 : image.hashCode());
		result = prime * result + (latest_review ? 1231 : 1237);
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(price_net);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + sold;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + (trend ? 1231 : 1237);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (available != other.available)
			return false;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (cover != other.cover)
			return false;
		if (deal_timer == null) {
			if (other.deal_timer != null)
				return false;
		} else if (!deal_timer.equals(other.deal_timer))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (discount != other.discount)
			return false;
		if (hot_best != other.hot_best)
			return false;
		if (hot_deal != other.hot_deal)
			return false;
		if (hot_new != other.hot_new)
			return false;
		if (id != other.id)
			return false;
		if (id_category != other.id_category)
			return false;
		if (image == null) {
			if (other.image != null)
				return false;
		} else if (!image.equals(other.image))
			return false;
		if (latest_review != other.latest_review)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (Double.doubleToLongBits(price_net) != Double.doubleToLongBits(other.price_net))
			return false;
		if (sold != other.sold)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (trend != other.trend)
			return false;
		return true;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice_net() {
		return price_net;
	}
	public void setPrice_net(double price_net) {
		this.price_net = price_net;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
	}
	public int getSold() {
		return sold;
	}
	public void setSold(int sold) {
		this.sold = sold;
	}
	public Timestamp getDeal_timer() {
		return deal_timer;
	}
	public void setDeal_timer(Timestamp deal_timer) {
		this.deal_timer = deal_timer;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public boolean isCover() {
		return cover;
	}
	public void setCover(boolean cover) {
		this.cover = cover;
	}
	public boolean isHot_deal() {
		return hot_deal;
	}
	public void setHot_deal(boolean hot_deal) {
		this.hot_deal = hot_deal;
	}
	public boolean isHot_new() {
		return hot_new;
	}
	public void setHot_new(boolean hot_new) {
		this.hot_new = hot_new;
	}
	public boolean isHot_best() {
		return hot_best;
	}
	public void setHot_best(boolean hot_best) {
		this.hot_best = hot_best;
	}
	public boolean isTrend() {
		return trend;
	}
	public void setTrend(boolean trend) {
		this.trend = trend;
	}
	public boolean isLatest_review() {
		return latest_review;
	}
	public void setLatest_review(boolean latest_review) {
		this.latest_review = latest_review;
	}
	public int getId_category() {
		return id_category;
	}
	public void setId_category(int id_category) {
		this.id_category = id_category;
	}
	@Column(name = "trend")
    protected boolean trend;
	@Column(name = "latest_review")
    protected boolean latest_review;
	@Column(name = "id_category")
    protected int id_category; 
	
    public Product() {  }
  ct_  @OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="id_product")
	private List<Related> produrelated;
	public List<Related>getRelated( ){
		return product_related;
	}
	public void setRelated(List<Related> product_related){
		this.product_related=product_related;
	}
		
    public Product(int id, String title, String description, double price,int discount,String brand, String image, boolean hot_deal, boolean hot_new,boolean hot_best,boolean trend,boolean latest_review,int id_category) {
    this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.discount = discount;        
        this.image= image;
        this.id_category = id_category;
        this.hot_deal = hot_deal;
        this.brand=brand;
        this.hot_new = hot_new;
        this.hot_best = hot_best;
        this.trend =trend;
        this.latest_review = latest_review;        
    }
}