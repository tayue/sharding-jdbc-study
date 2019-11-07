package com.cxytiandi.sharding.po;

import java.io.Serializable;

/**
 * 分表
 * @author yinjihuan
 *
 */
public class Order implements Serializable{

    private long orderId;


	private long userId;

    private String name;

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	
}
