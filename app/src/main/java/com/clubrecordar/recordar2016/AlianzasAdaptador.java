package com.clubrecordar.recordar2016;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by A on 17/05/2016.
 */
public class AlianzasAdaptador extends RecyclerView.Adapter<AlianzasAdaptador.AlianzasViewHolder> {
   private List<Alianzas> items;

   public static class AlianzasViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
   // campos respectivos de un item
       public ImageView idImagen;
       public TextView titulo_imagen;
       public TextView beneficio;

       public AlianzasViewHolder (View v){
           super(v);
           itemView.setOnClickListener(this);

           idImagen = (ImageView) v.findViewById(R.id.idImagen);
           titulo_imagen = (TextView) v.findViewById(R.id.titulo_imagen);
           beneficio = (TextView) v.findViewById(R.id.beneficio);

       }

       @Override
       public void onClick(View v) {

          // Toast.makeText(v.getContext(),"CLIKC",Toast.LENGTH_SHORT).show();
       }
   }

    public  AlianzasAdaptador(List<Alianzas> items){ this.items = items;}

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
            viewHolder.idImagen.setImageResource(items.get(i).getIdImagen());
            viewHolder.titulo_imagen.setText(items.get(i).getTitulo_imagen());
            viewHolder.beneficio.setText(items.get(i).getBeneficio());

           // viewHolder.beneficio.setText("Beneficio:"+String.valueOf(items.get(i).getBeneficio()));
        }





}