package com.example.shopee_s24307;

import java.util.ArrayList;
import java.util.List;

class Cart {
    private Customer customer;
    private List<String> items = new ArrayList<>();

    public Cart(Customer customer) {
        this.customer = customer;
    }

    public void addItemToCart(String item) {
        ItemsStorage itemsStorage = new ItemsStorage();
        if (itemsStorage.getItemByName(item) != null) {
            items.add(item);
            System.out.println("Dodano przedmiot: " + item);
        } else {
            System.out.println("Przedmiot o nazwie: " + item + " nie istnieje");
        }
    }

    public List<String> getItems() {
        return items;
    }

    public Customer getCustomer() {
        return customer;
    }
}
