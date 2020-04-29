package com.xmh.service;

import java.io.File;
import java.util.List;

import com.xmh.entity.FoodInfo;
import com.xmh.utils.PageHelper;

public interface MealService {
	
	/**
	 * ��Ӳ�Ʒ
	 * @param foods
	 * @return
	 */
	boolean insertMeal(FoodInfo foods);
	
	/**
	 * ��ʾ���в�Ʒ
	 * @return
	 */
	List<FoodInfo> selectAllMeal();
	
	/**
	 * ��ò�Ʒ
	 * @param foodInfo
	 * @return
	 */
	boolean updateMeal(FoodInfo foodInfo);
	
	/**
	 * ɾ����Ʒ
	 * @param mealId
	 * @return
	 */
	boolean deleteMeal(Integer mealId);

	/**
	 * ��ҳ��ѯ���в�Ʒ
	 * @param page
	 * @return
	 */
	PageHelper<FoodInfo> selectAllMealByPage(Integer page);

	/**
	 * �ϴ�ͼƬλ��
	 * @param mealId
	 * @param dir
	 * @return
	 */
	boolean submitImg(Integer mealId, String fileString);

	/**
	 * ����Ա���ݲ�������ϵ��ѯ
	 * @param mealName
	 * @param mealSerires
	 * @return
	 */
	List<FoodInfo> searchByMealName(String mealName, Integer mealSerires);



}
