package com.gameplanet2000.com;



import android.app.Activity;
import android.app.ProgressDialog;
import android.content.pm.ActivityInfo;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.Window;

public class Numb extends Activity {

	ProgressDialog dialog;
	  GameViewNum gv;
	  
   // Context context;
   // Handler handler;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		 requestWindowFeature(Window.FEATURE_NO_TITLE);
		 setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		 this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
		 gv = new GameViewNum(this);   
		 gv.setKeepScreenOn(true);
		 setContentView(gv);

		 
		 
		// context = getApplicationContext();
		// setContentView(R.layout.activity_numb);
		 
		
		 dialog = ProgressDialog.show(this, "Loading Please Wait",  "Loading Numbers");
		 new Thread() {
		        public void run() {
		            try {
		                // sleep the thread, whatever time you want. 
		                sleep(6000);
		            } catch (Exception e) {
		            }
		            dialog.dismiss();
		            dialog.cancel();
		        }
		    }.start();

		// handler = new Handler();
	/*			   
		Thread th = new Thread() {
			 public void run() { 	
				 //gv = new GameViewNum(context);	
				 try {
					  
					   //code that takes time to load  
		                
		             } 
				 catch (Exception e) {}
			 handler.post(new Runnable (){
				 
			 public void run() {
					  
				 //code that has to be run in the ui thread;
						
				 dialog.dismiss();
			 
			 
			 
					 }});
			 }
		 };*/
		// th.start();
		 	   
			   
			
			/////////////////////////////////////////////////////////////////////
			
			/////////////////////////////////////////////////////////////////////
	        
	        
	}

	public void onPause()
    {
        super.onPause();
        
        if(dialog != null)
            {
        		dialog.dismiss();
        		dialog.cancel();
            }
        
        GameViewNum.sounds.release();
        GameViewNum.sounds = null;
        finish();
    }

}

