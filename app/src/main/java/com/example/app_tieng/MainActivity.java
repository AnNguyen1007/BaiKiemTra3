package com.example.app_tieng;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    AppCompatButton btcong, bttru, btnhan, btchia, btlogartit, btbinhphuong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btcong = findViewById(R.id.btcong);
        bttru = findViewById(R.id.bttru);
        btnhan = findViewById(R.id.btnhan);
        btchia = findViewById(R.id.btchia);
        btlogartit= findViewById(R.id.btlogarit);
        btbinhphuong= findViewById(R.id.btbinhphuong);

        btcong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, TiengViet.class);
                startActivity(i);
            }
        });
        bttru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, TiengTrung.class);
                startActivity(i);
            }
        });
        btnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, TiengHan.class);
                startActivity(i);
            }
        });
        btchia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, TiengThai.class);
                startActivity(i);
            }
        });
        btlogartit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,TiengLao.class);
                startActivity(i);
            }
        });
        btbinhphuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,TiengAnh.class);
                startActivity(i);
            }
        });
        getSupportActionBar().hide();

    }

}