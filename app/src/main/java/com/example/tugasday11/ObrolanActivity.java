package com.example.tugasday11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ObrolanActivity extends AppCompatActivity {

    ImageButton obrolanButton, panggilanButton, settingButton, profilButton, cariButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obrolan);

        // Inisialisasi ImageButtons
        obrolanButton = findViewById(R.id.obrolanButton);
        panggilanButton = findViewById(R.id.panggilanButton);
        settingButton = findViewById(R.id.settingButton);
        profilButton = findViewById(R.id.profilButton);
        cariButton = findViewById(R.id.cariButton);

        // Panggil metode untuk mengatur klik listener
        klik();
    }

    void klik() {
        // Atur listener untuk obrolanButton
        obrolanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentsettingsButton = new Intent(ObrolanActivity.this, ObrolanActivity.class);
                startActivity(intentsettingsButton);
            }
        });

        // Atur listener untuk phoneButton
        panggilanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentphoneButton = new Intent(ObrolanActivity.this, PanggilanActivity.class);
                startActivity(intentphoneButton);
            }
        });

        // Atur listener untuk voomButton
        settingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentplayButton = new Intent(ObrolanActivity.this, SettingActivity.class);
                startActivity(intentplayButton);
            }
        });

        // Atur listener untuk profileButton
        profilButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentsettingsButton = new Intent(ObrolanActivity.this, ProfilActivity.class);
                startActivity(intentsettingsButton);
            }
        });

        // Atur listener untuk bubbleButton
        cariButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentchatButton = new Intent(ObrolanActivity.this, CariActivity.class);
                startActivity(intentchatButton);
            }
        });
    }
}
