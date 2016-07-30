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
import com.clubrecordar.recordar2016.cities.models.CaliModel;
import com.clubrecordar.recordar2016.detailsItem.cali.CaliDetEighthActivity;
import com.clubrecordar.recordar2016.detailsItem.cali.CaliDetEleventhActivity;
import com.clubrecordar.recordar2016.detailsItem.cali.CaliDetFifteenthActivity;
import com.clubrecordar.recordar2016.detailsItem.cali.CaliDetFifthActivity;
import com.clubrecordar.recordar2016.detailsItem.cali.CaliDetFirstActivity;
import com.clubrecordar.recordar2016.detailsItem.cali.CaliDetFourteenthActivity;
import com.clubrecordar.recordar2016.detailsItem.cali.CaliDetFourthActivity;
import com.clubrecordar.recordar2016.detailsItem.cali.CaliDetNinthActivity;
import com.clubrecordar.recordar2016.detailsItem.cali.CaliDetSecActivity;
import com.clubrecordar.recordar2016.detailsItem.cali.CaliDetSeventhActivity;
import com.clubrecordar.recordar2016.detailsItem.cali.CaliDetSixthActivity;
import com.clubrecordar.recordar2016.detailsItem.cali.CaliDetTenthActivity;
import com.clubrecordar.recordar2016.detailsItem.cali.CaliDetThirdActivity;
import com.clubrecordar.recordar2016.detailsItem.cali.CaliDetThirteenthActivity;
import com.clubrecordar.recordar2016.detailsItem.cali.CaliDetTwelvethActivity;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by willians on 24/7/16.
 */
public class CaliDetailAdapter extends RecyclerView.Adapter<CaliDetailAdapter.CaliDetailViewHolder> {
    private List<CaliModel> items;
    Context context;
    private Intent intent;


    public class CaliDetailViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        // campos respectivos de un item
        public ImageView idImagen;
        public TextView titulo_imagen;
        public TextView beneficio;

        public CaliDetailViewHolder (View v){
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
                    intent = new Intent(context, CaliDetFirstActivity.class);
                    context.startActivity(intent);
                    break;

                case 1:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CaliDetSecActivity.class);
                    context.startActivity(intent);
                    break;

                case 2:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CaliDetThirdActivity.class);
                    context.startActivity(intent);
                    break;

                case 3:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CaliDetFourthActivity.class);
                    context.startActivity(intent);
                    break;

                case 4:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CaliDetFifthActivity.class);
                    context.startActivity(intent);
                    break;

                case 5:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CaliDetSixthActivity.class);
                    context.startActivity(intent);
                    break;

                case 6:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CaliDetSeventhActivity.class);
                    context.startActivity(intent);
                    break;

                case 7:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CaliDetEighthActivity.class);
                    context.startActivity(intent);
                    break;

                case 8:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CaliDetNinthActivity.class);
                    context.startActivity(intent);
                    break;

                case 9:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CaliDetTenthActivity.class);
                    context.startActivity(intent);
                    break;

                case 10:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CaliDetEleventhActivity.class);
                    context.startActivity(intent);
                    break;

                case 11:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CaliDetTwelvethActivity.class);
                    context.startActivity(intent);
                    break;
                case 12:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CaliDetThirteenthActivity.class);
                    context.startActivity(intent);
                    break;
                case 13:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CaliDetFourteenthActivity.class);
                    context.startActivity(intent);
                    break;
                case 14:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CaliDetFifteenthActivity.class);
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

    public CaliDetailAdapter(List<CaliModel> items) {
        this.items = items;
    }

    @Override
    public CaliDetailViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cali_card, viewGroup, false);
        return new CaliDetailViewHolder(v);
    }

    @Override
    public void onBindViewHolder(CaliDetailViewHolder viewHolder, int position) {
        CaliModel currentItem = items.get(position);
        viewHolder.setTitle(currentItem.getTitulo_imagen());
        viewHolder.setBenefit(currentItem.getBeneficio());
        viewHolder.setImage(currentItem.getIdImagen());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
