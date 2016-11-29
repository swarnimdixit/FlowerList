package com.example.swarnim_d.flowerlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity  {
    ArrayAdapter arrayAdapter;
    public String[] flowerArray = {"Rose","Jasmine","Lilly","Sunflower",
            "Aster","Tulip","Lotus","Sakura"};
    ListView flowerList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flowerList = (ListView) findViewById(R.id.list_ListView_Fragment);
        ListViewFragment listViewFragment = new ListViewFragment();
        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().replace(R.id.activity_main,listViewFragment).commit();

    }

    @Override
    public void onBackPressed() {
        if (getFragmentManager().getBackStackEntryCount() > 0 ){
            getFragmentManager().popBackStack();
        } else {
            super.onBackPressed();
        }

    }
}
