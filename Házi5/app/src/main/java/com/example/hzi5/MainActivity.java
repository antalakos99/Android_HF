package com.example.hzi5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] autok={"Audi","BMW","Corvette","Dacia","Fiat","Porsche","Lamborghini","Maserati"};
    List<String> lista=new ArrayList<String>(Arrays.asList(autok));
    ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv=findViewById(R.id.listv);
        lv.setAdapter(adapter);
        registerForContextMenu(lv);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.context_menu,menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu,menu);
        return true;
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        AdapterView.AdapterContextMenuInfo info=(AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        View view = info.targetView;
        TextView  tv=view.findViewById(android.R.id.text1);

        if(item.getItemId()==R.id.piros){
            tv.setTextColor(Color.RED);
            return true;
        }

        if(item.getItemId()==R.id.sarga){
            tv.setTextColor(Color.YELLOW);
            return true;
        }

        if(item.getItemId()==R.id.zold){
            tv.setTextColor(Color.GREEN);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.torol){
            lista.clear();
            adapter.notifyDataSetChanged();
        }
        if (item.getItemId()==R.id.rendez){
            Collections.sort(lista, new Comparator<String>() {
                @Override
                public int compare(String auto1, String auto2) {
                    return auto1.compareToIgnoreCase(auto2);
                }
            });
            adapter.notifyDataSetChanged();
        }
        return super.onOptionsItemSelected(item);
    }
}