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
import com.clubrecordar.recordar2016.helpers.detail.DetailNational;
import com.squareup.picasso.Picasso;

import org.json.JSONException;

import java.util.List;

/**
 * Created by willians on 18/7/16.
 */
public class NationalDetailAdapter extends RecyclerView.Adapter<NationalDetailAdapter.NationalDetailViewHolder> {

    private List<NationalModel> items;
    Context context;
    private Intent intent;

    public String title;
    public String description;
    public String phone;
    public String email;
    public String coords;

    public int image;

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
                    try {
                        title = (String) DetailNational.getDetailNational().getJSONObject("item1").get("title");
                        description = (String) DetailNational.getDetailNational().getJSONObject("item1").get("description");
                        phone = (String) DetailNational.getDetailNational().getJSONObject("item1").get("phone");
                        email = (String) DetailNational.getDetailNational().getJSONObject("item1").get("email");
                        coords = (String) DetailNational.getDetailNational().getJSONObject("item1").get("coords");
                        image = (int) DetailNational.getDetailNational().getJSONObject("item1").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, NationalDetFirstActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;
                case 1:
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();

                    try {
                        title = (String) DetailNational.getDetailNational().getJSONObject("item2").get("title");
                        description = (String) DetailNational.getDetailNational().getJSONObject("item2").get("description");
                        phone = (String) DetailNational.getDetailNational().getJSONObject("item2").get("phone");
                        email = (String) DetailNational.getDetailNational().getJSONObject("item2").get("email");
                        coords = (String) DetailNational.getDetailNational().getJSONObject("item2").get("coords");
                        image = (int) DetailNational.getDetailNational().getJSONObject("item2").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    intent = new Intent(context, NationalDetSecActivity.class);
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
                        title = (String) DetailNational.getDetailNational().getJSONObject("item3").get("title");
                        description = (String) DetailNational.getDetailNational().getJSONObject("item3").get("description");
                        phone = (String) DetailNational.getDetailNational().getJSONObject("item3").get("phone");
                        email = (String) DetailNational.getDetailNational().getJSONObject("item3").get("email");
                        coords = (String) DetailNational.getDetailNational().getJSONObject("item3").get("coords");
                        image = (int) DetailNational.getDetailNational().getJSONObject("item3").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, NationalDetThirdActivity.class);
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
                        title = (String) DetailNational.getDetailNational().getJSONObject("item4").get("title");
                        description = (String) DetailNational.getDetailNational().getJSONObject("item4").get("description");
                        phone = (String) DetailNational.getDetailNational().getJSONObject("item4").get("phone");
                        email = (String) DetailNational.getDetailNational().getJSONObject("item4").get("email");
                        coords = (String) DetailNational.getDetailNational().getJSONObject("item4").get("coords");
                        image = (int) DetailNational.getDetailNational().getJSONObject("item4").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, NationalDetFourthActivity.class);
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
                        title = (String) DetailNational.getDetailNational().getJSONObject("item5").get("title");
                        description = (String) DetailNational.getDetailNational().getJSONObject("item5").get("description");
                        phone = (String) DetailNational.getDetailNational().getJSONObject("item5").get("phone");
                        email = (String) DetailNational.getDetailNational().getJSONObject("item5").get("email");
                        coords = (String) DetailNational.getDetailNational().getJSONObject("item5").get("coords");
                        image = (int) DetailNational.getDetailNational().getJSONObject("item5").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, NationalDetFifthActivity.class);
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
                        title = (String) DetailNational.getDetailNational().getJSONObject("item6").get("title");
                        description = (String) DetailNational.getDetailNational().getJSONObject("item6").get("description");
                        phone = (String) DetailNational.getDetailNational().getJSONObject("item6").get("phone");
                        email = (String) DetailNational.getDetailNational().getJSONObject("item6").get("email");
                        coords = (String) DetailNational.getDetailNational().getJSONObject("item6").get("coords");
                        image = (int) DetailNational.getDetailNational().getJSONObject("item6").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, NationalDetSixthActivity.class);
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
                        title = (String) DetailNational.getDetailNational().getJSONObject("item7").get("title");
                        description = (String) DetailNational.getDetailNational().getJSONObject("item7").get("description");
                        phone = (String) DetailNational.getDetailNational().getJSONObject("item7").get("phone");
                        email = (String) DetailNational.getDetailNational().getJSONObject("item7").get("email");
                        coords = (String) DetailNational.getDetailNational().getJSONObject("item7").get("coords");
                        image = (int) DetailNational.getDetailNational().getJSONObject("item7").get("image");


                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, NationalDetSeventhActivity.class);
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
                        title = (String) DetailNational.getDetailNational().getJSONObject("item8").get("title");
                        description = (String) DetailNational.getDetailNational().getJSONObject("item8").get("description");
                        phone = (String) DetailNational.getDetailNational().getJSONObject("item8").get("phone");
                        email = (String) DetailNational.getDetailNational().getJSONObject("item8").get("email");
                        coords = (String) DetailNational.getDetailNational().getJSONObject("item8").get("coords");
                        image = (int) DetailNational.getDetailNational().getJSONObject("item8").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, NationalDetEighthActivity.class);
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
                        title = (String) DetailNational.getDetailNational().getJSONObject("item9").get("title");
                        description = (String) DetailNational.getDetailNational().getJSONObject("item9").get("description");
                        phone = (String) DetailNational.getDetailNational().getJSONObject("item9").get("phone");
                        email = (String) DetailNational.getDetailNational().getJSONObject("item9").get("email");
                        coords = (String) DetailNational.getDetailNational().getJSONObject("item9").get("coords");
                        image = (int) DetailNational.getDetailNational().getJSONObject("item9").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, NationalDetNinthActivity.class);
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
                        title = (String) DetailNational.getDetailNational().getJSONObject("item10").get("title");
                        description = (String) DetailNational.getDetailNational().getJSONObject("item10").get("description");
                        phone = (String) DetailNational.getDetailNational().getJSONObject("item10").get("phone");
                        email = (String) DetailNational.getDetailNational().getJSONObject("item10").get("email");
                        coords = (String) DetailNational.getDetailNational().getJSONObject("item10").get("coords");
                        image = (int) DetailNational.getDetailNational().getJSONObject("item10").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, NationalDetTenthActivity.class);
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
                        title = (String) DetailNational.getDetailNational().getJSONObject("item11").get("title");
                        description = (String) DetailNational.getDetailNational().getJSONObject("item11").get("description");
                        phone = (String) DetailNational.getDetailNational().getJSONObject("item11").get("phone");
                        email = (String) DetailNational.getDetailNational().getJSONObject("item11").get("email");
                        coords = (String) DetailNational.getDetailNational().getJSONObject("item11").get("coords");
                        image = (int) DetailNational.getDetailNational().getJSONObject("item11").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, NationalDetEleventhActivity.class);
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
                        title = (String) DetailNational.getDetailNational().getJSONObject("item12").get("title");
                        description = (String) DetailNational.getDetailNational().getJSONObject("item12").get("description");
                        phone = (String) DetailNational.getDetailNational().getJSONObject("item12").get("phone");
                        email = (String) DetailNational.getDetailNational().getJSONObject("item12").get("email");
                        coords = (String) DetailNational.getDetailNational().getJSONObject("item12").get("coords");
                        image = (int) DetailNational.getDetailNational().getJSONObject("item12").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, NationalDetTwelvethActivity.class);
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
                        title = (String) DetailNational.getDetailNational().getJSONObject("item13").get("title");
                        description = (String) DetailNational.getDetailNational().getJSONObject("item13").get("description");
                        phone = (String) DetailNational.getDetailNational().getJSONObject("item13").get("phone");
                        email = (String) DetailNational.getDetailNational().getJSONObject("item13").get("email");
                        coords = (String) DetailNational.getDetailNational().getJSONObject("item13").get("coords");
                        image = (int) DetailNational.getDetailNational().getJSONObject("item13").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, NationalDetThirteenthActivity.class);
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
                        title = (String) DetailNational.getDetailNational().getJSONObject("item14").get("title");
                        description = (String) DetailNational.getDetailNational().getJSONObject("item14").get("description");
                        phone = (String) DetailNational.getDetailNational().getJSONObject("item14").get("phone");
                        email = (String) DetailNational.getDetailNational().getJSONObject("item14").get("email");
                        coords = (String) DetailNational.getDetailNational().getJSONObject("item14").get("coords");
                        image = (int) DetailNational.getDetailNational().getJSONObject("item14").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, NationalDetFourteenthActivity.class);
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
                        title = (String) DetailNational.getDetailNational().getJSONObject("item15").get("title");
                        description = (String) DetailNational.getDetailNational().getJSONObject("item15").get("description");
                        phone = (String) DetailNational.getDetailNational().getJSONObject("item15").get("phone");
                        email = (String) DetailNational.getDetailNational().getJSONObject("item15").get("email");
                        coords = (String) DetailNational.getDetailNational().getJSONObject("item15").get("coords");
                        image = (int) DetailNational.getDetailNational().getJSONObject("item15").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, NationalDetFifteenthActivity.class);
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
