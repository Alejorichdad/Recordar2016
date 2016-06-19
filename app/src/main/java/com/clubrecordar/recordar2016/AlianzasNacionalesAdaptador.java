package com.clubrecordar.recordar2016;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * GRUPO2
 * Este es el adaptador para la Activity dos,
 * Created by A on 17/05/2016.
 */
public class AlianzasNacionalesAdaptador extends RecyclerView.Adapter<AlianzasNacionalesAdaptador.DatosAlianzasNacionalesViewHolder> {
    private List<DatosAlianzasNacionales> items;

    public static class DatosAlianzasNacionalesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        // campos respectivos de un item
        public ImageView idImagen;
        public TextView titulo_imagen;
        public TextView beneficio;

        public DatosAlianzasNacionalesViewHolder (View v){
            super(v);
            itemView.setOnClickListener(this);

            idImagen = (ImageView) v.findViewById(R.id.idImagen);
            titulo_imagen = (TextView) v.findViewById(R.id.titulo_imagen);
            beneficio = (TextView) v.findViewById(R.id.beneficio);

        }

        @Override
        public void onClick(View v) {
            Toast.makeText(v.getContext(),"CLIKC",Toast.LENGTH_SHORT).show();
        }
    }

    public  AlianzasNacionalesAdaptador(List<DatosAlianzasNacionales> items){this.items = items;}

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public DatosAlianzasNacionalesViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.alianza_card, viewGroup, false);
        return new DatosAlianzasNacionalesViewHolder(v);
    }

    @Override
    public void onBindViewHolder(DatosAlianzasNacionalesViewHolder viewHolder, int i) {
        viewHolder.idImagen.setImageResource(items.get(i).getIdImagen());
        viewHolder.titulo_imagen.setText(items.get(i).getTitulo_imagen());
        viewHolder.beneficio.setText(items.get(i).getBeneficio());

        // viewHolder.beneficio.setText("Beneficio:"+String.valueOf(items.get(i).getBeneficio()));
    }





}