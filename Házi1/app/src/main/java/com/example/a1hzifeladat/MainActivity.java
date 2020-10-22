package com.example.a1hzifeladat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText szam1=findViewById(R.id.szam1);
        final EditText szam2=findViewById(R.id.szam2);

        final EditText eredmeny=findViewById(R.id.eredmeny);

        Button osszeadas=findViewById(R.id.plusz);
        osszeadas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eredmeny.setText(Integer.parseInt(szam1.toString())+Integer.parseInt(szam2.toString()));
            }
        });

        Button kivonas=findViewById(R.id.minusz);
        osszeadas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eredmeny.setText(Integer.parseInt(szam1.toString())-Integer.parseInt(szam2.toString()));
            }
        });

        Button szorzas=findViewById(R.id.szorzas);
        osszeadas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eredmeny.setText(Integer.parseInt(szam1.toString())*Integer.parseInt(szam2.toString()));
            }
        });

        Button osztas=findViewById(R.id.osztas);
        osszeadas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eredmeny.setText(Integer.parseInt(szam1.toString())/Integer.parseInt(szam2.toString()));
            }
        });
    }
}