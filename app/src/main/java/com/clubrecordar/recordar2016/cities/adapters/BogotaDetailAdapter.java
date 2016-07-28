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
import com.clubrecordar.recordar2016.cities.models.BogotaModel;
import com.clubrecordar.recordar2016.detailsItem.bogota.BogotaDetEighthActivity;
import com.clubrecordar.recordar2016.detailsItem.bogota.BogotaDetEleventhActivity;
import com.clubrecordar.recordar2016.detailsItem.bogota.BogotaDetFifteenthActivity;
import com.clubrecordar.recordar2016.detailsItem.bogota.BogotaDetFifthActivity;
import com.clubrecordar.recordar2016.detailsItem.bogota.BogotaDetFirstActivity;
import com.clubrecordar.recordar2016.detailsItem.bogota.BogotaDetFourteenthActivity;
import com.clubrecordar.recordar2016.detailsItem.bogota.BogotaDetFourthActivity;
import com.clubrecordar.recordar2016.detailsItem.bogota.BogotaDetNinthActivity;
import com.clubrecordar.recordar2016.detailsItem.bogota.BogotaDetSecActivity;
import com.clubrecordar.recordar2016.detailsItem.bogota.BogotaDetSeventhActivity;
import com.clubrecordar.recordar2016.detailsItem.bogota.BogotaDetSixthActivity;
import com.clubrecordar.recordar2016.detailsItem.bogota.BogotaDetTenthActivity;
import com.clubrecordar.recordar2016.detailsItem.bogota.BogotaDetThirdActivity;
import com.clubrecordar.recordar2016.detailsItem.bogota.BogotaDetThirteenthActivity;
import com.clubrecordar.recordar2016.detailsItem.bogota.BogotaDetTwelvethActivity;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by willians on 24/7/16.
 */
public class BogotaDetailAdapter extends RecyclerView.Adapter<BogotaDetailAdapter.BogotaDetailViewHolder> {

    private List<BogotaModel> items;
    Context context;
    private Intent intent;


    public class BogotaDetailViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        // campos respectivos de un item
        public ImageView idImagen;
        public TextView titulo_imagen;
        public TextView beneficio;

        public BogotaDetailViewHolder (View v){
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
                    intent = new Intent(context, BogotaDetFirstActivity.class);
                    context.startActivity(intent);
                    break;

                case 1:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BogotaDetSecActivity.class);
                    context.startActivity(intent);
                    break;

                case 2:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BogotaDetThirdActivity.class);
                    context.startActivity(intent);
                    break;

                case 3:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BogotaDetFourthActivity.class);
                    context.startActivity(intent);
                    break;

                case 4:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BogotaDetFifthActivity.class);
                    context.startActivity(intent);
                    break;

                case 5:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BogotaDetSixthActivity.class);
                    context.startActivity(intent);
                    break;

                case 6:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BogotaDetSeventhActivity.class);
                    context.startActivity(intent);
                    break;

                case 7:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BogotaDetEighthActivity.class);
                    context.startActivity(intent);
                    break;

                case 8:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BogotaDetNinthActivity.class);
                    context.startActivity(intent);
                    break;

                case 9:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BogotaDetTenthActivity.class);
                    context.startActivity(intent);
                    break;

                case 10:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BogotaDetEleventhActivity.class);
                    context.startActivity(intent);
                    break;

                case 11:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BogotaDetTwelvethActivity.class);
                    context.startActivity(intent);
                    break;
                case 12:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BogotaDetThirteenthActivity.class);
                    context.startActivity(intent);
                    break;
                case 13:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BogotaDetFourteenthActivity.class);
                    context.startActivity(intent);
                    break;
                case 14:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BogotaDetFifteenthActivity.class);
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

    public BogotaDetailAdapter(List<BogotaModel> items) {
        this.items = items;
    }

    @Override
    public BogotaDetailViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.bogota_card, viewGroup, false);
        return new BogotaDetailViewHolder(v);
    }

    @Override
    public void onBindViewHolder(BogotaDetailViewHolder viewHolder, int position) {
        BogotaModel currentItem = items.get(position);
        viewHolder.setTitle(currentItem.getTitulo_imagen());
        viewHolder.setBenefit(currentItem.getBeneficio());
        viewHolder.setImage(currentItem.getIdImagen());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
