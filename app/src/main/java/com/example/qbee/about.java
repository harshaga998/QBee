package com.example.qbee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class about extends AppCompatActivity {
    WebView wb;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        wb = (WebView)findViewById(R.id.webview);
        bt = (Button)findViewById(R.id.button);
        String url = "https://github.com/harshaga998/QbeeBot/blob/master/README.md#qbeebot";
        wb.getSettings().setLoadsImagesAutomatically(true);
        wb.getSettings().setJavaScriptEnabled(true);
        wb.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wb.loadUrl(url);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(about.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
