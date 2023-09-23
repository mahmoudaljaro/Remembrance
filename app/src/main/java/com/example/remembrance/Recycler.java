package com.example.remembrance;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Recycler extends RecyclerView.Adapter<Recycler.itemHolder> {
    Context context;
    ArrayList<item> item;

    public Recycler(Context context, ArrayList<com.example.remembrance.item> item) {
        this.context = context;
        this.item = item;
    }

    @NonNull
    @Override
    public itemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_item, parent, false);
        return new itemHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull itemHolder holder, int position) {
        holder.name.setText(item.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    public class itemHolder extends RecyclerView.ViewHolder {
        TextView name;


        public itemHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);

        }
    }
  // public interface onItemClick{
      //  void onclick(item item1);
  //  }


}
