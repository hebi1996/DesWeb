package com.xmh.entity;

import java.sql.Timestamp;
import java.util.List;

/**
 * 订单表
 */
public class MainOrder {
	private Integer oid;
	private Integer userId;
	private Timestamp orderTime;
	//订单状态：
	//	0：已下单
	//	1：已接单
	//	2：已送出
	//	3：已完成
	//	4：已取消
	//	5：待取消
	private int orderState = 0;
	private double orderPrice;
	private List<SonOrder> sonOrders;
	private User user;
	
	public MainOrder(Integer oid, Integer userId, Timestamp orderTime, int orderState, double orderPrice,
			List<SonOrder> sonOrders,User user) {
		super();
		this.oid = oid;
		this.userId = userId;
		this.orderTime = orderTime;
		this.orderState = orderState;
		this.orderPrice = orderPrice;
		this.sonOrders = sonOrders;
		this.user = user;
	}
	public MainOrder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getOid() {
		return oid;
	}
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Timestamp getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Timestamp orderTime) {
		this.orderTime = orderTime;
	}
	public int getOrderState() {
		return orderState;
	}
	public void setOrderState(int orderState) {
		this.orderState = orderState;
	}
	public double getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}
	public List<SonOrder> getSonOrders() {
		return sonOrders;
	}
	public void setSonOrders(List<SonOrder> sonOrders) {
		this.sonOrders = sonOrders;
	}
	@Override
	public String toString() {
		return "MainOrder [oid=" + oid + ", userId=" + userId + ", orderTime=" + orderTime + ", orderState="
				+ orderState + ", orderPrice=" + orderPrice + ", sonOrders=" + sonOrders + ", user=" + user + "]";
	}
	
	
	
	
	
}
