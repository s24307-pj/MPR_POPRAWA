package com.example.shopee_s24307;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ShopService {
    private ItemsStorage itemsStorage;

    public ShopService(ItemsStorage itemsStorage) {
        this.itemsStorage = itemsStorage;
    }

    public boolean orderItems(Cart cart) {
        List<String> items = cart.getItems();
        double totalCost = 0;
        for (String item : items) {
            Item storageItem = itemsStorage.getItemByName(item);
            if (storageItem == null) {
                return false;
            }
            totalCost += storageItem.getPrice();
        }
        Customer customer = cart.getCustomer();
        if (customer.getBalance() < totalCost) {
            System.out.println("Twoje zakupy przewyższają stan twojego konta! " + customer.getBalance());
            return false;
        }
        double balance = customer.getBalance() - totalCost;
        customer.setBalance(balance);
        System.out.println("Po zakupach twój stan konta wynosi: " + balance);
        return true;
    }
}
