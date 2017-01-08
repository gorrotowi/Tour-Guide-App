package com.gorrotowi.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.gorrotowi.tourguideapp.adapters.AdapterMainList;
import com.gorrotowi.tourguideapp.entitys.ItemMainList;
import com.gorrotowi.tourguideapp.listeners.RecyclerListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ItemMainList> data = new ArrayList<>();
    AdapterMainList adater;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.rcMain);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        data.add(new ItemMainList("Restaurants", R.drawable.store));
        data.add(new ItemMainList("Public Places", R.drawable.flower));
        data.add(new ItemMainList("Events", R.drawable.calendar));
        data.add(new ItemMainList("Attractions", R.drawable.airballoon));

        adater = new AdapterMainList(data, new RecyclerListener() {
            @Override
            public void onRecyclerListener(View view, int position) {
                Intent intent;
                switch (position) {
                    case 0:
                        intent = new Intent(MainActivity.this, RestaurantsActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(MainActivity.this, PublicPlacesActivity.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(MainActivity.this, EventsActivity.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(MainActivity.this, AttractionsActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        });

        recyclerView.setAdapter(adater);

    }
}