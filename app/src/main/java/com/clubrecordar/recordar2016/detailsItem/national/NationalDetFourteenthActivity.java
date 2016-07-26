package com.clubrecordar.recordar2016.detailsItem.national;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.clubrecordar.recordar2016.R;

public class NationalDetFourteenthActivity extends AppCompatActivity {
    TextView description;
    String phoneNumber = "12345678";
    Uri gmmIntentUri = Uri.parse("geo:37.7749,-122.4194?q=37.7749,-122.4194");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_national_det_fourteenth);
    }
    public void triggerCall(View v) {
        String number = "tel:" + phoneNumber.toString();
        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse(number));
        startActivity(callIntent);
    }

    public void geolocationFind(View v){
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }

        //Toast.makeText(v.getContext(), "Mapas: ", Toast.LENGTH_LONG).show();
    }

    public void sendEmail(View v){
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto","abc@gmail.com", null));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Body");
        startActivity(Intent.createChooser(emailIntent, "Send email..."));
        //Toast.makeText(v.getContext(), "Correo: ", Toast.LENGTH_LONG).show();
    }
}
