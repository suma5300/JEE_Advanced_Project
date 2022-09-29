package com.serviceoforder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.serviceoforder.entity.Order;
import com.serviceoforder.entity.Product;
import com.serviceoforder.repos.OrderRepository;


@SpringBootApplication
public class OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}
	@Bean
	public CommandLineRunner runner() {
		return new CommandLineRunner() {
			@Autowired
			OrderRepository repo;
			
			@Override
			public void run(String... args) throws Exception {
				repo.save(new Order(1, "Suma", LocalDate.of(2022, 9, 23),new Product(1)));
				
			}
		};
	}

}
