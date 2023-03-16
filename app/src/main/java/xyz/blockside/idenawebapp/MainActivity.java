package xyz.blockside.idenawebapp;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends Activity {

    private WebView mWebView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mWebView = (WebView) findViewById(R.id.activity_main_webview);
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        webSettings.setDomStorageEnabled(true);
        findViewById(R.id.activity_main_webview).setVisibility(View.VISIBLE);
        mWebView.loadUrl("https://app.idena.io");
        mWebView.reload();



    }


    @Override
    public void onBackPressed() {
        if (mWebView.canGoBack()) {
            mWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public void onStart() {
        super.onStart();

    }


}