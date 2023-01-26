package com.example.shopee_s24307;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ItemsStorageTest {
    @Test
    public void testGetItemByName() {
        ItemsStorage itemsStorage = new ItemsStorage();

        Item item = itemsStorage.getItemByName("milk");
        assertNotNull(item);
        assertEquals(item.getName(), "milk");
        assertEquals(item.getPrice(), 1.5);

        item = itemsStorage.getItemByName("water");
        assertNull(item);
    }
}
