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
import com.clubrecordar.recordar2016.helpers.detail.DetailCali;
import com.squareup.picasso.Picasso;

import org.json.JSONException;

import java.util.List;

/**
 * Created by willians on 24/7/16.
 */
public class CaliDetailAdapter extends RecyclerView.Adapter<CaliDetailAdapter.CaliDetailViewHolder> {
    private List<CaliModel> items;
    Context context;
    private Intent intent;

    public String title;
    public String description;
    public String phone;
    public String email;
    public String coords;

    public int image;


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
                    try {
                        title = (String) DetailCali.getDetailCali().getJSONObject("item1").get("title");
                        description = (String) DetailCali.getDetailCali().getJSONObject("item1").get("description");
                        phone = (String) DetailCali.getDetailCali().getJSONObject("item1").get("phone");
                        email = (String) DetailCali.getDetailCali().getJSONObject("item1").get("email");
                        coords = (String) DetailCali.getDetailCali().getJSONObject("item1").get("coords");
                        image = (int) DetailCali.getDetailCali().getJSONObject("item1").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CaliDetFirstActivity.class);
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
                        title = (String) DetailCali.getDetailCali().getJSONObject("item2").get("title");
                        description = (String) DetailCali.getDetailCali().getJSONObject("item2").get("description");
                        phone = (String) DetailCali.getDetailCali().getJSONObject("item2").get("phone");
                        email = (String) DetailCali.getDetailCali().getJSONObject("item2").get("email");
                        coords = (String) DetailCali.getDetailCali().getJSONObject("item2").get("coords");
                        image = (int) DetailCali.getDetailCali().getJSONObject("item2").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CaliDetSecActivity.class);
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
                        title = (String) DetailCali.getDetailCali().getJSONObject("item3").get("title");
                        description = (String) DetailCali.getDetailCali().getJSONObject("item3").get("description");
                        phone = (String) DetailCali.getDetailCali().getJSONObject("item3").get("phone");
                        email = (String) DetailCali.getDetailCali().getJSONObject("item3").get("email");
                        coords = (String) DetailCali.getDetailCali().getJSONObject("item3").get("coords");
                        image = (int) DetailCali.getDetailCali().getJSONObject("item3").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CaliDetThirdActivity.class);
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
                        title = (String) DetailCali.getDetailCali().getJSONObject("item4").get("title");
                        description = (String) DetailCali.getDetailCali().getJSONObject("item4").get("description");
                        phone = (String) DetailCali.getDetailCali().getJSONObject("item4").get("phone");
                        email = (String) DetailCali.getDetailCali().getJSONObject("item4").get("email");
                        coords = (String) DetailCali.getDetailCali().getJSONObject("item4").get("coords");
                        image = (int) DetailCali.getDetailCali().getJSONObject("item4").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CaliDetFourthActivity.class);
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
                        title = (String) DetailCali.getDetailCali().getJSONObject("item5").get("title");
                        description = (String) DetailCali.getDetailCali().getJSONObject("item5").get("description");
                        phone = (String) DetailCali.getDetailCali().getJSONObject("item5").get("phone");
                        email = (String) DetailCali.getDetailCali().getJSONObject("item5").get("email");
                        coords = (String) DetailCali.getDetailCali().getJSONObject("item5").get("coords");
                        image = (int) DetailCali.getDetailCali().getJSONObject("item5").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CaliDetFifthActivity.class);
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
                        title = (String) DetailCali.getDetailCali().getJSONObject("item6").get("title");
                        description = (String) DetailCali.getDetailCali().getJSONObject("item6").get("description");
                        phone = (String) DetailCali.getDetailCali().getJSONObject("item6").get("phone");
                        email = (String) DetailCali.getDetailCali().getJSONObject("item6").get("email");
                        coords = (String) DetailCali.getDetailCali().getJSONObject("item6").get("coords");
                        image = (int) DetailCali.getDetailCali().getJSONObject("item6").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CaliDetSixthActivity.class);
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
                        title = (String) DetailCali.getDetailCali().getJSONObject("item7").get("title");
                        description = (String) DetailCali.getDetailCali().getJSONObject("item7").get("description");
                        phone = (String) DetailCali.getDetailCali().getJSONObject("item7").get("phone");
                        email = (String) DetailCali.getDetailCali().getJSONObject("item7").get("email");
                        coords = (String) DetailCali.getDetailCali().getJSONObject("item7").get("coords");
                        image = (int) DetailCali.getDetailCali().getJSONObject("item7").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CaliDetSeventhActivity.class);
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
                        title = (String) DetailCali.getDetailCali().getJSONObject("item8").get("title");
                        description = (String) DetailCali.getDetailCali().getJSONObject("item8").get("description");
                        phone = (String) DetailCali.getDetailCali().getJSONObject("item8").get("phone");
                        email = (String) DetailCali.getDetailCali().getJSONObject("item8").get("email");
                        coords = (String) DetailCali.getDetailCali().getJSONObject("item8").get("coords");
                        image = (int) DetailCali.getDetailCali().getJSONObject("item8").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CaliDetEighthActivity.class);
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
                        title = (String) DetailCali.getDetailCali().getJSONObject("item9").get("title");
                        description = (String) DetailCali.getDetailCali().getJSONObject("item9").get("description");
                        phone = (String) DetailCali.getDetailCali().getJSONObject("item9").get("phone");
                        email = (String) DetailCali.getDetailCali().getJSONObject("item9").get("email");
                        coords = (String) DetailCali.getDetailCali().getJSONObject("item9").get("coords");
                        image = (int) DetailCali.getDetailCali().getJSONObject("item9").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CaliDetNinthActivity.class);
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
                        title = (String) DetailCali.getDetailCali().getJSONObject("item10").get("title");
                        description = (String) DetailCali.getDetailCali().getJSONObject("item10").get("description");
                        phone = (String) DetailCali.getDetailCali().getJSONObject("item10").get("phone");
                        email = (String) DetailCali.getDetailCali().getJSONObject("item10").get("email");
                        coords = (String) DetailCali.getDetailCali().getJSONObject("item10").get("coords");
                        image = (int) DetailCali.getDetailCali().getJSONObject("item10").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CaliDetTenthActivity.class);
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
                        title = (String) DetailCali.getDetailCali().getJSONObject("item11").get("title");
                        description = (String) DetailCali.getDetailCali().getJSONObject("item11").get("description");
                        phone = (String) DetailCali.getDetailCali().getJSONObject("item11").get("phone");
                        email = (String) DetailCali.getDetailCali().getJSONObject("item11").get("email");
                        coords = (String) DetailCali.getDetailCali().getJSONObject("item11").get("coords");
                        image = (int) DetailCali.getDetailCali().getJSONObject("item11").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CaliDetEleventhActivity.class);
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
                        title = (String) DetailCali.getDetailCali().getJSONObject("item12").get("title");
                        description = (String) DetailCali.getDetailCali().getJSONObject("item12").get("description");
                        phone = (String) DetailCali.getDetailCali().getJSONObject("item12").get("phone");
                        email = (String) DetailCali.getDetailCali().getJSONObject("item12").get("email");
                        coords = (String) DetailCali.getDetailCali().getJSONObject("item12").get("coords");
                        image = (int) DetailCali.getDetailCali().getJSONObject("item12").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CaliDetTwelvethActivity.class);
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
                        title = (String) DetailCali.getDetailCali().getJSONObject("item13").get("title");
                        description = (String) DetailCali.getDetailCali().getJSONObject("item13").get("description");
                        phone = (String) DetailCali.getDetailCali().getJSONObject("item13").get("phone");
                        email = (String) DetailCali.getDetailCali().getJSONObject("item13").get("email");
                        coords = (String) DetailCali.getDetailCali().getJSONObject("item13").get("coords");
                        image = (int) DetailCali.getDetailCali().getJSONObject("item13").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CaliDetThirteenthActivity.class);
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
                        title = (String) DetailCali.getDetailCali().getJSONObject("item14").get("title");
                        description = (String) DetailCali.getDetailCali().getJSONObject("item14").get("description");
                        phone = (String) DetailCali.getDetailCali().getJSONObject("item14").get("phone");
                        email = (String) DetailCali.getDetailCali().getJSONObject("item14").get("email");
                        coords = (String) DetailCali.getDetailCali().getJSONObject("item14").get("coords");
                        image = (int) DetailCali.getDetailCali().getJSONObject("item14").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CaliDetFourteenthActivity.class);
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
                        title = (String) DetailCali.getDetailCali().getJSONObject("item15").get("title");
                        description = (String) DetailCali.getDetailCali().getJSONObject("item15").get("description");
                        phone = (String) DetailCali.getDetailCali().getJSONObject("item15").get("phone");
                        email = (String) DetailCali.getDetailCali().getJSONObject("item15").get("email");
                        coords = (String) DetailCali.getDetailCali().getJSONObject("item15").get("coords");
                        image = (int) DetailCali.getDetailCali().getJSONObject("item15").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, CaliDetFifteenthActivity.class);
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
