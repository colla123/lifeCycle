package com.example.android.lifecycle;

import android.app.Activity;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Activity is created", Toast.LENGTH_SHORT).show();
        Log.i("onCreate():","Activity is created");
    }

    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        Toast.makeText(this, "Activity is started", Toast.LENGTH_SHORT).show();
        Log.i("onStart():","Activity started");
    }

    @Override
    protected void onRestart() {
        // TODO Auto-generated method stub
        super.onRestart();
        Toast.makeText(this, "Activity is Restarted", Toast.LENGTH_SHORT).show();
        Log.i("onRestart():","Activity Restarted");
    }

    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        super.onResume();
        Toast.makeText(this, "Activity is Resumed", Toast.LENGTH_SHORT).show();
        Log.i("onResume():","Activity Resumed");
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        Toast.makeText(this, "Activity is Paused", Toast.LENGTH_SHORT).show();
        Log.i("onPause():","Activity paused");
    }

    @Override
    protected void onStop() {
        // TODO Auto-generated method stub
        super.onStop();
        Toast.makeText(this, "Activity is Stopped", Toast.LENGTH_SHORT).show();
        Log.i("onStop():","Activity stopped");
    }

    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
        Toast.makeText(this, "Activity is Destroyed", Toast.LENGTH_SHORT).show();
        Log.i("onDestroy():","Activity destroyed");
    }

}