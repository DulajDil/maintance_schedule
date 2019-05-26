package com.example.avonet.maintance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner dropdownplant = findViewById(R.id.plant);
        Spinner dropdownline = findViewById(R.id.line);
        Spinner dropdownmotor = findViewById(R.id.motor);

        String[] items = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);

        dropdownplant.setAdapter(adapter);

        String[] itemsline = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        ArrayAdapter<String> adapterline = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, itemsline);

        dropdownline.setAdapter(adapterline);

        String[] itemsmotor = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        ArrayAdapter<String> adaptermotor = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, itemsmotor);

        dropdownmotor.setAdapter(adaptermotor);




    }
}
