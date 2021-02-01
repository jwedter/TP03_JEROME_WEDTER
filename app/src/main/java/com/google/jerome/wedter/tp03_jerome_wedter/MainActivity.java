package com.google.jerome.wedter.tp03_jerome_wedter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void myButton(View v){
        if(v.getId()==R.id.button){
            Intent intent = new Intent("gestion.mbds.CALC");
            startActivity(intent);
        } else if(v.getId()==R.id.button2) {
            Uri uri = Uri.parse("https://mail.google.com/mail/u/0/?tab=wm&ogbl#inbox?compose=new");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }else if(v.getId()==R.id.button3) {
            Uri uri = Uri.parse("114");
            Intent intent = new Intent(Intent.ACTION_DIAL);
            startActivity(intent);
        }else{
            Uri uri = Uri.parse("https://www.google.com");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
    }
}