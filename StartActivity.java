package com.movinglightgeeks.mlgs700;


import android.support.v4.app.Fragment;


public class StartActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new StartFragment();
    }

}
