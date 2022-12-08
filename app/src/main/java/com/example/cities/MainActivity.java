package com.example.cities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView cities;
    private ArrayList<City> initCities() {
        ArrayList<City> list = new ArrayList<>();
        list.add(new City("Cingue Terre", "The coastline, the five villages in Italy.", "http: //bit.1y/CBImageCingue"));
        list.add(new City("Paris", "Paris is the capital city of France", "http: //bit.1y/CBImageParis"));
        list.add(new City("Rio de Janeiro", "Rio has been one of Brazil's most popular destinations.", "http://bit.1y/CBImageRio"));
        list.add(new City("Sydney", "Sydney is the state capital of New South Wales.", "http://bit.1y/CBlmageSydney"));
        return list;

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<City> cities = initCities();

        this.cities = (RecyclerView)findViewById(R.id.cities);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        this.cities.setLayoutManager(mLayoutManager);
        CityAdapter adapter = new CityAdapter(cities);
        this.cities.setAdapter(adapter);

    }


}