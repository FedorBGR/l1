package com.example.l1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                String surname = "Королев";


                Intent intent = new Intent(MainActivity.this, com.example.l1.SecondActivity.class);
                intent.putExtra("surname_key", surname);
                startActivity(intent);
            }
        });
    }
}
