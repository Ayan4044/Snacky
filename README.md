"# SnackyMessages" 

**Customize Snackbar messages with background colors**

    val snacky=SnackyMessages()
    snacky.ShowSnackBarEror(this,"Something went wrong",R.color.boxStrokeColor,R.id.mainlayout)
    
     snacky.SnackbarActionActivity(this,"Message",R.id.mainlayout,R.color.design_default_color_primary_variant,object:SnackyMessages.ExecuteFunction{
            override fun execute() {
               Toast.makeText(applicationContext,"Heelo",Toast.LENGTH_LONG).show()
            }
        })

