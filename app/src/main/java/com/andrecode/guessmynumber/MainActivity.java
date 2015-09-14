package com.andrecode.guessmynumber;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import java.util.Arrays;


public class MainActivity extends ActionBarActivity {

    public static Integer RESULT;
    public static final String PACKAGENAME = "com.andrecode.guessmynumber";
    public static final ArrayList<String> INTENTS = new ArrayList<String>(
            Arrays.<String>asList("FirstActivity","SecondActivity","ThirdActivity","FourthActivity","FifthActivity","SixthActivity"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RESULT = 0;
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    public void startApp(View view) {
        Intent intent = new Intent(this,FirstActivity.class);
        startActivity(intent);
    }
}
