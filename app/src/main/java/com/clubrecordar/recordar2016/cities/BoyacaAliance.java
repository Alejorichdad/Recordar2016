package com.clubrecordar.recordar2016.cities;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.clubrecordar.recordar2016.R;
import com.clubrecordar.recordar2016.cities.adapters.BoyacaDetailAdapter;
import com.clubrecordar.recordar2016.cities.models.BoyacaModel;
import com.clubrecordar.recordar2016.helpers.cities.ContentBoyaca;

import java.util.ArrayList;
import java.util.List;

public class BoyacaAliance extends AppCompatActivity {

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boyaca_aliance);

        List<BoyacaModel> items = new ArrayList<>();

        items = ContentBoyaca.getContentBoyaca();


        recycler = (RecyclerView) findViewById(R.id.recyclerBoyaca);
        recycler.setHasFixedSize(true);


        lManager = new LinearLayoutManager(this);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
            lManager = new GridLayoutManager(this, 2);
        else
            lManager = new LinearLayoutManager(this);

        recycler.setLayoutManager(lManager);

        //Crear un nuevo adaptador
        adapter = new BoyacaDetailAdapter(items);
        recycler.setAdapter(adapter);
    }
}
