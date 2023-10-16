package com.example.mipt_praktikos_darbas_2;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EditText editableText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}