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
import com.clubrecordar.recordar2016.cities.models.NationalModel;
import com.clubrecordar.recordar2016.detailsItem.national.NationalDetEighthActivity;
import com.clubrecordar.recordar2016.detailsItem.national.NationalDetEleventhActivity;
import com.clubrecordar.recordar2016.detailsItem.national.NationalDetFifteenthActivity;
import com.clubrecordar.recordar2016.detailsItem.national.NationalDetFifthActivity;
import com.clubrecordar.recordar2016.detailsItem.national.NationalDetFirstActivity;
import com.clubrecordar.recordar2016.detailsItem.national.NationalDetFourteenthActivity;
import com.clubrecordar.recordar2016.detailsItem.national.NationalDetFourthActivity;
import com.clubrecordar.recordar2016.detailsItem.national.NationalDetNinthActivity;
import com.clubrecordar.recordar2016.detailsItem.national.NationalDetSecActivity;
import com.clubrecordar.recordar2016.detailsItem.national.NationalDetSeventhActivity;
import com.clubrecordar.recordar2016.detailsItem.national.NationalDetSixthActivity;
import com.clubrecordar.recordar2016.detailsItem.national.NationalDetTenthActivity;
import com.clubrecordar.recordar2016.detailsItem.national.NationalDetThirdActivity;
import com.clubrecordar.recordar2016.detailsItem.national.NationalDetThirteenthActivity;
import com.clubrecordar.recordar2016.detailsItem.national.NationalDetTwelvethActivity;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by willians on 18/7/16.
 */
public class NationalDetailAdapter extends RecyclerView.Adapter<NationalDetailAdapter.NationalDetailViewHolder> {

    private List<NationalModel> items;
    Context context;
    private Intent intent;

    public class NationalDetailViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        // campos respectivos de un item
        public ImageView idImagen;
        public TextView titulo_imagen;
        public TextView beneficio;

        public NationalDetailViewHolder (View v){
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
                    intent = new Intent(context, NationalDetFirstActivity.class);
                    context.startActivity(intent);
                    break;
                case 1:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, NationalDetSecActivity.class);
                    context.startActivity(intent);
                    break;
                case 2:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, NationalDetThirdActivity.class);
                    context.startActivity(intent);
                    break;
                case 3:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, NationalDetFourthActivity.class);
                    context.startActivity(intent);
                    break;
                case 4:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, NationalDetFifthActivity.class);
                    context.startActivity(intent);
                    break;
                case 5:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, NationalDetSixthActivity.class);
                    context.startActivity(intent);
                    break;
                case 6:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, NationalDetSeventhActivity.class);
                    context.startActivity(intent);
                    break;
                case 7:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, NationalDetEighthActivity.class);
                    context.startActivity(intent);
                    break;
                case 8:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, NationalDetNinthActivity.class);
                    context.startActivity(intent);
                    break;
                case 9:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, NationalDetTenthActivity.class);
                    context.startActivity(intent);
                    break;
                case 10:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, NationalDetEleventhActivity.class);
                    context.startActivity(intent);
                    break;
                case 11:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, NationalDetTwelvethActivity.class);
                    context.startActivity(intent);
                    break;
                case 12:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, NationalDetThirteenthActivity.class);
                    context.startActivity(intent);
                    break;
                case 13:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, NationalDetFourteenthActivity.class);
                    context.startActivity(intent);
                    break;
                case 14:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, NationalDetFifteenthActivity.class);
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

    public  NationalDetailAdapter(List<NationalModel> items){this.items = items;}

    @Override
    public NationalDetailViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.national_card, viewGroup, false);
        return new NationalDetailViewHolder(v);
    }

    @Override
    public void onBindViewHolder(NationalDetailViewHolder viewHolder, int i) {
        NationalModel currentItem = items.get(i);
        viewHolder.setTitle(currentItem.getTitulo_imagen());
        viewHolder.setBenefit(currentItem.getBeneficio());
        viewHolder.setImage(currentItem.getIdImagen());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
