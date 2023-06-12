package com.example.tugasakhirsemesterarist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class Jelajahi extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jelajahi);

        // Mendapatkan referensi ke WebView dari layout
        webView = findViewById(R.id.webview);

        // Mendapatkan pengaturan WebView
        WebSettings webSettings = webView.getSettings();

        // Mengaktifkan JavaScript
        webSettings.setJavaScriptEnabled(true);

        // Memuat URL ke WebView
        webView.loadUrl("https://ump.ac.id/");
    }

}
