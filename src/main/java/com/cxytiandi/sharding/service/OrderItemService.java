package com.cxytiandi.sharding.service;

import com.cxytiandi.sharding.po.OrderItem;

import java.util.List;

public interface OrderItemService {

	List<OrderItem> list();
	
	Long add(OrderItem orderItem);

	OrderItem findById(Long id);

	OrderItem findByName(String name);
	
}
