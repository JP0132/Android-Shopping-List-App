package uk.ac.le.co2103.hw4;


import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class ProductRepository {
    private ProductDao productDao;
    private LiveData<List<Product>> allProducts;

    ProductRepository(Application application){
        ShoppingListDB db = ShoppingListDB.getDatabase(application);
        productDao = db.productDao();
        allProducts = productDao.getProducts();
    }

    LiveData<List<Product>> getAllProducts(){
        return allProducts;
    }
    void insert(Product product){
        ShoppingListDB.databaseWriteExecutor.execute(() ->{
            productDao.insert(product);
        });
    }
}
