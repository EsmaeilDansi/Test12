package com.example.mypc.test12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int i=0;
        Toast.makeText(getApplicationContext(),"i="+i,Toast.LENGTH_LONG).show();
        int j=0;
        float h=0;

    }
}
