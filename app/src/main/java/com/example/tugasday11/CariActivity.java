package com.example.tugasday11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class CariActivity extends AppCompatActivity {

        ImageButton obrolanButton, panggilanButton, settingButton, profilButton;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_cari);

            // Inisialisasi ImageButtons
            obrolanButton = findViewById(R.id.obrolanButton);
            panggilanButton = findViewById(R.id.panggilanButton);
            settingButton = findViewById(R.id.settingButton);
            profilButton = findViewById(R.id.profilButton);

            // Panggil metode untuk mengatur klik listener
            klik();
        }

        void klik() {
            // Atur listener untuk bubbleButton
            obrolanButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intentchatButton = new Intent(CariActivity.this, ObrolanActivity.class);
                    startActivity(intentchatButton);
                }
            });

            // Atur listener untuk phoneButton
            panggilanButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intentphoneButton = new Intent(CariActivity.this, PanggilanActivity.class);
                    startActivity(intentphoneButton);
                }
            });

            // Atur listener untuk voomButton
            settingButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intentplayButton = new Intent(CariActivity.this, SettingActivity.class);
                    startActivity(intentplayButton);
                }
            });

            // Atur listener untuk profileButton
            profilButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intentsettingsButton = new Intent(CariActivity.this, ProfilActivity.class);
                    startActivity(intentsettingsButton);
                }
            });
        }
    }
