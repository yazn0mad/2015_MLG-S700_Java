package com.movinglightgeeks.mlgs700;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by frisco on 18/02/15.
 */
public class MainFragment extends Fragment {

    private Button mButton;


    public final static String MAIN_HEADER = "header";
    public final static String MAIN_BODY = "body";
    public final static String MAIN_IMAGE = "main image";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View theView = inflater.inflate(R.layout.fragment_steps, container, false);

        Bundle arguments = getArguments();
        if (arguments != null) {

            String mHeader = arguments.getString(MAIN_HEADER);
            String mBody = arguments.getString(MAIN_BODY);
            int topCardResourceId = arguments.getInt(MAIN_IMAGE);

            displayValues(theView, mHeader, mBody,
                    topCardResourceId);

        }

        mButton = (Button)theView.findViewById(R.id.buttonDone);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), EndNoteActivity.class);
                startActivity(i);
            }
         });



        return theView;
    }

    private void displayValues(View theView, String mHeader, String mBody,
                               int topCardResourceId) {

        TextView nsHeaderTextView = (TextView) theView.findViewById(R.id.mHeader);
        TextView nsBodyTextView = (TextView) theView.findViewById(R.id.mBody);
        ImageView mainImageView = (ImageView) theView.findViewById(R.id.mainImage);


        nsHeaderTextView.setText(mHeader);
        nsBodyTextView.setText(mBody);

        if (mainImageView != null) {
            mainImageView.setImageDrawable(null);
        }

        mainImageView.setImageResource(topCardResourceId);

    }








}
