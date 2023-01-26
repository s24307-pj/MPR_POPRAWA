package com.example.shopee_s24307;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ItemsStorage {
    private List<Item> items = new ArrayList<>();;

    public ItemsStorage() {
        items.add(new Item("milk", 1.5));
        items.add(new Item("beer", 2.5));
    }

    public Item getItemByName(String name) {
        for (Item item : items) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }
}
