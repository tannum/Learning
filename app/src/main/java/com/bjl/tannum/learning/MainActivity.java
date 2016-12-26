package com.bjl.tannum.learning;

import android.app.Dialog;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends FragmentActivity {


    ViewPager pager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        MyPageAdapter adapter = new MyPageAdapter(getSupportFragmentManager());
        pager = (ViewPager)findViewById(R.id.pager);
        pager.setAdapter(adapter);

        Button btn_next = (Button)findViewById(R.id.btn_next);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pager.setCurrentItem(pager.getCurrentItem() + 1);
            }
        });

        Button btn_prev = (Button)findViewById(R.id.btn_prev);
        btn_prev.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pager.setCurrentItem(pager.getCurrentItem() - 1);
            }
        });

        Button btn_request = (Button)findViewById(R.id.btn_request);
        btn_request.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });


//        Button btn_one = (Button)findViewById(R.id.btn_one);
//        btn_one.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                OneFragment fragment = new OneFragment();
//                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//                //transaction.add(R.id.fragment_container,fragment);
//                transaction.replace(R.id.fragment_container,fragment);
//                transaction.commit();
//            }
//        });
//
//        Button btn_two = (Button)findViewById(R.id.btn_two);
//        btn_two.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                TwoFragment twoFragment = new TwoFragment();
//                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//                //transaction.add(R.id.fragment_container, twoFragment);
//                transaction.replace(R.id.fragment_container,twoFragment);
//                transaction.commit();
//            }
//        });
//
//        Button btn_three = (Button)findViewById(R.id.btn_three);
//        btn_three.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                ThreeFragment threeFragment = new ThreeFragment();
//                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//                //transaction.add(R.id.fragment_container, threeFragment);
//                transaction.replace(R.id.fragment_container,threeFragment);
//                transaction.commit();
//            }
//        });

    }
    public Fragment getActiveFragment(ViewPager container, int position) {
        String name = "android:switcher:" + container.getId() + ":" + position;
        return getSupportFragmentManager().findFragmentByTag(name);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //return super.onCreateOptionsMenu(menu);
        Log.d("debug","on create menu");

        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;

    }
}
