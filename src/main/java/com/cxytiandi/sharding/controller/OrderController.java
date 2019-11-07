package com.cxytiandi.sharding.controller;

import com.cxytiandi.sharding.po.Order;
import com.cxytiandi.sharding.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/orders")
	public Object list() {
		return orderService.list();
	}
	
	@GetMapping("/addorder")
	public Object add() {
		for (long i = 10000; i < 11111; i++) {
			Order order = new Order();
			long tmp=i%2;
			order.setUserId(tmp);
			order.setName("订单"+i);
			orderService.add(order);
		}
		return "success";
	}
	
	@GetMapping("/order/{id}")
	public Object get(@PathVariable Long id) {
		return orderService.findById(id);
	}
	
	@GetMapping("/order/query")
	public Object get(String name) {
		return orderService.findByName(name);
	}
	
}
