package com.example.dtl_cau1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    Button btn_Dangnhap;
    CheckBox cb_Luuthongtin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_Dangnhap = findViewById(R.id.button_Dangnhap);
        cb_Luuthongtin = findViewById(R.id.checkBox_Luuthongtin);
        btn_Dangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Thông báo");

                if(cb_Luuthongtin.isChecked() == true){
                    builder.setMessage("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu");
                }
                else {
                    builder.setMessage("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu");
                }
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });
    }
}
