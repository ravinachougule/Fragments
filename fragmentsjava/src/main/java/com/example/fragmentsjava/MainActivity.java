package com.example.fragmentsjava;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment(new RedFragment());
    }

    public void loadFragment(Fragment fragment){
        FragmentManager manager =getSupportFragmentManager();
        FragmentTransaction trans=manager.beginTransaction();
        trans.replace(R.id.frameColor,fragment);
        trans.commit();

    }
}
