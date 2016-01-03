package com.qilinlove.cardrivelog.mycardrivelog;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import com.parse.FindCallback;
import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseQuery;

import java.util.Date;
import java.util.List;

import com.parse.ParseObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Parse.initialize(this, "80Xg1M3w8AdAUkX3czOmRigG9bWB0XWb3RZGjo9j", "Gg8KQrQ8w5NLsTyPP9GuIOqtwjfQbtsUx28bp4NK");

        Button startBtn = (Button) findViewById(R.id.startButton);
        startBtn.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                //start button pressed
                Date startDate = new Date();
                EditText eT = (EditText) findViewById(R.id.timeField);
                eT.setText(startDate.toString());
            }
        });

        //add parse query to fill in history and estimate text area
        ParseQuery<ParseObject> query= ParseQuery.getQuery("MyCarDriveRecord");

        //sort query objects in time based descendent order and return only first 5 records
        query.orderByDescending("createdAt").setLimit(5);
        //search in background
        query.findInBackground(new FindCallback<ParseObject>() {
            public void done(List<ParseObject> scoreList, ParseException e) {
            }
        });

        Log.v("ParseQuery", "Query after select first 5 records");


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onCreateStartButtonPressed(View v){



        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
