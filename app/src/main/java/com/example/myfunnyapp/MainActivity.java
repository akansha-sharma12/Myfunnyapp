package com.example.myfunnyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view) {


        ImageView mickey = (ImageView) findViewById(R.id.mickey);
        ImageView minnie = (ImageView) findViewById(R.id.minnie);


        mickey.animate()
                .translationXBy(1000f)
                .translationYBy(1000f)
                .rotationBy(3600f)
                .setDuration(2000);
        minnie.animate().alpha(1f).setDuration(2000);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
