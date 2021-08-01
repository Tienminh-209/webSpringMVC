package com.buiminhtien.dao;

import java.util.List;

import com.buiminhtien.model.Related;



public interface RelatedProductDAO {
	
	public List<Related> listProductRelated(int id_product);
}
