package com.xmh.service;


import java.util.List;

import com.xmh.entity.MainOrder;
import com.xmh.entity.SonOrder;
import com.xmh.entity.User;

public interface OrderService {
	
	/**
	 * �����ҵĶ���
	 * @param mainOrder
	 * @return
	 */
	boolean createMyOrders(MainOrder mainOrder);
	
	/**
	 * �����������������ʾ
	 * @param userId
	 * @return
	 */
	List<MainOrder> getAllOrdersByUserId(Integer userId);

	/**
	 * ���ͨ���������Ż�������Ӷ���
	 * @param oid
	 * @return
	 */
	List<SonOrder> getSonOrderByOid(Integer oid);

	/**
	 * �û��ջ���ɶ���
	 * @param oid
	 * @param orderState
	 * @return
	 */
	boolean orders_handle(Integer oid, Integer orderState);
	
	/**
	 * �û�ȡ������
	 * @param oid
	 * @param orderState
	 * @return
	 */
	boolean orders_cancel(Integer oid, Integer orderState);
	
	/**
	 * ����Ա��ѯ����������
	 * @return
	 */
	List<MainOrder> getAllOrders();
	
	/**
	 * ����Աͨ��������ID��ѯ�Ӷ���
	 * @param oid
	 * @return
	 */
	List<SonOrder> getSonOrdersbyoIdForAdmin(Integer oid);
	
	/**
	 * ���Ҷ������û���Ϣ
	 * @param oid
	 * @return
	 */
	User getUserInfoByorders(Integer oid);

	/**
	 * �޸Ķ���״̬
	 * @param oid
	 * @param orderState
	 * @return
	 */
	boolean changeOrderState(Integer oid, Integer orderState);

}
