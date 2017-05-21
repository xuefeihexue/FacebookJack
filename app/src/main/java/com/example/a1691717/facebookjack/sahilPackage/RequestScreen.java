package com.example.a1691717.facebookjack.sahilPackage;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.a1691717.facebookjack.R;

/**
 * Created by SAHIL BHATOA on 22-Apr-17.
 */

public class RequestScreen  extends Fragment {

    private  SwipeRefreshLayout  swipeContainer;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        final View rootview = inflater.inflate(R.layout.fragment_request, container, false);
        swipeContainer= (SwipeRefreshLayout) rootview.findViewById(R.id.requestSwipeContainer);
        // Setup refresh listener which triggers new data loading
        swipeContainer.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                swipeContainer.setRefreshing(false);
                Toast.makeText(getContext(),"Feed Refreshed",Toast.LENGTH_SHORT).show();
            }
        });
        // Configure the refreshing colors
        swipeContainer.setColorSchemeResources(R.color.colorPrimary,
                android.R.color.holo_green_light,
                android.R.color.holo_orange_light,
                android.R.color.holo_red_light);

        RecyclerView rv = (RecyclerView) rootview.findViewById(R.id.requestrv);
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        RequestFeed feed = new RequestFeed();
        RequestRVAdapter adapter = new RequestRVAdapter(feed.initializeData());
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);

        return rootview;
    }






    @Override
    public void onDestroy() {

        super.onDestroy();
    }
}
