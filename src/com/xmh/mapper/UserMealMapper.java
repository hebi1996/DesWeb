package com.xmh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import com.xmh.entity.Cart;
import com.xmh.entity.FoodInfo;

public interface UserMealMapper {
	
	/**
	 * �û���ʾ���в�Ʒ
	 * @return
	 */
	List<FoodInfo> getAllMeals();
	
	/**
	 * �����Ʒ�����ﳵ
	 * @param cart
	 * @return
	 */
	boolean addMealToCart(Cart cart);

	/**
	 * ���ݲ�������ϵ��ѯ��Ʒ
	 * @param mealName
	 * @param mealSeries
	 * @return
	 */
	List<FoodInfo> searchByMealNameAndSeries(@Param("mealName")String mealName, @Param("mealSeries")Integer mealSeries);

}
