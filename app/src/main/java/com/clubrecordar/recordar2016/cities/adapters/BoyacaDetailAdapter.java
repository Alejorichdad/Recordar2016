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
import com.clubrecordar.recordar2016.helpers.detail.DetailBoyaca;
import com.squareup.picasso.Picasso;

import org.json.JSONException;

import java.util.List;

/**
 * Created by willians on 24/7/16.
 */
public class BoyacaDetailAdapter extends RecyclerView.Adapter<BoyacaDetailAdapter.BoyacaDetailViewHolder>{

    private List<BoyacaModel> items;
    Context context;
    private Intent intent;

    public String title;
    public String description;
    public String phone;
    public String email;
    public String coords;


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
                    try {
                        title = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item1").get("title");
                        description = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item1").get("description");
                        phone = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item1").get("phone");
                        email = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item1").get("email");
                        coords = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item1").get("coords");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BoyacaDetFirstActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    context.startActivity(intent);
                    break;

                case 1:
                    try {
                        title = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item2").get("title");
                        description = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item2").get("description");
                        phone = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item2").get("phone");
                        email = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item2").get("email");
                        coords = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item2").get("coords");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BoyacaDetSecActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    context.startActivity(intent);
                    break;

                case 2:
                    try {
                        title = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item3").get("title");
                        description = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item3").get("description");
                        phone = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item3").get("phone");
                        email = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item3").get("email");
                        coords = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item3").get("coords");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BoyacaDetThirdActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    context.startActivity(intent);
                    break;

                case 3:
                    try {
                        title = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item4").get("title");
                        description = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item4").get("description");
                        phone = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item4").get("phone");
                        email = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item4").get("email");
                        coords = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item4").get("coords");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BoyacaDetFourthActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    context.startActivity(intent);
                    break;

                case 4:
                    try {
                        title = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item5").get("title");
                        description = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item5").get("description");
                        phone = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item5").get("phone");
                        email = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item5").get("email");
                        coords = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item5").get("coords");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BoyacaDetFifthActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    context.startActivity(intent);
                    break;

                case 5:
                    try {
                        title = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item6").get("title");
                        description = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item6").get("description");
                        phone = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item6").get("phone");
                        email = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item6").get("email");
                        coords = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item6").get("coords");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BoyacaDetSixthActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    context.startActivity(intent);
                    break;

                case 6:
                    try {
                        title = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item7").get("title");
                        description = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item7").get("description");
                        phone = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item7").get("phone");
                        email = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item7").get("email");
                        coords = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item7").get("coords");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BoyacaDetSeventhActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    context.startActivity(intent);
                    break;

                case 7:
                    try {
                        title = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item8").get("title");
                        description = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item8").get("description");
                        phone = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item8").get("phone");
                        email = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item8").get("email");
                        coords = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item8").get("coords");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BoyacaDetEighthActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    context.startActivity(intent);
                    break;

                case 8:
                    try {
                        title = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item9").get("title");
                        description = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item9").get("description");
                        phone = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item9").get("phone");
                        email = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item9").get("email");
                        coords = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item9").get("coords");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BoyacaDetNinthActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    context.startActivity(intent);
                    break;

                case 9:
                    try {
                        title = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item10").get("title");
                        description = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item10").get("description");
                        phone = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item10").get("phone");
                        email = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item10").get("email");
                        coords = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item10").get("coords");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BoyacaDetTenthActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    context.startActivity(intent);
                    break;

                case 10:
                    try {
                        title = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item11").get("title");
                        description = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item11").get("description");
                        phone = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item11").get("phone");
                        email = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item11").get("email");
                        coords = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item11").get("coords");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BoyacaDetEleventhActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    context.startActivity(intent);
                    break;

                case 11:
                    try {
                        title = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item12").get("title");
                        description = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item12").get("description");
                        phone = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item12").get("phone");
                        email = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item12").get("email");
                        coords = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item12").get("coords");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BoyacaDetTwelvethActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    context.startActivity(intent);
                    break;
                case 12:
                    try {
                        title = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item13").get("title");
                        description = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item13").get("description");
                        phone = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item13").get("phone");
                        email = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item13").get("email");
                        coords = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item13").get("coords");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BoyacaDetThirteenthActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    context.startActivity(intent);
                    break;
                case 13:
                    try {
                        title = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item14").get("title");
                        description = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item14").get("description");
                        phone = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item14").get("phone");
                        email = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item14").get("email");
                        coords = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item14").get("coords");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BoyacaDetFourteenthActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
                    context.startActivity(intent);
                    break;
                case 14:
                    try {
                        title = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item14").get("title");
                        description = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item14").get("description");
                        phone = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item14").get("phone");
                        email = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item14").get("email");
                        coords = (String) DetailBoyaca.getDetailBoyaca().getJSONObject("item14").get("coords");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, BoyacaDetFifteenthActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", phone);
                    intent.putExtra("email", email);
                    intent.putExtra("coords", coords);
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
