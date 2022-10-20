package com.example.homework_4_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.homework_4_1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportFragmentManager().beginTransaction().add(R.id.container, new Fragment1()).commit();
    }
}