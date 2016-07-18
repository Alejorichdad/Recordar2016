package com.clubrecordar.recordar2016.cities;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.clubrecordar.recordar2016.R;
import com.clubrecordar.recordar2016.cities.adapters.NationalDetailAdapter;
import com.clubrecordar.recordar2016.cities.models.NationalModel;

import java.util.ArrayList;
import java.util.List;

public class NationalAlianceActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_national_aliance);


        List<NationalModel> items = new ArrayList<>();

        items.add(new NationalModel(R.drawable.a_nacional, "item1 titulo", "item1 description"));
        items.add(new NationalModel(R.drawable.ingles, "item2 titulo", "item2 description"));
        items.add(new NationalModel(R.drawable.tienda, "item3 titulo", "item3 description"));
        items.add(new NationalModel(R.drawable.a_nacional, "item4 titulo", "item4 description"));
        items.add(new NationalModel(R.drawable.ingles, "item5 titulo", "item5 description"));
        items.add(new NationalModel(R.drawable.tienda, "item6 titulo", "item6 description"));
        items.add(new NationalModel(R.drawable.a_nacional, "item7 titulo", "item7 descriptions"));
        items.add(new NationalModel(R.drawable.a_nacional, "item8 titulo", "item8 description"));
        items.add(new NationalModel(R.drawable.a_nacional, "item9 titulo", "item9 description"));
        items.add(new NationalModel(R.drawable.a_nacional, "item10 titulo", "item10 description"));
        items.add(new NationalModel(R.drawable.a_nacional, "item11 titulo", "item11 description"));
        items.add(new NationalModel(R.drawable.a_nacional, "item12 titulo", "item12 description"));
        items.add(new NationalModel(R.drawable.a_nacional, "item13 titulo", "item13 description"));
        items.add(new NationalModel(R.drawable.a_nacional, "item14 titulo", "item14 description"));
        items.add(new NationalModel(R.drawable.a_nacional, "item15 titulo", "item15 description"));


        recycler = (RecyclerView) findViewById(R.id.recyclerNational);
        recycler.setHasFixedSize(true);


        lManager = new LinearLayoutManager(this);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
            lManager = new GridLayoutManager(this, 2);
        else
            lManager = new LinearLayoutManager(this);

        recycler.setLayoutManager(lManager);

        //Crear un nuevo adaptador
        adapter = new NationalDetailAdapter(items);
        recycler.setAdapter(adapter);
    }
}
