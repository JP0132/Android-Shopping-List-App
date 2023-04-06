package uk.ac.le.co2103.hw4;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

public class ShoppingListAdapter extends ListAdapter<ShoppingList, ShoppinglistViewHolder> {

    protected ShoppingListAdapter(@NonNull DiffUtil.ItemCallback<ShoppingList> diffCallback) {
        super(diffCallback);
    }


    @Override
    public ShoppinglistViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return ShoppinglistViewHolder.create(parent);
    }

    @Override
    public void onBindViewHolder(ShoppinglistViewHolder holder, int position) {
        ShoppingList current = getItem(position);
        holder.bind(current.getName());
    }

    static class ShoppingListDiff extends DiffUtil.ItemCallback<ShoppingList> {

        @Override
        public boolean areItemsTheSame(@NonNull ShoppingList oldItem, @NonNull ShoppingList newItem) {
            return oldItem == newItem;
        }

        @Override
        public boolean areContentsTheSame(@NonNull ShoppingList oldItem, @NonNull ShoppingList newItem) {
            return oldItem.getName().equals(newItem.getName());
        }
    }
}
