package com.cxytiandi.sharding.repository;

import com.cxytiandi.sharding.po.OrderItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface OrderItemRepository {
	
	Long addOrderItem(OrderItem order);
	
	List<OrderItem> list();

	OrderItem findById(Long id);

	OrderItem findByName(String name);
}
