package com.example.a1691717.facebookjack.navtejPackage;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.widget.Toolbar;

        import com.example.a1691717.facebookjack.R;

public class UserScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_bar_profile_screen2);
        Toolbar t=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(t);

    }
}
