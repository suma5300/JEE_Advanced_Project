package com.serviceoforder.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.serviceoforder.entity.Order;
import com.serviceoforder.exceptions.UserNotFoundException;
import com.serviceoforder.repos.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository repo;

	public List<Order> findAll() {
		return this.repo.findAll();
	}

	public List<Order> findByUser(String user) throws RuntimeException {
		List<Order> orderList = new ArrayList<>();
		String message = new StringBuilder("Order with Given user name: ").append(user).append(" Not Found").toString();
		try {
			orderList = this.repo.findByUser(user);
		} catch (UserNotFoundException e) {
			throw new RuntimeException(message);
		}
		return orderList;
	}

	public Order findById(int orderId) {
		String message = new StringBuilder("Order with Given OrderId: ").append(orderId).append(" Not Found")
				.toString();
		return this.repo.findById(orderId).orElseThrow(() -> new RuntimeException(message));

	}
}
