package com.buiminhtien.service;

import java.util.List;
import com.buiminhtien.model.Related;

public interface RelatedProductService {

	public List<Related> listProductRelated (int id_product);
	
}
