package com.debuglibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.shweta.LogManager;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LogManager.debug("Debug Demo!!!");
    }
}
