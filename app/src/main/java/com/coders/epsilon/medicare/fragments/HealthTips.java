package com.coders.epsilon.medicare.fragments;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.coders.epsilon.medicare.R;
import com.coders.epsilon.medicare.diseaseActivities.Cholera;
import com.coders.epsilon.medicare.diseaseActivities.HepatitisA;
import com.coders.epsilon.medicare.diseaseActivities.MalariaActivity;
import com.coders.epsilon.medicare.diseaseActivities.Polio;
import com.coders.epsilon.medicare.diseaseActivities.Rabics;
import com.coders.epsilon.medicare.diseaseActivities.Tetanusdiptheria;
import com.coders.epsilon.medicare.diseaseActivities.Typhoid;

public class HealthTips extends Fragment {

    View rootView;

    ListView listView;
    String[] values = new String[] { "Malaria",
            "HepatitisA",
            "Typhoid",
            "Polio",
            "Rabics",
            "Tetanus",
            "Cholera",};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_health_tips, container, false);

        init();
        return rootView;

    }

    private void init(){

        listView=(ListView)rootView.findViewById(R.id.listView);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, android.R.id.text1, values);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index


                //}
                int itemPosition = position;
                switch (itemPosition) {

                    case 0:
                        Intent intent = new Intent(getContext(), MalariaActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intentt = new Intent(getContext(), HepatitisA.class);
                        startActivity(intentt);
                        break;
                    case 2:
                        Intent Typhoid = new Intent(getContext(), com.coders.epsilon.medicare.diseaseActivities.Typhoid.class);
                        startActivity(Typhoid);
                        break;
                    case 3:
                        Intent polio = new Intent(getContext(), Polio.class);
                        startActivity(polio);
                        break;
                    case 4:
                        Intent rabics = new Intent(getContext(), Rabics.class);
                        startActivity(rabics);
                        break;
                    case 5:
                        Intent depthria = new Intent(getContext(), Tetanusdiptheria.class);
                        startActivity(depthria);
                        break;
                    case 6:
                        Intent cholera = new Intent(getContext(), Cholera.class);
                        startActivity(cholera);
                        break;



                }
            }

        });

                }
}
