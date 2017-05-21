package com.example.a1691717.facebookjack.sahilPackage;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.a1691717.facebookjack.R;

import java.util.List;

/**
 * Created by SAHIL BHATOA on 08-Apr-17.
 */

public class RequestRVAdapter extends RecyclerView.Adapter<RequestRVAdapter.FeedViewHolder>{


    List<RequestFeed> feeds;

    RequestRVAdapter(List<RequestFeed> feeds){
        this.feeds = feeds;
    }
    @Override
    public FeedViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.requestcards, viewGroup, false);
        FeedViewHolder pvh = new FeedViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(FeedViewHolder holder, int i) {
        holder.requesterName.setText(feeds.get(i).requesterName);
        holder.mutualFriendsCount.setText(feeds.get(i).mutualFriendsCount);
        holder.requesterProfilePic.setImageResource(feeds.get(i).requesterProfilePic);

    }

    @Override
    public int getItemCount() {
        return feeds.size();
    }

    public static class FeedViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView requesterName;
        TextView mutualFriendsCount;
        ImageView requesterProfilePic;



        FeedViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.requestcv);
            requesterName = (TextView)itemView.findViewById(R.id.requesterName);
            mutualFriendsCount = (TextView)itemView.findViewById(R.id.mutualFriendsCount);
            requesterProfilePic = (ImageView)itemView.findViewById(R.id.requesterProfilePic);


        }
    }



    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

}