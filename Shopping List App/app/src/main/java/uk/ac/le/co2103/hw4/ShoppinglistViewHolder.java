package uk.ac.le.co2103.hw4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ShoppinglistViewHolder extends RecyclerView.ViewHolder {
    private  final TextView listTextView;
    public ShoppinglistViewHolder(View itemView) {
        super(itemView);
        listTextView = itemView.findViewById(R.id.textView);
    }
    public  void bind(String text){
        listTextView.setText(text);
    }
    static ShoppinglistViewHolder create(ViewGroup parent){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent,false);
        return new ShoppinglistViewHolder(view);
    }
}
