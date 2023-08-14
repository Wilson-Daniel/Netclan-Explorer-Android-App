package com.example.netclantask;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Refine extends AppCompatActivity {
    ImageView backImage;
    TextView saveButton;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refine);
        backImage = findViewById(R.id.refine_back_button);
        saveButton = findViewById(R.id.refine_save_button);

        backImage.setOnClickListener(v -> {
            finish();
        });
        saveButton.setOnClickListener(v -> {
            finish();
        });


    }
}