package com.openidentity.android.sdk.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.openidentity.android.sdk.lib.OpenIdentity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OpenIdentity.getInstance().init(this, "1234", "https://service.com");
        
    }
}
