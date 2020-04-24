package com.developer2t.latihanspinner1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_hasil;
    private Spinner spinner;
    private String data[] = {"S1TI","D3TI","D3MI","S1DKV"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_hasil = findViewById(R.id.tv_hasil);
        spinner = findViewById(R.id.spinner);

        ArrayAdapter<String> adapters = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, data);

        adapters.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapters);
    }

    public void tampil (View view) {
        tv_hasil.setText("Jurusan :" + spinner.getSelectedItem().toString());
    }
}
