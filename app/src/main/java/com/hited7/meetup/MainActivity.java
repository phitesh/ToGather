package com.hited7.meetup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public void Hackathons(View view1){
        Log.i("Hackathon" ,"Running");
        Intent intent=new Intent(MainActivity.this,Hackathons.class);
        startActivity(intent);
    }
    public void Ted(View view2){
        Log.i("Ted Talks","Working");
        Intent intent=new Intent(MainActivity.this,TedTalks.class);
        startActivity(intent);
    }
    public void Design(View View3){
        Log.i("Design","Working");
        Intent intent=new Intent(MainActivity.this,Design.class);
        startActivity(intent);
    }
    public void Workshops(View view4){
        Log.i("Workshops","Working");
        Intent intent=new Intent(MainActivity.this,Workshops.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
