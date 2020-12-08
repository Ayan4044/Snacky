package com.ayan.snackymessages;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import com.google.android.material.snackbar.Snackbar;

public class SnackyMessages {

    public void ShowSnackBarEror(View rootView, String message, int layoutID, int colorid){
        Snackbar snackbar = Snackbar.make(rootView.findViewById(layoutID),message, Snackbar.LENGTH_LONG);
        View sbView = snackbar.getView();
        sbView.setBackgroundResource(colorid);
        snackbar.show();
    }


    public void ShowSnackbarInfo(View rootView, String message, int layoutID,int colorid){
        Snackbar snackbar = Snackbar.make(rootView.findViewById(layoutID), message, Snackbar.LENGTH_LONG);
        View sbView = snackbar.getView();
        sbView.setBackgroundResource(colorid);
        snackbar.show();
    }

    public void ShowSnackbarSuccess(View rootView, String message, int layoutID,int colorid){
        Snackbar snackbar = Snackbar.make(rootView.findViewById(layoutID), message, Snackbar.LENGTH_LONG);
        View sbView = snackbar.getView();
        sbView.setBackgroundResource(colorid);
        snackbar.show();
    }



    public interface ExecuteFunction{
        void execute();
    }

    public void SnackbarAction(View view, String custommessage, int layoutID,int colorid, ExecuteFunction command)
    {
        final Snackbar snackBar = Snackbar.make(view.findViewById(layoutID), custommessage,    Snackbar.LENGTH_INDEFINITE);
        View sbView = snackBar.getView();
        sbView.setBackgroundResource(colorid);
        snackBar.setActionTextColor(Color.parseColor("#FAFAFA"));
        snackBar.setAction("Ok", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                command.execute();
                snackBar.dismiss();
            }
        });
        snackBar.show();

    }


    public void SnackbarActionActivity(Activity getactivity, String custommessage, int layoutID, int colorid, ExecuteFunction command)
    {
        final Snackbar snackBar = Snackbar.make(getactivity.findViewById(layoutID), custommessage, Snackbar.LENGTH_INDEFINITE);
        View sbView = snackBar.getView();
        sbView.setBackgroundResource(colorid);
        snackBar.setActionTextColor(Color.parseColor("#FAFAFA"));
        snackBar.setAction("Ok", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                command.execute();
                snackBar.dismiss();
            }
        });
        snackBar.show();

    }

    public void ShowSnackbarSuccess(Activity getactivity, String message, int colorid, int layoutID) {
        Snackbar snackbar=Snackbar.make(getactivity.findViewById(layoutID), message, Snackbar.LENGTH_LONG);
        View sbView=snackbar.getView();
        sbView.setBackgroundResource(colorid);
        snackbar.show();
    }

    public void ShowSnackbarInfo(Activity getactivity, String message,int colorid,int layoutID){
        Snackbar snackbar=Snackbar.make(getactivity.findViewById(layoutID), message, Snackbar.LENGTH_LONG);
        View sbView=snackbar.getView();
        sbView.setBackgroundResource(colorid);
        snackbar.show();
    }



    public void ShowSnackBarEror(Activity getacActivity, String message, int colorid, int layoutid)
    {
        Snackbar snackbar=Snackbar.make(getacActivity.findViewById(layoutid), message, Snackbar.LENGTH_LONG);
        View sbView=snackbar.getView();
        sbView.setBackgroundResource(colorid);
        snackbar.show();
    }
}
