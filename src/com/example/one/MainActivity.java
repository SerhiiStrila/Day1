package com.example.one;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.view.Menu;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        MyAdapter adapter = new MyAdapter(this,generateData());

        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(adapter);

    }

    private ArrayList<Data> generateData() {
        ArrayList<Data> dataArrayList = new ArrayList<Data>();
        dataArrayList.add(new Data(R.drawable.d1,"Knopka1"));
        dataArrayList.add(new Data(R.drawable.d2,"Knopka2"));

        return dataArrayList;
    }
}
