package com.example.cities;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CityAdapter extends RecyclerView.Adapter<CityAdapter.ViewHolder>{


    static ArrayList<City> cities= new ArrayList<>();

    public CityAdapter(ArrayList<City> cities) {
        this.cities = cities;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_city,parent,false);
        return new ViewHolder(v);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder,   int position) {
        City city=cities.get(position);
        holder.name.setText(city.getName());
        holder.description.setText(city.getDescription());
        Picasso.get().load(city.getImgUrl()).into(holder.image) ;

    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public final View view;
        public final TextView name;
        public final TextView description;
        public final ImageView image;

        public ViewHolder(View view) {
            super(view);
            this.view = view;
            name = view.findViewById(R.id.name);
            description = view.findViewById(R.id.description);
            image = view.findViewById(R.id.image);
        }
    }
    @Override
        public int getItemCount() {
            if (cities != null) {
                return cities.size();
            } else {
                return 0;

            }
        }
    }