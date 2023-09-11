package com.example.viewbindng_java.adapter;

import androidx.recyclerview.widget.RecyclerView;

import com.example.viewbindng_java.databinding.ItemBindBinding;
import com.example.viewbindng_java.model.BindModel;
import com.squareup.picasso.Picasso;

public class BindViewHolder extends RecyclerView.ViewHolder {
    ItemBindBinding binding;

    public BindViewHolder(ItemBindBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    void bindViews(BindModel model) {
        binding.name.setText(model.getName());
        Picasso.get().load(model.getImageUri()).into(binding.image);
    }
}
