package com.example.tallerapi;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.tallerapi.models.Destilerias;
import com.example.tallerapi.models.Whishy;

import java.util.List;

public class DestileriaAdapter extends BaseAdapter {

    protected Activity activity;
    protected List<Destilerias> myDestilerias;

    public DestileriaAdapter(Activity activity, List<Destilerias> myDestilerias){
        this.activity = activity;
        this.myDestilerias = myDestilerias;
    }


    @Override
    public int getCount() {
        return myDestilerias.size();
    }

    @Override
    public Object getItem(int position) {
        return myDestilerias.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if(convertView == null){
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.listdestilerias,null);
        }

        Destilerias destilerias = myDestilerias.get(position);


        TextView NameDestileria = v.findViewById(R.id.TxtName);
        TextView CountryDestileria = v.findViewById(R.id.TxtCountry);
        TextView RatingDestileria = v.findViewById(R.id.TxtWhiskybase_rating);

        NameDestileria.setText(destilerias.getNameDestileria());
        CountryDestileria.setText(destilerias.getCountryDestileria());
        RatingDestileria.setText(destilerias.getRatingDestileria());

        return v;

    }
}
