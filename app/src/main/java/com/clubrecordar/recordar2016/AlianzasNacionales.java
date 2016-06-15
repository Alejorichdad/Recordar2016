package com.clubrecordar.recordar2016;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AlianzasNacionales extends AppCompatActivity{





    /*
    Declarar instancias globales
     */

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alianzas_nacionales);


        // Inicializar Alianzas Nacionales

        List<DatosAlianzasNacionales> items = new ArrayList<>();

        items.add(new DatosAlianzasNacionales(R.drawable.a_nacional, "Alianzas Nacionales", "Alianzas por todo el pais"));
        items.add(new DatosAlianzasNacionales(R.drawable.ingles, "Alianzas Barranquilla", "Aprende inglés ¡¡ya!!"));
        items.add(new DatosAlianzasNacionales(R.drawable.tienda, "Alianzas Bogotá", "Más y mejores ofertas Club"));
        items.add(new DatosAlianzasNacionales(R.drawable.a_nacional, "Alianzas Boyacá", "Alianzas por todo el pais"));
        items.add(new DatosAlianzasNacionales(R.drawable.ingles, "Alianzas Cali", "Aprende inglés ¡¡ya!!"));
        items.add(new DatosAlianzasNacionales(R.drawable.tienda, "Alianzas Cartagena", "Más y mejores ofertas Club"));
        items.add(new DatosAlianzasNacionales(R.drawable.a_nacional, "Alianzas Valledupar", "Alianzas por todo el pais"));
        items.add(new DatosAlianzasNacionales(R.drawable.a_nacional, "Alianzas Pasto", "Alianzas por todo el pais"));


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
        adapter = new AlianzasNacionalesAdaptador(items);
        recycler.setAdapter(adapter);
    }

}

/*
    }
    */
