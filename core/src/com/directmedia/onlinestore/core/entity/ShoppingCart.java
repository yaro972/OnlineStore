package com.directmedia.onlinestore.core.entity;

import java.util.HashSet;
import java.util.Set;

public class ShoppingCart {
    public Set<Work> Item = new HashSet<>();

    public ShoppingCart() {}

    public ShoppingCart(Set<Work> item) {
        Item = item;
    }

    public Set<Work> getItem() {
        return Item;
    }

    public void setItem(Set<Work> item) {
        Item = item;
    }
}
