package com.clubrecordar.recordar2016;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class EventsActivity extends AppCompatActivity {
    public WebView eventsWebView;
    public String EVENTS_URL = "http://clubrecordar.com/eventos";
    private ProgressBar mPbar = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);


        mPbar = (ProgressBar)findViewById(R.id.web_view_progress);

        eventsWebView = (WebView)findViewById(R.id.events);
        eventsWebView.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                mPbar.setVisibility(View.VISIBLE);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                mPbar.setVisibility(View.GONE);
            }
        });
        eventsWebView.loadUrl(EVENTS_URL);
    }
}
