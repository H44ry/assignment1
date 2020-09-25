package com.example.hoanghaidinh_ceng319lab1_ex1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class TopFragment extends Fragment {

    String [] list = new String[]
            {
                "AIActivity",
                "VRActivity"
            };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_top, container, false);
        //ArrayAdapter creates a view for each array item
        // by calling toString() on each item and placing
        // the contents in a TextView.
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, list);
        //bind the list view with array adapter

        return view;
    }
}