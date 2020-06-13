package com.saturday.fragmenttask;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Login extends Fragment {
    EditText objUserName, objPassword;
    Button btnLogin, btnRegister;
    String username, password;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Fragment fragment;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    MainActivity main;

    @Override
    public void onAttach(@NonNull Context context) {
        sharedPreferences = context.getSharedPreferences("userfile", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        boolean valid = sharedPreferences.getBoolean("auth", false);
        if (valid == true) {

            Intent i = new Intent(getContext(), Display.class);
            startActivity(i);
        }
        objUserName = view.findViewById(R.id.etUsernmae);
        objPassword = view.findViewById(R.id.etPassword);
        btnLogin = view.findViewById(R.id.idLog);
        btnRegister = view.findViewById(R.id.idReg);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = objUserName.getText().toString();
                password = objPassword.getText().toString();
                String uname, upassword;
                uname = sharedPreferences.getString("username", null);
                upassword = sharedPreferences.getString("password", null);
                if (username.equals(uname) && password.equals(upassword)) {


                    Intent i = new Intent(getContext(), Display.class);
                    startActivity(i);


                    Toast.makeText(getContext(), "Login Sucessfull", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getContext(), "Login is failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Regiter fragment = new Regiter();
                FragmentManager fragmentManager;
                fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.Login, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        return view;

    }

    private void addFragment() {

        fragmentTransaction.commit();
    }

    private void addFragmentB() {
    }
}