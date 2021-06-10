package com.example.tallerapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageWhisky;
    private ImageView imageDestilerias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageWhisky = findViewById(R.id.imageWhisky);
        imageDestilerias = findViewById(R.id.imageDestilerias);

        imageWhisky.setOnClickListener(this);
        imageDestilerias.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imageWhisky) {
            Intent intent= new Intent(this,list_view_whisky.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.imageDestilerias) {
            Intent intent= new Intent(this,list_view_destilerias.class);
            startActivity(intent);
        }
    }
}