package com.clubrecordar.recordar2016.cities.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.clubrecordar.recordar2016.R;
import com.clubrecordar.recordar2016.cities.models.BarranquillaModel;
import com.clubrecordar.recordar2016.detailsItem.barranquilla.BarranquillaDetFirstActivity;
import com.clubrecordar.recordar2016.detailsItem.barranquilla.BarranquillaDetSecActivity;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by willians on 22/7/16.
 */
public class BarranquillaDetailAdapter extends RecyclerView.Adapter<BarranquillaDetailAdapter.BarranquillaDetailViewHolder> {
    private List<BarranquillaModel> items;
    Context context;
    private Intent intent;


    public class BarranquillaDetailViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        // campos respectivos de un item
        public ImageView idImagen;
        public TextView titulo_imagen;
        public TextView beneficio;

        public BarranquillaDetailViewHolder (View v){
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
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BarranquillaDetFirstActivity.class);
                    context.startActivity(intent);
                    break;

                case 1:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BarranquillaDetSecActivity.class);
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

    public BarranquillaDetailAdapter(List<BarranquillaModel> items) {
        this.items = items;
    }

    @Override
    public BarranquillaDetailViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.barranquilla_card, viewGroup, false);
        return new BarranquillaDetailViewHolder(v);
    }

    @Override
    public void onBindViewHolder(BarranquillaDetailViewHolder viewHolder, int position) {
        BarranquillaModel currentItem = items.get(position);
        viewHolder.setTitle(currentItem.getTitulo_imagen());
        viewHolder.setBenefit(currentItem.getBeneficio());
        viewHolder.setImage(currentItem.getIdImagen());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
