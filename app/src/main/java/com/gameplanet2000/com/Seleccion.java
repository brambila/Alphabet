package com.gameplanet2000.com;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.SoundPool;
import android.view.MotionEvent;
import android.view.SurfaceHolder;

 
public class Seleccion extends GameView {
	
	  private SurfaceHolder holder;
	  private GameLoopThread gameLoopThread;
	  private int screenW;
	  private int screenH;
	  private Bitmap bg;
	  
	  boolean botonUnoBoolean = true;
	  boolean botonDosBoolean = true;
	  
	  private Flecha botonUno;
	  private Flecha botonDos;
	  private Flecha botonUno2;
	  private Flecha botonDos2;
	  
	  float volume;
	  static SoundPool sounds;
	  private static int botonSound1;
	  
	  
	  
    
    public Seleccion(Context context) {
          super(context);
          
          mycontext = context;
          
          gameLoopThread = new GameLoopThread(this);
          holder = getHolder();
          
          sounds = new SoundPool(5, AudioManager.STREAM_MUSIC, 0); 
          botonSound1 = sounds.load(mycontext, R.raw.sound80, 1);
          
          AudioManager audioManager = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);
   		  volume = (float)audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
          
          holder.addCallback(new SurfaceHolder.Callback() {

                 @Override
                 public void surfaceDestroyed(SurfaceHolder holder) {
                        boolean retry = true;
                        gameLoopThread.setRunning(false);
                        while (retry) {
                               try {
                                     gameLoopThread.join();
                                     retry = false;
                                     
                                     
                                     
                               } catch (InterruptedException e) {
                               }
                        }
                 }

                 @Override
                 public void surfaceCreated(SurfaceHolder holder) {
                 		
                 	   createSprites();
                        gameLoopThread.setRunning(true);
                        gameLoopThread.start();
                 }

                 @Override
                 public void surfaceChanged(SurfaceHolder holder, int format,
                               int width, int height) {
                 	
                 }
          });
          
           

         
          
    }     
    
    @Override
		public void onSizeChanged (int w, int h, int oldw, int oldh)
		{
			super.onSizeChanged(w, h, oldw, oldh);
			screenW = w;
			screenH = h;
		}
    private void createSprites() {
 
 	
 	  bg = BitmapFactory.decodeResource(getResources(), R.drawable.seleccionbk);
 	  bg = Bitmap.createScaledBitmap(bg, screenW, screenH, true);
 	  
 	 botonUno = createBoton(R.drawable.juego1);
 	 botonUno.setX((int)(botonUno.getWidth() * .25));
 	 botonUno.setY((screenH - botonUno.getHeight()) / 4);
 	 
 	 botonDos = createBoton(R.drawable.juego2);
	 botonDos.setX((int)(botonDos.getWidth() + (botonDos.getWidth() * .5)));
	 botonDos.setY((screenH - botonDos.getHeight()) / 4);
	 
	 botonUno2 = createBoton(R.drawable.juego1l);
 	 botonUno2.setX((int)(botonUno2.getWidth() * .25));
 	 botonUno2.setY((screenH - botonUno2.getHeight()) / 4);
 	 
 	 botonDos2 = createBoton(R.drawable.juego2l);
	 botonDos2.setX((int)(botonDos2.getWidth() + (botonDos2.getWidth() * .5)));
	 botonDos2.setY((screenH - botonDos2.getHeight()) / 4);
 	 
 	 
 	  
  }

    
    
 	   
    public boolean onTouchEvent(MotionEvent event) 
    {    
 	   
 	   
 	   if (event.getAction() == android.view.MotionEvent.ACTION_DOWN) 
          {
 		   	touchx = (int)event.getX();
 		   	touchy = (int)event.getY();
          }
          
 	   
 	   else if (event.getAction() == android.view.MotionEvent.ACTION_UP) 
 	   {     
 		   touchx = -400;
 		   touchy = -400;
 		   
 		   if(!botonUnoBoolean)
 		   {
 			  sounds.play(botonSound1, volume, volume, 1, 0,1);
 			  Intent myIntent3 = new Intent(mycontext, Rompecabezas.class);
			  mycontext.startActivity(myIntent3);
			  ((Activity)getContext()).finish();
 		   }
 		   else if(!botonDosBoolean)
 		   {
 			  sounds.play(botonSound1, volume, volume, 1, 0,1);
 			  Intent myIntent4 = new Intent(mycontext, Alpha.class);
			  mycontext.startActivity(myIntent4);
			  ((Activity)getContext()).finish();
 		   }
 	   }   
 	       	       	     	   
 	   return true;
    } 
////////////////////////////////////////////////////////////////////////// 
    
    private Flecha createBoton(int resouce) {
  	   Bitmap bmp = BitmapFactory.decodeResource(getResources(), resouce);
         bmp = Bitmap.createScaledBitmap(bmp, (int)(screenW/2.75), (int)((screenW/2.75) / 1.14), true);
  	  
         return new Flecha(this, bmp);
   } 
  
//////////////////////////////////////////////////////////////////////////   
    public void collision()
    {
    	if(botonDos.isCollition(touchx, touchy))
    	{
    		 
    		botonDosBoolean = false;
    		
    	}
    	else if(botonUno.isCollition(touchx, touchy))
    	{
    		// sounds.play(botonSound1, volume, volume, 1, 0,1);
    		botonUnoBoolean = false;
    		
    	}
    	 
    } 
    
    
    
    
//////////////////////////////////////////////////////////////////////////
    @Override
    protected void onDraw(Canvas canvas) {
 	   try{
 	   
 		   if(start)  
 		   { 
 			   canvas.drawColor(Color.BLACK);
 			   canvas.drawBitmap(bg, 0, 0 , null);
 			   
 			   if(botonUnoBoolean)
 			   {botonUno.onDraw(canvas);}
 			   else
 			   {botonUno2.onDraw(canvas);}   
 			   
 			   if(botonDosBoolean)
 			   {botonDos.onDraw(canvas);}
 			   else
 			   {botonDos2.onDraw(canvas);}
 		   }
 		  collision();
 	   }
 	   catch (Exception e){
 		   
 	   }
    
    }

	
	

	
}





