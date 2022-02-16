package com.gameplanet2000.com;




import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.media.AudioManager;
import android.media.SoundPool;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;

public class Title extends View {

	private int screenW;
	private int screenH;
	
	int scaledBotonW;
	int scaledBotonH;
	private float scale;
	
	Context mycontext;
	
	Bitmap botonUp;
	Bitmap botonUp2;
	Bitmap botonUp3;
	Bitmap botonUp4;
	
	// para cambiar volumen
	private AudioManager audioManager;
	// para cambiar volumen
	
	float volume;
	
	Bitmap botonDown;
	Bitmap botonDown2;
	Bitmap botonDown3;
	Bitmap botonDown4;
	
	Bitmap backgroundImg;
	
	private boolean playButtonPressed;
	private boolean playButtonPressed2;
	private boolean playButtonPressed3;
	private boolean playButtonPressed4;
	
	private int backgroundOrigW;
	private int backgroundOrigH;
	private float scaleW;
	private float scaleH;
	private float drawScaleW;
	private float drawScaleH;
	
	
	private static SoundPool sounds;
	private static int botonSound;
	private static int adiosSound;
	
	
	
	public Title(Context context) 
	{
		super(context);
		
		mycontext = context;
		
		Options options = new BitmapFactory.Options();
	    options.inScaled = false;
	   // Bitmap source = BitmapFactory.decodeResource(a.getResources(), path, options);
		//botonUp = BitmapFactory.decodeResource(getResources(), R.drawable.salchicha);
		botonUp = BitmapFactory.decodeResource(context.getResources(),R.drawable.boton1);
		botonUp2 = BitmapFactory.decodeResource(context.getResources(),R.drawable.botonnu);
		//botonUp3 = BitmapFactory.decodeResource(context.getResources(),R.drawable.botonvowels);
		botonUp4 = BitmapFactory.decodeResource(context.getResources(),R.drawable.botonexitn);
		
		botonDown = BitmapFactory.decodeResource(context.getResources(),R.drawable.boton123);
		botonDown2 = BitmapFactory.decodeResource(context.getResources(),R.drawable.botonnu2);
		//botonDown3 = BitmapFactory.decodeResource(context.getResources(),R.drawable.botonvow2);
		botonDown4 = BitmapFactory.decodeResource(context.getResources(),R.drawable.botonexit2b);
		
		backgroundImg = BitmapFactory.decodeResource(context.getResources(),R.drawable.tapiz4);
		backgroundOrigW = 1600;
		backgroundOrigH = 1200;
		//scale = myContext.getResources().getDisplayMetrics().density;
		
		sounds = new SoundPool(5, AudioManager.STREAM_MUSIC, 0); 
	    botonSound = sounds.load(context, R.raw.sound80, 1);
	    adiosSound = sounds.load(context, R.raw.goodbye, 1);
	    audioManager = (AudioManager) mycontext.getSystemService(Context.AUDIO_SERVICE);
	   
		volume = (float)audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
	}

