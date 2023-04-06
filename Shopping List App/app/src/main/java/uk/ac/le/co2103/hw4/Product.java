package uk.ac.le.co2103.hw4;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;


@Entity(tableName = "Products", foreignKeys = @ForeignKey(entity = ShoppingList.class, parentColumns = "listId", childColumns = "shoppingListId"))
public class Product {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "ProductName")
    public String name;
    @ColumnInfo(name = "Quantity")
    public Integer quantity;
    @ColumnInfo(name = "Unit")
    public String unit;

    @ColumnInfo(name = "shoppingListId", index = true)
    public int shoppingListId;

    public Product(String name, Integer quantity, String unit){
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
    }

    public String getName(){
        return name;
    }

    public Integer getQuantity(){
        return quantity;
    }

    public String getUnit(){
        return unit;
    }

}
