package com.example.viewbindng_java.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.viewbindng_java.databinding.ItemBindBinding;
import com.example.viewbindng_java.model.BindModel;

import java.util.List;

public class BindAdapter extends RecyclerView.Adapter<BindViewHolder> {
    List<BindModel> models;

    public BindAdapter(List<BindModel> models) {
        this.models = models;
    }

    @NonNull
    @Override
    public BindViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BindViewHolder(ItemBindBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull BindViewHolder holder, int position) {
        holder.bindViews(models.get(position));
    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
