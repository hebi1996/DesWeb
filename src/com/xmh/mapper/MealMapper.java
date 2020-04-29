package com.xmh.mapper;

import java.io.File;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xmh.entity.FoodInfo;
import com.xmh.utils.PageHelper;

public interface MealMapper {

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
	 * �޸Ĳ�Ʒ
	 * @param foodInfo
	 * @return
	 */
	boolean updateMeal(FoodInfo foodInfo);
	
	/**
	 * ɾ����Ʒ
	 * @param mealId
	 * @return
	 */
	boolean deleteMeal(@Param("mealId")Integer mealId);

	/**
	 * ��ҳ��ѯ���в�Ʒ
	 * @param page
	 * @param size 
	 * @return
	 */
	List<FoodInfo> selectAllMealByPage(@Param("page")Integer page, @Param("size")Integer size);

	/**
	 * �ϴ���ƷͼƬ
	 * @param mealId
	 * @param fileString
	 * @return
	 */
	boolean submitImg(@Param("mealId")Integer mealId, @Param("file")String fileString);

	/**
	 * ����Ա���ݲ�������ϵ��ѯ��Ʒ
	 * @param mealName
	 * @param mealSerires
	 * @return
	 */
	List<FoodInfo> searchByMealName(@Param("mealName")String mealName, @Param("mealSeries")Integer mealSerires);


}
