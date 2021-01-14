package com.ayan.snacky;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.Toast;

import com.ayan.snackymessages.SnackyMessages;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SnackyMessages snackyMessages=new SnackyMessages();
        snackyMessages.SnackbarActionSucess(this, "Something went wrong", R.id.mainlayout, "Retry", new SnackyMessages.ExecuteFunction() {
            @Override
            public void execute() {
              snackyMessages.ShowSnackbarSuccess(MainActivity.this,"Hello",R.id.mainlayout);
            }
        });


    }


}