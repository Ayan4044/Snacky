"# SnackyMessages" 




**Customize Snackbar messages with icons and action**
     
     maven { url 'https://jitpack.io' }
     implementation 'com.github.Ayan4044:Snacky:0.0.2'

###### For Kotlin

    val snacky=SnackyMessages()
    snacky.ShowSnackBarEror(this,"Something went wrong",R.id.mainlayout)
   
    
     snacky.SnackbarActionActivity(this,"Message",R.id.mainlayout,"",object:SnackyMessages.ExecuteFunction{
            override fun execute() {
               Toast.makeText(applicationContext,"Heelo",Toast.LENGTH_LONG).show()
            }
        })
        
        
![Screenshot](https://github.com/Ayan4044/Snacky/blob/main/snacy.jpeg)
        
        
        
###### For Java
     
       snackyMessages.SnackbarActionActivity(ActivityDeptCalender.this, "Something went wrong!!", android.R.id.content,"Retry", new SnackyMessages.ExecuteFunction()            {
                @Override
                public void execute() {
                    onBackPressed();
                }
            });

