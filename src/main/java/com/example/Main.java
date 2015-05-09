package com.example;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.activity.DeckardActivity;

/**
 * Created by c4q-john on 5/7/15.
 */
public class Main extends DeckardActivity {
    public int numtest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deckard);

    }
    public void addone(View v){
        numtest += 1;
        TextView t = (TextView) findViewById(R.id.counter);
        t.setText(numtest+"");
    }
}
