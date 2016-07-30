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
    GRUPO2
    Esta es la Activity dos, donde se inicializa todas las alianzas  a nivel nacional
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

        items.add(new DatosAlianzasNacionales(R.drawable.alianzas, this.getString(R.string.national_title), this.getString(R.string.national_description)));
        items.add(new DatosAlianzasNacionales(R.drawable.barranquilla, this.getString(R.string.barranquilla_title), this.getString(R.string.barranquilla_description)));
        items.add(new DatosAlianzasNacionales(R.drawable.bogota, this.getString(R.string.bogota_title), this.getString(R.string.bogota_description)));
        items.add(new DatosAlianzasNacionales(R.drawable.boyaca, this.getString(R.string.boyaca_title), this.getString(R.string.boyaca_description)));
        items.add(new DatosAlianzasNacionales(R.drawable.cali, this.getString(R.string.cali_title), this.getString(R.string.cali_description)));
        items.add(new DatosAlianzasNacionales(R.drawable.cartagena, this.getString(R.string.cartagena_title), this.getString(R.string.cartagena_description)));
        items.add(new DatosAlianzasNacionales(R.drawable.valledupar, this.getString(R.string.valle_title), this.getString(R.string.valle_description)));
        items.add(new DatosAlianzasNacionales(R.drawable.pasto, this.getString(R.string.pasto_title), this.getString(R.string.pasto_description)));


        //Obtener el recycler

        recycler = (RecyclerView) findViewById(R.id.reciclador2);
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
