package uk.ac.le.co2103.hw4;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class ProductViewModel extends AndroidViewModel {
    private ProductRepository repo;
    private final LiveData<List<Product>> allProducts;

    public ProductViewModel(Application application) {
        super(application);
        repo = new ProductRepository(application);
        allProducts = repo.getAllProducts();
    }

    LiveData<List<Product>> getAllProducts() {return  allProducts;}
    public void insert(Product product){
        repo.insert(product);
    }
}
