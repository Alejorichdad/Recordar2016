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
import com.clubrecordar.recordar2016.cities.models.BoyacaModel;
import com.clubrecordar.recordar2016.detailsItem.boyaca.BoyacaDetEighthActivity;
import com.clubrecordar.recordar2016.detailsItem.boyaca.BoyacaDetEleventhActivity;
import com.clubrecordar.recordar2016.detailsItem.boyaca.BoyacaDetFifteenthActivity;
import com.clubrecordar.recordar2016.detailsItem.boyaca.BoyacaDetFifthActivity;
import com.clubrecordar.recordar2016.detailsItem.boyaca.BoyacaDetFirstActivity;
import com.clubrecordar.recordar2016.detailsItem.boyaca.BoyacaDetFourteenthActivity;
import com.clubrecordar.recordar2016.detailsItem.boyaca.BoyacaDetFourthActivity;
import com.clubrecordar.recordar2016.detailsItem.boyaca.BoyacaDetNinthActivity;
import com.clubrecordar.recordar2016.detailsItem.boyaca.BoyacaDetSecActivity;
import com.clubrecordar.recordar2016.detailsItem.boyaca.BoyacaDetSeventhActivity;
import com.clubrecordar.recordar2016.detailsItem.boyaca.BoyacaDetSixthActivity;
import com.clubrecordar.recordar2016.detailsItem.boyaca.BoyacaDetTenthActivity;
import com.clubrecordar.recordar2016.detailsItem.boyaca.BoyacaDetThirdActivity;
import com.clubrecordar.recordar2016.detailsItem.boyaca.BoyacaDetThirteenthActivity;
import com.clubrecordar.recordar2016.detailsItem.boyaca.BoyacaDetTwelvethActivity;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by willians on 24/7/16.
 */
public class BoyacaDetailAdapter extends RecyclerView.Adapter<BoyacaDetailAdapter.BoyacaDetailViewHolder>{

    private List<BoyacaModel> items;
    Context context;
    private Intent intent;


    public class BoyacaDetailViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        // campos respectivos de un item
        public ImageView idImagen;
        public TextView titulo_imagen;
        public TextView beneficio;

        public BoyacaDetailViewHolder (View v){
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
                    intent = new Intent(context, BoyacaDetFirstActivity.class);
                    context.startActivity(intent);
                    break;

                case 1:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BoyacaDetSecActivity.class);
                    context.startActivity(intent);
                    break;

                case 2:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BoyacaDetThirdActivity.class);
                    context.startActivity(intent);
                    break;

                case 3:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BoyacaDetFourthActivity.class);
                    context.startActivity(intent);
                    break;

                case 4:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BoyacaDetFifthActivity.class);
                    context.startActivity(intent);
                    break;

                case 5:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BoyacaDetSixthActivity.class);
                    context.startActivity(intent);
                    break;

                case 6:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BoyacaDetSeventhActivity.class);
                    context.startActivity(intent);
                    break;

                case 7:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BoyacaDetEighthActivity.class);
                    context.startActivity(intent);
                    break;

                case 8:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BoyacaDetNinthActivity.class);
                    context.startActivity(intent);
                    break;

                case 9:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BoyacaDetTenthActivity.class);
                    context.startActivity(intent);
                    break;

                case 10:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BoyacaDetEleventhActivity.class);
                    context.startActivity(intent);
                    break;

                case 11:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BoyacaDetTwelvethActivity.class);
                    context.startActivity(intent);
                    break;
                case 12:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BoyacaDetThirteenthActivity.class);
                    context.startActivity(intent);
                    break;
                case 13:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BoyacaDetFourteenthActivity.class);
                    context.startActivity(intent);
                    break;
                case 14:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BoyacaDetFifteenthActivity.class);
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

    public BoyacaDetailAdapter(List<BoyacaModel> items) {
        this.items = items;
    }

    @Override
    public BoyacaDetailViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.boyaca_card, viewGroup, false);
        return new BoyacaDetailViewHolder(v);
    }

    @Override
    public void onBindViewHolder(BoyacaDetailViewHolder viewHolder, int position) {
        BoyacaModel currentItem = items.get(position);
        viewHolder.setTitle(currentItem.getTitulo_imagen());
        viewHolder.setBenefit(currentItem.getBeneficio());
        viewHolder.setImage(currentItem.getIdImagen());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
