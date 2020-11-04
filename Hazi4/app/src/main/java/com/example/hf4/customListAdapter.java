package com.example.hf4;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class customListAdapter extends ArrayAdapter {

    private final Activity context;
    private final String[] csname;
    private final String[] cfname;
    private final String[] sw;
    private final String[] bw;

    public customListAdapter(@NonNull Activity context, String[] csname, String[] cfname, String[] sw, String[] bw) {
        super(context, R.layout.row);
        this.context = context;
        this.csname = csname;
        this.cfname = cfname;
        this.sw = sw;
        this.bw = bw;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();

        View rowWiew=inflater.inflate(R.layout.row,null,true);
        TextView sname=rowWiew.findViewById(R.id.shortname);
        TextView fname=rowWiew.findViewById(R.id.fullname);
        TextView sellworth=rowWiew.findViewById(R.id.sellw);
        TextView buyworth=rowWiew.findViewById(R.id.buyw);

        sname.setText(csname[position]);
        fname.setText(cfname[position]);
        sellworth.setText(sw[position]);
        buyworth.setText(bw[position]);

        return rowWiew;
    }
}
