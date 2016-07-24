package com.clubrecordar.recordar2016.cities;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.clubrecordar.recordar2016.R;
import com.clubrecordar.recordar2016.cities.adapters.CartagenaDetailAdapter;
import com.clubrecordar.recordar2016.cities.models.CartagenaModel;

import java.util.ArrayList;
import java.util.List;

public class CartagenaAlianceActivity extends AppCompatActivity {
    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartagena_aliance);

        List<CartagenaModel> items = new ArrayList<>();

        items.add(new CartagenaModel(R.drawable.a_nacional, "item1 cartagena titulo", "item1 description"));
        items.add(new CartagenaModel(R.drawable.ingles, "item2 cartagena titulo", "item2 description"));
        items.add(new CartagenaModel(R.drawable.tienda, "item3 cartagena titulo", "item3 description"));
        items.add(new CartagenaModel(R.drawable.a_nacional, "item4 cartagena titulo", "item4 description"));
        items.add(new CartagenaModel(R.drawable.ingles, "item5 cartagena titulo", "item5 description"));
        items.add(new CartagenaModel(R.drawable.tienda, "item6 cartagena titulo", "item6 description"));
        items.add(new CartagenaModel(R.drawable.a_nacional, "item7 cartagena titulo", "item7 descriptions"));
        items.add(new CartagenaModel(R.drawable.a_nacional, "item8 cartagena titulo", "item8 description"));
        items.add(new CartagenaModel(R.drawable.a_nacional, "item9 cartagena titulo", "item9 description"));
        items.add(new CartagenaModel(R.drawable.a_nacional, "item10 cartagena titulo", "item10 description"));
        items.add(new CartagenaModel(R.drawable.a_nacional, "item11 cartagena titulo", "item11 description"));
        items.add(new CartagenaModel(R.drawable.a_nacional, "item12 cartagena titulo", "item12 description"));
        items.add(new CartagenaModel(R.drawable.a_nacional, "item13 cartagena titulo", "item13 description"));
        items.add(new CartagenaModel(R.drawable.a_nacional, "item14 cartagena titulo", "item14 description"));
        items.add(new CartagenaModel(R.drawable.a_nacional, "item15 cartagena titulo", "item15 description"));


        recycler = (RecyclerView) findViewById(R.id.recyclerCartagena);
        recycler.setHasFixedSize(true);


        lManager = new LinearLayoutManager(this);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
            lManager = new GridLayoutManager(this, 2);
        else
            lManager = new LinearLayoutManager(this);

        recycler.setLayoutManager(lManager);

        //Crear un nuevo adaptador
        adapter = new CartagenaDetailAdapter(items);
        recycler.setAdapter(adapter);
    }
}
