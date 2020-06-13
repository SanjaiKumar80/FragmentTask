package com.saturday.fragmenttask;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
    Fragment fragment;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    FrameLayout Framemain, Frame1, Frame2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Framemain = findViewById(R.id.Login);
        Frame1 = findViewById(R.id.containerA);
        Frame2 = findViewById(R.id.containerb);

        addFragmentLogin();
    }

    private void addFragmentLogin() {
        fragment = new Login();
        Framemain.setVisibility(View.VISIBLE);
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.Login, fragment);
        fragmentTransaction.commit();
    }


}