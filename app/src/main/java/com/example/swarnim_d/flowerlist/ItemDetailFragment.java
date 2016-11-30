package com.example.swarnim_d.flowerlist;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by swarnim_d on 28-11-2016.
 */

public class ItemDetailFragment extends Fragment {

    TextView tvLabel,tvDesc;
    ImageView imgLabel;
    String bundleFlowerLabel;


    public String[] flowerNameArray = {"Rose", "Jasmine", "Lilly", "Sunflower", "Aster", "Tulip", "Lotus", "Sakura"};
    public String[] flowerDescArray = {"Rose is red", "Jasmine is white", "Lilly is yellow", "Sunflower is orange", "Aster is purple", "Tulips are pink", "Lotus is white", "Sakura is colourful"};
    int[] flowerImageArray = {R.drawable.rose,R.drawable.jasmine,R.drawable.lilly,R.drawable.sunflower,R.drawable.aster,R.drawable.tulip,R.drawable.lotus,R.drawable.sakura};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_item_detail, container, false);
        container.removeAllViews();
        tvLabel = (TextView) view.findViewById(R.id.labelTextView);
        tvDesc = (TextView) view.findViewById(R.id.DescriptionTextView);
        imgLabel = (ImageView) view.findViewById(R.id.Image_frag);


     //   ArrayList<HashMap<String,FlowerModel>> arrayListDetailFrag = new ArrayList<>();
        HashMap<String,FlowerModel> hmapDetailFrag =new HashMap<>();

       for(int i=0;i<flowerNameArray.length;i++){

           FlowerModel fmDetailFrag = new FlowerModel();
           fmDetailFrag.setDescModel(flowerDescArray[i]);
           fmDetailFrag.setImageModel(flowerImageArray[i]);
           hmapDetailFrag.put(flowerNameArray[i],fmDetailFrag);
       }

     //   arrayListDetailFrag.add(hmapDetailFrag);



        Bundle bundle = getArguments();
        if (bundle != null) {
            bundleFlowerLabel = bundle.getString("flowername");
            Toast.makeText(getContext(), " the flower is "+bundleFlowerLabel, Toast.LENGTH_LONG).show();
            tvLabel.setText(bundleFlowerLabel);
        }

        FlowerModel fm = hmapDetailFrag.get(bundleFlowerLabel);
        tvDesc.setText(fm.descModel);
        imgLabel.setImageResource(fm.imageModel);

        return view;
    }
}
