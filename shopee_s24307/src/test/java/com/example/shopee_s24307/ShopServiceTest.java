package com.example.shopee_s24307;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class ShopServiceTest {
    @Test
    public void testOrderItems() {
        Customer customer = new Customer(1, 150d);
        Cart cart = new Cart(customer);
        cart.addItemToCart("milk");
        cart.addItemToCart("milk");
        cart.addItemToCart("beer");
        ItemsStorage itemsStorage = new ItemsStorage();
        ShopService shopService = new ShopService(itemsStorage);

        boolean result = shopService.orderItems(cart);

        assertTrue(result);
        assertEquals(customer.getBalance(), 144.5d, 0);
    }
}
