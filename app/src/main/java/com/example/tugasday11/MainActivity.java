package com.example.tugasday11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
        ImageButton logoButton;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            logoButton = findViewById(R.id.logoButton);
            klik();
        }
        void klik(){
            logoButton.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent intentlogo = new Intent(MainActivity.this, CariActivity.class);
                    startActivity(intentlogo);
                }
            });
        }
    }