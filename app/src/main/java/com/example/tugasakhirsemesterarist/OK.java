package com.example.tugasakhirsemesterarist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class OK extends AppCompatActivity {

    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ok);

        spinner = findViewById(R.id.spinnerOk);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getApplicationContext(),
                R.array.Pilih_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();

                if (selectedItem.equals("Jelajahi")) {
                    Intent intent = new Intent(OK.this, Jelajahi.class);
                    startActivity(intent);
                }

                else if (selectedItem.equals("Hubungi")) {
                    Intent intent = new Intent(OK.this, MainHubungi.class);
                    startActivity(intent);
                }

                else if (selectedItem.equals("Baca Data")) {
                    Intent intent = new Intent(OK.this, Jelajahi.class);
                    startActivity(intent);
                }

                else if (selectedItem.equals("Cek Posisi")) {
                    Intent intent = new Intent(OK.this, Jelajahi.class);
                    startActivity(intent);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
}