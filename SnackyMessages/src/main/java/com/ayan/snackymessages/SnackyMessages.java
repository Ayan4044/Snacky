package com.ayan.snackymessages;
import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class SnackyMessages {
    public  Snackbar snackySnackbar;
    public TextView snackyTextview;
    public View snacyView;
    public void ShowSnackBarEror(View rootView, String message, int layoutID){
        Snackbar snackbar = Snackbar.make(rootView.findViewById(layoutID),message, Snackbar.LENGTH_LONG);
        View sbView = snackbar.getView();
        TextView textView = (TextView)sbView.findViewById(com.google.android.material.R.id.snackbar_text);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_error, 0, 0, 0);
        textView.setCompoundDrawablePadding(10);
        sbView.setBackgroundResource(R.drawable.rounded_corner_error);
        snackbar.show();
    }


    public void ShowSnackbarInfo(View rootView, String message, int layoutID,int colorid){
        Snackbar snackbar = Snackbar.make(rootView.findViewById(layoutID), message, Snackbar.LENGTH_LONG);
        View sbView = snackbar.getView();
        TextView textView = (TextView)sbView.findViewById(com.google.android.material.R.id.snackbar_text);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_info, 0, 0, 0);
        textView.setCompoundDrawablePadding(10);
        sbView.setBackgroundResource(R.drawable.rounded_corner_info);
        snackbar.show();
    }

    public void ShowSnackbarSuccess(View rootView, String message, int layoutID){
        Snackbar snackbar = Snackbar.make(rootView.findViewById(layoutID), message, Snackbar.LENGTH_LONG);
        View sbView = snackbar.getView();
        TextView textView = (TextView)sbView.findViewById(com.google.android.material.R.id.snackbar_text);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_sueccess, 0, 0, 0);
        textView.setCompoundDrawablePadding(10);
        sbView.setBackgroundResource(R.drawable.rounded_corner_success);
        snackbar.show();
    }



    public interface ExecuteFunction{
        void execute();
    }

    public void SnackbarAction(View view, String custommessage, int layoutID,String actionname, ExecuteFunction command)
    {
        final Snackbar snackBar = Snackbar.make(view.findViewById(layoutID), custommessage,    Snackbar.LENGTH_INDEFINITE);
        View sbView = snackBar.getView();
        TextView textView = (TextView)sbView.findViewById(com.google.android.material.R.id.snackbar_text);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_info, 0, 0, 0);
        textView.setCompoundDrawablePadding(10);
        // sbView.setBackgroundResource(colorid);
        sbView.setBackgroundResource(R.drawable.round_corner_action);
        snackBar.setActionTextColor(Color.parseColor("#FAFAFA"));
        snackBar.setAction(actionname, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                command.execute();
                snackBar.dismiss();
            }
        });
        snackBar.show();

    }

    public void SnackbarActionSucess(View view, String custommessage, int layoutID,String actionname, ExecuteFunction command)
    {
        final Snackbar snackBar = Snackbar.make(view.findViewById(layoutID), custommessage,    Snackbar.LENGTH_INDEFINITE);
        View sbView = snackBar.getView();
        TextView textView = (TextView)sbView.findViewById(com.google.android.material.R.id.snackbar_text);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_sueccess, 0, 0, 0);
        textView.setCompoundDrawablePadding(10);
        // sbView.setBackgroundResource(colorid);
        sbView.setBackgroundResource(R.drawable.rounded_corner_success);
        snackBar.setActionTextColor(Color.parseColor("#FAFAFA"));
        snackBar.setAction(actionname, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                command.execute();
                snackBar.dismiss();
            }
        });
        snackBar.show();

    }

    public void SnackbarActionError(View view, String custommessage, int layoutID,String actionname, ExecuteFunction command)
    {
        final Snackbar snackBar = Snackbar.make(view.findViewById(layoutID), custommessage,    Snackbar.LENGTH_INDEFINITE);
        View sbView = snackBar.getView();
        TextView textView = (TextView)sbView.findViewById(com.google.android.material.R.id.snackbar_text);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_error, 0, 0, 0);
        textView.setCompoundDrawablePadding(10);
        // sbView.setBackgroundResource(colorid);
        sbView.setBackgroundResource(R.drawable.rounded_corner_error);
        snackBar.setActionTextColor(Color.parseColor("#FAFAFA"));
        snackBar.setAction(actionname, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                command.execute();
                snackBar.dismiss();
            }
        });
        snackBar.show();

    }


    public void SnackbarActionActivity(Activity getactivity, String custommessage, int layoutID,String actionname, ExecuteFunction command)
    {
        final Snackbar snackBar = Snackbar.make(getactivity.findViewById(layoutID), custommessage, Snackbar.LENGTH_INDEFINITE);
        View sbView = snackBar.getView();

        TextView textView = (TextView)sbView.findViewById(com.google.android.material.R.id.snackbar_text);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_info, 0, 0, 0);
       textView.setCompoundDrawablePadding(10);
       // sbView.setBackgroundResource(colorid);
        sbView.setBackgroundResource(R.drawable.round_corner_action);
        snackBar.setActionTextColor(Color.parseColor("#FAFAFA"));
        snackBar.setAction(actionname, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                command.execute();
                snackBar.dismiss();
            }
        });
        snackBar.show();

    }

    public void SnackbarActionSucess(Activity getactivity, String custommessage, int layoutID,String actionname, ExecuteFunction command)
    {
        final Snackbar snackBar = Snackbar.make(getactivity.findViewById(layoutID), custommessage, Snackbar.LENGTH_INDEFINITE);
        View sbView = snackBar.getView();

        TextView textView = (TextView)sbView.findViewById(com.google.android.material.R.id.snackbar_text);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_sueccess, 0, 0, 0);
        textView.setCompoundDrawablePadding(10);
        // sbView.setBackgroundResource(colorid);
        sbView.setBackgroundResource(R.drawable.rounded_corner_success);
        snackBar.setActionTextColor(Color.parseColor("#FAFAFA"));
        snackBar.setAction(actionname, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                command.execute();
                snackBar.dismiss();
            }
        });
        snackBar.show();

    }

    public void SnackbarActionError(Activity getactivity, String custommessage, int layoutID,String actionname, ExecuteFunction command)
    {
        final Snackbar snackBar = Snackbar.make(getactivity.findViewById(layoutID), custommessage, Snackbar.LENGTH_INDEFINITE);
        View sbView = snackBar.getView();

        TextView textView = (TextView)sbView.findViewById(com.google.android.material.R.id.snackbar_text);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_error, 0, 0, 0);
        textView.setCompoundDrawablePadding(10);
        // sbView.setBackgroundResource(colorid);
        sbView.setBackgroundResource(R.drawable.rounded_corner_error);
        snackBar.setActionTextColor(Color.parseColor("#FAFAFA"));
        snackBar.setAction(actionname, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                command.execute();
                snackBar.dismiss();
            }
        });
        snackBar.show();

    }

    public void ShowSnackbarSuccess(Activity getactivity, String message, int layoutID) {
        Snackbar snackbar=Snackbar.make(getactivity.findViewById(layoutID), message, Snackbar.LENGTH_LONG);
        View sbView=snackbar.getView();
        TextView textView = (TextView)sbView.findViewById(com.google.android.material.R.id.snackbar_text);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_sueccess, 0, 0, 0);
        textView.setCompoundDrawablePadding(10);
        sbView.setBackgroundResource(R.drawable.rounded_corner_success);
        snackbar.show();
    }

    public void ShowSnackbarInfo(Activity getactivity, String message,int layoutID){
        Snackbar snackbar=Snackbar.make(getactivity.findViewById(layoutID), message, Snackbar.LENGTH_LONG);
        View sbView=snackbar.getView();
        TextView textView = (TextView)sbView.findViewById(com.google.android.material.R.id.snackbar_text);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_info, 0, 0, 0);
        textView.setCompoundDrawablePadding(10);
        sbView.setBackgroundResource(R.drawable.rounded_corner_info);
        snackbar.show();
    }



    public void ShowSnackBarEror(Activity getacActivity, String message, int layoutid)
    {
        Snackbar snackbar=Snackbar.make(getacActivity.findViewById(layoutid), message, Snackbar.LENGTH_LONG);
        View sbView=snackbar.getView();
        TextView textView = (TextView)sbView.findViewById(com.google.android.material.R.id.snackbar_text);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_error, 0, 0, 0);
        textView.setCompoundDrawablePadding(10);
        sbView.setBackgroundResource(R.drawable.rounded_corner_error);
        snackbar.show();
    }


    public void ShowSnackBar(Activity getacActivity, String message, int layoutid)
    {
        Snackbar snackbar=Snackbar.make(getacActivity.findViewById(layoutid), message, Snackbar.LENGTH_LONG);
        View sbView=snackbar.getView();
        TextView textView = (TextView)sbView.findViewById(com.google.android.material.R.id.snackbar_text);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_info, 0, 0, 0);
        textView.setCompoundDrawablePadding(10);
        sbView.setBackgroundResource(R.drawable.round_corner_action);
        snackbar.show();
    }


    public void ShowSnackBar(View view, String message, int layoutid)
    {
        Snackbar snackbar=Snackbar.make(view.findViewById(layoutid), message, Snackbar.LENGTH_LONG);
        View sbView=snackbar.getView();
        TextView textView = (TextView)sbView.findViewById(com.google.android.material.R.id.snackbar_text);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_info, 0, 0, 0);
        textView.setCompoundDrawablePadding(10);
        sbView.setBackgroundResource(R.drawable.round_corner_action);
        snackbar.show();
    }


    public void ShowSnackBarIndefinite(View view, String message, int layoutid)
    {
        snackySnackbar=Snackbar.make(view.findViewById(layoutid), message, Snackbar.LENGTH_INDEFINITE);
        View sbView=snackySnackbar.getView();
        snackyTextview = (TextView)sbView.findViewById(com.google.android.material.R.id.snackbar_text);
        snackyTextview.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_info, 0, 0, 0);
        snackyTextview.setCompoundDrawablePadding(10);
        sbView.setBackgroundResource(R.drawable.round_corner_action);
        snackySnackbar.show();
    }

    public void ShowSnackBarIndefinite(Activity getactiivty, String message, int layoutid)
    {

        snackySnackbar=Snackbar.make(getactiivty.findViewById(layoutid), message, Snackbar.LENGTH_INDEFINITE);
        snacyView=snackySnackbar.getView();
        snackyTextview = (TextView)snacyView.findViewById(com.google.android.material.R.id.snackbar_text);
        snackyTextview.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_info, 0, 0, 0);
        snackyTextview.setCompoundDrawablePadding(10);
        snacyView.setBackgroundResource(R.drawable.round_corner_action);
        snackySnackbar.show();
    }
}
