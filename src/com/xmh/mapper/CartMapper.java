package com.xmh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xmh.entity.Cart;

public interface CartMapper {
	
	/**
	 * 显示我的购物车信息
	 * @return
	 */
	List<Cart> getAllCartsByUser(@Param("userId")Integer userId);
	
	/**
	 * 删除我购物车中的某张订单
	 * @param cartId
	 * @return
	 */
	boolean deleteCartByCartId(@Param("cartId")Integer cartId);
	
	/**
	 * 清空购物车
	 * @param userId
	 * @return
	 */
	boolean clearMyCart(@Param("userId")Integer userId);

}
