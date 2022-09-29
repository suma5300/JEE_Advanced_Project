package com.serviceoforder.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.serviceoforder.entity.Order;
import com.serviceoforder.services.OrderService;

import lombok.AllArgsConstructor;
import lombok.Data;
@RestController
@RequestMapping(path = "/api/orders")
@AllArgsConstructor
@Data
public class OrderController {
private OrderService service;
@GetMapping
public List<Order> getAllproducts(){
	return this.service.findAll();
}
@PostMapping(path = "/byUser")
public List<Order> findOrderByUsers(@RequestBody String user){
	return this.service.findByUser(user);
}
@PostMapping(path = "/byOrderId")
public Order findOrderByOrderId(@RequestBody int orderId){
	return this.service.findById(orderId);
}
}
