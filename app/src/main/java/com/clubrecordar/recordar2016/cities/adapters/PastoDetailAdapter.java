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
import com.clubrecordar.recordar2016.cities.models.PastoModel;
import com.clubrecordar.recordar2016.detailsItem.pasto.PastoDetEighthActivity;
import com.clubrecordar.recordar2016.detailsItem.pasto.PastoDetEleventhActivity;
import com.clubrecordar.recordar2016.detailsItem.pasto.PastoDetFifteenthActivity;
import com.clubrecordar.recordar2016.detailsItem.pasto.PastoDetFifthActivity;
import com.clubrecordar.recordar2016.detailsItem.pasto.PastoDetFirstActivity;
import com.clubrecordar.recordar2016.detailsItem.pasto.PastoDetFourteenthActivity;
import com.clubrecordar.recordar2016.detailsItem.pasto.PastoDetFourthActivity;
import com.clubrecordar.recordar2016.detailsItem.pasto.PastoDetNinthActivity;
import com.clubrecordar.recordar2016.detailsItem.pasto.PastoDetSecActivity;
import com.clubrecordar.recordar2016.detailsItem.pasto.PastoDetSeventhActivity;
import com.clubrecordar.recordar2016.detailsItem.pasto.PastoDetSixthActivity;
import com.clubrecordar.recordar2016.detailsItem.pasto.PastoDetTenthActivity;
import com.clubrecordar.recordar2016.detailsItem.pasto.PastoDetThirdActivity;
import com.clubrecordar.recordar2016.detailsItem.pasto.PastoDetThirteenthActivity;
import com.clubrecordar.recordar2016.detailsItem.pasto.PastoDetTwelvethActivity;
import com.clubrecordar.recordar2016.helpers.detail.DetailPasto;
import com.squareup.picasso.Picasso;

import org.json.JSONException;

import java.util.List;

/**
 * Created by willians on 24/7/16.
 */
public class PastoDetailAdapter extends RecyclerView.Adapter<PastoDetailAdapter.PastoDetailViewHolder>  {
    private List<PastoModel> items;
    Context context;
    private Intent intent;

    public String title;
    public String description;
    public String phone;
    public String email;
    public String coords;

    public int image;

    public class PastoDetailViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        // campos respectivos de un item
        public ImageView idImagen;
        public TextView titulo_imagen;
        public TextView beneficio;

