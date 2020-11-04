package com.example.hf4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String[] shortnameArray = {"EUR", "USD", "GPB", "AUD", "CAD", "CHF", "DKK", "HUF"};
    String[] fullnameArray = {"Euro", "Dollar american", "Lira sterliana", "Dollar australian", "Dollar canadian", "Franc elvetian", "Corona daneza", "Forint magyar"};

    String[] buywArray = {"4,4100", "3,9750", "6,1250", "2,9600", "3,0950", "4,2300", "0,5850", "0,0136"};

    String[] sellwArray = {"4,5500", "3,9750", "6,3550", "3,0600", "3,2650", "4,3300", "0,6150", "0,0146"};

    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customListAdapter cla=new customListAdapter(this,shortnameArray,fullnameArray,buywArray,sellwArray);
        lv=(ListView)findViewById(R.id.listv);
        lv.setAdapter(cla);

        lv.setAdapter(cla);

        lv.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView sw=view.findViewById(R.id.sellw);
                TextView bw=view.findViewById(R.id.buyw);

                sw.setVisibility(view.VISIBLE);
                bw.setVisibility(view.VISIBLE);
            }
        });
    }






}