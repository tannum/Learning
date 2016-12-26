package com.bjl.tannum.learning;

import android.app.Dialog;
import android.support.v4.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends FragmentActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button btn_one = (Button)findViewById(R.id.btn_one);
        btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OneFragment fragment = new OneFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.add(R.id.fragment_container,fragment);
                transaction.commit();
            }
        });

        Button btn_two = (Button)findViewById(R.id.btn_two);
        btn_two.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TwoFragment twoFragment = new TwoFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.add(R.id.fragment_container, twoFragment);
                transaction.commit();
            }
        });

        Button btn_three = (Button)findViewById(R.id.btn_three);
        btn_three.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ThreeFragment threeFragment = new ThreeFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.add(R.id.fragment_container, threeFragment);
                transaction.commit();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //return super.onCreateOptionsMenu(menu);
        Log.d("debug","on create menu");

        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;

    }
}
