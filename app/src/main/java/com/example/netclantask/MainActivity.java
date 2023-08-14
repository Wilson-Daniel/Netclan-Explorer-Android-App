package com.example.netclantask;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    ViewPager myViewPager;
    TabLayout myTabLayout;
    ImageView refineImage;
    TextView refineText;
    TabAccessorAdaptor myTabAccessorAdaptor;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.main_bottom_nav);
        refineImage = findViewById(R.id.main_refine_img);
        refineText = findViewById(R.id.main_refine_text);

        bottomNavigationView.setSelectedItemId(R.id.explore);
        myViewPager = (ViewPager) findViewById(R.id.main_view_pager);
        myTabAccessorAdaptor = new TabAccessorAdaptor(getSupportFragmentManager());
        myViewPager.setAdapter(myTabAccessorAdaptor);

        myTabLayout = (TabLayout) findViewById(R.id.tabLayout);
        myTabLayout.setupWithViewPager(myViewPager);

        refineImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Refine.class);
                startActivity(intent);
            }
        });
        refineText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Refine.class);
                startActivity(intent);
            }
        });

    }
}