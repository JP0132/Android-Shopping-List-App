package uk.ac.le.co2103.hw4;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class ShoppingListViewModel extends AndroidViewModel {
    private ShoppingListRepository repo;
    private final LiveData<List<ShoppingList>> allShoppingLists;

    public ShoppingListViewModel(@NonNull Application application) {
        super(application);
        repo = new ShoppingListRepository(application);
        allShoppingLists = repo.getAllShoppingLists();
    }

    LiveData<List<ShoppingList>> getAllShoppingLists() {return allShoppingLists;}
    public void insert(ShoppingList shoppingList){
        repo.insert(shoppingList);
    }


}
