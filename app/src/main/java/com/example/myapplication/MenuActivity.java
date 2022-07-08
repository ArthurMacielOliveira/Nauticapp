package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MenuActivity extends Activity {
    ImageView switchToHomerActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        switchToHomerActivity = (ImageView) findViewById(R.id.imageView3);
        switchToHomerActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchActivities();
            }
        });
    }
    private void switchActivities(){
        Intent switchActivityIntent = new Intent(this, HomerActivity.class);
        startActivity(switchActivityIntent);

    }
}