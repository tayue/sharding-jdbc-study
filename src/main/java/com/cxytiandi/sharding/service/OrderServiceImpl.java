package com.cxytiandi.sharding.service;

import com.cxytiandi.sharding.po.Order;
import com.cxytiandi.sharding.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> list() {
		return orderRepository.list();
	}

	public Long add(Order user) {
		return orderRepository.addOrder(user);
	}

	@Override
	public Order findById(Long id) {
		return orderRepository.findById(id);
	}

	@Override
	public Order findByName(String name) {
		return orderRepository.findByName(name);
	}

}
