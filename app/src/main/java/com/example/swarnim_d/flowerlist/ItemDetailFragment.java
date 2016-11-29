package com.example.swarnim_d.flowerlist;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by swarnim_d on 28-11-2016.
 */

public class ItemDetailFragment extends Fragment {

    TextView tvLabel,tvDesc;
    ImageView imgLabel;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_item_detail, container, false);
        container.removeAllViews();
        tvLabel = (TextView) view.findViewById(R.id.labelTextView);
        tvDesc = (TextView) view.findViewById(R.id.DescriptionTextView);
        imgLabel = (ImageView) view.findViewById(R.id.Image_frag);


        Bundle bundle = getArguments();
        if (bundle != null) {

            String incomingLabel = bundle.getString("flowername");
            Toast.makeText(getContext(), " the flower is "+incomingLabel, Toast.LENGTH_LONG).show();

            if(incomingLabel.equals("Rose")) {
                tvLabel.setText(incomingLabel);
                tvDesc.setText("A rose is a woody perennial flowering plant of the genus Rosa, " +
                        "in the family Rosaceae, or the flower it bears. " +
                        "There are over a hundred species and thousands of cultivars. " +
                        "They form a group of plants that can be erect shrubs, " +
                        "climbing or trailing with stems that are often armed with sharp prickles.");
                imgLabel.setImageResource(R.drawable.rose);
            }
            if(incomingLabel.equals("Jasmine")) {
                tvLabel.setText(incomingLabel);
                tvDesc.setText("A rose is a woody perennial flowering plant of the genus Rosa, " +
                        "in the family Rosaceae, or the flower it bears. " +
                        "There are over a hundred species and thousands of cultivars. " +
                        "They form a group of plants that can be erect shrubs, " +
                        "climbing or trailing with stems that are often armed with sharp prickles.");
                imgLabel.setImageResource(R.drawable.jasmine);
            }
            if(incomingLabel.equals("Lilly")) {
                tvLabel.setText(incomingLabel);
                tvDesc.setText("A rose is a woody perennial flowering plant of the genus Rosa, " +
                        "in the family Rosaceae, or the flower it bears. " +
                        "There are over a hundred species and thousands of cultivars. " +
                        "They form a group of plants that can be erect shrubs, " +
                        "climbing or trailing with stems that are often armed with sharp prickles.");
                imgLabel.setImageResource(R.drawable.lilly);
            }
            if(incomingLabel.equals("Sunflower")) {
                tvLabel.setText(incomingLabel);
                tvDesc.setText("A rose is a woody perennial flowering plant of the genus Rosa, " +
                        "in the family Rosaceae, or the flower it bears. " +
                        "There are over a hundred species and thousands of cultivars. " +
                        "They form a group of plants that can be erect shrubs, " +
                        "climbing or trailing with stems that are often armed with sharp prickles.");
                imgLabel.setImageResource(R.drawable.sunflower);
            }
            if(incomingLabel.equals("Aster")) {
                tvLabel.setText(incomingLabel);
                tvDesc.setText("A rose is a woody perennial flowering plant of the genus Rosa, " +
                        "in the family Rosaceae, or the flower it bears. " +
                        "There are over a hundred species and thousands of cultivars. " +
                        "They form a group of plants that can be erect shrubs, " +
                        "climbing or trailing with stems that are often armed with sharp prickles.");
                imgLabel.setImageResource(R.drawable.aster);
            }
            if(incomingLabel.equals("Tulip")) {
                tvLabel.setText(incomingLabel);
                tvDesc.setText("A rose is a woody perennial flowering plant of the genus Rosa, " +
                        "in the family Rosaceae, or the flower it bears. " +
                        "There are over a hundred species and thousands of cultivars. " +
                        "They form a group of plants that can be erect shrubs, " +
                        "climbing or trailing with stems that are often armed with sharp prickles.");
                imgLabel.setImageResource(R.drawable.tulip);
            }
            if(incomingLabel.equals("Lotus")) {
                tvLabel.setText(incomingLabel);
                tvDesc.setText("A rose is a woody perennial flowering plant of the genus Rosa, " +
                        "in the family Rosaceae, or the flower it bears. " +
                        "There are over a hundred species and thousands of cultivars. " +
                        "They form a group of plants that can be erect shrubs, " +
                        "climbing or trailing with stems that are often armed with sharp prickles.");
                imgLabel.setImageResource(R.drawable.lotus);
            }
            if(incomingLabel.equals("Sakura")) {
                tvLabel.setText(incomingLabel);
                tvDesc.setText("A rose is a woody perennial flowering plant of the genus Rosa, " +
                        "in the family Rosaceae, or the flower it bears. " +
                        "There are over a hundred species and thousands of cultivars. " +
                        "They form a group of plants that can be erect shrubs, " +
                        "climbing or trailing with stems that are often armed with sharp prickles.");
                imgLabel.setImageResource(R.drawable.sakura);
            }
        }



        return view;
    }
}
