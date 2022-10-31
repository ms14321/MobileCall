package com.example.phonecallapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {
private EditText phnno;
private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phnno = (EditText) findViewById(R.id.EditText1);
        btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallPhoneNumber();
            }


        });
    }
        @Override
        public void onRequestPermission;
    void Result(int reuestCode, String [] permission, int[] grantResult){
        if(reuestCode==101)
        {
            CallPhoneNumber();
        }
    }
        private void CallPhoneNumber() {
        try{
            if(Build.VERSION.SDK_INT > 22){
                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE != PackageManager.PERMISSION_GRANTED{ActivityCompat.requestPermissions(MainActivity.this,new String[]);{
                    Intent)) {

                }

            }
        }
        }


    }