package com.example.henry.a4_8_animacin_game;

import android.animation.ObjectAnimator;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnSpin;
    TextView textView, tvpuntuacion;
    ImageView imageView;
    EditText editText;
    private RelativeLayout canvas;
    RadioButton r1,r2,r3;
    private ImageView imageView3,imageView4,imageView5,imageView6,imageView7;

    private MediaPlayer mediaPlayer, mediaPlayer2;


    Random r;

    int grado = 0;
    int grado_anterior = 0;
    String cad = "";
    int tiradas = 0;
    int puntuacion = 0;


    //38 sectores 360/38 = 9.47
    // comienza 23 Rojo desde 9.47/2 = 4.73
    // y termina 4.73 + 9.47 = 14.2 grados
    //
    private static final float FACTOR= 4.73f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    btnSpin = (Button) findViewById(R.id.btnspin);
    textView = (TextView) findViewById(R.id.textView);
    tvpuntuacion = (TextView) findViewById(R.id.puntuacion2);
    imageView = (ImageView) findViewById(R.id.imgroulette);
    editText = (EditText)findViewById(R.id.editText);
    r1=(RadioButton)findViewById(R.id.radioButton);
    r2=(RadioButton)findViewById(R.id.radioButton2);
    r3=(RadioButton)findViewById(R.id.radioButton3);

    canvas = (RelativeLayout) findViewById(R.id.animationCanvas);

    imageView4 = (ImageView) findViewById(R.id.imageView4);
    imageView5 = (ImageView) findViewById(R.id.imageView5);
    imageView3 = (ImageView) findViewById(R.id.imageView3);
    imageView6 = (ImageView) findViewById(R.id.imageView6);
    imageView7 = (ImageView) findViewById(R.id.imageView7);

    r = new Random();

    imageView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            grado_anterior = grado % 360;
            grado = r.nextInt(3600) + 720;
            RotateAnimation rotate = new RotateAnimation(grado_anterior,grado,RotateAnimation.RELATIVE_TO_SELF,0.5f,RotateAnimation.RELATIVE_TO_SELF,0.5f);
        rotate.setDuration(3600);
        rotate.setFillAfter(true);
        rotate.setInterpolator(new DecelerateInterpolator());
        rotate.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                textView.setText("");
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                textView.setText(currentNumber(360 - (grado % 360)));
                if (tiradas % 3 == 0) {

                    if (r1.isChecked() == true) {
                        cad = editText.getText().toString() + " Negro";
                    } else if (r2.isChecked() == true) {
                        cad = editText.getText().toString() + " Rojo";
                    }  else if (r3.isChecked() == true) {
                        cad = editText.getText().toString() + " Verde";
                    }

                    if (textView.getText().equals(cad)) {
                        Toast toast = Toast.makeText(getApplicationContext(), "Has Ganado!", Toast.LENGTH_SHORT);
                        toast.show();
                        puntuacion++;
                        tvpuntuacion.setText(puntuacion+"");


                        //-----------------------------------------------------------------
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


                        //-----------------------------------------------------------------








                        mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.winner);
                        mediaPlayer.start();

                    } else {
                        Toast toast2 = Toast.makeText(getApplicationContext(), "Has Perdido Intenta de Nuevo", Toast.LENGTH_SHORT);
                        toast2.show();
                        mediaPlayer2 = MediaPlayer.create(MainActivity.this,R.raw.error);
                        mediaPlayer2.start();

                    }
                } else {
                    Toast toast3 = Toast.makeText(getApplicationContext(), "Mala Suerte", Toast.LENGTH_SHORT);
                    toast3.show();
                }
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        imageView.startAnimation(rotate);

        }
    });




    }



    private String currentNumber(int grado){
        String text = "";

        if(grado >= (FACTOR * 1) && grado <(FACTOR * 3)){
            text = "23 Rojo";
        }
        if(grado >= (FACTOR * 3) && grado <(FACTOR * 5)){
            text = "35 Negro";
        }
        if(grado >= (FACTOR * 5) && grado <(FACTOR * 7)){
            text = "14 Rojo";
        }
        if(grado >= (FACTOR * 7) && grado <(FACTOR * 9)){
            text = "2 Negro";
        }
        if(grado >= (FACTOR * 9) && grado <(FACTOR * 11)){
            text = "0 Verde";
        }
        if(grado >= (FACTOR * 11) && grado <(FACTOR * 13)){
            text = "28 Negro";
        }
        if(grado >= (FACTOR * 13) && grado <(FACTOR * 15)){
            text = "9 Rojo";
        }
        if(grado >= (FACTOR * 15) && grado <(FACTOR * 17)){
            text = "26 Negro";
        }
        if(grado >= (FACTOR * 17) && grado <(FACTOR * 19)){
            text = "30 Rojo";
        }
        if(grado >= (FACTOR * 19) && grado <(FACTOR * 21)){
            text = "11 Negro";
        }
        if(grado >= (FACTOR * 21) && grado <(FACTOR * 23)){
            text = "7 Rojo";
        }
        if(grado >= (FACTOR * 23) && grado <(FACTOR * 25)){
            text = "20 Negro";
        }
        if(grado >= (FACTOR * 25) && grado <(FACTOR * 27)){
            text = "32 Rojo";
        }
        if(grado >= (FACTOR * 27) && grado <(FACTOR * 29)){
            text = "17 Negro";
        }
        if(grado >= (FACTOR * 29) && grado <(FACTOR * 31)){
            text = "5 Rojo";
        }
        if(grado >= (FACTOR * 31) && grado <(FACTOR * 33)){
            text = "22 Negro";
        }
        if(grado >= (FACTOR * 33) && grado <(FACTOR * 35)){
            text = "34 Rojo";
        }
        if(grado >= (FACTOR * 35) && grado <(FACTOR * 37)){
            text = "15 Negro";
        }
        if(grado >= (FACTOR * 37) && grado <(FACTOR * 39)){
            text = "3 Rojo";
        }
        if(grado >= (FACTOR * 39) && grado <(FACTOR * 41)){
            text = "24 Negro";
        }
        if(grado >= (FACTOR * 41) && grado <(FACTOR * 43)){
            text = "36 Rojo";
        }
        if(grado >= (FACTOR * 43) && grado <(FACTOR * 45)){
            text = "13 Negro";
        }
        if(grado >= (FACTOR * 45) && grado <(FACTOR * 47)){
            text = "1 Rojo";
        }
        if(grado >= (FACTOR * 47) && grado <(FACTOR * 49)){
            text = "00 Verde";
        }
        if(grado >= (FACTOR * 49) && grado <(FACTOR * 51)){
            text = "27 Rojo";
        }
        if(grado >= (FACTOR * 51) && grado <(FACTOR * 53)){
            text = "10 Negro";
        }
        if(grado >= (FACTOR * 53) && grado <(FACTOR * 55)){
            text = "25 Rojo";
        }
        if(grado >= (FACTOR * 55) && grado <(FACTOR * 57)){
            text = "29 Negro";
        }
        if(grado >= (FACTOR * 57) && grado <(FACTOR * 59)){
            text = "12 Rojo";
        }
        if(grado >= (FACTOR * 59) && grado <(FACTOR * 61)){
            text = "8 Negro";
        }
        if(grado >= (FACTOR * 61) && grado <(FACTOR * 63)){
            text = "19 Rojo";
        }
        if(grado >= (FACTOR * 63) && grado <(FACTOR * 65)){
            text = "31 Negro";
        }
        if(grado >= (FACTOR * 65) && grado <(FACTOR * 67)){
            text = "18 Rojo";
        }
        if(grado >= (FACTOR * 67) && grado <(FACTOR * 69)){
            text = "6 Negro";
        }
        if(grado >= (FACTOR * 69) && grado <(FACTOR * 71)){
            text = "21 Rojo";
        }
        if(grado >= (FACTOR * 71) && grado <(FACTOR * 73)){
            text = "33 Negro";
        }
        if(grado >= (FACTOR * 73) && grado <(FACTOR * 75)){
            text = "16 Rojo";
        }
        if((grado >= (FACTOR * 75) && grado < 360 || (grado >= 0 && grado <(FACTOR * 1)))){
            text = "4 Negro";
        }



        return text;
    }
}
