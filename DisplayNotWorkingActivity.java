package com.movinglightgeeks.mlgs700;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

/**
 * Created by frisco on 21/02/15.
 */
public class DisplayNotWorkingActivity extends FragmentActivity {

    DisplayNotWorkingPagerAdapter mDisplayNotWorkingPagerAdapter;
    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_pager);

        mDisplayNotWorkingPagerAdapter = new DisplayNotWorkingPagerAdapter
                (getSupportFragmentManager(),
                this);
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mDisplayNotWorkingPagerAdapter);

    }



}
