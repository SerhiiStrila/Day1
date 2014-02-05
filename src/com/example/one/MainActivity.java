package com.example.one;

import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.*;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class MainActivity extends Activity {

    ListView listView;
    ProgressBar bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        listView = (ListView) findViewById(R.id.list);
        bar = (ProgressBar) findViewById(R.id.progressBar);
        new DelayOutput().execute();
    }

    public static ArrayList<Data> generateData() {
        ArrayList<Data> dataArrayList = new ArrayList<Data>();
        dataArrayList.add(new Data(R.drawable.d1,"Knopka1"));
        dataArrayList.add(new Data(R.drawable.d2,"Knopka2"));

        return dataArrayList;
    }

    class DelayOutput extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected Void doInBackground(Void... params) {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);
            bar.setVisibility(View.GONE);
            MyAdapter adapter = new MyAdapter(MainActivity.this,generateData());
            listView.setAdapter(adapter);
        }
    }
}

