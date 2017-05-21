package com.example.a1691717.facebookjack.feipackage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.example.a1691717.facebookjack.R;
import com.example.a1691717.facebookjack.navtejPackage.UserScreen;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

/**
 * Created by fei on 5/21/17.
 */


public class phoneRequest extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void goto2(View view) {
        Intent i = new Intent(phoneRequest.this, UserScreen.class);
        startActivity(i);
    }
    }
}