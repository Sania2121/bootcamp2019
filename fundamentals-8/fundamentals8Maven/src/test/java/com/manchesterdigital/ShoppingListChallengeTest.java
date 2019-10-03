package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ShoppingListChallengeTest {

    @Test
    public void whenAnItemIsAddedTheSizeOfTheListIncresesByOne() {
        // ARRANGE
        ShoppingList shoppingList = new ShoppingList();
        String item = "bread";


        //ACT
        shoppingList.addItemToShoppingList(item);



        //ASSERT

        Assertions.assertThat(shoppingList.getList().size()).isEqualTo(1);
    }

    @Test
    public void whenAnItemIsRemovedTheSizeOfTheListDecreasesByOne() {
        // ARRANGE
        ShoppingList shoppingList = new ShoppingList();
        String item = "bread";
        shoppingList.addItemToShoppingList(item);


        //ACT
        shoppingList.removeITemFromShoppingList(item);



        //ASSERT
        Assertions.assertThat(shoppingList.getList().size()).isEqualTo(0);

    }

    @Test
    public void updateShoppingListShouldUpdateTheList() {
        // ARRANGE
        ShoppingList shoppingList = new ShoppingList();
        String item = "bread";
        shoppingList.addItemToShoppingList(item);
        String newItem = "milk";


        //ACT
        shoppingList.updateShoppingList(item, newItem);



        //ASSERT
        Assertions.assertThat(shoppingList.getList().get(0)).isEqualTo("milk");
    }
}
