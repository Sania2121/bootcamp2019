package com.manchesterdigital;

import java.util.ArrayList;

public class ShoppingList {

    private ArrayList<String> list;

    public ShoppingList() {
        list = new ArrayList<>();
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void addItemToShoppingList(String item) {
        list.add(item);
    }

    public void removeITemFromShoppingList(String item) {
    list.remove(item);
    }

    public void updateShoppingList(String item, String newItem) {
        if(list.contains(item)) {

        }
    }
}
