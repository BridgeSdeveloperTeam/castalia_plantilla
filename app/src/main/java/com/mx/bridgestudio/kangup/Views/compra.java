package com.mx.bridgestudio.kangup.Views;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.mx.bridgestudio.kangup.Controllers.BaseActivity;
import com.mx.bridgestudio.kangup.R;

/**
 * Created by Anthony on 11/11/2016.
 */

public class compra extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.compra);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarr);
        toolbar.setTitle("Compras");
        setSupportActionBar(toolbar);


        WebView myWebView = (WebView) this.findViewById(R.id.webView);
        myWebView.loadUrl("https://www.facebook.com/bridgestudiomx/?fref=ts");
        myWebView.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView viewx, String urlx) {
                viewx.loadUrl(urlx);
                return false;
            }
        });

    }

    public void onBackPressed()
    {
        Intent setIntent = new Intent(this,TypesOfAutomobiles.class);
        startActivity(setIntent);
        finish();
    }

}
