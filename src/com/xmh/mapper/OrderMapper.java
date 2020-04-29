package com.xmh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xmh.entity.MainOrder;
import com.xmh.entity.SonOrder;
import com.xmh.entity.User;

public interface OrderMapper {
	
	/**
	 * ����������
	 * @param mainOrder
	 */
	boolean createMainOrder(MainOrder mainOrder);
	
	/**
	 * �����Ӷ���
	 * @param sonOrders
	 * @return 
	 */
	boolean createSonOrder(@Param("sonOrders")List<SonOrder> sonOrders);

	/**
	 * �����������������ʾ
	 * @param userId
	 * @return
	 */
	List<MainOrder> getAllOrdersByUserId(@Param("userId")Integer userId);

	/**
	 * ͨ���������Ż�������Ӷ���
	 * @param oid
	 * @return
	 */
	List<SonOrder> getSonOrderByOid(@Param("oId")Integer oid);

	/**
	 * �û��޸Ķ���״̬
	 * @param oid
	 * @param orderState
	 * @return
	 */
	boolean orders_handle(@Param("oid")Integer oid, @Param("orderState")Integer orderState);

	/**
	 * ����Ա��ѯ����������
	 * @return
	 */
	List<MainOrder> getAllOrders();

	
	/**
	 * ���Ҷ������û���Ϣ
	 * @param oid
	 * @return
	 */
	User getUserInfoByorders(@Param("oid")Integer oid);

	/**
	 * �޸Ķ���״̬
	 * @param oid
	 * @param orderState
	 * @return
	 */
	boolean changeOrderState(@Param("oid")Integer oid, @Param("orderState")Integer orderState);

}
