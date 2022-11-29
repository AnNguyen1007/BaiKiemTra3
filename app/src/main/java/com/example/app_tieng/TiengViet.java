package com.example.app_tieng;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TiengViet extends AppCompatActivity {
    EditText edtso1;
    TextView tvketqua;
    Button btketqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiengviet);


        edtso1 = findViewById(R.id.tl_1);
        btketqua = findViewById(R.id.bt_push);
        tvketqua = findViewById(R.id.tv_kq);

        btketqua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chuoi1 = edtso1.getText().toString();
                double so1 = Double.parseDouble(chuoi1);

                double ketqua = Math.log(so1);
                tvketqua.setText(String.valueOf(ketqua));
            }
        });

    }
}