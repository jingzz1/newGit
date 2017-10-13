package com.jingzz.administrator.mynews;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String SHARE_APP_TAG = "isFIRST";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread td = new Thread(new Runnable(){
            @Override
            public void run() {

            }
        });
        td.start();



    }
}
