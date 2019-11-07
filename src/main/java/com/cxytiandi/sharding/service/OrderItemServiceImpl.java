package com.cxytiandi.sharding.service;

import com.cxytiandi.sharding.po.OrderItem;
import com.cxytiandi.sharding.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemServiceImpl implements OrderItemService {

	@Autowired
	private OrderItemRepository orderItemRepository;
	
	public List<OrderItem> list() {
		return orderItemRepository.list();
	}

	public Long add(OrderItem orderItem) {
		return orderItemRepository.addOrderItem(orderItem);
	}

	@Override
	public OrderItem findById(Long id) {
		return orderItemRepository.findById(id);
	}

	@Override
	public OrderItem findByName(String name) {
		return orderItemRepository.findByName(name);
	}

}
