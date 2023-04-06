package uk.ac.le.co2103.hw4;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ProductDao {
    @Insert
    void insert(Product product);

    @Query("SELECT * " +
            "FROM Products")
    LiveData<List<Product>> getProducts();

    @Query("DELETE FROM Products")
    void deleteProduct();

}
