package com.example.app_tieng;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class TiengAnh extends AppCompatActivity {
    EditText edtso1;
    ListView lvkq;
    Button btbvd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tienganh);


        edtso1 = findViewById(R.id.tl_1);
        btbvd = findViewById(R.id.bt_push);

        private void addEvents() {
            btbvd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String so1 = edtso1.getText().toString();
                    String ketqua = tvketqua.getText().toString();


                    DuLieu duLieu =new DuLieu(so1,ketqua);
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference myRef = database.getReference("QuanLyTinh");
                    String id = myRef.push().getKey();
                    myRef.child(id).setValue(duLieu).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void unused) {
                            Toast.makeText(getApplicationContext(),"Thêm thành công  !",Toast.LENGTH_SHORT).show();
                            finish();
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(getApplicationContext(),"Thêm thất bại !",Toast.LENGTH_SHORT).show();
                        }
                    });

                }
            });
        }

    }
    private void addControls() {
        edtso1 = findViewById(R.id.tl_1);
        lvkq = findViewById(R.id.lvvd);
        btbvd = findViewById(R.id.bt_push);
    }
}