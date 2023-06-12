package com.example.tugasakhirsemesterarist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainHubungi extends AppCompatActivity {

    public int IJIN_SEND_SMS = 1;
    boolean IJIN_SEND_SMSOK = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_hubungi);

        if(ActivityCompat.checkSelfPermission(
                this, android.Manifest.permission.SEND_SMS)
                != PackageManager.PERMISSION_GRANTED){

            ActivityCompat.requestPermissions(
                    this, new String[] {
                            Manifest.permission.SEND_SMS}, IJIN_SEND_SMS);
        } else{IJIN_SEND_SMSOK=true; }

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if(requestCode == IJIN_SEND_SMS
                && grantResults[0] == PackageManager.PERMISSION_GRANTED){
            IJIN_SEND_SMSOK = true;
        }
    }


    public void KirimSms(View view){
    }


    public void klik2(View view){
        if(!IJIN_SEND_SMSOK){
            Toast.makeText(this, "SMS Ditolak", Toast.LENGTH_SHORT).show();
            return;
        }

        Intent sms = new Intent(Intent.ACTION_VIEW,
                Uri.parse("smsto:085724126979"));
        sms.putExtra("sms_body", "Pesan dari aplikasi Android");
        startActivity(sms);
    }

}