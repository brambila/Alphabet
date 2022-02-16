package com.gameplanet2000.com;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Window;

public class Vow extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		 requestWindowFeature(Window.FEATURE_NO_TITLE);
		 setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
			//GameViewVow gv = new GameViewVow(this);
			//gv.setKeepScreenOn(true);
	       //setContentView(gv);
	}



}

