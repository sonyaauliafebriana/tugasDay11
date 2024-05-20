package com.example.tugasday11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PanggilanActivity extends AppCompatActivity {

    ImageButton cariButton, obrolanButton, settingButton, profilButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panggilan);

        // Inisialisasi ImageButtons
        cariButton = findViewById(R.id.cariButton);
        obrolanButton = findViewById(R.id.obrolanButton);
        settingButton = findViewById(R.id.settingButton);
        profilButton = findViewById(R.id.profilButton);


        // Panggil metode untuk mengatur klik listener
        klik();
    }

    void klik() {
        // Atur listener untuk bubbleButton
        cariButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentchatButton = new Intent(PanggilanActivity.this, CariActivity.class);
                startActivity(intentchatButton);
            }
        });

        // Atur listener untuk obrolanButton
        obrolanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentsettingsButton = new Intent(PanggilanActivity.this, ObrolanActivity.class);
                startActivity(intentsettingsButton);
            }
        });

        // Atur listener untuk voomButton
        settingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentplayButton = new Intent(PanggilanActivity.this, SettingActivity.class);
                startActivity(intentplayButton);
            }
        });

        // Atur listener untuk profileButton
        profilButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentsettingsButton = new Intent(PanggilanActivity.this, ProfilActivity.class);
                startActivity(intentsettingsButton);
            }
        });

    }
}
