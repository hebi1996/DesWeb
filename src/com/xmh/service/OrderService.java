package com.xmh.service;


import java.util.List;

import com.xmh.entity.MainOrder;
import com.xmh.entity.SonOrder;
import com.xmh.entity.User;

public interface OrderService {
	
	/**
	 * 创建我的订单
	 * @param mainOrder
	 * @return
	 */
	boolean createMyOrders(MainOrder mainOrder);
	
	/**
	 * 获得所有主订单并显示
	 * @param userId
	 * @return
	 */
	List<MainOrder> getAllOrdersByUserId(Integer userId);

	/**
	 * 获得通过主订单号获得所有子订单
	 * @param oid
	 * @return
	 */
	List<SonOrder> getSonOrderByOid(Integer oid);

	/**
	 * 用户收获完成订单
	 * @param oid
	 * @param orderState
	 * @return
	 */
	boolean orders_handle(Integer oid, Integer orderState);
	
	/**
	 * 用户取消订单
	 * @param oid
	 * @param orderState
	 * @return
	 */
	boolean orders_cancel(Integer oid, Integer orderState);
	
	/**
	 * 管理员查询所有主订单
	 * @return
	 */
	List<MainOrder> getAllOrders();
	
	/**
	 * 管理员通过主订单ID查询子订单
	 * @param oid
	 * @return
	 */
	List<SonOrder> getSonOrdersbyoIdForAdmin(Integer oid);
	
	/**
	 * 查找订单的用户信息
	 * @param oid
	 * @return
	 */
	User getUserInfoByorders(Integer oid);

	/**
	 * 修改订单状态
	 * @param oid
	 * @param orderState
	 * @return
	 */
	boolean changeOrderState(Integer oid, Integer orderState);

}
