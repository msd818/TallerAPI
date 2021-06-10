package com.example.tallerapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.tallerapi.apimanager.RetrofitClient;
import com.example.tallerapi.models.Whishy;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class list_view_whisky extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listWhisky;
    List<Whishy> myWhisky;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_whisky);

        listWhisky = findViewById(R.id.ListView);
        getFromInternetWhiskys();
        listWhisky.setOnItemClickListener(this);
    }

    private void getFromInternetWhiskys(){
        Call<List<Whishy>> call= RetrofitClient.getInstance().getMyApi().getWhishy();
        call.enqueue(new Callback<List<Whishy>>() {

            @Override
            public void onResponse(Call<List<Whishy>> call, Response<List<Whishy>>response) {
                myWhisky = response.body();
                String message ="";
                WhiskyAdapter adapter = new WhiskyAdapter(list_view_whisky.this, myWhisky);
                listWhisky.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Whishy>> call, Throwable t) {
                Toast.makeText(list_view_whisky.this, "ERROR", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent in = new Intent(this,DetailWhisky.class);
        in.putExtra("slug", myWhisky.get(position).getSlugWhisky());
        startActivity(in);
    }
}