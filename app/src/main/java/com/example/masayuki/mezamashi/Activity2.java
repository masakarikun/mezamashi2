package com.example.masayuki.mezamashi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Activity2 extends Activity {
    private WebView varWebView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        ((Button) findViewById(R.id.back))
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                });

        varWebView = (WebView)findViewById(R.id.webView);
        varWebView.setWebViewClient(new WebViewClient());
        varWebView.loadUrl("http://www.yahoo.co.jp");
    }
}