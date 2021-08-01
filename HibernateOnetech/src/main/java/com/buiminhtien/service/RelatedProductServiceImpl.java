package com.buiminhtien.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.buiminhtien.dao.RelatedProductDAO;
import com.buiminhtien.model.Related;
@Service
public class RelatedProductServiceImpl implements RelatedProductService {
	@Autowired
	private RelatedProductDAO relatedProductDAO;

	public void setRelatedProductDAO(RelatedProductDAO relatedProductDAO) {
		this.relatedProductDAO = relatedProductDAO;
	}
   @Transactional
   public List<Related> listProductRelated(int id_product){
	   return this.relatedProductDAO.listProductRelated(id_product);
	   
   }
}
