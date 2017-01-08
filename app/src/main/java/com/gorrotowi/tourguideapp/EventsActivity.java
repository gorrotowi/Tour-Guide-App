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

public class EventsActivity extends AppCompatActivity {

    RecyclerView rcEvents;
    AdapterGeneralList adapter;
    List<ItemRestaurant> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        rcEvents = (RecyclerView) findViewById(R.id.rcEvents);

        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        rcEvents.setLayoutManager(new LinearLayoutManager(this));

        data.add(new ItemRestaurant(0, getString(R.string.eventOne), getString(R.string.eventOneDescr), getString(R.string.eventOneLocation), 19.3945846, -99.1769924));
        data.add(new ItemRestaurant(0, getString(R.string.eventTwo), getString(R.string.eventTwoDescr), getString(R.string.eventTwoLocation), 19.4132082, -99.1741409));
//        data.add(new ItemRestaurant(0, getString(R.string.eventThree), getString(R.string.eventThreeDescr), getString(R.string.eventThreeLocation), 19.4353462, -99.1409855));
//        data.add(new ItemRestaurant(0, getString(R.string.eventFour), getString(R.string.eventFourDescr), getString(R.string.eventFourLocation), 19.4339019, -99.138742));

        adapter = new AdapterGeneralList(this, data);
        rcEvents.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
