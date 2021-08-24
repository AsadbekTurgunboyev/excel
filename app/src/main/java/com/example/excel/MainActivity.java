package com.example.excel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.AssetManager;
import android.os.Bundle;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            AssetManager manager = getAssets();
//            InputStream  stream = manager.open("tel.xlsx");

        }catch (Exception e){

        }
    }
}