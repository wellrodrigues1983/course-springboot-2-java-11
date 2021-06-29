package com.wrsolution.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wrsolution.course.entities.OrderItem;
import com.wrsolution.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}