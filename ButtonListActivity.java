package com.movinglightgeeks.mlgs700;

import android.support.v4.app.Fragment;

/**
 * Created by frisco on 29/01/15.
 */
public class ButtonListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new ButtonListActivityFragment();
    }

}
