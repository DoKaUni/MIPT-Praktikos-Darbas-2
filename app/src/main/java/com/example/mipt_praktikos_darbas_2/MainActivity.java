package com.example.mipt_praktikos_darbas_2;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

import android.os.Bundle;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Utils.CountText;

public class MainActivity extends AppCompatActivity {

    private TextView textCounter;
    private EditText editableText;
    private Spinner counterOptions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.textCounter = findViewById(R.id.textCounter);
        this.editableText = findViewById(R.id.editableText);
        this.counterOptions = findViewById(R.id.counterOptions);

        this.counterOptions = findViewById(R.id.counterOptions);
        ArrayAdapter<CharSequence> counterOptionsAdapter = ArrayAdapter.createFromResource(this, R.array.counter_options, android.R.layout.simple_spinner_item);
        counterOptionsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        counterOptions.setAdapter(counterOptionsAdapter);
    }

    public void buttonClick(View view){
        String selectedOption = this.counterOptions.getSelectedItem().toString();
        String[] counterOptions = getResources().getStringArray(R.array.counter_options);

        String inputText = this.editableText.getText().toString();
        if(inputText.isEmpty()){
            Toast toast = Toast.makeText(this, "No Entered Text!", Toast.LENGTH_SHORT);
            toast.show();

            return;
        }

        if(selectedOption.equals(counterOptions[0])) {
            Pattern pattern = Pattern.compile("\\w+");
            Matcher matcher = pattern.matcher(inputText);

            int wordCount = 0;
            while (matcher.find()) {
                wordCount++;
            }

            String wordCountString = "Word count: " + wordCount;
            textCounter.setText(wordCountString);
        } else if (selectedOption.equals(counterOptions[1])){
            String charCount = CountText.getCharCount(inputText);
            charCount = "Character Count: " + charCount;
            textCounter.setText(charCount);
        }
    }
}