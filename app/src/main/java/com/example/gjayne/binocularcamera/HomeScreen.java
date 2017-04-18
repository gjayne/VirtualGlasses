package com.example.gjayne.binocularcamera;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }

    public void start(View v){
        Intent start = new Intent(this, MainActivity.class);
        start.setData(Uri.parse("OFF"));
        startActivity(start);
    }

    public void mono(View v){
        Intent mono = new Intent(this, MainActivity.class);
        mono.setData(Uri.parse("MONO"));
        startActivity(mono);
    }

    public void negative(View v){
        Intent negative = new Intent(this, MainActivity.class);
        negative.setData(Uri.parse("NEGATIVE"));
        startActivity(negative);
    }

    public void solarize(View v){
        Intent solarize = new Intent(this, MainActivity.class);
        solarize.setData(Uri.parse("SOLARIZE"));
        startActivity(solarize);
    }
    public void sepia(View v){
        Intent sepia = new Intent(this, MainActivity.class);
        sepia.setData(Uri.parse("SEPIA"));
        startActivity(sepia);
    }
    public void posterize(View v){
        Intent posterize = new Intent(this, MainActivity.class);
        posterize.setData(Uri.parse("POSTERIZE"));
        startActivity(posterize);
    }
    public void whiteboard(View v){
        Intent whiteboard = new Intent(this, MainActivity.class);
        whiteboard.setData(Uri.parse("WHITEBOARD"));
        startActivity(whiteboard);
    }
    public void blackboard(View v){
        Intent blackboard = new Intent(this, MainActivity.class);
        blackboard.setData(Uri.parse("BLACKBOARD"));
        startActivity(blackboard);
    }
    public void aqua(View v){
        Intent aqua = new Intent(this, MainActivity.class);
        aqua.setData(Uri.parse("AQUA"));
        startActivity(aqua);
    }

}
