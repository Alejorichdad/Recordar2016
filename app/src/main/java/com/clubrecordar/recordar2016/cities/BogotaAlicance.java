package com.clubrecordar.recordar2016.cities;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.clubrecordar.recordar2016.R;
import com.clubrecordar.recordar2016.cities.adapters.BogotaDetailAdapter;
import com.clubrecordar.recordar2016.cities.models.BogotaModel;

import java.util.ArrayList;
import java.util.List;

public class BogotaAlicance extends AppCompatActivity {

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bogota_alicance);

        List<BogotaModel> items = new ArrayList<>();

        items.add(new BogotaModel(R.drawable.a_nacional, "item1 bogota titulo", "item1 description"));
        items.add(new BogotaModel(R.drawable.ingles, "item2 bogota titulo", "item2 description"));
        items.add(new BogotaModel(R.drawable.tienda, "item3 bogota titulo", "item3 description"));
        items.add(new BogotaModel(R.drawable.a_nacional, "item4 bogota titulo", "item4 description"));
        items.add(new BogotaModel(R.drawable.ingles, "item5 bogota titulo", "item5 description"));
        items.add(new BogotaModel(R.drawable.tienda, "item6 bogota titulo", "item6 description"));
        items.add(new BogotaModel(R.drawable.a_nacional, "item7 bogota titulo", "item7 descriptions"));
        items.add(new BogotaModel(R.drawable.a_nacional, "item8 bogota titulo", "item8 description"));
        items.add(new BogotaModel(R.drawable.a_nacional, "item9 bogota titulo", "item9 description"));
        items.add(new BogotaModel(R.drawable.a_nacional, "item10 bogota titulo", "item10 description"));
        items.add(new BogotaModel(R.drawable.a_nacional, "item11 bogota titulo", "item11 description"));
        items.add(new BogotaModel(R.drawable.a_nacional, "item12 bogota titulo", "item12 description"));
        items.add(new BogotaModel(R.drawable.a_nacional, "item13 bogota titulo", "item13 description"));
        items.add(new BogotaModel(R.drawable.a_nacional, "item14 bogota titulo", "item14 description"));
        items.add(new BogotaModel(R.drawable.a_nacional, "item15 bogota titulo", "item15 description"));


        recycler = (RecyclerView) findViewById(R.id.recyclerBogota);
        recycler.setHasFixedSize(true);


        lManager = new LinearLayoutManager(this);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
            lManager = new GridLayoutManager(this, 2);
        else
            lManager = new LinearLayoutManager(this);

        recycler.setLayoutManager(lManager);

        //Crear un nuevo adaptador
        adapter = new BogotaDetailAdapter(items);
        recycler.setAdapter(adapter);
    }
}
