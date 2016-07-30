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
import com.clubrecordar.recordar2016.cities.models.ValleModel;
import com.clubrecordar.recordar2016.detailsItem.valledupar.ValleDetEighthActivity;
import com.clubrecordar.recordar2016.detailsItem.valledupar.ValleDetEleventhActivity;
import com.clubrecordar.recordar2016.detailsItem.valledupar.ValleDetFifteenthActivity;
import com.clubrecordar.recordar2016.detailsItem.valledupar.ValleDetFifthActivity;
import com.clubrecordar.recordar2016.detailsItem.valledupar.ValleDetFirstActivity;
import com.clubrecordar.recordar2016.detailsItem.valledupar.ValleDetFourteenthActivity;
import com.clubrecordar.recordar2016.detailsItem.valledupar.ValleDetFourthActivity;
import com.clubrecordar.recordar2016.detailsItem.valledupar.ValleDetNinthActivity;
import com.clubrecordar.recordar2016.detailsItem.valledupar.ValleDetSecActivity;
import com.clubrecordar.recordar2016.detailsItem.valledupar.ValleDetSeventhActivity;
import com.clubrecordar.recordar2016.detailsItem.valledupar.ValleDetSixthActivity;
import com.clubrecordar.recordar2016.detailsItem.valledupar.ValleDetTenthActivity;
import com.clubrecordar.recordar2016.detailsItem.valledupar.ValleDetThirdActivity;
import com.clubrecordar.recordar2016.detailsItem.valledupar.ValleDetThirteenthActivity;
import com.clubrecordar.recordar2016.detailsItem.valledupar.ValleDetTwelvethActivity;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by willians on 24/7/16.
 */
public class ValleDetailAdapter extends RecyclerView.Adapter<ValleDetailAdapter.ValleDetailViewHolder> {
    private List<ValleModel> items;
    Context context;
    private Intent intent;


    public class ValleDetailViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        // campos respectivos de un item
        public ImageView idImagen;
        public TextView titulo_imagen;
        public TextView beneficio;

        public ValleDetailViewHolder (View v){
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
                    intent = new Intent(context, ValleDetFirstActivity.class);
                    context.startActivity(intent);
                    break;

                case 1:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, ValleDetSecActivity.class);
                    context.startActivity(intent);
                    break;

                case 2:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, ValleDetThirdActivity.class);
                    context.startActivity(intent);
                    break;

                case 3:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, ValleDetFourthActivity.class);
                    context.startActivity(intent);
                    break;

                case 4:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, ValleDetFifthActivity.class);
                    context.startActivity(intent);
                    break;

                case 5:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, ValleDetSixthActivity.class);
                    context.startActivity(intent);
                    break;

                case 6:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, ValleDetSeventhActivity.class);
                    context.startActivity(intent);
                    break;

                case 7:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, ValleDetEighthActivity.class);
                    context.startActivity(intent);
                    break;

                case 8:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, ValleDetNinthActivity.class);
                    context.startActivity(intent);
                    break;

                case 9:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, ValleDetTenthActivity.class);
                    context.startActivity(intent);
                    break;

                case 10:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, ValleDetEleventhActivity.class);
                    context.startActivity(intent);
                    break;

                case 11:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, ValleDetTwelvethActivity.class);
                    context.startActivity(intent);
                    break;
                case 12:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, ValleDetThirteenthActivity.class);
                    context.startActivity(intent);
                    break;
                case 13:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, ValleDetFourteenthActivity.class);
                    context.startActivity(intent);
                    break;
                case 14:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, ValleDetFifteenthActivity.class);
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

    public ValleDetailAdapter(List<ValleModel> items) {
        this.items = items;
    }

    @Override
    public ValleDetailViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.valle_card, viewGroup, false);
        return new ValleDetailViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ValleDetailViewHolder viewHolder, int position) {
        ValleModel currentItem = items.get(position);
        viewHolder.setTitle(currentItem.getTitulo_imagen());
        viewHolder.setBenefit(currentItem.getBeneficio());
        viewHolder.setImage(currentItem.getIdImagen());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
