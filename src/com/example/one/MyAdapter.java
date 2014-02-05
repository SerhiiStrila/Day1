package com.example.one;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Created by serega on 04.02.14.
 */
public class MyAdapter extends ArrayAdapter<Data> {

    private Context context;
    private ArrayList<Data> arrayList;

    public MyAdapter(Context context, ArrayList<Data> arrayList) {
        super(context, R.layout.list_row,arrayList);
        this.context=context;
        this.arrayList=arrayList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.list_row, parent, false);


        TextView text = (TextView) rowView.findViewById(R.id.text);
        ImageView image = (ImageView) rowView.findViewById(R.id.image);


        text.setText(arrayList.get(position).getText());
        image.setImageResource(arrayList.get(position).getImageId());

        return rowView;
    }


}
