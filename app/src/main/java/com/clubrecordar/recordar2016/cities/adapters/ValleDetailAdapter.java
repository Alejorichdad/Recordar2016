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
import com.clubrecordar.recordar2016.helpers.detail.DetailValle;
import com.squareup.picasso.Picasso;

import org.json.JSONException;

import java.util.List;

/**
 * Created by willians on 24/7/16.
 */
public class ValleDetailAdapter extends RecyclerView.Adapter<ValleDetailAdapter.ValleDetailViewHolder> {
    private List<ValleModel> items;
    Context context;
    private Intent intent;

    public String title;
    public String description;
    public String phone;
    public String email;
    public String coords;

    public int image;


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
                    try {
                        title = (String) DetailValle.getDetailValle().getJSONObject("item1").get("title");
                        description = (String) DetailValle.getDetailValle().getJSONObject("item1").get("description");
                        phone = (String) DetailValle.getDetailValle().getJSONObject("item1").get("phone");
                        email = (String) DetailValle.getDetailValle().getJSONObject("item1").get("email");
                        coords = (String) DetailValle.getDetailValle().getJSONObject("item1").get("coords");
                        image = (int) DetailValle.getDetailValle().getJSONObject("item1").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, ValleDetFirstActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;

                case 1:
                    try {
                        title = (String) DetailValle.getDetailValle().getJSONObject("item2").get("title");
                        description = (String) DetailValle.getDetailValle().getJSONObject("item2").get("description");
                        phone = (String) DetailValle.getDetailValle().getJSONObject("item2").get("phone");
                        email = (String) DetailValle.getDetailValle().getJSONObject("item2").get("email");
                        coords = (String) DetailValle.getDetailValle().getJSONObject("item2").get("coords");
                        image = (int) DetailValle.getDetailValle().getJSONObject("item2").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, ValleDetSecActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;

                case 2:
                    try {
                        title = (String) DetailValle.getDetailValle().getJSONObject("item3").get("title");
                        description = (String) DetailValle.getDetailValle().getJSONObject("item3").get("description");
                        phone = (String) DetailValle.getDetailValle().getJSONObject("item3").get("phone");
                        email = (String) DetailValle.getDetailValle().getJSONObject("item3").get("email");
                        coords = (String) DetailValle.getDetailValle().getJSONObject("item3").get("coords");
                        image = (int) DetailValle.getDetailValle().getJSONObject("item3").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, ValleDetThirdActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;

                case 3:
                    try {
                        title = (String) DetailValle.getDetailValle().getJSONObject("item4").get("title");
                        description = (String) DetailValle.getDetailValle().getJSONObject("item4").get("description");
                        phone = (String) DetailValle.getDetailValle().getJSONObject("item4").get("phone");
                        email = (String) DetailValle.getDetailValle().getJSONObject("item4").get("email");
                        coords = (String) DetailValle.getDetailValle().getJSONObject("item4").get("coords");
                        image = (int) DetailValle.getDetailValle().getJSONObject("item4").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, ValleDetFourthActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;

                case 4:
                    try {
                        title = (String) DetailValle.getDetailValle().getJSONObject("item5").get("title");
                        description = (String) DetailValle.getDetailValle().getJSONObject("item5").get("description");
                        phone = (String) DetailValle.getDetailValle().getJSONObject("item5").get("phone");
                        email = (String) DetailValle.getDetailValle().getJSONObject("item5").get("email");
                        coords = (String) DetailValle.getDetailValle().getJSONObject("item5").get("coords");
                        image = (int) DetailValle.getDetailValle().getJSONObject("item5").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, ValleDetFifthActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;

                case 5:
                    try {
                        title = (String) DetailValle.getDetailValle().getJSONObject("item6").get("title");
                        description = (String) DetailValle.getDetailValle().getJSONObject("item6").get("description");
                        phone = (String) DetailValle.getDetailValle().getJSONObject("item6").get("phone");
                        email = (String) DetailValle.getDetailValle().getJSONObject("item6").get("email");
                        coords = (String) DetailValle.getDetailValle().getJSONObject("item6").get("coords");
                        image = (int) DetailValle.getDetailValle().getJSONObject("item6").get("image");


                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, ValleDetSixthActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;

                case 6:
                    try {
                        title = (String) DetailValle.getDetailValle().getJSONObject("item7").get("title");
                        description = (String) DetailValle.getDetailValle().getJSONObject("item7").get("description");
                        phone = (String) DetailValle.getDetailValle().getJSONObject("item7").get("phone");
                        email = (String) DetailValle.getDetailValle().getJSONObject("item7").get("email");
                        coords = (String) DetailValle.getDetailValle().getJSONObject("item7").get("coords");
                        image = (int) DetailValle.getDetailValle().getJSONObject("item7").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, ValleDetSeventhActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;

                case 7:
                    try {
                        title = (String) DetailValle.getDetailValle().getJSONObject("item8").get("title");
                        description = (String) DetailValle.getDetailValle().getJSONObject("item8").get("description");
                        phone = (String) DetailValle.getDetailValle().getJSONObject("item8").get("phone");
                        email = (String) DetailValle.getDetailValle().getJSONObject("item8").get("email");
                        coords = (String) DetailValle.getDetailValle().getJSONObject("item8").get("coords");
                        image = (int) DetailValle.getDetailValle().getJSONObject("item8").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, ValleDetEighthActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;

                case 8:
                    try {
                        title = (String) DetailValle.getDetailValle().getJSONObject("item9").get("title");
                        description = (String) DetailValle.getDetailValle().getJSONObject("item9").get("description");
                        phone = (String) DetailValle.getDetailValle().getJSONObject("item9").get("phone");
                        email = (String) DetailValle.getDetailValle().getJSONObject("item9").get("email");
                        coords = (String) DetailValle.getDetailValle().getJSONObject("item9").get("coords");
                        image = (int) DetailValle.getDetailValle().getJSONObject("item9").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, ValleDetNinthActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;

                case 9:
                    try {
                        title = (String) DetailValle.getDetailValle().getJSONObject("item10").get("title");
                        description = (String) DetailValle.getDetailValle().getJSONObject("item10").get("description");
                        phone = (String) DetailValle.getDetailValle().getJSONObject("item10").get("phone");
                        email = (String) DetailValle.getDetailValle().getJSONObject("item10").get("email");
                        coords = (String) DetailValle.getDetailValle().getJSONObject("item10").get("coords");
                        image = (int) DetailValle.getDetailValle().getJSONObject("item10").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, ValleDetTenthActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;

                case 10:
                    try {
                        title = (String) DetailValle.getDetailValle().getJSONObject("item11").get("title");
                        description = (String) DetailValle.getDetailValle().getJSONObject("item11").get("description");
                        phone = (String) DetailValle.getDetailValle().getJSONObject("item11").get("phone");
                        email = (String) DetailValle.getDetailValle().getJSONObject("item11").get("email");
                        coords = (String) DetailValle.getDetailValle().getJSONObject("item11").get("coords");
                        image = (int) DetailValle.getDetailValle().getJSONObject("item11").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, ValleDetEleventhActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;

                case 11:
                    try {
                        title = (String) DetailValle.getDetailValle().getJSONObject("item12").get("title");
                        description = (String) DetailValle.getDetailValle().getJSONObject("item12").get("description");
                        phone = (String) DetailValle.getDetailValle().getJSONObject("item12").get("phone");
                        email = (String) DetailValle.getDetailValle().getJSONObject("item12").get("email");
                        coords = (String) DetailValle.getDetailValle().getJSONObject("item12").get("coords");
                        image = (int) DetailValle.getDetailValle().getJSONObject("item12").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, ValleDetTwelvethActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;
                case 12:
                    try {
                        title = (String) DetailValle.getDetailValle().getJSONObject("item13").get("title");
                        description = (String) DetailValle.getDetailValle().getJSONObject("item13").get("description");
                        phone = (String) DetailValle.getDetailValle().getJSONObject("item13").get("phone");
                        email = (String) DetailValle.getDetailValle().getJSONObject("item13").get("email");
                        coords = (String) DetailValle.getDetailValle().getJSONObject("item13").get("coords");
                        image = (int) DetailValle.getDetailValle().getJSONObject("item13").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, ValleDetThirteenthActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;
                case 13:
                    try {
                        title = (String) DetailValle.getDetailValle().getJSONObject("item14").get("title");
                        description = (String) DetailValle.getDetailValle().getJSONObject("item14").get("description");
                        phone = (String) DetailValle.getDetailValle().getJSONObject("item14").get("phone");
                        email = (String) DetailValle.getDetailValle().getJSONObject("item14").get("email");
                        coords = (String) DetailValle.getDetailValle().getJSONObject("item14").get("coords");
                        image = (int) DetailValle.getDetailValle().getJSONObject("item14").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, ValleDetFourteenthActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;
                case 14:
                    try {
                        title = (String) DetailValle.getDetailValle().getJSONObject("item14").get("title");
                        description = (String) DetailValle.getDetailValle().getJSONObject("item14").get("description");
                        phone = (String) DetailValle.getDetailValle().getJSONObject("item14").get("phone");
                        email = (String) DetailValle.getDetailValle().getJSONObject("item14").get("email");
                        coords = (String) DetailValle.getDetailValle().getJSONObject("item14").get("coords");
                        image = (int) DetailValle.getDetailValle().getJSONObject("item14").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, ValleDetFifteenthActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
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
