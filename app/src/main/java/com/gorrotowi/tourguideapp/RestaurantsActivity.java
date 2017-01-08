package com.gorrotowi.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.gorrotowi.tourguideapp.adapters.AdapterGeneralList;
import com.gorrotowi.tourguideapp.entitys.ItemRestaurant;

import java.util.ArrayList;
import java.util.List;

public class RestaurantsActivity extends AppCompatActivity {

    RecyclerView rcRestaurants;
    AdapterGeneralList adapter;
    List<ItemRestaurant> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        rcRestaurants = (RecyclerView) findViewById(R.id.rcRestaurants);

        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        rcRestaurants.setLayoutManager(new LinearLayoutManager(this));

        data.add(new ItemRestaurant(R.drawable.elcardenal, getString(R.string.restaurantOne), getString(R.string.restaurantOneDescr), getString(R.string.RestaurantOneLocation), 19.433692, -99.1352456));
        data.add(new ItemRestaurant(R.drawable.azulhistorico, getString(R.string.restaurantTwo), getString(R.string.restaurantTwoDescr), getString(R.string.RestaurantTwoLocation), 19.4317848, -99.1401701));
        data.add(new ItemRestaurant(R.drawable.cafetacuba, getString(R.string.restaurantThree), getString(R.string.restaurantThreeDescr), getString(R.string.RestaurantThreeLocation), 19.4353462, -99.1409855));
        data.add(new ItemRestaurant(R.drawable.perronegro, getString(R.string.restaurantFour), getString(R.string.restaurantFourDescr), getString(R.string.RestaurantFourLocation), 19.4339019, -99.138742));

        adapter = new AdapterGeneralList(this, data);
        rcRestaurants.setAdapter(adapter);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
