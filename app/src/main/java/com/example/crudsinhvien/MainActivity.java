package com.example.crudsinhvien;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.crudsinhvien.SQLiteHelper.CreateDbSinhVien;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CreateDbSinhVien createDbSinhVien = new CreateDbSinhVien(this);
        createDbSinhVien.getWritableDatabase();
    }
}