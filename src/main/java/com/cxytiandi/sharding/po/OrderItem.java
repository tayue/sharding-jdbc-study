package com.cxytiandi.sharding.po;

import java.io.Serializable;

/**
 * 分表
 * @author yinjihuan
 *
 */
public class OrderItem implements Serializable {

   private long orderId;


	private long userId;

    private String item;

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	
}
