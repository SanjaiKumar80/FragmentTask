package com.saturday.fragmenttask;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import static com.saturday.fragmenttask.R.id.list_view;


public class FragmentB extends Fragment {
    String[] number = {"1", "2", "3", "4",
            "5", "6", "7", "8"};
    ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_b, container, false);
        listView = v.findViewById(R.id.list_viewa);
        ArrayAdapter adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, number);
        listView.setAdapter(adapter);
        return v;
    }
}