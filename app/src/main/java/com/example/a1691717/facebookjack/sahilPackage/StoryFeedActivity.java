package com.example.a1691717.facebookjack.sahilPackage;


import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;

import com.example.a1691717.facebookjack.R;

public class StoryFeedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storyfeed);
        EditText tview = (EditText) findViewById(R.id.myEditText);
        tview.setCompoundDrawablesWithIntrinsicBounds(scaleImage(getDrawable(R.drawable.magnify),(float)0.5), null, null, null);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        RecyclerView rv = (RecyclerView)findViewById(R.id.rv);
        LinearLayoutManager llm = new LinearLayoutManager(getApplicationContext());
        StoryFeed feed=new StoryFeed();
        feed.initializeData();
        RVAdapter adapter = new RVAdapter(feed.initializeData());
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);

    }

    public Drawable scaleImage (Drawable image, float scaleFactor) {

        if ((image == null) || !(image instanceof BitmapDrawable))
            return image;
        Bitmap b = ((BitmapDrawable)image).getBitmap();
        int sizeX = Math.round(image.getIntrinsicWidth() * scaleFactor);
        int sizeY = Math.round(image.getIntrinsicHeight() * scaleFactor);
        Bitmap bitmapResized = Bitmap.createScaledBitmap(b, sizeX, sizeY, false);
        image = new BitmapDrawable(getResources(), bitmapResized);
        return image;
    }

}
