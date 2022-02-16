package com.gameplanet2000.com;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.Window;

public class AlphabetSelection extends Activity {
	
	 
	// float volume;
	// private static SoundPool sounds;
	// private static int adiosSound;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		 requestWindowFeature(Window.FEATURE_NO_TITLE);
		 setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		//  sounds = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
		//  adiosSound = sounds.load(this.getBaseContext(), R.raw.goodbye, 1);
		//  AudioManager audioManager = (AudioManager) this.getBaseContext().getSystemService(Context.AUDIO_SERVICE);
		// volume = (float)audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
		  
		 this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
		 
			Seleccion sl = new Seleccion(this);
			sl.setKeepScreenOn(true);
	       setContentView(sl);
	      
	}

	  public void onPause(){
		 
		 // Toast toast = Toast.makeText(this, "Si Junciona" , Toast.LENGTH_SHORT);
 	      //toast.show();
 	  
		   // sounds.play(adiosSound, volume, volume, 1, 0, 1);
	    	super.onPause();
	    	
	    	Seleccion.sounds.release();
	        Seleccion.sounds = null;
	        //Agregue este codigo por el problema de memoria
	        //GameView.sounds.release();
	        //GameView.sounds = null;
	        ////////////////////////////////////////////////
	    	finish();
	    	 
	    	
	  }

}

