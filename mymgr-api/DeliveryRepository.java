package com.b127.manager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.b127.mm.entity.Delivery;
import com.b127.mm.entity.Order;

@Repository 		//indicates that the decorated class is a repository
public interface DeliveryRepository extends JpaRepository<Delivery, Long> { 	//delivery repositary inherit the attribute and method from jparepositery// 
	
	Delivery findByOrder(Order order); 											// find deliveries by their orders
	
	List<Delivery> findByOrderIn(List<Order> orders);

}