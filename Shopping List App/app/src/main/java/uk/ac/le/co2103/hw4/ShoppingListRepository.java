package uk.ac.le.co2103.hw4;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class ShoppingListRepository {
    private ShopppingListDao shopppingListDao;
    private LiveData<List<ShoppingList>> allShoppingLists;

    ShoppingListRepository(Application application){
        ShoppingListDB db = ShoppingListDB.getDatabase(application);
        shopppingListDao = db.shopppingListDao();
        allShoppingLists = shopppingListDao.getShoppingList();
    }

    LiveData<List<ShoppingList>> getAllShoppingLists() { return allShoppingLists; }

    void insert(ShoppingList shoppingList){
        ShoppingListDB.databaseWriteExecutor.execute(() ->{
            shopppingListDao.insert(shoppingList);
        });
    }

}
