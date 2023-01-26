package com.example.shopee_s24307;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class CartTest {
    @Test
    public void testAddItemToCart() {
        Cart cart = new Cart(new Customer(1, 150d));

        cart.addItemToCart("milk");
        cart.addItemToCart("water");

        assertTrue(cart.getItems().contains("milk"));
        assertFalse(cart.getItems().contains("water"));
    }
}
