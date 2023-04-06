package uk.ac.le.co2103.hw4;

import android.media.Image;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.sql.Blob;

@Entity(tableName = "shoppingLists")
public class ShoppingList {
    @PrimaryKey(autoGenerate = true)
    public int listId;
    @NonNull
    @ColumnInfo(name = "shoppingListName")
    public  String name;
    @ColumnInfo(name = "shoppingListImage")
    public String image;

    public ShoppingList(@NonNull String name, String image){
        this.name = name;
        this.image = image;
    }

    public String getName(){
        return name;
    }

    public String getImage(){
        return image;
    }
}
