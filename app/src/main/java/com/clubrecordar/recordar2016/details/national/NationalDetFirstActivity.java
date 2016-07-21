package com.clubrecordar.recordar2016.details.national;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import com.clubrecordar.recordar2016.R;

public class NationalDetFirstActivity extends AppCompatActivity {

    LinearLayout wrapper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_national_det_first);

        wrapper = (LinearLayout)findViewById(R.id.wrapperDetail);
        wrapper.setAlpha((float) 0.8);

    }
}
