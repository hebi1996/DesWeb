package com.xmh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xmh.entity.MainOrder;
import com.xmh.entity.SonOrder;
import com.xmh.entity.User;

public interface OrderMapper {
	
	/**
	 * 创建主订单
	 * @param mainOrder
	 */
	boolean createMainOrder(MainOrder mainOrder);
	
	/**
	 * 创建子订单
	 * @param sonOrders
	 * @return 
	 */
	boolean createSonOrder(@Param("sonOrders")List<SonOrder> sonOrders);

	/**
	 * 获得所有主订单并显示
	 * @param userId
	 * @return
	 */
	List<MainOrder> getAllOrdersByUserId(@Param("userId")Integer userId);

	/**
	 * 通过主订单号获得所有子订单
	 * @param oid
	 * @return
	 */
	List<SonOrder> getSonOrderByOid(@Param("oId")Integer oid);

	/**
	 * 用户修改订单状态
	 * @param oid
	 * @param orderState
	 * @return
	 */
	boolean orders_handle(@Param("oid")Integer oid, @Param("orderState")Integer orderState);

	/**
	 * 管理员查询所有主订单
	 * @return
	 */
	List<MainOrder> getAllOrders();

	
	/**
	 * 查找订单的用户信息
	 * @param oid
	 * @return
	 */
	User getUserInfoByorders(@Param("oid")Integer oid);

	/**
	 * 修改订单状态
	 * @param oid
	 * @param orderState
	 * @return
	 */
	boolean changeOrderState(@Param("oid")Integer oid, @Param("orderState")Integer orderState);

}
