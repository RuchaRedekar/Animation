package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         ImageView imageView = findViewById(R.id.pic);
        Button blink=findViewById(R.id.Blink);
        Button fade=findViewById(R.id.Fade);
        Button move=findViewById(R.id.Move);
        Button slide=findViewById(R.id.Slide);
        Button zoom=findViewById(R.id.Zoom);
        Button stop=findViewById(R.id.Stop);

        blink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
                imageView.startAnimation(animation);
            }
        });

        fade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
                imageView.startAnimation(animation);
            }
        });

        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
                imageView.startAnimation(animation);
            }
        });

        slide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide);
                imageView.startAnimation(animation);
            }
        });

        zoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
                imageView.startAnimation(animation);
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.clearAnimation();
            }
        });
    }
}