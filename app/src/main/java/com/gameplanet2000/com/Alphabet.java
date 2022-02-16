package com.gameplanet2000.com;

import android.media.AudioManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.view.Menu;
import android.view.Window;

public class Alphabet extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		 requestWindowFeature(Window.FEATURE_NO_TITLE);
	     setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
	     this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
		Title ma = new Title(this);
		ma.setKeepScreenOn(true);
		setContentView(ma);
	}

	  public void onPause(){
			 
			 // Toast toast = Toast.makeText(this, "Si Junciona" , Toast.LENGTH_SHORT);
	 	      //toast.show();
	 	  
			   // sounds.play(adiosSound, volume, volume, 1, 0, 1);
		    	super.onPause();
		    	//GameView.sounds.release();
		        //GameView.sounds = null;
		    	finish();
		    	 
		    	
		  }
}

