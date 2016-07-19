package com.clubrecordar.recordar2016;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class StoreActivity extends AppCompatActivity {
    public WebView storeWebView;
    public String STORE_URL = "https://rn.superlikers.com/welcome";
    private ProgressBar mPbar = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);
        mPbar = (ProgressBar)findViewById(R.id.web_view_progress);
        storeWebView = (WebView)findViewById(R.id.store);
        storeWebView.setWebViewClient(new customStoreWebView());
        storeWebView.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress) {
                mPbar.setProgress(progress);
                if (progress == 100) {
                    mPbar.setVisibility(View.GONE);

                } else {
                    mPbar.setVisibility(View.VISIBLE);

                }
            }
        });
        storeWebView.getSettings().setJavaScriptEnabled(true);
        storeWebView.loadUrl(STORE_URL);

    }

    public class customStoreWebView extends WebViewClient{
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url){
            //mPbar.setVisibility(View.VISIBLE);
            view.loadUrl(url);
            return true;
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            //mPbar.setVisibility(View.GONE);
        }
    }
}
