package com.example.mipt_praktikos_darbas_2;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EditText editableText;
    private Spinner counterOptions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterOptions = findViewById(R.id.counterOptions);
        ArrayAdapter<CharSequence> counterOptionsAdapter = ArrayAdapter.createFromResource(this, R.array.counter_options, android.R.layout.simple_spinner_item);
        counterOptionsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        counterOptions.setAdapter(counterOptionsAdapter);
    }
}