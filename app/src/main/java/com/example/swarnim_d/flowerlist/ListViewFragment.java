package com.example.swarnim_d.flowerlist;


import android.content.res.Configuration;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ListViewFragment extends Fragment {
    ArrayAdapter arrayAdapter;
    public String[] flowerArray = {"Rose", "Jasmine", "Lilly", "Sunflower", "Aster", "Tulip", "Lotus", "Sakura"};

    HashMap<String,String> hmapFragment;
    ListView flowerList;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list_view, container, false);
        container.removeAllViews();






        flowerList = (ListView) view.findViewById(R.id.list_ListView_Fragment);

        arrayAdapter = new ArrayAdapter<String>(getContext(), R.layout.list_item, flowerArray);
        flowerList.setAdapter(arrayAdapter);

        flowerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String itemAtPosition = (String) adapterView.getItemAtPosition(i);

                ListViewFragment listViewFragment = new ListViewFragment();
                ItemDetailFragment itemdetailFrag = new ItemDetailFragment();
                android.support.v4.app.FragmentManager fm = getFragmentManager();

                Bundle bundle = new Bundle();
                bundle.putString("flowername", itemAtPosition);
                itemdetailFrag.setArguments(bundle);

                if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
                   fm.beginTransaction().replace(R.id.rightpane_landscape_listview,itemdetailFrag).commit();
//                    fm.beginTransaction().replace(R.id.rightpane_activity_main,itemdetailFrag).commit();

                }

                if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
                    fm.beginTransaction().replace(R.id.activity_main, itemdetailFrag).addToBackStack(null).commit();
                }


            }
        });
        return view;


    }
}