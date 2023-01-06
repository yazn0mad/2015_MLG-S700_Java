package com.movinglightgeeks.mlgs700;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by frisco on 18/12/14.
 */
public class StartFragment extends Fragment {

    private ImageButton mImageButton;
    private Button mButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_start, parent, false);

        mImageButton = (ImageButton)v.findViewById(R.id.start_imageButton);
        mImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getActivity(), ButtonListActivity.class);
                startActivity(i);
            }
        });

        mButton = (Button)v.findViewById(R.id.buttonStart);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getActivity(), ButtonListActivity.class);
                startActivity(i);
            }
        });
        return v;
    }

}
