package com.example.viewbindng_java.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.viewbindng_java.R;
import com.example.viewbindng_java.adapter.BindAdapter;
import com.example.viewbindng_java.databinding.ActivityMainBinding;
import com.example.viewbindng_java.model.BindModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        List<BindModel> models = new ArrayList<>();
        models.add(new BindModel("God Of War 2018", "https://vigiato.net/wp-content/uploads/2021/10/10-1024x538.jpg"));
        models.add(new BindModel(" Assassin’s Creed Valhalla", "https://www.plaza.ir/wp-content/uploads/2020/05/assassins-creed-valhalla-update-9.jpg.webp"));
        models.add(new BindModel("  Uncharted 4: A Thief's End", "https://cdn.zoomg.ir/2016/05/uncharted-4-shakhes-1.jpg?w=1920"));
        models.add(new BindModel("  Resident Evil 4", "https://cdn.sargarme.com/uploads/2021/06/resident-evil-4.jpg"));
        models.add(new BindModel("God Of War 2018", "https://vigiato.net/wp-content/uploads/2021/10/10-1024x538.jpg"));
        models.add(new BindModel(" Assassin’s Creed Valhalla", "https://www.plaza.ir/wp-content/uploads/2020/05/assassins-creed-valhalla-update-9.jpg.webp"));
        models.add(new BindModel("  Uncharted 4: A Thief's End", "https://cdn.zoomg.ir/2016/05/uncharted-4-shakhes-1.jpg?w=1920"));
        BindAdapter adapter = new BindAdapter(models);
        binding.recycler.setAdapter(adapter);
        binding.recycler.setLayoutManager(new GridLayoutManager(getApplicationContext(), 1, RecyclerView.VERTICAL, false));
    }
}