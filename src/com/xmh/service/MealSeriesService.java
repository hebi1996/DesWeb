package com.xmh.service;

import java.util.List;

import com.xmh.entity.Cuisine;
import com.xmh.utils.PageHelper;

public interface MealSeriesService {
	
	/**
	 * 添加菜系
	 * @param mealSeriesName
	 * @return
	 */
	boolean insertMealSeries(Cuisine cuisine);
	
	/**
	 * 查询所有菜系并显示页面
	 * @return
	 */
	List<Cuisine> selectAllSeries();
	
	/**
	 * 修改菜系名称
	 * @param seriesId
	 * @param seriesName
	 * @return
	 */
	boolean updateMealSeriesName(Integer seriesId, String seriesName);
	
	/**
	 * 删除菜系
	 * @param seriesId
	 * @return
	 */
	boolean deleteMealSeries(Integer seriesId);

	/**
	 * 分页显示菜系
	 * @param page
	 * @return
	 */
	PageHelper<Cuisine> selectAllSeriesByPage(Integer page);


}
