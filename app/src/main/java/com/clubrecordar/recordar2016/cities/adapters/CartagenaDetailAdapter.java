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
import com.clubrecordar.recordar2016.cities.models.CartagenaModel;
import com.clubrecordar.recordar2016.detailsItem.cartagena.CartagenaDetEighthActivity;
import com.clubrecordar.recordar2016.detailsItem.cartagena.CartagenaDetEleventhActivity;
import com.clubrecordar.recordar2016.detailsItem.cartagena.CartagenaDetFifteenthActivity;
import com.clubrecordar.recordar2016.detailsItem.cartagena.CartagenaDetFifthActivity;
import com.clubrecordar.recordar2016.detailsItem.cartagena.CartagenaDetFirstActivity;
import com.clubrecordar.recordar2016.detailsItem.cartagena.CartagenaDetFourteenthActivity;
import com.clubrecordar.recordar2016.detailsItem.cartagena.CartagenaDetFourthActivity;
import com.clubrecordar.recordar2016.detailsItem.cartagena.CartagenaDetNinthActivity;
import com.clubrecordar.recordar2016.detailsItem.cartagena.CartagenaDetSecActivity;
import com.clubrecordar.recordar2016.detailsItem.cartagena.CartagenaDetSeventhActivity;
import com.clubrecordar.recordar2016.detailsItem.cartagena.CartagenaDetSixthActivity;
import com.clubrecordar.recordar2016.detailsItem.cartagena.CartagenaDetTenthActivity;
import com.clubrecordar.recordar2016.detailsItem.cartagena.CartagenaDetThirdActivity;
import com.clubrecordar.recordar2016.detailsItem.cartagena.CartagenaDetThirteenthActivity;
import com.clubrecordar.recordar2016.detailsItem.cartagena.CartagenaDetTwelvethActivity;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by willians on 24/7/16.
 */
public class CartagenaDetailAdapter extends RecyclerView.Adapter<CartagenaDetailAdapter.CartagenaDetailViewHolder>{
    private List<CartagenaModel> items;
    Context context;
    private Intent intent;


    public class CartagenaDetailViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        // campos respectivos de un item
        public ImageView idImagen;
        public TextView titulo_imagen;
        public TextView beneficio;

        public CartagenaDetailViewHolder (View v){
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
                    intent = new Intent(context, CartagenaDetFirstActivity.class);
                    context.startActivity(intent);
                    break;

                case 1:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CartagenaDetSecActivity.class);
                    context.startActivity(intent);
                    break;

                case 2:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CartagenaDetThirdActivity.class);
                    context.startActivity(intent);
                    break;

                case 3:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CartagenaDetFourthActivity.class);
                    context.startActivity(intent);
                    break;

                case 4:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CartagenaDetFifthActivity.class);
                    context.startActivity(intent);
                    break;

                case 5:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CartagenaDetSixthActivity.class);
                    context.startActivity(intent);
                    break;

                case 6:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CartagenaDetSeventhActivity.class);
                    context.startActivity(intent);
                    break;

                case 7:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CartagenaDetEighthActivity.class);
                    context.startActivity(intent);
                    break;

                case 8:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CartagenaDetNinthActivity.class);
                    context.startActivity(intent);
                    break;

                case 9:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CartagenaDetTenthActivity.class);
                    context.startActivity(intent);
                    break;

                case 10:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CartagenaDetEleventhActivity.class);
                    context.startActivity(intent);
                    break;

                case 11:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CartagenaDetTwelvethActivity.class);
                    context.startActivity(intent);
                    break;
                case 12:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CartagenaDetThirteenthActivity.class);
                    context.startActivity(intent);
                    break;
                case 13:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CartagenaDetFourteenthActivity.class);
                    context.startActivity(intent);
                    break;
                case 14:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CartagenaDetFifteenthActivity.class);
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

    public CartagenaDetailAdapter(List<CartagenaModel> items) {
        this.items = items;
    }

    @Override
    public CartagenaDetailViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cartagena_card, viewGroup, false);
        return new CartagenaDetailViewHolder(v);
    }

    @Override
    public void onBindViewHolder(CartagenaDetailViewHolder viewHolder, int position) {
        CartagenaModel currentItem = items.get(position);
        viewHolder.setTitle(currentItem.getTitulo_imagen());
        viewHolder.setBenefit(currentItem.getBeneficio());
        viewHolder.setImage(currentItem.getIdImagen());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
