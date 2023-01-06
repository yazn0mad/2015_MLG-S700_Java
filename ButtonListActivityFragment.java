package com.movinglightgeeks.mlgs700;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by frisco on 29/01/15.
 */
public class ButtonListActivityFragment extends Fragment {

    private Button mButton01;
    private Button mButton02;
    private Button mButton03;
    private Button mButton04;
    private Button mButton05;
    private Button mButton06;
    private Button mButton07;
    private Button mButton08;
    private Button mButton09;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.list_buttons, parent, false);

        mButton01 = (Button)v.findViewById(R.id.button01);
        mButton01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Set Button01: No Strike.
                Intent i = new Intent(getActivity(), NsActivity.class);
                startActivity(i);
           }
        });

        mButton02 = (Button)v.findViewById(R.id.button02);
        mButton02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Set Button02: No Response.
                Intent i = new Intent(getActivity(), NrActivity.class);
                startActivity(i);
            }
        });

        mButton03 = (Button)v.findViewById(R.id.button03);
        mButton03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Set Button03: P/T.
                Intent i = new Intent(getActivity(), PtActivity.class);
                startActivity(i);
            }
        });


        mButton04 = (Button)v.findViewById(R.id.button04);
        mButton04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Set Button04: CMY.
                Intent i = new Intent(getActivity(), CmyActivity.class);
                startActivity(i);
            }
        });

        mButton05 = (Button)v.findViewById(R.id.button05);
        mButton05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Set Button05: Dimmer.
                Intent i = new Intent(getActivity(), DimmerActivity.class);
                startActivity(i);
            }
        });

        mButton06 = (Button)v.findViewById(R.id.button06);
        mButton06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Set Button06: Gobo.
                Intent i = new Intent(getActivity(), GoboActivity.class);
                startActivity(i);
            }
        });

        mButton07 = (Button)v.findViewById(R.id.button07);
        mButton07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Set Button07: Lamping Off.
                Intent i = new Intent(getActivity(), LampingOffActivity.class);
                startActivity(i);
            }
        });

        mButton08 = (Button)v.findViewById(R.id.button08);
        mButton08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Set Button08: Shutter.
                Intent i = new Intent(getActivity(), ShutterActivity.class);
                startActivity(i);
            }
        });

        mButton09 = (Button)v.findViewById(R.id.button09);
        mButton09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Set Button09: Display.
                Intent i = new Intent(getActivity(), DisplayActivity.class);
                startActivity(i);
            }
        });






       return v;
    }







}
