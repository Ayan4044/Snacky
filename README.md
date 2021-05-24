"# SnackyMessages" 




**Customized Snackbar messages messages and action**
     
     maven { url 'https://jitpack.io' }
     implementation 'com.github.Ayan4044:Snacky:0.0.8'

###### For Kotlin

    val snacky=SnackyMessages()
    snacky.ShowSnackBarEror(this,"Something went wrong",R.id.mainlayout)
   
    
  
        snacky.SnackbarActionActivity(this,"Message",R.id.mainlayout,"Retry",object:SnackyMessages.ExecuteFunction{
            override fun execute() {
                calculateTip();
            }
        })
        
        ![Screenshot](https://github.com/Ayan4044/Snacky/blob/main/snacy.jpeg)
        
        
         snacky.ShowSnackbarSuccessLite(fragmentFeedbackView,"Feedback Submitted!!",R.id.feedback_fragment)
         
         ![Screenshot](https://github.com/Ayan4044/Snacky/blob/main/snackbar_lite_success.png)
        

        
        
###### For Java
     
     snackyMessages.SnackbarActionActivity(this, "Something went wrong", R.id.mainlayout, "Retry", new SnackyMessages.ExecuteFunction() {
            @Override
            public void execute() {
                   onBackPressed();
            }
        });
    