        public PastoDetailViewHolder (View v){
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
                        title = (String) DetailPasto.getDetailPasto().getJSONObject("item1").get("title");
                        description = (String) DetailPasto.getDetailPasto().getJSONObject("item1").get("description");
                        phone = (String) DetailPasto.getDetailPasto().getJSONObject("item1").get("phone");
                        email = (String) DetailPasto.getDetailPasto().getJSONObject("item1").get("email");
                        coords = (String) DetailPasto.getDetailPasto().getJSONObject("item1").get("coords");
                        image = (int) DetailPasto.getDetailPasto().getJSONObject("item1").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, PastoDetFirstActivity.class);
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
                        title = (String) DetailPasto.getDetailPasto().getJSONObject("item2").get("title");
                        description = (String) DetailPasto.getDetailPasto().getJSONObject("item2").get("description");
                        phone = (String) DetailPasto.getDetailPasto().getJSONObject("item2").get("phone");
                        email = (String) DetailPasto.getDetailPasto().getJSONObject("item2").get("email");
                        coords = (String) DetailPasto.getDetailPasto().getJSONObject("item2").get("coords");
                        image = (int) DetailPasto.getDetailPasto().getJSONObject("item2").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, PastoDetSecActivity.class);
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
                        title = (String) DetailPasto.getDetailPasto().getJSONObject("item3").get("title");
                        description = (String) DetailPasto.getDetailPasto().getJSONObject("item3").get("description");
                        phone = (String) DetailPasto.getDetailPasto().getJSONObject("item3").get("phone");
                        email = (String) DetailPasto.getDetailPasto().getJSONObject("item3").get("email");
                        coords = (String) DetailPasto.getDetailPasto().getJSONObject("item3").get("coords");
                        image = (int) DetailPasto.getDetailPasto().getJSONObject("item3").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, PastoDetThirdActivity.class);
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
                        title = (String) DetailPasto.getDetailPasto().getJSONObject("item4").get("title");
                        description = (String) DetailPasto.getDetailPasto().getJSONObject("item4").get("description");
                        phone = (String) DetailPasto.getDetailPasto().getJSONObject("item4").get("phone");
                        email = (String) DetailPasto.getDetailPasto().getJSONObject("item4").get("email");
                        coords = (String) DetailPasto.getDetailPasto().getJSONObject("item4").get("coords");
                        image = (int) DetailPasto.getDetailPasto().getJSONObject("item4").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, PastoDetFourthActivity.class);
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
                        title = (String) DetailPasto.getDetailPasto().getJSONObject("item5").get("title");
                        description = (String) DetailPasto.getDetailPasto().getJSONObject("item5").get("description");
                        phone = (String) DetailPasto.getDetailPasto().getJSONObject("item5").get("phone");
                        email = (String) DetailPasto.getDetailPasto().getJSONObject("item5").get("email");
                        coords = (String) DetailPasto.getDetailPasto().getJSONObject("item5").get("coords");
                        image = (int) DetailPasto.getDetailPasto().getJSONObject("item5").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, PastoDetFifthActivity.class);
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
                        title = (String) DetailPasto.getDetailPasto().getJSONObject("item6").get("title");
                        description = (String) DetailPasto.getDetailPasto().getJSONObject("item6").get("description");
                        phone = (String) DetailPasto.getDetailPasto().getJSONObject("item6").get("phone");
                        email = (String) DetailPasto.getDetailPasto().getJSONObject("item6").get("email");
                        coords = (String) DetailPasto.getDetailPasto().getJSONObject("item6").get("coords");
                        image = (int) DetailPasto.getDetailPasto().getJSONObject("item6").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, PastoDetSixthActivity.class);
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
                        title = (String) DetailPasto.getDetailPasto().getJSONObject("item7").get("title");
                        description = (String) DetailPasto.getDetailPasto().getJSONObject("item7").get("description");
                        phone = (String) DetailPasto.getDetailPasto().getJSONObject("item7").get("phone");
                        email = (String) DetailPasto.getDetailPasto().getJSONObject("item7").get("email");
                        coords = (String) DetailPasto.getDetailPasto().getJSONObject("item7").get("coords");
                        image = (int) DetailPasto.getDetailPasto().getJSONObject("item7").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, PastoDetSeventhActivity.class);
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
                        title = (String) DetailPasto.getDetailPasto().getJSONObject("item8").get("title");
                        description = (String) DetailPasto.getDetailPasto().getJSONObject("item8").get("description");
                        phone = (String) DetailPasto.getDetailPasto().getJSONObject("item8").get("phone");
                        email = (String) DetailPasto.getDetailPasto().getJSONObject("item8").get("email");
                        coords = (String) DetailPasto.getDetailPasto().getJSONObject("item8").get("coords");
                        image = (int) DetailPasto.getDetailPasto().getJSONObject("item8").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, PastoDetEighthActivity.class);
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
                        title = (String) DetailPasto.getDetailPasto().getJSONObject("item9").get("title");
                        description = (String) DetailPasto.getDetailPasto().getJSONObject("item9").get("description");
                        phone = (String) DetailPasto.getDetailPasto().getJSONObject("item9").get("phone");
                        email = (String) DetailPasto.getDetailPasto().getJSONObject("item9").get("email");
                        coords = (String) DetailPasto.getDetailPasto().getJSONObject("item9").get("coords");
                        image = (int) DetailPasto.getDetailPasto().getJSONObject("item9").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, PastoDetNinthActivity.class);
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
                        title = (String) DetailPasto.getDetailPasto().getJSONObject("item10").get("title");
                        description = (String) DetailPasto.getDetailPasto().getJSONObject("item10").get("description");
                        phone = (String) DetailPasto.getDetailPasto().getJSONObject("item10").get("phone");
                        email = (String) DetailPasto.getDetailPasto().getJSONObject("item10").get("email");
                        coords = (String) DetailPasto.getDetailPasto().getJSONObject("item10").get("coords");
                        image = (int) DetailPasto.getDetailPasto().getJSONObject("item10").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, PastoDetTenthActivity.class);
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
                        title = (String) DetailPasto.getDetailPasto().getJSONObject("item11").get("title");
                        description = (String) DetailPasto.getDetailPasto().getJSONObject("item11").get("description");
                        phone = (String) DetailPasto.getDetailPasto().getJSONObject("item11").get("phone");
                        email = (String) DetailPasto.getDetailPasto().getJSONObject("item11").get("email");
                        coords = (String) DetailPasto.getDetailPasto().getJSONObject("item11").get("coords");
                        image = (int) DetailPasto.getDetailPasto().getJSONObject("item11").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, PastoDetEleventhActivity.class);
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
                        title = (String) DetailPasto.getDetailPasto().getJSONObject("item12").get("title");
                        description = (String) DetailPasto.getDetailPasto().getJSONObject("item12").get("description");
                        phone = (String) DetailPasto.getDetailPasto().getJSONObject("item12").get("phone");
                        email = (String) DetailPasto.getDetailPasto().getJSONObject("item12").get("email");
                        coords = (String) DetailPasto.getDetailPasto().getJSONObject("item12").get("coords");
                        image = (int) DetailPasto.getDetailPasto().getJSONObject("item12").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, PastoDetTwelvethActivity.class);
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
                        title = (String) DetailPasto.getDetailPasto().getJSONObject("item13").get("title");
                        description = (String) DetailPasto.getDetailPasto().getJSONObject("item13").get("description");
                        phone = (String) DetailPasto.getDetailPasto().getJSONObject("item13").get("phone");
                        email = (String) DetailPasto.getDetailPasto().getJSONObject("item13").get("email");
                        coords = (String) DetailPasto.getDetailPasto().getJSONObject("item13").get("coords");
                        image = (int) DetailPasto.getDetailPasto().getJSONObject("item13").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, PastoDetThirteenthActivity.class);
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
                        title = (String) DetailPasto.getDetailPasto().getJSONObject("item14").get("title");
                        description = (String) DetailPasto.getDetailPasto().getJSONObject("item14").get("description");
                        phone = (String) DetailPasto.getDetailPasto().getJSONObject("item14").get("phone");
                        email = (String) DetailPasto.getDetailPasto().getJSONObject("item14").get("email");
                        coords = (String) DetailPasto.getDetailPasto().getJSONObject("item14").get("coords");
                        image = (int) DetailPasto.getDetailPasto().getJSONObject("item14").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, PastoDetFourteenthActivity.class);
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
                        title = (String) DetailPasto.getDetailPasto().getJSONObject("item15").get("title");
                        description = (String) DetailPasto.getDetailPasto().getJSONObject("item15").get("description");
                        phone = (String) DetailPasto.getDetailPasto().getJSONObject("item15").get("phone");
                        email = (String) DetailPasto.getDetailPasto().getJSONObject("item15").get("email");
                        coords = (String) DetailPasto.getDetailPasto().getJSONObject("item15").get("coords");
                        image = (int) DetailPasto.getDetailPasto().getJSONObject("item15").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, PastoDetFifteenthActivity.class);
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

    public PastoDetailAdapter(List<PastoModel> items) {
        this.items = items;
    }

    @Override
    public PastoDetailViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.pasto_card, viewGroup, false);
        return new PastoDetailViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PastoDetailViewHolder viewHolder, int position) {
        PastoModel currentItem = items.get(position);
        viewHolder.setTitle(currentItem.getTitulo_imagen());
        viewHolder.setBenefit(currentItem.getBeneficio());
        viewHolder.setImage(currentItem.getIdImagen());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

}
