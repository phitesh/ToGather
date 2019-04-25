package com.hited7.meetup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Hackathons extends AppCompatActivity implements View.OnClickListener {
    private CardView Card1,Card2,Card3,Card4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hackathons);
        Card1=(CardView)findViewById(R.id.Card1);
        Card2=(CardView)findViewById(R.id.Card2);
        Card3=(CardView)findViewById(R.id.Card3);
        Card4=(CardView)findViewById(R.id.Card4);
        Card1.setOnClickListener(this);
        Card2.setOnClickListener(this);
        Card3.setOnClickListener(this);
        Card4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch(v.getId()){
            case R.id.Card1: intent=new Intent(Hackathons.this,HackSRM.class);
                startActivity(intent);
                break;
            case R.id.Card2: intent=new Intent(Hackathons.this,Hack3.class);
                startActivity(intent);
                break;
            case R.id.Card3: intent=new Intent(Hackathons.this,Womandroid.class);
                startActivity(intent);
                break;
            case R.id.Card4: intent=new Intent(Hackathons.this,Persona.class);
                startActivity(intent);
                break;


        }

    }
}
