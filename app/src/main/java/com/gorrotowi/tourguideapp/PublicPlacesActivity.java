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

public class PublicPlacesActivity extends AppCompatActivity {

    List<ItemRestaurant> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_public_places);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        RecyclerView rcPublicPlaces = (RecyclerView) findViewById(R.id.rcPublicPlaces);

        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        rcPublicPlaces.setLayoutManager(new LinearLayoutManager(this));

        data.add(new ItemRestaurant(R.drawable.zocalo, getString(R.string.publicPlaceOne), getString(R.string.publicPlaceOneDescr), getString(R.string.publicPlaceOneLocation), 19.4326068, -99.1353936));
        data.add(new ItemRestaurant(R.drawable.bellasartes, getString(R.string.publicPlaceTwo), getString(R.string.publicPlaceTwoDescr), getString(R.string.publicPlaceTwoLocation), 19.4384396, -99.1891987));
        data.add(new ItemRestaurant(R.drawable.laalameda, getString(R.string.publicPlaceThree), getString(R.string.publicPlaceThreeDescr), getString(R.string.publicPlaceThreeLocation), 19.4357619, -99.1463079));
        data.add(new ItemRestaurant(R.drawable.bosquechapultepec, getString(R.string.publicPlaceFour), getString(R.string.publicPlaceFourDescr), getString(R.string.publicPlaceFourLocation), 19.4194865, -99.1916445));

        AdapterGeneralList adapter = new AdapterGeneralList(this, data);
        rcPublicPlaces.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
