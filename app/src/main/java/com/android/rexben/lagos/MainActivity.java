package com.android.rexben.lagos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        final ArrayList<Lagoss> lagos = new ArrayList<Lagoss>();
        lagos.add(new Lagoss("Badagry's first storey building", R.drawable.badagry));
        lagos.add(new Lagoss("Coconut Beach", R.drawable.coconutbeach));
        lagos.add(new Lagoss("Ikeja City Mall", R.drawable.ikeja));
        lagos.add(new Lagoss("National Theatre Iganmu", R.drawable.ima));
        lagos.add(new Lagoss("Kingsway Fried Chicken", R.drawable.kfc));
        lagos.add(new Lagoss("Lekki/Ikoyi Bridge", R.drawable.lekkib));
        lagos.add(new Lagoss("Lekki Conservation Center", R.drawable.lekkiconservationcenta));
        lagos.add(new Lagoss("National Museum", R.drawable.musuem));
        lagos.add(new Lagoss("Silverbird Galleria", R.drawable.stv));
        lagos.add(new Lagoss("Tafawa Balewa Square", R.drawable.tbs));
        lagos.add(new Lagoss("Third MainLand Bridge", R.drawable.third));


        ListView listView = (ListView) findViewById(R.id.list);
        LagosAdapter lagosAdapter = new LagosAdapter(MainActivity.this,lagos);
        listView.setAdapter(lagosAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Lagoss lagosso = lagos.get(position);
            }
        });



    }
}
