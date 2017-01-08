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

public class AttractionsActivity extends AppCompatActivity {

    RecyclerView rcAttractions;
    AdapterGeneralList adapter;
    List<ItemRestaurant> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attractions);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        rcAttractions = (RecyclerView) findViewById(R.id.rcAttractions);

        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        rcAttractions.setLayoutManager(new LinearLayoutManager(this));

        data.add(new ItemRestaurant(R.drawable.castillochapultepec, getString(R.string.attractionOne), getString(R.string.attractionOneDescr), getString(R.string.attractionOneLocation), 19.4136228, -99.1884795));
        data.add(new ItemRestaurant(R.drawable.angelindependencia, getString(R.string.attractionTwo), getString(R.string.attractionTwoDescr), getString(R.string.attractionTwoLocation), 19.424227, -99.171485));
        data.add(new ItemRestaurant(R.drawable.monumentorevolucion, getString(R.string.attractionThree), getString(R.string.attractionThreeDescr), getString(R.string.attractionThreeLocation), 19.424227, -99.171485));
        data.add(new ItemRestaurant(R.drawable.miradorlatino, getString(R.string.attractionFour), getString(R.string.attractionFourDescr), getString(R.string.attractionFourLocation), 19.4323517, -99.1466156));

        adapter = new AdapterGeneralList(this, data);
        rcAttractions.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
