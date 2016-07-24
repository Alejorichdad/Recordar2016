package com.clubrecordar.recordar2016.cities;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.clubrecordar.recordar2016.R;
import com.clubrecordar.recordar2016.cities.adapters.CaliDetailAdapter;
import com.clubrecordar.recordar2016.cities.models.CaliModel;

import java.util.ArrayList;
import java.util.List;

public class CaliAlianceActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cali_aliance);

        List<CaliModel> items = new ArrayList<>();

        items.add(new CaliModel(R.drawable.a_nacional, "item1 cali titulo", "item1 description"));
        items.add(new CaliModel(R.drawable.ingles, "item2 cali titulo", "item2 description"));
        items.add(new CaliModel(R.drawable.tienda, "item3 cali titulo", "item3 description"));
        items.add(new CaliModel(R.drawable.a_nacional, "item4 cali titulo", "item4 description"));
        items.add(new CaliModel(R.drawable.ingles, "item5 cali titulo", "item5 description"));
        items.add(new CaliModel(R.drawable.tienda, "item6 cali titulo", "item6 description"));
        items.add(new CaliModel(R.drawable.a_nacional, "item7 cali titulo", "item7 descriptions"));
        items.add(new CaliModel(R.drawable.a_nacional, "item8 cali titulo", "item8 description"));
        items.add(new CaliModel(R.drawable.a_nacional, "item9 cali titulo", "item9 description"));
        items.add(new CaliModel(R.drawable.a_nacional, "item10 cali titulo", "item10 description"));
        items.add(new CaliModel(R.drawable.a_nacional, "item11 cali titulo", "item11 description"));
        items.add(new CaliModel(R.drawable.a_nacional, "item12 cali titulo", "item12 description"));
        items.add(new CaliModel(R.drawable.a_nacional, "item13 cali titulo", "item13 description"));
        items.add(new CaliModel(R.drawable.a_nacional, "item14 cali titulo", "item14 description"));
        items.add(new CaliModel(R.drawable.a_nacional, "item15 cali titulo", "item15 description"));


        recycler = (RecyclerView) findViewById(R.id.recyclerCali);
        recycler.setHasFixedSize(true);


        lManager = new LinearLayoutManager(this);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
            lManager = new GridLayoutManager(this, 2);
        else
            lManager = new LinearLayoutManager(this);

        recycler.setLayoutManager(lManager);

        //Crear un nuevo adaptador
        adapter = new CaliDetailAdapter(items);
        recycler.setAdapter(adapter);
    }
}
