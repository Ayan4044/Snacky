package com.ayan.snackymessages;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.google.android.material.snackbar.Snackbar;

public class SnackyMessages {
    public  Snackbar snackySnackbar;
    public TextView snackyTextview;
    public View snacyView;
    Animation animationImage;

    public void ShowSnackBarEror(View rootView, String message, int layoutID){
        animationImage=AnimationUtils.loadAnimation(rootView.getContext(),R.anim.fade_in);
        Snackbar snackbar = Snackbar.make(rootView.findViewById(layoutID),message, Snackbar.LENGTH_LONG);
        View sbView = snackbar.getView();
        TextView textView = (TextView)sbView.findViewById(com.google.android.material.R.id.snackbar_text);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_error, 0, 0, 0);
        textView.setCompoundDrawablePadding(10);
        sbView.setBackgroundResource(R.drawable.rounded_corner_error);

        snackbar.show();
    }





    public void ShowSnackbarInfo(View rootView, String message, int layoutID,int colorid){
     animationImage=AnimationUtils.loadAnimation(rootView.getContext(),R.anim.fade_in);
        Snackbar snackbar = Snackbar.make(rootView.findViewById(layoutID), message, Snackbar.LENGTH_LONG);
        View sbView = snackbar.getView();
        TextView textView = (TextView)sbView.findViewById(com.google.android.material.R.id.snackbar_text);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_info, 0, 0, 0);
        textView.setCompoundDrawablePadding(10);

        sbView.setBackgroundResource(R.drawable.rounded_corner_info);
        snackbar.show();
    }

    public void ShowSnackbarSuccess(View rootView, String message, int layoutID){
       animationImage=AnimationUtils.loadAnimation(rootView.getContext(),R.anim.fade_in);
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
        animationImage=AnimationUtils.loadAnimation(view.getContext(),R.anim.fade_in);
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
       animationImage=AnimationUtils.loadAnimation(view.getContext(),R.anim.fade_in);
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
      animationImage=AnimationUtils.loadAnimation(view.getContext(),R.anim.fade_in);
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
       animationImage=AnimationUtils.loadAnimation(getactivity,R.anim.fade_in);
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
       animationImage=AnimationUtils.loadAnimation(getactivity,R.anim.fade_in);
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
       animationImage=AnimationUtils.loadAnimation(getactivity,R.anim.fade_in);
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
        animationImage=AnimationUtils.loadAnimation(getactivity,R.anim.fade_in);
        Snackbar snackbar=Snackbar.make(getactivity.findViewById(layoutID), message, Snackbar.LENGTH_LONG);
        View sbView=snackbar.getView();
        TextView textView = (TextView)sbView.findViewById(com.google.android.material.R.id.snackbar_text);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_sueccess, 0, 0, 0);
        textView.setCompoundDrawablePadding(10);

        sbView.setBackgroundResource(R.drawable.rounded_corner_success);
        snackbar.show();
    }



    public void ShowSnackbarInfo(Activity getactivity, String message,int layoutID){
        animationImage=AnimationUtils.loadAnimation(getactivity,R.anim.fade_in);
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
      animationImage=AnimationUtils.loadAnimation(getacActivity,R.anim.fade_in);
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
       animationImage=AnimationUtils.loadAnimation(getacActivity,R.anim.fade_in);
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
      animationImage=AnimationUtils.loadAnimation(view.getContext(),R.anim.fade_in);
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
       animationImage=AnimationUtils.loadAnimation(view.getContext(),R.anim.fade_in);
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
        animationImage=AnimationUtils.loadAnimation(getactiivty,R.anim.fade_in);
        snackySnackbar=Snackbar.make(getactiivty.findViewById(layoutid), message, Snackbar.LENGTH_INDEFINITE);
        snacyView=snackySnackbar.getView();
        snackyTextview = (TextView)snacyView.findViewById(com.google.android.material.R.id.snackbar_text);
        snackyTextview.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_info, 0, 0, 0);
        snackyTextview.setCompoundDrawablePadding(10);

        snacyView.setBackgroundResource(R.drawable.round_corner_action);
        snackySnackbar.show();
    }



    /*-------------------------- Snackbar Lite Activity ---------------------------------------------------*/
    @SuppressLint("ResourceAsColor")
    public void ShowSnackbarErrorActionGlass(Activity getactivity, String message, int layoutID, String actionname,ExecuteFunction command) {

        animationImage=AnimationUtils.loadAnimation(getactivity,R.anim.fade_in);
        Snackbar snackbar=Snackbar.make(getactivity.findViewById(layoutID), message,  Snackbar.LENGTH_INDEFINITE);
        View sbView=snackbar.getView();
        TextView textView = (TextView)sbView.findViewById(com.google.android.material.R.id.snackbar_text);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_error_red, 0, 0, 0);
        textView.setCompoundDrawablePadding(10);
        textView.setTypeface(null, Typeface.BOLD);
        sbView.setBackgroundResource(R.drawable.rounded_corner_transparent_error);
        sbView.getBackground().setAlpha(100);
        textView.setTextColor(Color.parseColor("#db3445"));
        snackbar.setActionTextColor(Color.parseColor("#99db3445"));
        snackbar.setAction(actionname, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                command.execute();
                snackbar.dismiss();
            }
        });
        snackbar.show();

    }

    @SuppressLint("ResourceAsColor")
    public void ShowSnackbarInfoActionGlass(Activity getactivity, String message, int layoutID, String actionname,ExecuteFunction command) {

        animationImage=AnimationUtils.loadAnimation(getactivity,R.anim.fade_in);
        Snackbar snackbar=Snackbar.make(getactivity.findViewById(layoutID), message,  Snackbar.LENGTH_INDEFINITE);
        View sbView=snackbar.getView();
        TextView textView = (TextView)sbView.findViewById(com.google.android.material.R.id.snackbar_text);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_info_white, 0, 0, 0);
        textView.setCompoundDrawablePadding(10);
        textView.setTypeface(null, Typeface.BOLD);
        sbView.setBackgroundResource(R.drawable.rounded_transparent_info);
         sbView.getBackground().setAlpha(120);
        textView.setTextColor(Color.parseColor("#63a4ff"));
        snackbar.setActionTextColor(Color.parseColor("#9963a4ff"));
        snackbar.setAction(actionname, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                command.execute();
                snackbar.dismiss();
            }
        });
        snackbar.show();

    }

    @SuppressLint("ResourceAsColor")
    public void ShowSnackbarSuccessActionGlass(Activity getactivity, String message, int layoutID, String actionname,ExecuteFunction command) {

        animationImage=AnimationUtils.loadAnimation(getactivity,R.anim.fade_in);
        Snackbar snackbar=Snackbar.make(getactivity.findViewById(layoutID), message,  Snackbar.LENGTH_INDEFINITE);
        View sbView=snackbar.getView();
        TextView textView = (TextView)sbView.findViewById(com.google.android.material.R.id.snackbar_text);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_success_white, 0, 0, 0);
        textView.setCompoundDrawablePadding(10);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        sbView.setBackgroundResource(R.drawable.rounded_glassbackgrounded);
        sbView.getBackground().setAlpha(120);

        textView.setTextColor(Color.parseColor("#FF03DAC5"));
        snackbar.setActionTextColor(Color.parseColor("#FF03DAC5"));
        snackbar.setAction(actionname, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                command.execute();
                snackbar.dismiss();
            }
        });
        snackbar.show();

    }
    public void ShowSnackbarSuccessGlass(Activity getactivity, String message, int layoutID) {

        animationImage=AnimationUtils.loadAnimation(getactivity,R.anim.fade_in);
        Snackbar snackbar=Snackbar.make(getactivity.findViewById(layoutID), message, Snackbar.LENGTH_LONG);
        View sbView=snackbar.getView();
        TextView textView = (TextView)sbView.findViewById(com.google.android.material.R.id.snackbar_text);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_success_white, 0, 0, 0);
        textView.setCompoundDrawablePadding(10);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextColor(Color.parseColor("#FF03DAC5"));


        sbView.setBackgroundResource(R.drawable.rounded_glassbackgrounded);
        sbView.getBackground().setAlpha(120);
        snackbar.show();
    }


    public void ShowSnackbarErrorGlass(Activity getactivity, String message, int layoutID) {

        animationImage=AnimationUtils.loadAnimation(getactivity,R.anim.fade_in);
        Snackbar snackbar=Snackbar.make(getactivity.findViewById(layoutID), message, Snackbar.LENGTH_LONG);
        View sbView=snackbar.getView();
        TextView textView = (TextView)sbView.findViewById(com.google.android.material.R.id.snackbar_text);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_error_red, 0, 0, 0);
        textView.setCompoundDrawablePadding(10);

        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextColor(Color.parseColor("#db3445"));


        sbView.setBackgroundResource(R.drawable.rounded_corner_transparent_error);
        sbView.getBackground().setAlpha(120);
        snackbar.show();
    }

    public void ShowSnackbarInfoGlass(Activity getactivity, String message, int layoutID) {

        animationImage=AnimationUtils.loadAnimation(getactivity,R.anim.fade_in);
        Snackbar snackbar=Snackbar.make(getactivity.findViewById(layoutID), message, Snackbar.LENGTH_LONG);
        View sbView=snackbar.getView();
        TextView textView = (TextView)sbView.findViewById(com.google.android.material.R.id.snackbar_text);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_info_white, 0, 0, 0);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setCompoundDrawablePadding(10);

        textView.setTextColor(Color.parseColor("#63a4ff"));

        sbView.setBackgroundResource(R.drawable.rounded_transparent_info);
        sbView.getBackground().setAlpha(120);
        snackbar.show();
    }

    public void ShowSnackBarIndefiniteLite(Activity getactiivty, String message, int layoutid)
    {
        animationImage=AnimationUtils.loadAnimation(getactiivty,R.anim.fade_in);
        snackySnackbar=Snackbar.make(getactiivty.findViewById(layoutid), message, Snackbar.LENGTH_INDEFINITE);
        snacyView=snackySnackbar.getView();
        snackyTextview = (TextView)snacyView.findViewById(com.google.android.material.R.id.snackbar_text);
        snackyTextview.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_info_white, 0, 0, 0);
        snackyTextview.setCompoundDrawablePadding(10);
        snackyTextview.setTypeface(Typeface.DEFAULT_BOLD);
        snackyTextview.setTextColor(Color.parseColor("#63a4ff"));
        snacyView.setBackgroundResource(R.drawable.rounded_transparent_info);
        snacyView.getBackground().setAlpha(120);
        snackySnackbar.show();
        snackySnackbar.show();
    }



    /*---------------------------------------- Snackbar Lite Fragment ---------------------------------------------------------*/
    @SuppressLint("ResourceAsColor")
    public void ShowSnackbarErrorActionLite(View view, String message, int layoutID, String actionname,ExecuteFunction command) {

        animationImage=AnimationUtils.loadAnimation(view.getContext(),R.anim.fade_in);
        Snackbar snackbar=Snackbar.make(view.findViewById(layoutID), message,  Snackbar.LENGTH_INDEFINITE);
        View sbView=snackbar.getView();
        TextView textView = (TextView)sbView.findViewById(com.google.android.material.R.id.snackbar_text);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_error_red, 0, 0, 0);
        textView.setCompoundDrawablePadding(10);
        textView.setTypeface(null, Typeface.BOLD);
        sbView.setBackgroundResource(R.drawable.rounded_corner_transparent_error);
        sbView.getBackground().setAlpha(100);
        textView.setTextColor(Color.parseColor("#db3445"));
        snackbar.setActionTextColor(Color.parseColor("#99db3445"));
        snackbar.setAction(actionname, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                command.execute();
                snackbar.dismiss();
            }
        });
        snackbar.show();

    }

    @SuppressLint("ResourceAsColor")
    public void ShowSnackbarInfoActionLite(View view, String message, int layoutID, String actionname,ExecuteFunction command) {

        animationImage=AnimationUtils.loadAnimation(view.getContext(),R.anim.fade_in);
        Snackbar snackbar=Snackbar.make(view.findViewById(layoutID), message,  Snackbar.LENGTH_INDEFINITE);
        View sbView=snackbar.getView();
        TextView textView = (TextView)sbView.findViewById(com.google.android.material.R.id.snackbar_text);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_info_white, 0, 0, 0);
        textView.setCompoundDrawablePadding(10);
        textView.setTypeface(null, Typeface.BOLD);
        sbView.setBackgroundResource(R.drawable.rounded_transparent_info);
        sbView.getBackground().setAlpha(120);
        textView.setTextColor(Color.parseColor("#63a4ff"));
        snackbar.setActionTextColor(Color.parseColor("#9963a4ff"));
        snackbar.setAction(actionname, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                command.execute();
                snackbar.dismiss();
            }
        });
        snackbar.show();

    }

    @SuppressLint("ResourceAsColor")
    public void ShowSnackbarSuccessActionLite(View view, String message, int layoutID, String actionname,ExecuteFunction command) {

        animationImage=AnimationUtils.loadAnimation(view.getContext(),R.anim.fade_in);
        Snackbar snackbar=Snackbar.make(view.findViewById(layoutID), message,  Snackbar.LENGTH_INDEFINITE);
        View sbView=snackbar.getView();
        TextView textView = (TextView)sbView.findViewById(com.google.android.material.R.id.snackbar_text);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_success_white, 0, 0, 0);
        textView.setCompoundDrawablePadding(10);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        sbView.setBackgroundResource(R.drawable.rounded_glassbackgrounded);
        sbView.getBackground().setAlpha(120);

        textView.setTextColor(Color.parseColor("#FF03DAC5"));
        snackbar.setActionTextColor(Color.parseColor("#FF03DAC5"));
        snackbar.setAction(actionname, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                command.execute();
                snackbar.dismiss();
            }
        });
        snackbar.show();

    }
    public void ShowSnackbarSuccessLite(View view, String message, int layoutID) {

        animationImage=AnimationUtils.loadAnimation(view.getContext(),R.anim.fade_in);
        Snackbar snackbar=Snackbar.make(view.findViewById(layoutID), message, Snackbar.LENGTH_LONG);
        View sbView=snackbar.getView();
        TextView textView = (TextView)sbView.findViewById(com.google.android.material.R.id.snackbar_text);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_success_white, 0, 0, 0);
        textView.setCompoundDrawablePadding(10);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextColor(Color.parseColor("#FF03DAC5"));


        sbView.setBackgroundResource(R.drawable.rounded_glassbackgrounded);
        sbView.getBackground().setAlpha(120);
        snackbar.show();
    }


    public void ShowSnackbarErrorLite(View view, String message, int layoutID) {

        animationImage=AnimationUtils.loadAnimation(view.getContext(),R.anim.fade_in);
        Snackbar snackbar=Snackbar.make(view.findViewById(layoutID), message, Snackbar.LENGTH_LONG);
        View sbView=snackbar.getView();
        TextView textView = (TextView)sbView.findViewById(com.google.android.material.R.id.snackbar_text);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_error_red, 0, 0, 0);
        textView.setCompoundDrawablePadding(10);

        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextColor(Color.parseColor("#db3445"));


        sbView.setBackgroundResource(R.drawable.rounded_corner_transparent_error);
        sbView.getBackground().setAlpha(120);
        snackbar.show();
    }

    public void ShowSnackbarInfoLite(View view, String message, int layoutID) {

        animationImage=AnimationUtils.loadAnimation(view.getContext(),R.anim.fade_in);
        Snackbar snackbar=Snackbar.make(view.findViewById(layoutID), message, Snackbar.LENGTH_LONG);
        View sbView=snackbar.getView();
        TextView textView = (TextView)sbView.findViewById(com.google.android.material.R.id.snackbar_text);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_info_white, 0, 0, 0);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setCompoundDrawablePadding(10);

        textView.setTextColor(Color.parseColor("#63a4ff"));

        sbView.setBackgroundResource(R.drawable.rounded_transparent_info);
        sbView.getBackground().setAlpha(120);
        snackbar.show();
    }

    public void ShowSnackBarIndefiniteLite(View view, String message, int layoutid)
    {
        animationImage=AnimationUtils.loadAnimation(view.getContext(),R.anim.fade_in);
        snackySnackbar=Snackbar.make(view.findViewById(layoutid), message, Snackbar.LENGTH_INDEFINITE);
        View sbView=snackySnackbar.getView();
        snackyTextview = (TextView)sbView.findViewById(com.google.android.material.R.id.snackbar_text);
        snackyTextview.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_info_white, 0, 0, 0);
        snackyTextview.setCompoundDrawablePadding(10);
        snackyTextview.setTypeface(Typeface.DEFAULT_BOLD);
        snackyTextview.setTextColor(Color.parseColor("#63a4ff"));
        sbView.setBackgroundResource(R.drawable.rounded_transparent_info);
        sbView.getBackground().setAlpha(120);
        snackySnackbar.show();
    }

}
