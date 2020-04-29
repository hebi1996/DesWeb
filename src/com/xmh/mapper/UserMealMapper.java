package com.xmh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import com.xmh.entity.Cart;
import com.xmh.entity.FoodInfo;

public interface UserMealMapper {
	
	/**
	 * 用户显示所有菜品
	 * @return
	 */
	List<FoodInfo> getAllMeals();
	
	/**
	 * 添加物品到购物车
	 * @param cart
	 * @return
	 */
	boolean addMealToCart(Cart cart);

	/**
	 * 根据菜名、菜系查询菜品
	 * @param mealName
	 * @param mealSeries
	 * @return
	 */
	List<FoodInfo> searchByMealNameAndSeries(@Param("mealName")String mealName, @Param("mealSeries")Integer mealSeries);

}
