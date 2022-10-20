package com.example.homework_4_1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homework_4_1.databinding.ItemContinentsBinding;

import java.util.ArrayList;

public class ContinentsAdapter extends RecyclerView.Adapter<ContinentsAdapter.ContinentsViewHolder> {

    private ArrayList<Continents> continentsList;
    private OnItenClick onItenClick;


    public ContinentsAdapter(ArrayList<Continents> continentsList, OnItenClick onItenClick) {
        this.continentsList = continentsList;
        this.onItenClick = onItenClick;
    }

    @NonNull
    @Override
    public ContinentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentsViewHolder(ItemContinentsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull ContinentsViewHolder holder, int position) {
        holder.bind(continentsList.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItenClick.inItemClick(position);

            }
        });
    }

    @Override
    public int getItemCount() {
        return continentsList.size();
    }

    class ContinentsViewHolder extends RecyclerView.ViewHolder {

        private ItemContinentsBinding binding;

        public ContinentsViewHolder(@NonNull ItemContinentsBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Continents continents) {
            binding.continents.setText(continents.getCountry());
            binding.imageContinents.setImageResource(continents.getFlag());
        }
    }
}
