package com.xmh.mapper;

import java.io.File;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xmh.entity.FoodInfo;
import com.xmh.utils.PageHelper;

public interface MealMapper {

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
	 * 修改菜品
	 * @param foodInfo
	 * @return
	 */
	boolean updateMeal(FoodInfo foodInfo);
	
	/**
	 * 删除菜品
	 * @param mealId
	 * @return
	 */
	boolean deleteMeal(@Param("mealId")Integer mealId);

	/**
	 * 分页查询所有菜品
	 * @param page
	 * @param size 
	 * @return
	 */
	List<FoodInfo> selectAllMealByPage(@Param("page")Integer page, @Param("size")Integer size);

	/**
	 * 上传菜品图片
	 * @param mealId
	 * @param fileString
	 * @return
	 */
	boolean submitImg(@Param("mealId")Integer mealId, @Param("file")String fileString);

	/**
	 * 管理员根据菜名、菜系查询菜品
	 * @param mealName
	 * @param mealSerires
	 * @return
	 */
	List<FoodInfo> searchByMealName(@Param("mealName")String mealName, @Param("mealSeries")Integer mealSerires);


}
