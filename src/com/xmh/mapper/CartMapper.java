package com.xmh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xmh.entity.Cart;

public interface CartMapper {
	
	/**
	 * ��ʾ�ҵĹ��ﳵ��Ϣ
	 * @return
	 */
	List<Cart> getAllCartsByUser(@Param("userId")Integer userId);
	
	/**
	 * ɾ���ҹ��ﳵ�е�ĳ�Ŷ���
	 * @param cartId
	 * @return
	 */
	boolean deleteCartByCartId(@Param("cartId")Integer cartId);
	
	/**
	 * ��չ��ﳵ
	 * @param userId
	 * @return
	 */
	boolean clearMyCart(@Param("userId")Integer userId);

}
