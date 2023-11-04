package com.gbs_soft.userinput;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edName;
    Button myButton;
    TextView tvDisplay;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edName = findViewById(R.id.edName);
        myButton = findViewById(R.id.myButton);
        tvDisplay = findViewById(R.id.tvDisplay);


        myButton.setOnClickListener(view -> {
           String userName = edName.getText(). toString();
           tvDisplay.setText("Hello "+userName +"\n Great Work!");
        });
    }
}