package com.example.lab07;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Siguiente(View view){
        Intent siguiente = new Intent(this, PassActivity.class);
        startActivity(siguiente);
    }
    public void Siguiente2(View view){
        Intent siguiente = new Intent(this, DataActivity.class);
        startActivity(siguiente);
    }

}