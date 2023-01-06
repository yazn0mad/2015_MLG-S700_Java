package com.movinglightgeeks.mlgs700;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by frisco on 19/02/15.
 */
public class NrFragment extends Fragment {

    private Button mYesButton;
    private Button mNoButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.yes_no, parent, false);

        mYesButton = (Button)v.findViewById(R.id.Yes);
        mYesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // launch the list view of Problems.
                Intent i = new Intent(getActivity(), NrYesActivity.class);
                startActivity(i);
            }
        });

        mNoButton = (Button)v.findViewById(R.id.No);
        mNoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // launch the list view of Problems.
                Intent i = new Intent(getActivity(), NrNoActivity.class);
                startActivity(i);
            }
        });
        return v;
    }
}
