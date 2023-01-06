package com.movinglightgeeks.mlgs700;

import android.support.v4.app.Fragment;

/**
 * Created by frisco on 19/02/15.
 */
public class NrActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new NrFragment();
    }


}
