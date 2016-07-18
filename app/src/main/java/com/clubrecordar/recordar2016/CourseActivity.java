package com.clubrecordar.recordar2016;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class CourseActivity extends AppCompatActivity {
    public WebView courseWebView;
    public String COURSE_URL = "http://clubrecordar.com/foro/";
    private ProgressBar mPbar = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        mPbar = (ProgressBar)findViewById(R.id.web_view_progress);
        courseWebView = (WebView)findViewById(R.id.course);
        //courseWebView.setWebViewClient(new WebViewClient());
        courseWebView.setWebViewClient(new customCourseWebView());
        courseWebView.getSettings().setJavaScriptEnabled(true);
        courseWebView.loadUrl(COURSE_URL);
    }

    public class customCourseWebView extends WebViewClient{
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url){
            mPbar.setVisibility(View.VISIBLE);
            view.loadUrl(url);
            return true;
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            mPbar.setVisibility(View.GONE);
        }
    }
}
