package com.example.shopee_s24307;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopeeS24307Application {

	public static void main(String[] args) {
		SpringApplication.run(ShopeeS24307Application.class, args);
	}
	private ShopService shopService;

	public ShopeeS24307Application(ShopService shopService) {
		Customer customer = new Customer(1, 150d);
		Cart cart = new Cart(customer);
		cart.addItemToCart("milk");
		cart.addItemToCart("milk");
		cart.addItemToCart("beer");
		shopService.orderItems(cart);
	}
}
