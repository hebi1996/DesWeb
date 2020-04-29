package com.xmh.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xmh.entity.Cuisine;
import com.xmh.utils.PageHelper;

public interface MealSeriesMapper {
	
	/**
	 * 添加菜系
	 * @param mealSeriesName
	 * @return
	 */
	boolean insertMealSeries(Cuisine cuisine);
	
	/**
	 * 查询所有菜系并显示
	 * @return
	 */
	List<Cuisine> selectAllSeries();
	
	/**
	 * 修改菜系名称
	 * @param seriesId
	 * @param seriesName
	 * @return
	 */
	boolean updateMealSeriesName(@Param("seriesId")Integer seriesId,@Param("seriesName") String seriesName);

	/**
	 * 删除菜系
	 * @param seriesId
	 * @return
	 */
	boolean deleteMealSeries(@Param("seriesId")Integer seriesId);

	/**
	 * 分页显示菜系
	 * @param page
	 * @param size 
	 * @return
	 */
	List<Cuisine> selectAllSeriesByPage(@Param("page")Integer page, @Param("size")Integer size);


}
