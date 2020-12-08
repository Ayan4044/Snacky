"# SnackyMessages" 




**Customize Snackbar messages with background colors**
     
     maven { url 'https://jitpack.io' }
     implementation 'com.github.Ayan4044:Snacky:0.0.1'

###### For Kotlin

    val snacky=SnackyMessages()
    snacky.ShowSnackBarEror(this,"Something went wrong",R.color.boxStrokeColor,R.id.mainlayout)
   
    
     snacky.SnackbarActionActivity(this,"Message",R.id.mainlayout,R.color.design_default_color_primary_variant,object:SnackyMessages.ExecuteFunction{
            override fun execute() {
               Toast.makeText(applicationContext,"Heelo",Toast.LENGTH_LONG).show()
            }
        })
        
        
![Screenshot](https://github.com/Ayan4044/Snacky/blob/main/Snacky.png)
        
        
        
###### For Java
     
       snackyMessages.SnackbarActionActivity(ActivityDeptCalender.this, "Something went wrong!!", android.R.id.content, R.color.snackbarInfo, new SnackyMessages.ExecuteFunction()            {
                @Override
                public void execute() {
                    onBackPressed();
                }
            });

