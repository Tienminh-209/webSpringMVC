package com.buiminhtien.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.buiminhtien.dao.CategoryDAO;
import com.buiminhtien.model.Category;
@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryDAO categoryDAO;
	public void setCategoryDAO(CategoryDAO categoryDAO) {
		this.categoryDAO = categoryDAO;
	}
	@Transactional
	public List<Category> listCategory() {
		return this.categoryDAO.listCategory();
	}
}