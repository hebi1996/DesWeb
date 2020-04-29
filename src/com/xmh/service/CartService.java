package com.xmh.service;

import java.util.List;

import com.xmh.entity.Cart;

public interface CartService {
	
	/**
	 * ��ʾ�ҵĹ��ﳵ��Ϣ
	 * @param userId 
	 * @return
	 */
	List<Cart> getAllCartsByUser(Integer userId);
	
	/**
	 * ɾ���ҵĹ��ﳵ�еĶ���
	 * @param cartId
	 * @return
	 */
	boolean deleteCartByCartId(Integer cartId);
	
	/**
	 * ��չ��ﳵ
	 * @param userId
	 * @return
	 */
	boolean clearMyCart(Integer userId);

}
