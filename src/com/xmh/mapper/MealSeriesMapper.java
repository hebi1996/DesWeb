package com.xmh.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xmh.entity.Cuisine;
import com.xmh.utils.PageHelper;

public interface MealSeriesMapper {
	
	/**
	 * ��Ӳ�ϵ
	 * @param mealSeriesName
	 * @return
	 */
	boolean insertMealSeries(Cuisine cuisine);
	
	/**
	 * ��ѯ���в�ϵ����ʾ
	 * @return
	 */
	List<Cuisine> selectAllSeries();
	
	/**
	 * �޸Ĳ�ϵ����
	 * @param seriesId
	 * @param seriesName
	 * @return
	 */
	boolean updateMealSeriesName(@Param("seriesId")Integer seriesId,@Param("seriesName") String seriesName);

	/**
	 * ɾ����ϵ
	 * @param seriesId
	 * @return
	 */
	boolean deleteMealSeries(@Param("seriesId")Integer seriesId);

	/**
	 * ��ҳ��ʾ��ϵ
	 * @param page
	 * @param size 
	 * @return
	 */
	List<Cuisine> selectAllSeriesByPage(@Param("page")Integer page, @Param("size")Integer size);


}
