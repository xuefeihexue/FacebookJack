package com.example.a1691717.facebookjack.sahilPackage;

import com.example.a1691717.facebookjack.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SAHIL BHATOA on 08-Apr-17.
 */

public class RequestFeed {


    RequestFeed()
    {

    }
    String requesterName;
    String mutualFriendsCount;
    int requesterProfilePic;

    RequestFeed(String requesterName, String mutualFriendsCount,  int requesterProfilePic) {
        this.requesterName = requesterName;
        this.mutualFriendsCount = mutualFriendsCount;
        this.requesterProfilePic=requesterProfilePic;
    }

    List<RequestFeed> feedList;

    // This method creates an ArrayList that has three Person objects
// Checkout the project associated with this tutorial on Github if
// you want to use the same images.
    public List<RequestFeed> initializeData() {
        feedList = new ArrayList<>();
        feedList.add(new RequestFeed("Sahil","5 Mutual Friends" , R.drawable.profilepic));
        feedList.add(new RequestFeed("Fei","6 Mutual Friends" , R.drawable.feiprofilepic));
        feedList.add(new RequestFeed("Navtej","7 Mutual Friends" , R.drawable.navtejprofilepic));
        feedList.add(new RequestFeed("Navneet","8 Mutual Friends" , R.drawable.navneetprofilepic));
        feedList.add(new RequestFeed("Rohit","9 Mutual Friends" , R.drawable.rohitpic));
        feedList.add(new RequestFeed("Robert","10 Mutual Friends" , R.drawable.robiertpic));
        return feedList;
    }

}