package com.clubrecordar.recordar2016.cities;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.clubrecordar.recordar2016.R;
import com.clubrecordar.recordar2016.cities.adapters.ValleDetailAdapter;
import com.clubrecordar.recordar2016.cities.models.ValleModel;

import java.util.ArrayList;
import java.util.List;

public class ValleAlianceActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valle_aliance);

        List<ValleModel> items = new ArrayList<>();

        items.add(new ValleModel(R.drawable.a_nacional, "item1 valle titulo", "item1 description"));
        items.add(new ValleModel(R.drawable.ingles, "item2 valle titulo", "item2 description"));
        items.add(new ValleModel(R.drawable.tienda, "item3 valle titulo", "item3 description"));
        items.add(new ValleModel(R.drawable.a_nacional, "item4 valle titulo", "item4 description"));
        items.add(new ValleModel(R.drawable.ingles, "item5 valle titulo", "item5 description"));
        items.add(new ValleModel(R.drawable.tienda, "item6 valle titulo", "item6 description"));
        items.add(new ValleModel(R.drawable.a_nacional, "item7 valle titulo", "item7 descriptions"));
        items.add(new ValleModel(R.drawable.a_nacional, "item8 valle titulo", "item8 description"));
        items.add(new ValleModel(R.drawable.a_nacional, "item9 valle titulo", "item9 description"));
        items.add(new ValleModel(R.drawable.a_nacional, "item10 valle titulo", "item10 description"));
        items.add(new ValleModel(R.drawable.a_nacional, "item11 valle titulo", "item11 description"));
        items.add(new ValleModel(R.drawable.a_nacional, "item12 valle titulo", "item12 description"));
        items.add(new ValleModel(R.drawable.a_nacional, "item13 valle titulo", "item13 description"));
        items.add(new ValleModel(R.drawable.a_nacional, "item14 valle titulo", "item14 description"));
        items.add(new ValleModel(R.drawable.a_nacional, "item15 valle titulo", "item15 description"));


        recycler = (RecyclerView) findViewById(R.id.recyclerValle);
        recycler.setHasFixedSize(true);


        lManager = new LinearLayoutManager(this);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
            lManager = new GridLayoutManager(this, 2);
        else
            lManager = new LinearLayoutManager(this);

        recycler.setLayoutManager(lManager);

        //Crear un nuevo adaptador
        adapter = new ValleDetailAdapter(items);
        recycler.setAdapter(adapter);
    }
}
