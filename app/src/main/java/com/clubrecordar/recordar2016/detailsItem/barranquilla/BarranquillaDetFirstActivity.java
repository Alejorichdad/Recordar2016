package com.clubrecordar.recordar2016.detailsItem.barranquilla;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import com.clubrecordar.recordar2016.R;

public class BarranquillaDetFirstActivity extends AppCompatActivity {
    TextView description;
    String phoneNumber = "12345678";
    Uri gmmIntentUri = Uri.parse("geo:37.7749,-122.4194?q=37.7749,-122.4194");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barranquilla_det_first);

        description = (TextView) findViewById(R.id.textViewDetail);

        description.setMovementMethod(new ScrollingMovementMethod());
    }

    public void triggerCall(View v) {
        String number = "tel:" + phoneNumber;
        Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse(number));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            startActivity(callIntent);
            //return;
        }

        //Toast.makeText(v.getContext(), "Llamada: ", Toast.LENGTH_LONG).show();
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
