package com.xmh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xmh.entity.Cuisine;
import com.xmh.entity.User;
import com.xmh.mapper.MealSeriesMapper;
import com.xmh.service.MealSeriesService;
import com.xmh.utils.PageHelper;
@Service
public class MealSeriesServiceImpl implements MealSeriesService{

	@Autowired
	private MealSeriesMapper mealSeriesMapper;
	@Autowired
	private PageHelper<Cuisine> pageHelper;
	
	@Override
	public boolean insertMealSeries(Cuisine cuisine) {
		// TODO Auto-generated method stub
		return mealSeriesMapper.insertMealSeries(cuisine);
	}

	@Override
	public List<Cuisine> selectAllSeries() {
		// TODO Auto-generated method stub
		return mealSeriesMapper.selectAllSeries();
	}

	@Override
	public boolean updateMealSeriesName(Integer seriesId, String seriesName) {
		// TODO Auto-generated method stub
		return mealSeriesMapper.updateMealSeriesName(seriesId,seriesName);
	}

	@Override
	public boolean deleteMealSeries(Integer seriesId) {
		// TODO Auto-generated method stub
		return mealSeriesMapper.deleteMealSeries(seriesId);
	}

	@Override
	public PageHelper<Cuisine> selectAllSeriesByPage(Integer page) {
				//page不能小于1
				if (page<=1) {
					page = 1;
				}
				//保存当前页
				pageHelper.setNow_page(page);
				List<Cuisine> totalUsers = mealSeriesMapper.selectAllSeries();
				Integer size = pageHelper.getSize();
				List<Cuisine> users = mealSeriesMapper.selectAllSeriesByPage((page-1)*size,size);
				//总记录数
				pageHelper.setCounts(totalUsers.size());
				
				//分页数据
				pageHelper.setList(users);
				//总页数
				int total = pageHelper.getPage_total();
				if (page>1) {
					pageHelper.setPrev(true);
					
				}else {
					pageHelper.setPrev(false);
				}
				if (page<total) {
					pageHelper.setNext(true);
					
				}else {
					pageHelper.setNext(false);
				}
				return pageHelper;
	}

}
