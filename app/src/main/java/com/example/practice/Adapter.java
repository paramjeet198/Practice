package com.example.practice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.practice.databinding.ItemBinding;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    List<MyModel> myModelList = new ArrayList<>();
    Context context;

    public Adapter(Context context, List<MyModel> myModelList) {
        this.myModelList = myModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemBinding itemBinding = ItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new MyViewHolder(itemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        MyModel item = myModelList.get(position);

        holder.binding.name.setText(item.getName());
        holder.binding.country.setText(item.getCountry());
        holder.binding.website.setText(item.getWeb_pages().get(0));

    }

    @Override
    public int getItemCount() {
        return myModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ItemBinding binding;

        public MyViewHolder(@NonNull ItemBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }
    }
}
