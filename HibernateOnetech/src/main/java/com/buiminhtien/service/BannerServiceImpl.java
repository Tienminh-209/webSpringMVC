package com.buiminhtien.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.buiminhtien.dao.BannerDAO;
import com.buiminhtien.model.Banner;

@Service
public class BannerServiceImpl implements BannerService {
	@Autowired
	private BannerDAO bannerDAO;

	public void setBannerDAO(BannerDAO bannerDAO) {
		this.bannerDAO = bannerDAO;
	}
	@Transactional
	public List<Banner> listBannerbot() {
		return this.bannerDAO.listBannerbot();
	}
	@Transactional
	public List<Banner> listBannertop() {
		return this.bannerDAO.listBannertop();
	}
}
