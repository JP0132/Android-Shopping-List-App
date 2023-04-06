package uk.ac.le.co2103.hw4;
import android.content.Context;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = {ShoppingList.class, Product.class}, version = 1, exportSchema = false)
public abstract class ShoppingListDB extends RoomDatabase{
    public abstract ProductDao productDao();
    public abstract ShopppingListDao shopppingListDao();

    private static volatile ShoppingListDB INSTANCE;
    private static final  int NUMER_OF_THREADS = 4;
    static  final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMER_OF_THREADS);

    static ShoppingListDB getDatabase(final Context context){
        if (INSTANCE == null){
            synchronized (ShoppingListDB.class){
                if  (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),ShoppingListDB.class, "shoppinglist_db").build();
                }

            }
        }

        return INSTANCE;
    }


}
