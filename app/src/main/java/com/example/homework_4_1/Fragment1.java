package com.example.homework_4_1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.homework_4_1.databinding.Fragment1Binding;

import java.util.ArrayList;


public class Fragment1 extends Fragment implements OnItenClick {
    private Fragment1Binding binding;
    private ArrayList<Continents> continentsList = new ArrayList<>();
    private ContinentsAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = Fragment1Binding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new ContinentsAdapter(continentsList, this::inItemClick);
        binding.recycle1.setAdapter(adapter);


    }

    private void loadData() {
        continentsList.add(new Continents(R.drawable.africa,"Africa"));
        continentsList.add(new Continents(R.drawable.australia,"Australia"));
        continentsList.add(new Continents(R.drawable.evrasia,"Eurasia"));
        continentsList.add(new Continents(R.drawable.north_america,"North America"));
        continentsList.add(new Continents(R.drawable.southamerica,"South America"));


    }

    @Override
    public void inItemClick(int position) {
        Fragment2 fragment2=new Fragment2();
        Bundle bundle=new Bundle();
        Continents continents=continentsList.get(position);
        bundle.putString("Key1",continents.getCountry());
        fragment2.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment2).addToBackStack(null).commit();




    }

}