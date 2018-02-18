package com.android.rexben.lagos;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rexben on 2/17/2018.
 */

public class LagosAdapter extends ArrayAdapter<Lagoss> {



    public LagosAdapter(MainActivity mainActivity, ArrayList<Lagoss> lagos) {
        super(mainActivity, 0, lagos);

    }
    public View getView(int position, @Nullable View convertView,  ViewGroup parent) {

View listViewItem = convertView;
        if (listViewItem == null){
            listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.activity_main, parent, false);

        }
        Lagoss currentLagos = getItem(position);

        TextView text = (TextView) listViewItem.findViewById(R.id.textView);
        text.setText(currentLagos.getmText());

        ImageView image = (ImageView) listViewItem.findViewById(R.id.imageView);
        image.setImageResource(currentLagos.getmImage());

        return listViewItem;
    }

}
