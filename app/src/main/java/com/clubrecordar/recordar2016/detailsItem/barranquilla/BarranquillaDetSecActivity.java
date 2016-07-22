package com.clubrecordar.recordar2016.detailsItem.barranquilla;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.clubrecordar.recordar2016.R;

public class BarranquillaDetSecActivity extends AppCompatActivity {
    TextView description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barranquilla_det_sec);

        description = (TextView)findViewById(R.id.beneficio);

        description.setMovementMethod(new ScrollingMovementMethod());
    }

    public void triggerCall(View v){
        Toast.makeText(v.getContext(), "Llamada: ", Toast.LENGTH_LONG).show();
    }

    public void geolocationFind(View v){
        Toast.makeText(v.getContext(), "Mapas: ", Toast.LENGTH_LONG).show();
    }

    public void sendEmail(View v){
        Toast.makeText(v.getContext(), "Correo: ", Toast.LENGTH_LONG).show();
    }
}