	@Override
	public void onSizeChanged (int w, int h, int oldw, int oldh)
	{
		super.onSizeChanged(w, h, oldw, oldh);
		screenW = w;
		screenH = h;
		scaledBotonW = (int) (screenW/2);
		scaledBotonH = screenH / 10;
		backgroundImg = Bitmap.createScaledBitmap(backgroundImg, w, h, true);
		
		botonUp= Bitmap.createScaledBitmap(botonUp, scaledBotonW, scaledBotonH, true);
		botonUp2= Bitmap.createScaledBitmap(botonUp2, scaledBotonW, scaledBotonH, true);
		//botonUp3= Bitmap.createScaledBitmap(botonUp3, scaledBotonW, scaledBotonH, true);
		botonUp4= Bitmap.createScaledBitmap(botonUp4, scaledBotonW, scaledBotonH, true);
		
		botonDown= Bitmap.createScaledBitmap(botonDown, scaledBotonW, scaledBotonH, true);
		botonDown2= Bitmap.createScaledBitmap(botonDown2, scaledBotonW, scaledBotonH, true);
		//botonDown3= Bitmap.createScaledBitmap(botonDown3, scaledBotonW, scaledBotonH, true);
		botonDown4= Bitmap.createScaledBitmap(botonDown4, scaledBotonW, scaledBotonH, true);
		
		scaleW = (float) screenW / (float)backgroundOrigW;
		scaleH = (float) screenH / (float)backgroundOrigH;
		
		drawScaleW = (float) screenW / backgroundOrigW; 
		drawScaleH = (float) screenH / backgroundOrigH;
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////
	
/////////////////////////////////////////////////////////////////////////////////////////
	@Override
	protected void onDraw(Canvas canvas) 
	{
		try {
			canvas.drawBitmap(backgroundImg, 0, 0, null);
			
			if (playButtonPressed)
			{
				canvas.drawBitmap(botonDown, (screenW - scaledBotonW) / 2, screenH - scaledBotonH * 8 , null);
			}
			else
			{
				canvas.drawBitmap(botonUp, (screenW - scaledBotonW) / 2, screenH - scaledBotonH * 8 , null);
			}
			
			if (playButtonPressed2)
			{
				canvas.drawBitmap(botonDown2, (screenW - scaledBotonW) / 2, screenH - scaledBotonH * 5 , null);
			}
			else
			{
				canvas.drawBitmap(botonUp2, (screenW - scaledBotonW) / 2, screenH - (scaledBotonH * 5) , null);
			}
			
			/*if (playButtonPressed3)
			{
				canvas.drawBitmap(botonDown3, (screenW - scaledBotonW) / 2, screenH - scaledBotonH * 3 , null);
			}
			else
			{
				canvas.drawBitmap(botonUp3, (screenW - scaledBotonW) / 2, screenH - (scaledBotonH * 3)  , null);
			}*/
			
			if (playButtonPressed4)
			{
				canvas.drawBitmap(botonDown4, (screenW - scaledBotonW) / 2, screenH - scaledBotonH * 2 , null);
			}
			else
			{
				canvas.drawBitmap(botonUp4, (screenW - scaledBotonW) / 2, screenH - (scaledBotonH * 2)  ,null);
			}
			
			
			
			/*canvas.drawBitmap(botonUp, (screenW - scaledBotonW) / 2, screenH - (scaledBotonH * 5) - (scaledBotonH / 6 ), null);
			canvas.drawBitmap(botonUp2, (screenW - scaledBotonW) / 2, screenH - (scaledBotonH * 4) , null);
			canvas.drawBitmap(botonUp3, (screenW - scaledBotonW) / 2, screenH - (scaledBotonH * 3)  +(scaledBotonH / 6 ), null);
			canvas.drawBitmap(botonUp4, (screenW - scaledBotonW) / 2, screenH - (scaledBotonH * 2)  +(scaledBotonH / 3 ),null);*/
			
			} 
		catch (Exception e) 
		{
			
		}
	}



	@Override
	public boolean onTouchEvent(MotionEvent event) {
	
		int eventaction = event.getAction();

		int X = (int)event.getX();
		int Y = (int)event.getY();

		switch (eventaction ) 
		{
		case MotionEvent.ACTION_DOWN:
			if (X > (screenW - scaledBotonW) / 2 && X < (screenW - scaledBotonW) / 2 + scaledBotonW
					 &&
					Y >  screenH - scaledBotonH * 8 && Y <  screenH - scaledBotonH * 8 + scaledBotonH) 
			{
					playButtonPressed = true;
					
					sounds.play(botonSound, volume, volume, 1, 0,1);
					
			}	
			
			else if (X > (screenW - scaledBotonW) / 2 && X < (screenW - scaledBotonW) / 2 + scaledBotonW
			 &&
			Y >  screenH - scaledBotonH * 5 && Y <  screenH - scaledBotonH * 5 + scaledBotonH) 
			{
			playButtonPressed2 = true;
			sounds.play(botonSound, volume, volume, 1, 0,1);
			}	
			/*else if (X > (screenW - scaledBotonW) / 2 && X < (screenW - scaledBotonW) / 2 + scaledBotonW
			 &&
			Y >  screenH - scaledBotonH * 3 && Y <  screenH - scaledBotonH * 3 + scaledBotonH) 
			{
			playButtonPressed3 = true;
			sounds.play(botonSound, volume, volume, 1, 0,1);
			}	*/
			else if (X > (screenW - scaledBotonW) / 2 && X < (screenW - scaledBotonW) / 2 + scaledBotonW
			 &&
			Y >  screenH - scaledBotonH * 2 && Y <  screenH - scaledBotonH * 2 + scaledBotonH) 
			{
			playButtonPressed4 = true;
			//sounds.play(botonSound, volume, volume, 1, 0,1);
			sounds.play(adiosSound, volume, volume, 1, 0, 1);
			}	
			
			break;
			
		case MotionEvent.ACTION_MOVE:
			break;
		case MotionEvent.ACTION_UP:
			if(playButtonPressed)
			{
				playButtonPressed = false;
				//Intent myIntent3 = new Intent(mycontext, Alpha.class);
				//mycontext.startActivity(myIntent3);
				
				Intent myIntent3 = new Intent(mycontext, AlphabetSelection.class);
				mycontext.startActivity(myIntent3);
				
			}
			else if(playButtonPressed2)
			{
				playButtonPressed2 = false;
				Intent myIntent4 = new Intent(mycontext, Numb.class);
				mycontext.startActivity(myIntent4);
				
			}
		/*	else if(playButtonPressed3)
			{
				playButtonPressed3 = false;
				Intent myIntent2 = new Intent(mycontext, Vow.class);
				mycontext.startActivity(myIntent2);
				
			}*/
			else if(playButtonPressed4)
			{
				playButtonPressed4 = false;
				//Context context = getContext(); 
	    		//context.startActivity(intent);
	    		((Activity) mycontext).finish();
				//Intent myIntent2 = new Intent(mycontext, Alpha.class);
				//mycontext.startActivity(myIntent2);
				
			}
		
			
			break;
		}

		invalidate();

		return true;
	}
}