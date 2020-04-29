package com.xmh.service;

import java.util.List;

import com.xmh.entity.Cart;
import com.xmh.entity.FoodInfo;

public interface UserMealService {
	
	/**
	 * 对用户显示所有菜品
	 * @return
	 */
	List<FoodInfo> getAllMeals();
	
	/**
	 * 添加菜品到购物车
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
	List<FoodInfo> searchByMealNameAndSeries(String mealName, Integer mealSeries);

}
