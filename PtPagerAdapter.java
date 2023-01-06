package com.movinglightgeeks.mlgs700;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by frisco on 22/02/15.
 */
public class PtPagerAdapter extends FragmentStatePagerAdapter {

    final String[] mTitles;
    final String[] mHeaders;
    final String[] mBodies;

    final int[] mMainImageResourceIds =
            {
                    R.drawable.screws_hextool,
                    R.drawable.pt_dipswitch,
                    R.drawable.cpu,

            };

    public PtPagerAdapter(FragmentManager fm, Context context) {
        super(fm);

        Resources resources = context.getResources();
        mTitles = resources.getStringArray(R.array.pt_titles);
        mHeaders = resources.getStringArray(R.array.pt_headers);
        mBodies = resources.getStringArray(R.array.pt_bodies);


    }

    @Override
    public android.support.v4.app.Fragment getItem(int i) {

        Bundle arguments = new Bundle();

        arguments.putString(MainFragment.MAIN_HEADER, mHeaders[i]);
        arguments.putString(MainFragment.MAIN_BODY, mBodies[i]);
        arguments.putInt(MainFragment.MAIN_IMAGE, mMainImageResourceIds[i]);

        MainFragment mFragment = new MainFragment();
        mFragment.setArguments(arguments);
        return mFragment;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }

    @Override
    public int getCount() {
        return mTitles.length;
    }

}
