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
public class EndNoteFragment extends Fragment {

    private Button mButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.endnote, parent, false);

        mButton = (Button)v.findViewById(R.id.BackToStart);
        mButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(getActivity(), StartActivity.class);
                startActivity(i);
            }
        });
        return v;
    }
}
