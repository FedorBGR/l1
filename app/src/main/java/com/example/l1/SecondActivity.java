package com.example.l1;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);


        String surname = getIntent().getStringExtra("surname_key");
        
        TextView textView = findViewById(R.id.textView);
        textView.setText("Переданный параметр: " + surname);
    }
}
