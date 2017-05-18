package com.example.a1691717.facebookjack.sahilPackage;

import com.example.a1691717.facebookjack.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SAHIL BHATOA on 08-Apr-17.
 */

public class StoryFeed {


    StoryFeed()
    {

    }
     String feedTitle;
     String feedTime;
     String feedContent;
     String likes;
     String commentShareView;
     int contentImageID;
     int feedImageID;

    StoryFeed(String feedTitle, String feedTime, String feedContent, String likes, String commentShareView, int feedImageID, int contentImageID) {
        this.feedTitle = feedTitle;
        this.feedTime = feedTime;
        this.feedContent = feedContent;
        this.likes = likes;
        this.commentShareView = commentShareView;
        this.contentImageID=contentImageID;
        this.feedImageID=feedImageID;
    }

    public String getEmojiByUnicode(int unicode){

        return new String(Character.toChars(unicode));
    }
     List<StoryFeed> feedList;

    // This method creates an ArrayList that has three Person objects
// Checkout the project associated with this tutorial on Github if
// you want to use the same images.
    public List<StoryFeed> initializeData() {
        feedList = new ArrayList<>();
        feedList.add(new StoryFeed("Interesting Engineering", "Apr 1 at 7:21 am.","This wheelchair can actually climb stairs"+" "+getEmojiByUnicode(0x2665),"19k","582 Comments 7.6k Shares 839K Views",R.drawable.image , R.drawable.logo2));
        feedList.add(new StoryFeed("What The F Facts by Diply", "Mar 29 at 8:51 pm.","An Amazing machine! #onedip","8k","214 Comments 1.3k Shares 152K Views",R.drawable.maxresdefault ,R.drawable.logo3));
        feedList.add(new StoryFeed("Interesting Engineering", "Apr 1 at 7:21 am.","This wheelchair can actually climb stairs"+" "+getEmojiByUnicode(0x2665),"19k","582 Comments 7.6k Shares 839K Views",R.drawable.image ,R.drawable.logo2));
        return feedList;
    }

}