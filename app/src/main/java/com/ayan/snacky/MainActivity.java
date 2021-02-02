package com.ayan.snacky;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.ayan.snackymessages.SnackyMessages;
import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SnackyMessages snackyMessages=new SnackyMessages();
        snackyMessages.SnackbarActionSucess(this, "Something went wrong", R.id.mainlayout, "Retry", new SnackyMessages.ExecuteFunction() {
            @Override
            public void execute() {
              snackyMessages.ShowSnackBarIndefinite(MainActivity.this,"Sending...",R.id.mainlayout);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                    snackyMessages.snackyTextview.setText("File Sent");
                        //textView.setText("File Sent");
                       // outerSnackBar.dismiss();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                snackyMessages.snackySnackbar.dismiss();
                            }},500);
                    }
                }, 2000);
            }
      });





    }


}