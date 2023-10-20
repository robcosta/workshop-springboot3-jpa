package com.robertocosta.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robertocosta.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
