package com.xmh.service;

import java.util.List;

import com.xmh.entity.Cuisine;
import com.xmh.utils.PageHelper;

public interface MealSeriesService {
	
	/**
	 * ��Ӳ�ϵ
	 * @param mealSeriesName
	 * @return
	 */
	boolean insertMealSeries(Cuisine cuisine);
	
	/**
	 * ��ѯ���в�ϵ����ʾҳ��
	 * @return
	 */
	List<Cuisine> selectAllSeries();
	
	/**
	 * �޸Ĳ�ϵ����
	 * @param seriesId
	 * @param seriesName
	 * @return
	 */
	boolean updateMealSeriesName(Integer seriesId, String seriesName);
	
	/**
	 * ɾ����ϵ
	 * @param seriesId
	 * @return
	 */
	boolean deleteMealSeries(Integer seriesId);

	/**
	 * ��ҳ��ʾ��ϵ
	 * @param page
	 * @return
	 */
	PageHelper<Cuisine> selectAllSeriesByPage(Integer page);


}
