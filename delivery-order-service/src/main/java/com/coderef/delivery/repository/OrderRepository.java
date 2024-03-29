package com.coderef.delivery.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coderef.delivery.model.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {
}
