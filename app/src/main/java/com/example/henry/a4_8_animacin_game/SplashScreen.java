package com.example.henry.a4_8_animacin_game;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.BounceInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SplashScreen extends AppCompatActivity {

    private ImageView imageView, imageView3,imageView4,imageView5,imageView6,imageView7;
    private RelativeLayout canvas;
    private TextView textView2, textView3;

    //private Typeface casino;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        /*
        String fuente1 = "fuentes/casinno.ttf";
        this.casino = Typeface.createFromAsset(getAssets(),fuente1);
        */

        AlphaAnimation aparece = new AlphaAnimation(0.1f,1.0f);
        aparece.setDuration(1500);
        aparece.setFillAfter(true);


        imageView = (ImageView) findViewById(R.id.imageView);
        imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView5 = (ImageView) findViewById(R.id.imageView5);
        imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView6 = (ImageView) findViewById(R.id.imageView6);
        imageView7 = (ImageView) findViewById(R.id.imageView7);
        canvas = (RelativeLayout) findViewById(R.id.animationCanvas);
        textView2 = (TextView) findViewById(R.id.textView2);
        //textView2.setTypeface(casino);

        textView3 = (TextView) findViewById(R.id.textView3);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                int screenHeight = canvas.getHeight();
                int targetY = screenHeight - imageView.getHeight();
                ObjectAnimator animator = ObjectAnimator.ofFloat(
                        imageView, "y", 0, targetY)
                        .setDuration(1000);
                animator.setInterpolator(new BounceInterpolator());
                animator.start();



            }
        },1000);
//monedas-----------------------------------------
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView3.setVisibility(View.VISIBLE);
                int screenHeight = canvas.getHeight();
                int targetY = screenHeight - imageView3.getHeight();
                ObjectAnimator animator = ObjectAnimator.ofFloat(
                        imageView3, "y", 0, targetY)
                        .setDuration(1000);
                animator.setInterpolator(new AccelerateInterpolator());
                animator.start();



            }
        },2000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView3.setVisibility(View.VISIBLE);
                int screenHeight = canvas.getHeight();
                int targetY = screenHeight - imageView3.getHeight();
                ObjectAnimator animator = ObjectAnimator.ofFloat(
                        imageView3, "y", 0, targetY)
                        .setDuration(1000);
                animator.setInterpolator(new AccelerateInterpolator());
                animator.start();



            }
        },2300);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView4.setVisibility(View.VISIBLE);
                int screenHeight = canvas.getHeight();
                int targetY = screenHeight - imageView4.getHeight();
                ObjectAnimator animator = ObjectAnimator.ofFloat(
                        imageView4, "y", 0, targetY)
                        .setDuration(1000);
                animator.setInterpolator(new AccelerateInterpolator());
                animator.start();



            }
        },2600);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView5.setVisibility(View.VISIBLE);
                int screenHeight = canvas.getHeight();
                int targetY = screenHeight - imageView5.getHeight();
                ObjectAnimator animator = ObjectAnimator.ofFloat(
                        imageView5, "y", 0, targetY)
                        .setDuration(1000);
                animator.setInterpolator(new AccelerateInterpolator());
                animator.start();



            }
        },2900);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView6.setVisibility(View.VISIBLE);
                int screenHeight = canvas.getHeight();
                int targetY = screenHeight - imageView6.getHeight();
                ObjectAnimator animator = ObjectAnimator.ofFloat(
                        imageView6, "y", 0, targetY)
                        .setDuration(1000);
                animator.setInterpolator(new AccelerateInterpolator());
                animator.start();



            }
        },3100);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                imageView7.setVisibility(View.VISIBLE);
                int screenHeight = canvas.getHeight();
                int targetY = screenHeight - imageView7.getHeight();
                ObjectAnimator animator = ObjectAnimator.ofFloat(
                        imageView7, "y", 0, targetY)
                        .setDuration(1000);
                animator.setInterpolator(new AccelerateInterpolator());
                animator.start();



            }
        },3400);


        aparece.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                textView2.setText("ROULETTE");
                textView3.setText("Henry Rico");
            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        textView2.startAnimation(aparece);
        textView3.startAnimation(aparece);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(SplashScreen.this,MainActivity.class);
                startActivity(intent);
            }
        },4000);
    }
}
