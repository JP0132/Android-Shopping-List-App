package uk.ac.le.co2103.hw4;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ShopppingListDao {
    @Insert
    void insert(ShoppingList shoppingList);

    @Query("SELECT * FROM shoppingLists ORDER BY shoppingListName ASC")
    LiveData<List<ShoppingList>> getShoppingList();

    @Query("DELETE FROM shoppingLists")
    void deleteAll();


}
