package com.example.homework_4_1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.homework_4_1.databinding.Fragment2Binding;

import java.util.ArrayList;

public class Fragment2 extends Fragment implements OnItenClick {
    private Fragment2Binding binding;
    private ArrayList <Continents> continentsList2=new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=Fragment2Binding.inflate(inflater,container,false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);
        String name=getArguments().getString("Key1");
        Log.d("ololo", "onViewCreated: "+name);
        loadData(name);
        ContinentsAdapter adapter=new ContinentsAdapter(continentsList2, this::inItemClick);
        binding.recycle2.setAdapter(adapter);


    }

    private void loadData(String name) {
        if (name == "Africa") {
            continentsList2.add(new Continents(R.drawable.ic_benin_africa, "Benin"));
            continentsList2.add(new Continents(R.drawable.ic_aljir_africa, "Algeria"));
            continentsList2.add(new Continents(R.drawable.ic_mali_africa, "Mali"));
            continentsList2.add(new Continents(R.drawable.ic_chad_africa, "Chad"));
            continentsList2.add(new Continents(R.drawable.ic_tanzaniya_africa, "Tanzania"));
        }
        if (name == "Australia") {
            continentsList2.add(new Continents(R.drawable.australia, "Australia"));
            continentsList2.add(new Continents(R.drawable.ic_samoa_australia, "Samoa"));
            continentsList2.add(new Continents(R.drawable.ic_ostrov_pitkern_australia, "Pitcairn"));
            continentsList2.add(new Continents(R.drawable.ic_tonga_australia, "Tonga"));
            continentsList2.add(new Continents(R.drawable.ic_gaiti_australia, "Haiti"));

        }
        if (name == "Eurasia") {
            continentsList2.add(new Continents(R.drawable.ic_kirgizstan_eurasia, "Kyrgyzstan"));
            continentsList2.add(new Continents(R.drawable.ic_vietnam_eurasia, "Vietnam"));
            continentsList2.add(new Continents(R.drawable.ic_koreya_eurasia, "Korea"));
            continentsList2.add(new Continents(R.drawable.ic_acrotiri_eurasia, "Akrotiri"));
            continentsList2.add(new Continents(R.drawable.ic_austria_eurasia, "Austria"));
        }
        if (name == "North America") {
            continentsList2.add(new Continents(R.drawable.ic_canada_n_america, "Canada"));
            continentsList2.add(new Continents(R.drawable.ic_kliperton_n_america, "Kliperton"));
            continentsList2.add(new Continents(R.drawable.ic_usa_n_america, "USA"));
            continentsList2.add(new Continents(R.drawable.ic_gvatamela_n_america, "Gvatamela"));
            continentsList2.add(new Continents(R.drawable.ic_bermudskie_ostrova_n_america, "Bermuda"));

        }
        if (name == "South America") {
            continentsList2.add((new Continents(R.drawable.ic_argentina_s_america,"Argentina")));
            continentsList2.add((new Continents(R.drawable.ic_peru_s_america,"Peru")));
            continentsList2.add((new Continents(R.drawable.ic_columbia_s_america,"Columbia")));
            continentsList2.add((new Continents(R.drawable.ic_urugvai_s_america,"Uruguay")));
            continentsList2.add((new Continents(R.drawable.ic_gaiana_s_america,"Guyana")));

        }
    }


    @Override
    public void inItemClick(int position) {

    }
}