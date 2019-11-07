package com.cxytiandi.sharding.service;

import com.cxytiandi.sharding.po.Order;

import java.util.List;

public interface OrderService {

	List<Order> list();
	
	Long add(Order user);

	Order findById(Long id);

	Order findByName(String name);
	
}
