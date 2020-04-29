package com.xmh.service;

import java.util.List;

import com.xmh.entity.Cart;
import com.xmh.entity.FoodInfo;

public interface UserMealService {
	
	/**
	 * ���û���ʾ���в�Ʒ
	 * @return
	 */
	List<FoodInfo> getAllMeals();
	
	/**
	 * ��Ӳ�Ʒ�����ﳵ
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
	List<FoodInfo> searchByMealNameAndSeries(String mealName, Integer mealSeries);

}
