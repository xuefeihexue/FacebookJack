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

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.FeedViewHolder>{


    List<StoryFeed> feeds;

    RVAdapter(List<StoryFeed> feeds){
        this.feeds = feeds;
    }
    @Override
    public FeedViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view, viewGroup, false);
        FeedViewHolder pvh = new FeedViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(FeedViewHolder holder, int i) {
        holder.feedTitle.setText(feeds.get(i).feedTitle);
        holder.feedTime.setText(feeds.get(i).feedTime);
        holder.feedDescription.setText(feeds.get(i).feedContent);
        holder.likes.setText(feeds.get(i).likes);
        holder.comments.setText(feeds.get(i).commentShareView);
        holder.feedImage.setImageResource(feeds.get(i).contentImageID);
        holder.feedContentImage.setImageResource(feeds.get(i).feedImageID);

    }

    @Override
    public int getItemCount() {
        return feeds.size();
    }

    public static class FeedViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView feedTitle;
        TextView feedTime;
        TextView feedDescription;
        TextView likes;
        TextView comments;
        ImageView feedImage;
        ImageView feedContentImage;



        FeedViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            feedTitle = (TextView)itemView.findViewById(R.id.mutualFriendsCount);
            feedTime = (TextView)itemView.findViewById(R.id.textView);
            feedDescription = (TextView)itemView.findViewById(R.id.textView3);
            likes = (TextView)itemView.findViewById(R.id.textView4);
            comments = (TextView)itemView.findViewById(R.id.textView5);
            feedImage = (ImageView)itemView.findViewById(R.id.imageView2);
            feedContentImage = (ImageView)itemView.findViewById(R.id.imageView3);

        }
    }



    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

}