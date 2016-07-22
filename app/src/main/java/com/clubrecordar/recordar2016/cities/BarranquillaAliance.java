package com.clubrecordar.recordar2016.cities;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.clubrecordar.recordar2016.R;
import com.clubrecordar.recordar2016.cities.adapters.BarranquillaDetailAdapter;
import com.clubrecordar.recordar2016.cities.models.BarranquillaModel;

import java.util.ArrayList;
import java.util.List;

public class BarranquillaAliance extends AppCompatActivity {

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barranquilla_aliance);

        List<BarranquillaModel> items = new ArrayList<>();

        items.add(new BarranquillaModel(R.drawable.a_nacional, "item1 barranquilla titulo", "item1 description"));
        items.add(new BarranquillaModel(R.drawable.ingles, "item2 barranquilla titulo", "item2 description"));
        items.add(new BarranquillaModel(R.drawable.tienda, "item3 barranquilla titulo", "item3 description"));
        items.add(new BarranquillaModel(R.drawable.a_nacional, "item4 barranquilla titulo", "item4 description"));
        items.add(new BarranquillaModel(R.drawable.ingles, "item5 barranquilla titulo", "item5 description"));
        items.add(new BarranquillaModel(R.drawable.tienda, "item6 barranquilla titulo", "item6 description"));
        items.add(new BarranquillaModel(R.drawable.a_nacional, "item7 barranquilla titulo", "item7 descriptions"));
        items.add(new BarranquillaModel(R.drawable.a_nacional, "item8 barranquilla titulo", "item8 description"));
        items.add(new BarranquillaModel(R.drawable.a_nacional, "item9 barranquilla titulo", "item9 description"));
        items.add(new BarranquillaModel(R.drawable.a_nacional, "item10 barranquilla titulo", "item10 description"));
        items.add(new BarranquillaModel(R.drawable.a_nacional, "item11 barranquilla titulo", "item11 description"));
        items.add(new BarranquillaModel(R.drawable.a_nacional, "item12 barranquilla titulo", "item12 description"));
        items.add(new BarranquillaModel(R.drawable.a_nacional, "item13 barranquilla titulo", "item13 description"));
        items.add(new BarranquillaModel(R.drawable.a_nacional, "item14 barranquilla titulo", "item14 description"));
        items.add(new BarranquillaModel(R.drawable.a_nacional, "item15 barranquilla titulo", "item15 description"));


        recycler = (RecyclerView) findViewById(R.id.recyclerBarranquilla);
        recycler.setHasFixedSize(true);


        lManager = new LinearLayoutManager(this);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
            lManager = new GridLayoutManager(this, 2);
        else
            lManager = new LinearLayoutManager(this);

        recycler.setLayoutManager(lManager);

        //Crear un nuevo adaptador
        adapter = new BarranquillaDetailAdapter(items);
        recycler.setAdapter(adapter);
    }
}
