package com.movinglightgeeks.mlgs700;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by frisco on 21/02/15.
 */
public class DisplayFragment extends Fragment {

    private Button mButton1;
    private Button mButton2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.display_choice, parent, false);

        mButton1 = (Button)v.findViewById(R.id.displayButton1);
        mButton1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(getActivity(), DisplayWorkingActivity.class);
                startActivity(i);
            }
        });

        mButton2 = (Button)v.findViewById(R.id.displayButton2);
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getActivity(), DisplayNotWorkingActivity.class);
                startActivity(i);
            }
        });
        return v;
    }

}
