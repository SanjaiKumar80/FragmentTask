package com.saturday.fragmenttask;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Display extends AppCompatActivity {
    Fragment fragment;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        addFragment();
        addFragmentB();
    }
    public void addFragment() {
        fragment = new FragmentA();

        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.containerA, fragment);
        fragmentTransaction.commit();

    }

    public void addFragmentB() {
        fragment = new FragmentB();

        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.containerb, fragment);
        fragmentTransaction.commit();

    }
}