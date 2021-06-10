package com.example.tallerapi;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.tallerapi.models.Whishy;

import java.util.List;

public class WhiskyAdapter extends BaseAdapter {

    protected Activity activity;
    protected List<Whishy> myWhiskys;

    public WhiskyAdapter(Activity activity, List<Whishy> myWhiskys) {
        this.activity = activity;
        this.myWhiskys = myWhiskys;
    }

    @Override
    public int getCount() {
        return myWhiskys.size();
    }

    @Override
    public Object getItem(int position) {
        return myWhiskys.get(position);
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
            v = inf.inflate(R.layout.listwhisky,null);
        }

        Whishy whishy = myWhiskys.get(position);

        TextView nameWhisky = v.findViewById(R.id.TxtName);
        nameWhisky.setText(whishy.getNameWhisky());

        return v;
    }
}
