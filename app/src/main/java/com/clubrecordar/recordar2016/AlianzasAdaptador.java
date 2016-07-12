package com.clubrecordar.recordar2016;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * GRUPO1
 * Este es el adaptador de las Alianzas del primer grupo y para la MainActivity
 * Created by A on 17/05/2016.
 *
 */
public class AlianzasAdaptador extends RecyclerView.Adapter<AlianzasAdaptador.AlianzasViewHolder> {
    private ArrayList<Alianzas> items;
    Context context;
    private Intent intent;

    public class AlianzasViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        // campos respectivos de un item
        public ImageView idImagen;
        public TextView titulo_imagen;
        public TextView beneficio;



        //public String COURSE_URL = "http://clubrecordar.com/foro/";

        public AlianzasViewHolder (View v){
            super(v);
            context = v.getContext();
            itemView.setOnClickListener(this);

            idImagen = (ImageView) v.findViewById(R.id.idImagen);
            titulo_imagen = (TextView) v.findViewById(R.id.titulo_imagen);
            beneficio = (TextView) v.findViewById(R.id.beneficio);

        }

        @Override
        public void onClick(View v) {
            switch (getLayoutPosition()){
                case 0:
                    intent = new Intent(context, AlianzasNacionales.class);
                    context.startActivity(intent);
                    break;
                case 1:
                    intent = new Intent(context, CourseActivity.class);
                    context.startActivity(intent);
                    break;
                case 2:
                    intent = new Intent(context, StoreActivity.class);
                    context.startActivity(intent);
                    break;
                case 3:
                    intent = new Intent(context, EventsActivity.class);
                    context.startActivity(intent);
                    break;
            }
            //intent = new Intent(context, AlianzasNacionales.class);
            //context.startActivity(intent);
            //Toast.makeText(v.getContext(), "Position: " + getLayoutPosition(), Toast.LENGTH_LONG).show();
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

    public  AlianzasAdaptador(ArrayList<Alianzas> items){ this.items = items;}

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public AlianzasViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.alianzas_nacionalescard, viewGroup, false);
        return new AlianzasViewHolder(v);
    }

    @Override
    public void onBindViewHolder(AlianzasViewHolder viewHolder, int i) {
        /*viewHolder.idImagen.setImageResource(items.get(i).getIdImagen());
        viewHolder.titulo_imagen.setText(items.get(i).getTitulo_imagen());
        viewHolder.beneficio.setText(items.get(i).getBeneficio());*/

        Alianzas currentItem = items.get(i);
        viewHolder.setTitle(currentItem.getTitulo_imagen());
        viewHolder.setBenefit(currentItem.getBeneficio());
        viewHolder.setImage(currentItem.getIdImagen());


        // viewHolder.beneficio.setText("Beneficio:"+String.valueOf(items.get(i).getBeneficio()));
    }





}
