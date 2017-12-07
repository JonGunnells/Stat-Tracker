package com.gunnells.android.stattrackerjj;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends Activity {

    int tscore;
    int jscore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jscoreUp(View view){
        displayJ(jscore = jscore +1);
    }

    public void jscoreDown(View view){
        displayJ(jscore = jscore -1);
    }

    public void tscoreUp(View view){
        display(tscore = tscore +1);
    }

    public void tscoreDown(View view) {
        display(tscore = tscore -1);

    }

    public void display(int number){
        TextView thomasScore = findViewById(R.id.thomasScore);
        thomasScore.setText("" + number);
    }

    public void displayJ(int number){
        TextView jonScore =  findViewById(R.id.jonScore);
        jonScore.setText("" + number);
    }
}
