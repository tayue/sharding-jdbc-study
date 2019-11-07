package com.cxytiandi.sharding.controller;

import com.cxytiandi.sharding.po.Order;
import com.cxytiandi.sharding.po.OrderItem;
import com.cxytiandi.sharding.service.OrderItemService;
import com.cxytiandi.sharding.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderItemController {
	
	@Autowired
	private OrderItemService orderItemService;

	@Autowired
	private OrderService orderService;
	
	@GetMapping("/orderitems")
	public Object list() {
		return orderItemService.list();
	}
	
	@GetMapping("/addorderitem")
	public Object add() {
		for (long i = 100; i < 10000; i++) {
			OrderItem order = new OrderItem();
			long tmp=i%2;
			order.setUserId(tmp);
			order.setItem("订单项"+i);
			orderItemService.add(order);
		}
		return "success";
	}

	@GetMapping("/addorderitem/{orderId}")
	public Object addIem(@PathVariable Long orderId) {
		Order order=orderService.findById(orderId);
		long user_id=order.getUserId();
		String name=order.getName();
			OrderItem orderItem = new OrderItem();
		    orderItem.setOrderId(orderId);
		    orderItem.setUserId(user_id);
		     orderItem.setItem(name+" 订单项");
			orderItemService.add(orderItem);

		return "success";
	}
	
	@GetMapping("/orderitem/{id}")
	public Object get(@PathVariable Long id) {
		return orderItemService.findById(id);
	}
	
	@GetMapping("/orderitem/query")
	public Object get(String name) {
		return orderItemService.findByName(name);
	}
	
}
