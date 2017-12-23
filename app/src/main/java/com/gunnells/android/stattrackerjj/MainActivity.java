package com.gunnells.android.stattrackerjj;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import java.util.HashMap;

public class MainActivity extends Activity {

    int tScore;
    int jScore;

    HashMap<Integer, String> hmap = new HashMap<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jScoreUp(View view){
        jScore = jScore +1;
        hmap.put(jScore, "Jon");
        display(jScore);
    }

    public void jScoreDown(View view){
        jScore = jScore -1;
        hmap.put(jScore, "Jon");
        display(jScore);
    }

    public void tScoreUp(View view){
        tScore = tScore +1;
        hmap.put(tScore, "Thomas");
        display(tScore);
    }

    public void tScoreDown(View view) {
        tScore = tScore -1;
        hmap.put(tScore, "Thomas");
        display(tScore);
    }

    public void display(int tScore){
        TextView thomasScore = findViewById(R.id.thomasScore);
        thomasScore.setText("" + tScore);
    }

    public void displayJ(int jScore){
        TextView jonScore =  findViewById(R.id.jonScore);
        jonScore.setText("" + jScore);
    }
}
