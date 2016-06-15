package com.clubrecordar.recordar2016;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{





    /*
    Declarar instancias globales
     */

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Inicializar Alianzas

        List<Alianzas> items = new ArrayList<>();

        items.add(new Alianzas(R.drawable.a_nacional, "Alianzas", "Alianzas por todo el pais"));
        items.add(new Alianzas(R.drawable.ingles, "Curso Online", "Aprende inglés ¡¡ya!!"));
        items.add(new Alianzas(R.drawable.tienda, "Tienda Club", "Más y mejores ofertas Club"));
        items.add(new Alianzas(R.drawable.destacados, "Tienda Club", "Más y mejores ofertas Club"));


        //Obtener el recycler

        recycler = (RecyclerView) findViewById(R.id.reciclador);
        recycler.setHasFixedSize(true);

        // Usar un administrador para LinearLayout y dejar  dos columnas para recicler

        lManager = new LinearLayoutManager(this);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
            lManager = new GridLayoutManager(this, 2);
        else
            lManager = new LinearLayoutManager(this);

            recycler.setLayoutManager(lManager);

        //Crear un nuevo adaptador
        adapter = new AlianzasAdaptador(items);
        recycler.setAdapter(adapter);
    }

}

/*
    }
    */