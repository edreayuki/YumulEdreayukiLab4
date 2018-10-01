package com.yumul.edreayuki.yumuledreayukilab4;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d( "4ITF" , "OnCreate has executed.");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("4ITF", "OnStart has executed");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4itf" , "OnResume has executed..");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4itf" , "OnRestart has executed..");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4itf" , "OnStop has executed..");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4itf" , "OnDestroy has executed..");
    }

    public void display(View v) {
        Toast.makeText(this, "Button is clicked",Toast.LENGTH_LONG).show();
        //Snackbar.make(v, "button is clicked", Snackbar.LENGTH_SHORT).show();
    }

}
