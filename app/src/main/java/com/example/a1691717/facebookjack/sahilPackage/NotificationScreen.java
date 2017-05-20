package com.example.a1691717.facebookjack.sahilPackage;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a1691717.facebookjack.R;

/**
 * Created by SAHIL BHATOA on 22-Apr-17.
 */

public class NotificationScreen extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        final View rootview = inflater.inflate(R.layout.fragment_notification, container, false);
        return rootview;
    }






    @Override
    public void onDestroy() {

        super.onDestroy();
    }
}
