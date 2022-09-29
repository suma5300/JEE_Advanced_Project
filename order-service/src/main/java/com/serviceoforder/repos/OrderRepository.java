package com.serviceoforder.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.serviceoforder.entity.Order;
import com.serviceoforder.exceptions.UserNotFoundException;

public interface OrderRepository extends JpaRepository<Order, Integer> {
	public List<Order> findByUser(String user) throws UserNotFoundException;
}
