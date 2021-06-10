package com.example.tallerapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.tallerapi.apimanager.RetrofitClient;
import com.example.tallerapi.models.Destilerias;
import com.example.tallerapi.models.Whishy;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class list_view_destilerias extends AppCompatActivity {

    ListView listdestilerias;
    Destilerias myDestilerias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_destilerias);

        listdestilerias = findViewById(R.id.ListViewDestilerias);
        getFromInternetDestilerias();
    }

    private void getFromInternetDestilerias(){
        Call<List<Destilerias>> call= RetrofitClient.getInstance().getMyApi().getdestilerias();
        call.enqueue(new Callback<List<Destilerias>>() {

            @Override
            public void onResponse(Call<List<Destilerias>> call, Response<List<Destilerias>> response) {
                List<Destilerias> myDestilerias = response.body();
                String message ="";
                DestileriaAdapter adapter = new DestileriaAdapter(list_view_destilerias.this, myDestilerias);
                listdestilerias.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Destilerias>> call, Throwable t) {
                Toast.makeText(list_view_destilerias.this, "ERROR", Toast.LENGTH_SHORT).show();
            }

        });
    }


}