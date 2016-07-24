package com.clubrecordar.recordar2016.cities;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.clubrecordar.recordar2016.R;
import com.clubrecordar.recordar2016.cities.adapters.PastoDetailAdapter;
import com.clubrecordar.recordar2016.cities.models.PastoModel;

import java.util.ArrayList;
import java.util.List;

public class PastoAlianceActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasto_aliance);

        List<PastoModel> items = new ArrayList<>();

        items.add(new PastoModel(R.drawable.a_nacional, "item1 pasto titulo", "item1 description"));
        items.add(new PastoModel(R.drawable.ingles, "item2 pasto titulo", "item2 description"));
        items.add(new PastoModel(R.drawable.tienda, "item3 pasto titulo", "item3 description"));
        items.add(new PastoModel(R.drawable.a_nacional, "item4 pasto titulo", "item4 description"));
        items.add(new PastoModel(R.drawable.ingles, "item5 pasto titulo", "item5 description"));
        items.add(new PastoModel(R.drawable.tienda, "item6 pasto titulo", "item6 description"));
        items.add(new PastoModel(R.drawable.a_nacional, "item7 pasto titulo", "item7 descriptions"));
        items.add(new PastoModel(R.drawable.a_nacional, "item8 pasto titulo", "item8 description"));
        items.add(new PastoModel(R.drawable.a_nacional, "item9 pasto titulo", "item9 description"));
        items.add(new PastoModel(R.drawable.a_nacional, "item10 pasto titulo", "item10 description"));
        items.add(new PastoModel(R.drawable.a_nacional, "item11 pasto titulo", "item11 description"));
        items.add(new PastoModel(R.drawable.a_nacional, "item12 pasto titulo", "item12 description"));
        items.add(new PastoModel(R.drawable.a_nacional, "item13 pasto titulo", "item13 description"));
        items.add(new PastoModel(R.drawable.a_nacional, "item14 pasto titulo", "item14 description"));
        items.add(new PastoModel(R.drawable.a_nacional, "item15 pasto titulo", "item15 description"));


        recycler = (RecyclerView) findViewById(R.id.recyclerPasto);
        recycler.setHasFixedSize(true);


        lManager = new LinearLayoutManager(this);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
            lManager = new GridLayoutManager(this, 2);
        else
            lManager = new LinearLayoutManager(this);

        recycler.setLayoutManager(lManager);

        //Crear un nuevo adaptador
        adapter = new PastoDetailAdapter(items);
        recycler.setAdapter(adapter);
    }
}
