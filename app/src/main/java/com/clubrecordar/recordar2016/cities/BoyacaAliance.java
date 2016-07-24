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

        items.add(new BoyacaModel(R.drawable.a_nacional, "item1 boyaca titulo", "item1 description"));
        items.add(new BoyacaModel(R.drawable.ingles, "item2 boyaca titulo", "item2 description"));
        items.add(new BoyacaModel(R.drawable.tienda, "item3 boyaca titulo", "item3 description"));
        items.add(new BoyacaModel(R.drawable.a_nacional, "item4 boyaca titulo", "item4 description"));
        items.add(new BoyacaModel(R.drawable.ingles, "item5 boyaca titulo", "item5 description"));
        items.add(new BoyacaModel(R.drawable.tienda, "item6 boyaca titulo", "item6 description"));
        items.add(new BoyacaModel(R.drawable.a_nacional, "item7 boyaca titulo", "item7 descriptions"));
        items.add(new BoyacaModel(R.drawable.a_nacional, "item8 boyaca titulo", "item8 description"));
        items.add(new BoyacaModel(R.drawable.a_nacional, "item9 boyaca titulo", "item9 description"));
        items.add(new BoyacaModel(R.drawable.a_nacional, "item10 boyaca titulo", "item10 description"));
        items.add(new BoyacaModel(R.drawable.a_nacional, "item11 boyaca titulo", "item11 description"));
        items.add(new BoyacaModel(R.drawable.a_nacional, "item12 boyaca titulo", "item12 description"));
        items.add(new BoyacaModel(R.drawable.a_nacional, "item13 boyaca titulo", "item13 description"));
        items.add(new BoyacaModel(R.drawable.a_nacional, "item14 boyaca titulo", "item14 description"));
        items.add(new BoyacaModel(R.drawable.a_nacional, "item15 boyaca titulo", "item15 description"));


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
