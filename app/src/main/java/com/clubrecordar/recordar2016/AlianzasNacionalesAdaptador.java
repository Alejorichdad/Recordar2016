package com.clubrecordar.recordar2016;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.clubrecordar.recordar2016.cities.BarranquillaAliance;
import com.clubrecordar.recordar2016.cities.BogotaAlicance;
import com.clubrecordar.recordar2016.cities.BoyacaAliance;
import com.clubrecordar.recordar2016.cities.CaliAlianceActivity;
import com.clubrecordar.recordar2016.cities.CartagenaAlianceActivity;
import com.clubrecordar.recordar2016.cities.NationalAlianceActivity;
import com.clubrecordar.recordar2016.cities.PastoAlianceActivity;
import com.clubrecordar.recordar2016.cities.ValleAlianceActivity;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * GRUPO2
 * Este es el adaptador para la Activity dos,
 * Created by A on 17/05/2016.
 */
public class AlianzasNacionalesAdaptador extends RecyclerView.Adapter<AlianzasNacionalesAdaptador.DatosAlianzasNacionalesViewHolder> {
    private List<DatosAlianzasNacionales> items;
    Context context;
    private Intent intent;

    public class DatosAlianzasNacionalesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        // campos respectivos de un item
        public ImageView idImagen;
        public TextView titulo_imagen;
        public TextView beneficio;

        public DatosAlianzasNacionalesViewHolder (View v){
            super(v);
            context = v.getContext();
            itemView.setOnClickListener(this);

            idImagen = (ImageView) v.findViewById(R.id.idImagen);
            titulo_imagen = (TextView) v.findViewById(R.id.titulo_imagen);
            beneficio = (TextView) v.findViewById(R.id.beneficio);

        }

        @Override
        public void onClick(View v) {
            //Toast.makeText(v.getContext(),"CLIKC",Toast.LENGTH_SHORT).show();

            switch (getLayoutPosition()){
                case 0:
                    intent = new Intent(context, NationalAlianceActivity.class);
                    context.startActivity(intent);
                    break;
                case 1:
                    intent = new Intent(context, BarranquillaAliance.class);
                    context.startActivity(intent);
                    break;
                case 2:
                    intent = new Intent(context, BogotaAlicance.class);
                    context.startActivity(intent);
                    break;
                case 3:
                    intent = new Intent(context, BoyacaAliance.class);
                    context.startActivity(intent);
                    break;
                case 4:
                    intent = new Intent(context, CaliAlianceActivity.class);
                    context.startActivity(intent);
                    break;
                case 5:
                    intent = new Intent(context, CartagenaAlianceActivity.class);
                    context.startActivity(intent);
                    break;
                case 6:
                    intent = new Intent(context, ValleAlianceActivity.class);
                    context.startActivity(intent);
                    break;
                case 7:
                    intent = new Intent(context, PastoAlianceActivity.class);
                    context.startActivity(intent);
                    break;
            }
        }

        public void setTitle(String title){
            titulo_imagen.setText(title);
        }

        public void setBenefit(String benefit){
            beneficio.setText(benefit);
        }

        public void setImage(int urlImg){
            //Log.e(context.toString(),"ssss");
            Picasso.with(context)
                    .load(urlImg)
                    .fit()
                    .centerCrop()
                    .into(idImagen);
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
        /*viewHolder.idImagen.setImageResource(items.get(i).getIdImagen());
        viewHolder.titulo_imagen.setText(items.get(i).getTitulo_imagen());
        viewHolder.beneficio.setText(items.get(i).getBeneficio());*/

        DatosAlianzasNacionales currentItem = items.get(i);
        viewHolder.setTitle(currentItem.getTitulo_imagen());
        viewHolder.setBenefit(currentItem.getBeneficio());
        viewHolder.setImage(currentItem.getIdImagen());

        // viewHolder.beneficio.setText("Beneficio:"+String.valueOf(items.get(i).getBeneficio()));
    }





}