package com.xmh.service;

import java.io.File;
import java.util.List;

import com.xmh.entity.FoodInfo;
import com.xmh.utils.PageHelper;

public interface MealService {
	
	/**
	 * 添加菜品
	 * @param foods
	 * @return
	 */
	boolean insertMeal(FoodInfo foods);
	
	/**
	 * 显示所有菜品
	 * @return
	 */
	List<FoodInfo> selectAllMeal();
	
	/**
	 * 最该菜品
	 * @param foodInfo
	 * @return
	 */
	boolean updateMeal(FoodInfo foodInfo);
	
	/**
	 * 删除菜品
	 * @param mealId
	 * @return
	 */
	boolean deleteMeal(Integer mealId);

	/**
	 * 分页查询所有菜品
	 * @param page
	 * @return
	 */
	PageHelper<FoodInfo> selectAllMealByPage(Integer page);

	/**
	 * 上传图片位置
	 * @param mealId
	 * @param dir
	 * @return
	 */
	boolean submitImg(Integer mealId, String fileString);

	/**
	 * 管理员根据菜名、菜系查询
	 * @param mealName
	 * @param mealSerires
	 * @return
	 */
	List<FoodInfo> searchByMealName(String mealName, Integer mealSerires);



}
