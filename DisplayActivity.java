package com.movinglightgeeks.mlgs700;

import android.support.v4.app.Fragment;


/**
 * Created by frisco on 21/02/15.
 */
public class DisplayActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new DisplayFragment();
    }
}
