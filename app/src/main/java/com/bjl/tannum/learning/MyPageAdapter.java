package com.bjl.tannum.learning;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

/**
 * Created by Tannum on 26/12/16.
 */

public class MyPageAdapter extends FragmentPagerAdapter{

    private final int PAGE_NUM = 3;

    public MyPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        //Log.d("debug","page position = " + String.valueOf(position));
        if(position == 0){
            Log.d("debug", "Get Item 0");
            return OneFragment.newInstance();
        }else if(position == 1){
            return TwoFragment.newInstance();
        }
        else if(position == 2){
            return ThreeFragment.newInstance();
        }

        return null;
    }

    @Override
    public int getCount() {
        return PAGE_NUM;
    }
}
