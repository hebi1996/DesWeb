package com.xmh.service;

import java.util.List;

import com.xmh.entity.Cart;

public interface CartService {
	
	/**
	 * 显示我的购物车信息
	 * @param userId 
	 * @return
	 */
	List<Cart> getAllCartsByUser(Integer userId);
	
	/**
	 * 删除我的购物车中的订单
	 * @param cartId
	 * @return
	 */
	boolean deleteCartByCartId(Integer cartId);
	
	/**
	 * 清空购物车
	 * @param userId
	 * @return
	 */
	boolean clearMyCart(Integer userId);

}
