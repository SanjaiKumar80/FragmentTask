package com.saturday.fragmenttask;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import static com.saturday.fragmenttask.R.id.list_view;
import static com.saturday.fragmenttask.R.layout.fragment_a;


public class FragmentA extends Fragment {

    String[] Employee = {"sanjai", "jabez", "pradeep", "ashok",
            "Gokul", "vengat", "Kamal", "suriya"};
    ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(fragment_a, container, false);
        listView = view.findViewById(list_view);
        ArrayAdapter adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Employee);
        listView.setAdapter(adapter);

        return view;
    }
}