package com.example.a1691717.facebookjack.sahilPackage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.a1691717.facebookjack.R;

public class postingPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posting_page);
        TextView view=(TextView)findViewById(R.id.mutualFriendsCount);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(postingPage.this,UserScreen.class);
                startActivity(i);
            }
        });

    }
}
