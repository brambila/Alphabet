package com.gameplanet2000.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;



import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.Toast;
 
public class GameView extends SurfaceView   {
	
	   boolean start = true;
	   boolean alfabetoBoolean = false;
	   boolean polloboolean = false;
	   boolean segundaTanda = false;
	   boolean mayuscula = true;
	   boolean mover = true;
	   boolean iniciaRompecabezas = true;
	   boolean star = false;
	   boolean starSoporte = true;
	   boolean toggle = true;
	   boolean sonidoDelBoton = true;
	   boolean pintarPescadoChico = false;
	   boolean escogePescadoChico = false;
	   
	   boolean sonidoLetra = true;
	   
	   boolean pescadoVerdeBoolean = false;
	   boolean pescadoRojoBoolean = false;
	   boolean pescadoAzulBoolean = false;
	   
	   boolean pintarPescadoAzulBoolean = false;
	   boolean pintarPescadoVerdeBoolean = false;
	   boolean pintarPescadoRojoBoolean = false;
	   
	   boolean instruccionesBoolean = true;
	   boolean instruccionesBooleanOsito = true;
	   
	   int rompeUno;
	   int rompeDos;
	   int rompeTres;
	   int rompeCuatro;
	   int rompeCinco;	
	   
	   int uno;
	   int dos;
	   int tres;
	   int cuatro;
	   int cinco;
	   int counterR;
	   
	   
	   float volume;
	   static SoundPool sounds;
	  
	   //private static int si;
	   
	   private static int soundA;
	   private static int soundB;
	   private static int soundC;
	   private static int soundD;
	   private static int soundE;
	   private static int soundF;
	   private static int soundG;
	   private static int soundH;
	   private static int soundI;
	   private static int soundJ;
	   private static int soundK;
	   private static int soundL;
	   private static int soundM;
	   private static int soundN;
	   private static int soundO;
	   private static int soundP;
	   private static int soundQ;
	   private static int soundR;
	   private static int soundS;
	   private static int soundT;
	   private static int soundU;
	   private static int soundV;
	   private static int soundW;
	   private static int soundX;
	   private static int soundY;
	   private static int soundZ;
	   private static int botonSound;
	   private static int pescadorian;
	   
	   private static int yes;
	  
	   ProgressDialog pd;
	   Context mycontext;   
 
	   private Bitmap bg; 
	   private Bitmap bg2;
	   
	   private Flecha instruccionesBitmap;
	   private Flecha instruccionesBitmapOso;
	  
	   //private Flecha flechita;
	   private Bitmap estrellaBitmap;
	   
	   private Estrella estrellaObject;
	   private Estrella estrellaObject2;
	   private Estrella estrellaObject3;
	   private Estrella estrellaObject4;
	   private Estrella estrellaObject5;
	   private Estrella estrellaObject6;
	   
	   private Animacion cangrejo;
	   
	   private Pescado pescadoVerde;
	   private Pescado pescadoRojo;
	   private Pescado pescadoAzul;
	   private Pulpo octopulpo;
	   
	   Rompe ra1;
	 
	   boolean sonidono = true;
    boolean image_down = true;
 
    private int screenW;
	   private int screenH;
	   
	   int touchx = -400;
	   int touchy = -400;
  
    private SurfaceHolder holder;
    private GameLoopThread gameLoopThread;
   
   
    private List<Burbujas> burbujitas = new ArrayList<Burbujas>();
    
    private List<Pescado> pescaditos = new ArrayList<Pescado>();
    
    List<Integer> sonidos = new ArrayList<Integer>();
    
   
    
    private List<Rompe> rompecabezas = new ArrayList<Rompe>();
    
    private List<Rompe> rompecabezasGris = new ArrayList<Rompe>();
   
    
   // Flecha flecha;
    
    Figura carita;
   
    Paint mPaint = new Paint();     
       
    FontMetricsInt fm = mPaint.getFontMetricsInt(); 
    
    public GameView(Context context) {
          super(context);
          
          mycontext = context;
         
          gameLoopThread = new GameLoopThread(this);
          holder = getHolder();
          
         sounds = new SoundPool(5, AudioManager.STREAM_MUSIC, 0); 
         
         //si = sounds.load(mycontext, R.raw.yes, 1);
         botonSound = sounds.load(context, R.raw.sound80, 1);
         pescadorian = sounds.load(context, R.raw.rian, 1);
         soundA = sounds.load(mycontext, R.raw.a, 1);
         soundB = sounds.load(mycontext, R.raw.b, 1);
         soundC = sounds.load(mycontext, R.raw.c, 1);
         soundD = sounds.load(mycontext, R.raw.d, 1);
         soundE = sounds.load(mycontext, R.raw.e, 1);
         soundF = sounds.load(mycontext, R.raw.f, 1);
         soundG = sounds.load(mycontext, R.raw.g, 1);
         soundH = sounds.load(mycontext, R.raw.h, 1);
         soundI = sounds.load(mycontext, R.raw.i, 1);
         soundJ = sounds.load(mycontext, R.raw.j, 1);
         soundK = sounds.load(mycontext, R.raw.k, 1);
         soundL = sounds.load(mycontext, R.raw.l, 1);
         soundM = sounds.load(mycontext, R.raw.m, 1);
         soundN = sounds.load(mycontext, R.raw.n, 1);
         soundO = sounds.load(mycontext, R.raw.o, 1);
         soundP = sounds.load(mycontext, R.raw.p, 1);
         soundQ = sounds.load(mycontext, R.raw.q, 1);
         soundR = sounds.load(mycontext, R.raw.r, 1);
         soundS = sounds.load(mycontext, R.raw.s, 1);
         soundT = sounds.load(mycontext, R.raw.t, 1);
         soundU = sounds.load(mycontext, R.raw.u, 1);
         soundV = sounds.load(mycontext, R.raw.v, 1);
         soundW = sounds.load(mycontext, R.raw.w, 1);
         soundX = sounds.load(mycontext, R.raw.x, 1);
         soundY = sounds.load(mycontext, R.raw.y, 1);
         soundZ = sounds.load(mycontext, R.raw.z, 1);
         yes = sounds.load(mycontext, R.raw.tada1, 1);
         
         
  	    
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
    
//////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////
    
    private void createSprites() {
 
   
 	  bg = BitmapFactory.decodeResource(getResources(), R.drawable.q);
 	  bg = Bitmap.createScaledBitmap(bg, screenW, screenH, true);
 	  
 	  bg2 = BitmapFactory.decodeResource(getResources(), R.drawable.cute);
 	  bg2 = Bitmap.createScaledBitmap(bg2, screenW, screenH, true);
 	  
 	  estrellaBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.starswhite);
 	  
 	  
 	  estrellaObject = createEstrella(R.drawable.starswhite);
 	  estrellaObject.setX(screenW / 40); //
 	  estrellaObject.setY((screenH - estrellaObject.getWidth()) / 2);
 	  
 	  estrellaObject2 = createEstrellaMediana(R.drawable.starswhite);
 	  estrellaObject2.setX((screenW - estrellaObject2.getWidth())- (screenW / 12));
 	  estrellaObject2.setY(screenH / 2);
 	 
 	  
 	  estrellaObject3 = createEstrella(R.drawable.starswhite);
 	  estrellaObject3.setX((screenW - estrellaObject3.getWidth()) / 2);
 	  estrellaObject3.setY(screenH - (screenH / 6));
 	  
 	  estrellaObject4 = createEstrellaChica(R.drawable.starswhite);
 	  estrellaObject4.setX((screenW - estrellaObject4.getWidth()));
 	  estrellaObject4.setY(screenH / 10);
 	  
 	  estrellaObject5 = createEstrellaMediana(R.drawable.starswhite);
 	  estrellaObject5.setX(screenW / 3);
 	  estrellaObject5.setY(screenH / 3);
 	  
 	  estrellaObject6 = createEstrellaChica(R.drawable.starswhite);
 	  estrellaObject6.setX(screenW / 6);
 	  estrellaObject6.setY(screenH - (screenH / 4));
/////////////////////////////////////////////////////////////////////////////
 	  
 	 octopulpo = createPulpo(R.drawable.pulpo);
 	  
/////////////////////////////////////////////////////////////////////////////
 	  
 	  cangrejo = createCangrejo(R.drawable.cangrejo1);
 	  cangrejo.setX(screenW / 7);
 	  cangrejo.setY(screenH - cangrejo.getHeight() - (int)(cangrejo.getHeight() * .6));
 	  
 	  //pescadoVerde = createPescado(R.drawable.pescaditosv);
 	  
 	 
 	  
 	  
 	 // new Burbujas(this, bmp);
 	  //flechita = createFlecha(R.drawable.level2);
 	  
 	  instruccionesBitmap = createInstrucciones(R.drawable.anuncio2);
 	  instruccionesBitmap.setX(0);
 	  instruccionesBitmap.setY(0);
 	  
 	  instruccionesBitmapOso = createInstrucciones2(R.drawable.instruccion4);
	  instruccionesBitmapOso.setX(0);
	  instruccionesBitmapOso.setY(0);
 	    	  
 	  carita = createFigura(R.drawable.osito3);
 	  
 	//  ra1 = createRompe(R.drawable.acolor);
 	 
   
 	  uno = randonBurbuja();
 	  
 	  dos = randonBurbuja();
 	 
 	  tres = randonBurbuja();
 	  
 	  cuatro = randonBurbuja();
 	 
 	  cinco = randonBurbuja();
 	  
 	  
       rompeUno = randonRompe();
 	  
 	  rompeDos = randonRompe();
 	 
 	  rompeTres = randonRompe();
 	  
 	  rompeCuatro = randonRompe();
 	 
 	  rompeCinco = randonRompe();
 	  
 	  
 	  
 	  
		   sonidos.add(uno);
		   sonidos.add(dos);
		   sonidos.add(tres);
		   sonidos.add(cuatro);
		   sonidos.add(cinco);
		   
		
 	  

  }

    
/////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////
    public boolean onTouchEvent(MotionEvent event) 
    {    
 	   int X = (int)event.getX() - (screenW/6) / 2;
        int Y = (int)event.getY() - (screenW/6) / 2;

 	   
 	   if (event.getAction() == android.view.MotionEvent.ACTION_DOWN) 
          {
 		  
 		  // start = true;
 		   touchx = (int)event.getX();
	   	       touchy = (int)event.getY();
 		    
 		 //  sprite.move((int)event.getX(), (int)event.getY());  
 		   
          }
          
 	   
 	   else if (event.getAction() == android.view.MotionEvent.ACTION_UP) 
 	   {     
 		   if(!start){
 		   for (int i = rompecabezas.size()-1; i >= 0; i--) { 
		    		  
				   Rompe rompeva = rompecabezas.get(i); 
				   
					   rompeva.tocar = false;
					 
 		   }
 		   sonidoLetra = true;
 		   }   
 		   touchx = -400;
	   	       touchy = -400;
 		}  
 	   
 	   else if (event.getAction() == android.view.MotionEvent.ACTION_MOVE) 
        {    
     		if(!start){
     	//	{
     			//ra1.x = X;
     			//ra1.y = Y;
     			
     			for (int i = rompecabezas.size()-1; i >= 0; i--) { 
		    		  
  				   Rompe rompeva = rompecabezas.get(i); 
  				   
  				   if(!start && rompeva.tocar)
  				   {
  					   rompeva.setX(X);
  					   rompeva.setY(Y);
  				   }
  			   
  		
 		    }
     		} // start = false;
     	}  	       	     	   
 	   return true;
    } 
 	   
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
    private Burbujas createBurbuja(int resouce) {
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), resouce);
        bmp = Bitmap.createScaledBitmap(bmp, (int)(screenH/5 * .9), (int)(screenH/5 * .9), true);
        
        return new Burbujas(this, bmp);
  } 
    
    private Burbujas createBurbujaGrande(int resouce) {
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), resouce);
        bmp = Bitmap.createScaledBitmap(bmp, (int)(screenH/5 * 1.4), (int)(screenH/5 * 1.4), true);
        
        return new Burbujas(this, bmp);
  } 
    
    private Burbujas createBurbujaChica(int resouce) {
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), resouce);
        bmp = Bitmap.createScaledBitmap(bmp, (int)(screenH/5 * 1.2), (int)(screenH/5 * 1.2), true);
        
        return new Burbujas(this, bmp);
  } 
    
    private Flecha createFlecha(int resouce) {
 	   Bitmap bmp = BitmapFactory.decodeResource(getResources(), resouce);
        bmp = Bitmap.createScaledBitmap(bmp, (int)(screenW/6), (int)((screenW/6) / 2.71), true);
 	  
        return new Flecha(this, bmp);
  } 
    
    private Figura createFigura(int resouce) {
 	   Bitmap bmp = BitmapFactory.decodeResource(getResources(), resouce);
        bmp = Bitmap.createScaledBitmap(bmp, screenW/4, screenW/4, true);
 	  
        return new Figura(this, bmp);
  } 
    
    private Rompe createRompe(int resouce) {
 	   Bitmap bmp = BitmapFactory.decodeResource(getResources(), resouce);
        bmp = Bitmap.createScaledBitmap(bmp, screenW/6, screenW/6, true);
 	  
        return new Rompe(this, bmp);
        
  } 
    
    private Estrella createEstrella(int resouce) {
 	   Bitmap bmp = BitmapFactory.decodeResource(getResources(), resouce);
        bmp = Bitmap.createScaledBitmap(bmp, screenW/4, (int)(screenW/4 / 1.5), true);
 	  
        return new Estrella(this, bmp);
        
  } 
    
    private Estrella createEstrellaMediana(int resouce) {
 	   Bitmap bmp = BitmapFactory.decodeResource(getResources(), resouce);
        bmp = Bitmap.createScaledBitmap(bmp, screenW/6, (int)(screenW/6 / 1.5), true);
 	  
        return new Estrella(this, bmp);
        
  } 
    
    private Estrella createEstrellaChica(int resouce) {
 	   Bitmap bmp = BitmapFactory.decodeResource(getResources(), resouce);
        bmp = Bitmap.createScaledBitmap(bmp, screenW/8, (int)(screenW/8 / 1.5), true);
 	  
        return new Estrella(this, bmp);
        
  } 
    
    private Animacion createCangrejo(int resouce) {
 	   Bitmap bmp = BitmapFactory.decodeResource(getResources(), resouce);
        bmp = Bitmap.createScaledBitmap(bmp, screenW / 2, (int)(((screenW/3) / 2) * .6), true);
 	  
        return new Animacion(this, bmp);
        
  } 
    
    private Pescado createPescado(int resouce) {
 	   Bitmap bmp = BitmapFactory.decodeResource(getResources(), resouce);
        bmp = Bitmap.createScaledBitmap(bmp, screenW /3, (int)((screenW/3) / 1.3), true);
 	  
        return new Pescado(this, bmp);
        
  } 
    
    private Pescado createPescadoChico(int resouce) {
  	   Bitmap bmp = BitmapFactory.decodeResource(getResources(), resouce);
         bmp = Bitmap.createScaledBitmap(bmp, screenW /6, (int)((screenW/6) / 1.3), true);
  	  
         return new Pescado(this, bmp);
         
   } 
    
    private Flecha createInstrucciones(int resouce) {
  	   Bitmap bmp = BitmapFactory.decodeResource(getResources(), resouce);
         bmp = Bitmap.createScaledBitmap(bmp, (int)(screenW/3), (int)((screenW/3) / 2), true);
  	  
         return new Flecha(this, bmp);
   } 
    
    private Flecha createInstrucciones2(int resouce) {
   	   Bitmap bmp = BitmapFactory.decodeResource(getResources(), resouce);
          bmp = Bitmap.createScaledBitmap(bmp, (int)(screenW/1.7), (int)((screenW/1.7) / 2), true);
   	  
          return new Flecha(this, bmp);
    } 
    
    private Pulpo createPulpo(int resouce) {
  	   Bitmap bmp = BitmapFactory.decodeResource(getResources(), resouce);
         bmp = Bitmap.createScaledBitmap(bmp, (int)(screenW /1.5), (int)((screenW/1.5) / 7), true);
  	  
         return new Pulpo(this, bmp);
         
   } 
    
///////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////
    
public int randonRompe(){
      	
     	 Random rnd = new Random();
     	 
     	
     	 int x = rnd.nextInt(26) + 1;
     	 
     	 if (!(rompeUno == 0)){
     		 while(x == rompeUno){
     		 x = rnd.nextInt(26) + 1;
     		 }
     	 }
     	 
     	 if (!(rompeDos == 0)){
    		 while(x == rompeDos){
    		 x = rnd.nextInt(26) + 1;
    		 }
    	 }
     	 if (!(rompeTres == 0)){
   		 while(x == rompeTres){
   		 x = rnd.nextInt(26) + 1;
   		 }
   	 }
     	 if (!(rompeCuatro == 0)){
     		 while(x == rompeCuatro){
  			 x = rnd.nextInt(26) + 1;
  		 	}
     	 }
     	 
     	if (!(rompeCinco == 0)){
     		 while(x == rompeCinco){
     		 x = rnd.nextInt(26) + 1;
     		 }
     	 }
          Rompe tempRompe1;
          Rompe tempRompe2;
          
          switch (x) {
              case 1:  
             	 	tempRompe1 = createRompe(R.drawable.acolor);
             	 	tempRompe1.setValue(1);
           	   		rompecabezas.add(tempRompe1);
           	   		
           	   		tempRompe2 = createRompe(R.drawable.agris);
           	   		tempRompe2.setValue(1);
           	   	    rompecabezasGris.add(tempRompe2);
                       break;
              case 2:  
             	 tempRompe1 = createRompe(R.drawable.bcolor);
          	 	tempRompe1.setValue(2);
        	   		rompecabezas.add(tempRompe1);
        	   		
        	   		tempRompe2 = createRompe(R.drawable.bgris);
        	   		tempRompe2.setValue(2);
        	   	    rompecabezasGris.add(tempRompe2);
                       break;
              case 3:  
             	 tempRompe1 = createRompe(R.drawable.ccolor);
          	 	tempRompe1.setValue(3);
        	   		rompecabezas.add(tempRompe1);
        	   		
        	   		tempRompe2 = createRompe(R.drawable.cgris);
        	   		tempRompe2.setValue(3);
        	   	    rompecabezasGris.add(tempRompe2);
                       break;
              case 4:  
             	 tempRompe1 = createRompe(R.drawable.dcolor);
          	 	tempRompe1.setValue(4);
        	   		rompecabezas.add(tempRompe1);
        	   		
        	   		tempRompe2 = createRompe(R.drawable.dgris);
        	   		tempRompe2.setValue(4);
        	   	    rompecabezasGris.add(tempRompe2);
                       break;
              case 5:  
             	 tempRompe1 = createRompe(R.drawable.ecolor);
          	 	tempRompe1.setValue(5);
        	   		rompecabezas.add(tempRompe1);
        	   		
        	   		tempRompe2 = createRompe(R.drawable.egris);
        	   		tempRompe2.setValue(5);
        	   	    rompecabezasGris.add(tempRompe2);
                       break;
              case 6:  
             	 tempRompe1 = createRompe(R.drawable.fcolor);
          	 	tempRompe1.setValue(6);
        	   		rompecabezas.add(tempRompe1);
        	   		
        	   		tempRompe2 = createRompe(R.drawable.fgris);
        	   		tempRompe2.setValue(6);
        	   	    rompecabezasGris.add(tempRompe2);
                       break;
              case 7:  
             	 tempRompe1 = createRompe(R.drawable.gcolor);
          	 	tempRompe1.setValue(7);
        	   		rompecabezas.add(tempRompe1);
        	   		
        	   		tempRompe2 = createRompe(R.drawable.ggris);
        	   		tempRompe2.setValue(7);
        	   	    rompecabezasGris.add(tempRompe2);
                       break;
              case 8:  
             	 tempRompe1 = createRompe(R.drawable.hcolor);
          	 	tempRompe1.setValue(8);
        	   		rompecabezas.add(tempRompe1);
        	   		
        	   		tempRompe2 = createRompe(R.drawable.hgris);
        	   		tempRompe2.setValue(8);
        	   	    rompecabezasGris.add(tempRompe2);
                       break;
              case 9:  
             	 tempRompe1 = createRompe(R.drawable.icolor);
          	 	tempRompe1.setValue(9);
        	   		rompecabezas.add(tempRompe1);
        	   		
        	   		tempRompe2 = createRompe(R.drawable.igris);
        	   		tempRompe2.setValue(9);
        	   	    rompecabezasGris.add(tempRompe2);
                       break;
              case 10: 
             	 tempRompe1 = createRompe(R.drawable.jcolor);
           	 	tempRompe1.setValue(10);
         	   		rompecabezas.add(tempRompe1);
         	   		
         	   		tempRompe2 = createRompe(R.drawable.jgris);
         	   		tempRompe2.setValue(10);
         	   	    rompecabezasGris.add(tempRompe2);
                       break;
              case 11: 
             	 tempRompe1 = createRompe(R.drawable.kcolor);
          	 	tempRompe1.setValue(11);
        	   		rompecabezas.add(tempRompe1);
        	   		
        	   		tempRompe2 = createRompe(R.drawable.kgris);
        	   		tempRompe2.setValue(11);
        	   	    rompecabezasGris.add(tempRompe2);
                       break;
              case 12: 
             	 tempRompe1 = createRompe(R.drawable.lcolor);
          	 	tempRompe1.setValue(12);
        	   		rompecabezas.add(tempRompe1);
        	   		
        	   		tempRompe2 = createRompe(R.drawable.lgris);
        	   		tempRompe2.setValue(12);
        	   	    rompecabezasGris.add(tempRompe2);
                       break;
              case 13: 
             	 tempRompe1 = createRompe(R.drawable.mcolor);
          	 	tempRompe1.setValue(13);
        	   		rompecabezas.add(tempRompe1);
        	   		
        	   		tempRompe2 = createRompe(R.drawable.mgris);
        	   		tempRompe2.setValue(13);
        	   	    rompecabezasGris.add(tempRompe2);
              		    break;
              case 14: 
             	 tempRompe1 = createRompe(R.drawable.ncolor);
          	 	tempRompe1.setValue(14);
        	   		rompecabezas.add(tempRompe1);
        	   		
        	   		tempRompe2 = createRompe(R.drawable.ngris);
        	   		tempRompe2.setValue(14);
        	   	    rompecabezasGris.add(tempRompe2);
   					break;
              case 15: 
             	 tempRompe1 = createRompe(R.drawable.ocolor);
          	 	tempRompe1.setValue(15);
        	   		rompecabezas.add(tempRompe1);
        	   		
        	   		tempRompe2 = createRompe(R.drawable.ogris);
        	   		tempRompe2.setValue(15);
        	   	    rompecabezasGris.add(tempRompe2);
 				        break;
              case 16: 
             	 tempRompe1 = createRompe(R.drawable.pcolor);
          	 	tempRompe1.setValue(16);
        	   		rompecabezas.add(tempRompe1);
        	   		
        	   		tempRompe2 = createRompe(R.drawable.pgris);
        	   		tempRompe2.setValue(16);
        	   	    rompecabezasGris.add(tempRompe2);
 		                break;
              case 17: 
             	 tempRompe1 = createRompe(R.drawable.qcolor);
          	 	tempRompe1.setValue(17);
        	   		rompecabezas.add(tempRompe1);
        	   		
        	   		tempRompe2 = createRompe(R.drawable.qgris);
        	   		tempRompe2.setValue(17);
        	   	    rompecabezasGris.add(tempRompe2);
                       break;
              case 18: 
             	 tempRompe1 = createRompe(R.drawable.rcolor);
          	 	tempRompe1.setValue(18);
        	   		rompecabezas.add(tempRompe1);
        	   		
        	   		tempRompe2 = createRompe(R.drawable.rgris);
        	   		tempRompe2.setValue(18);
        	   	    rompecabezasGris.add(tempRompe2);
              		    break;
              case 19: 
             	 tempRompe1 = createRompe(R.drawable.scolor);
          	 	tempRompe1.setValue(19);
        	   		rompecabezas.add(tempRompe1);
        	   		
        	   		tempRompe2 = createRompe(R.drawable.sgray);
        	   		tempRompe2.setValue(19);
        	   	    rompecabezasGris.add(tempRompe2);
     		            break;
              case 20: 
             	 tempRompe1 = createRompe(R.drawable.tcolor);
          	 	tempRompe1.setValue(20);
        	   		rompecabezas.add(tempRompe1);
        	   		
        	   		tempRompe2 = createRompe(R.drawable.tgris);
        	   		tempRompe2.setValue(20);
        	   	    rompecabezasGris.add(tempRompe2);
                       break;
              case 21: 
             	 tempRompe1 = createRompe(R.drawable.ucolor);
          	 	tempRompe1.setValue(21);
        	   		rompecabezas.add(tempRompe1);
        	   		
        	   		tempRompe2 = createRompe(R.drawable.ugris);
        	   		tempRompe2.setValue(21);
        	   	    rompecabezasGris.add(tempRompe2);
                       break;
              case 22: 
             	 tempRompe1 = createRompe(R.drawable.vcolor);
          	 	tempRompe1.setValue(22);
        	   		rompecabezas.add(tempRompe1);
        	   		
        	   		tempRompe2 = createRompe(R.drawable.vgris);
        	   		tempRompe2.setValue(22);
        	   	    rompecabezasGris.add(tempRompe2);
              		    break;
              case 23: 
             	 tempRompe1 = createRompe(R.drawable.wcolor);
          	 	tempRompe1.setValue(23);
        	   		rompecabezas.add(tempRompe1);
        	   		
        	   		tempRompe2 = createRompe(R.drawable.wgris);
        	   		tempRompe2.setValue(23);
        	   	    rompecabezasGris.add(tempRompe2);
              		    break;
              case 24: 
             	 tempRompe1 = createRompe(R.drawable.xcolor);
          	 	tempRompe1.setValue(24);
        	   		rompecabezas.add(tempRompe1);
        	   		
        	   		tempRompe2 = createRompe(R.drawable.xgris);
        	   		tempRompe2.setValue(24);
        	   	    rompecabezasGris.add(tempRompe2);
     		  		    break;
              case 25: 
             	 tempRompe1 = createRompe(R.drawable.ycolor);
          	 	tempRompe1.setValue(25);
        	   		rompecabezas.add(tempRompe1);
        	   		
        	   		tempRompe2 = createRompe(R.drawable.ygris);
        	   		tempRompe2.setValue(25);
        	   	    rompecabezasGris.add(tempRompe2);
              		    break;
              case 26: 
             	 tempRompe1 = createRompe(R.drawable.zcolor);
          	 	tempRompe1.setValue(26);
        	   		rompecabezas.add(tempRompe1);
        	   		
        	   		tempRompe2 = createRompe(R.drawable.zgris);
        	   		tempRompe2.setValue(26);
        	   	    rompecabezasGris.add(tempRompe2);
		  		      break;
              default:  
              		  break;
          } 
          Collections.shuffle(rompecabezas, new Random());
          return x;
     }

      
    
    
    
    
///////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////
    public int randonBurbuja(){
       	
   	 Random rnd = new Random();
   	 
   	
   	 int x = rnd.nextInt(26) + 1;
   	 
   	 if (!(uno == 0)){
   		 while(x == uno){
   		 x = rnd.nextInt(26) + 1;
   		 }
   	 }
   	 
   	 if (!(dos == 0)){
  		 while(x == dos){
  		 x = rnd.nextInt(26) + 1;
  		 }
  	 }
   	 if (!(tres == 0)){
 		 while(x == tres){
 		 x = rnd.nextInt(26) + 1;
 		 }
 	 }
   	 if (!(cuatro == 0)){
   		 while(x == cuatro){
			 x = rnd.nextInt(26) + 1;
		 	}
   	 }
   	 
   	if (!(cinco == 0)){
   		 while(x == cinco){
   		 x = rnd.nextInt(26) + 1;
   		 }
   	 }
        
        switch (x) {
            case 1:  
         	   		burbujitas.add(createBurbujaGrande(R.drawable.burbujaa));
                     break;
            case 2:  
         	   		burbujitas.add(createBurbuja(R.drawable.burbujab));
                     break;
            case 3:  
         	   		burbujitas.add(createBurbujaChica(R.drawable.burbujac));
                     break;
            case 4:  
         	   		burbujitas.add(createBurbujaGrande(R.drawable.burbujad));
                     break;
            case 5:  
         	   		burbujitas.add(createBurbuja(R.drawable.burbujae));
                     break;
            case 6:  
         	   		burbujitas.add(createBurbujaChica(R.drawable.burbujaf));
                     break;
            case 7:  
         	   		burbujitas.add(createBurbujaGrande(R.drawable.burbujag));
                     break;
            case 8:  
         	   		burbujitas.add(createBurbuja(R.drawable.burbujah));
                     break;
            case 9:  
         	   		burbujitas.add(createBurbujaChica(R.drawable.burbujai));
                     break;
            case 10: 
         	   		burbujitas.add(createBurbujaGrande(R.drawable.burbujaj));
                     break;
            case 11: 
         	   		burbujitas.add(createBurbuja(R.drawable.burbujak));
                     break;
            case 12: 
         	   		burbujitas.add(createBurbujaChica(R.drawable.burbujal));
                     break;
            case 13: 
         	   		burbujitas.add(createBurbujaGrande(R.drawable.burbujam));
            		    break;
            case 14: 
         	   		burbujitas.add(createBurbuja(R.drawable.burbujan));
 					break;
            case 15: 
         	   		burbujitas.add(createBurbujaChica(R.drawable.burbujao));
				        break;
            case 16: 
         	   		burbujitas.add(createBurbujaGrande(R.drawable.burbujap));
		                break;
            case 17: 
         	   		burbujitas.add(createBurbuja(R.drawable.burbujaq));
                     break;
            case 18: 
         	   		burbujitas.add(createBurbujaChica(R.drawable.burbujar));
            		    break;
            case 19: 
         	   		burbujitas.add(createBurbujaGrande(R.drawable.burbujas));
   		            break;
            case 20: 
         	   		burbujitas.add(createBurbuja(R.drawable.burbujat));
                     break;
            case 21: 
         	   		burbujitas.add(createBurbujaChica(R.drawable.burbujau));
                     break;
            case 22: 
         	   		burbujitas.add(createBurbujaGrande(R.drawable.burbujav));
            		    break;
            case 23: 
         	   		burbujitas.add(createBurbuja(R.drawable.burbujaw));
            		    break;
            case 24: 
         	   		burbujitas.add(createBurbujaChica(R.drawable.burbujax));
   		  		    break;
            case 25: 
         	   		burbujitas.add(createBurbujaGrande(R.drawable.burbujay));
            		    break;
            case 26: 
         	   		burbujitas.add(createBurbuja(R.drawable.burbujaz));
		  		      break;
            default:  
            		  break;
        } 
        
        return x;
   }

    
    
    
    
    public int randonBurbujaMinuscula(){
       	
       	
     	 Random rnd = new Random();
     	 int x = rnd.nextInt(26) + 1;
     	 
     	 
     	 if (!(uno == 0)){
       		 while(x == uno){
       		 x = rnd.nextInt(26) + 1;
       		 }
       	 }
       	 
     	 if (!(dos == 0)){
      		 while(x == dos){
      		 x = rnd.nextInt(26) + 1;
      		 }
      	 }
       	 if (!(tres == 0)){
     		 while(x == tres){
     		 x = rnd.nextInt(26) + 1;
     		 }
     	 }
       	 if (!(cuatro == 0)){
       		 while(x == cuatro){
       		 x = rnd.nextInt(26) + 1;
    		 	}
       	
       	 }
       	 
       	if (!(cinco == 0)){
    		 while(x == cinco){
    		 x = rnd.nextInt(26) + 1;
    		 }
    	 }
       	 
     	 
          
          switch (x) {
              case 1:  
           	   		burbujitas.add(createBurbujaGrande(R.drawable.burbujaam));
                       break;
              case 2:  
           	   		burbujitas.add(createBurbuja(R.drawable.burbujabm));
                       break;
              case 3:  
           	   		burbujitas.add(createBurbujaChica(R.drawable.burbujacm));
                       break;
              case 4:  
           	   		burbujitas.add(createBurbujaGrande(R.drawable.burbujadm));
                       break;
              case 5:  
           	   		burbujitas.add(createBurbuja(R.drawable.burbujaem));
                       break;
              case 6:  
           	   		burbujitas.add(createBurbujaChica(R.drawable.burbujafm));
                       break;
              case 7:  
           	   		burbujitas.add(createBurbujaGrande(R.drawable.burbujagm));
                       break;
              case 8:  
           	   		burbujitas.add(createBurbuja(R.drawable.burbujahm));
                       break;
              case 9:  
           	   		burbujitas.add(createBurbujaChica(R.drawable.burbujaim));
                       break;
              case 10: 
           	   		burbujitas.add(createBurbujaGrande(R.drawable.burbujajm));
                       break;
              case 11: 
           	   		burbujitas.add(createBurbuja(R.drawable.burbujakm));
                       break;
              case 12: 
           	   		burbujitas.add(createBurbujaChica(R.drawable.burbujalm));
                       break;
              case 13: 
           	   		burbujitas.add(createBurbujaGrande(R.drawable.burbujamm));
              		    break;
              case 14: 
           	   		burbujitas.add(createBurbuja(R.drawable.burbujanm));
   					break;
              case 15: 
           	   		burbujitas.add(createBurbujaChica(R.drawable.burbujaom));
 				        break;
              case 16: 
           	   		burbujitas.add(createBurbujaGrande(R.drawable.burbujapm));
 		                break;
              case 17: 
           	   		burbujitas.add(createBurbuja(R.drawable.burbujaqm));
                       break;
              case 18: 
           	   		burbujitas.add(createBurbujaChica(R.drawable.burbujarm));
              		    break;
              case 19: 
           	   		burbujitas.add(createBurbujaGrande(R.drawable.burbujasm));
     		            break;
              case 20: 
           	   		burbujitas.add(createBurbuja(R.drawable.burbujatm));
                       break;
              case 21: 
           	   		burbujitas.add(createBurbujaChica(R.drawable.burbujaum));
                       break;
              case 22: 
           	   		burbujitas.add(createBurbujaGrande(R.drawable.burbujavm));
              		    break;
              case 23: 
           	   		burbujitas.add(createBurbuja(R.drawable.burbujawm));
              		    break;
              case 24: 
           	   		burbujitas.add(createBurbujaChica(R.drawable.burbujaxm));
     		  		    break;
              case 25: 
           	   		burbujitas.add(createBurbujaGrande(R.drawable.burbujaym));
              		    break;
              case 26: 
           	   		burbujitas.add(createBurbuja(R.drawable.burbujazm));
		  		      break;
              default:  
              		  break;
          } 
          
          return x;
     }
//////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////
  public void collision(){
  if(start){
 	 
 	      /*if (flechita.isCollition(touchx, touchy))
 	      {
 	    	  start = false;
 	    	  
 	    	  if(sonidoDelBoton){
 	    	  sounds.play(botonSound, volume, volume, 1, 0,1);
 	    	  sonidoDelBoton = false;
 	    	  
 	    	 
 	    	  
 	    	  }
 	      }*/
 	 
	    	  for (int i = burbujitas.size()-1; i >= 0; i--) { 
	    		  
				   Burbujas pelota = burbujitas.get(i); 
				   ////////////////////////////////////////////////////
				   
				   /*for (int i2 = burbujitas.size()-2; i2 >= 0; i2--) { 
					   
					   Burbujas pelota2 = burbujitas.get(i); 
					   
					   if (pelota2.isCollition(pelota.getX(), pelota.getY()))
					   {
						   pelota2.xSpeed = -pelota2.xSpeed;
						   
					   }
				   }*/
				     
				  ///////////////////////////////////////////////////// 
				   if (pelota.isCollition(touchx, touchy)) {
					   
					  
					   
					   instruccionesBoolean = false;
					   
					   Random rnd = new Random();
					   
			           int x = rnd.nextInt(6);
					   
					   
					   
					   switch (x) {
					   
			           case 0:  pescadoVerdeBoolean = true;
			                    break;
			           case 1:  
			           			
			                    break;
			           case 2:  pescadoRojoBoolean = true;
			                    break;
			           case 3:  if(pescaditos.size() <= 49)
			           			{escogePescadoChico = true;}
			           			//You have 50 fishes, Keep going or go to level 2
			                    break;
			           case 4:  pescadoAzulBoolean = true;
			                    break;
			           case 5:  
			           			
	                    		break;
			           
			           default: break;
					   }
					   
					   if(escogePescadoChico)
					   {
						   int x1 = rnd.nextInt(10);
						   
						   switch (x1) {
						   
				           case 0:  pescaditos.add(createPescadoChico(R.drawable.pescaditosv));
				           			sounds.play(pescadorian, volume, volume, 1, 0,1);
				                    break;
				                    
				           case 1:  
		                    		break;
		                    
				           case 2:  pescaditos.add(createPescadoChico(R.drawable.pescaditosa));
				           			sounds.play(pescadorian, volume, volume, 1, 0,1);
				                    break;
				                    
				           case 3:  
		                    		break;
		                    		
				           case 4:  pescaditos.add(createPescadoChico(R.drawable.pescaditosr));
				           			sounds.play(pescadorian, volume, volume, 1, 0,1);
				                    break;
				                    
				           case 5:  
				        	   break;
				           
				           default: break;
						   }
						    
		           			pintarPescadoChico = true;
		           			escogePescadoChico = false;
					   }
					   
					   if(pescadoVerdeBoolean && !pintarPescadoVerdeBoolean)
					   {
						   pescadoVerde = createPescado(R.drawable.pescaditosv);
						   pescadoVerde.setX(pelota.x);
						   pescadoVerde.setY(pelota.y);
						   pintarPescadoVerdeBoolean = true;
						   pescadoVerdeBoolean = false;
					   }
					   else if(pescadoVerdeBoolean)
					   { 
						   pescadoVerdeBoolean = false;
					   }
					   
/////////////////////////////////////////////////////////////////////////////////
					   
					   if(pescadoAzulBoolean && !pintarPescadoAzulBoolean)
					   {
						   pescadoAzul = createPescado(R.drawable.pescaditosa);
						   pescadoAzul.setX(pelota.x);
						   pescadoAzul.setY(pelota.y);
						   pintarPescadoAzulBoolean = true;
						   pescadoAzulBoolean = false;
						   
					   }
					   
					   else if(pescadoAzulBoolean)
					   { 
						   pescadoAzulBoolean = false;
					   }
/////////////////////////////////////////////////////////////////////////////////
					   
					   if(pescadoRojoBoolean && !pintarPescadoRojoBoolean)
					   {
						   pescadoRojo = createPescado(R.drawable.pescaditosr);
						   pescadoRojo.setX(pelota.x);
						   pescadoRojo.setY(pelota.y);
						   pintarPescadoRojoBoolean = true;
						   pescadoRojoBoolean = false;
						   
					   }
					   
					   else if(pescadoRojoBoolean)
					   { 
						   pescadoRojoBoolean = false;
					   }
//////////////////////////////////////////////////////////////////////////////////
					   
					   burbujitas.remove(pelota);
					   pelota = null;
					   //vibrar();
					  
					   tocar(i);
					
					   // inicio del segundo nivel/////////////////////////////
	                   while(burbujitas.size() == 0){
	                  		
	                	   pintarPescadoVerdeBoolean = false;
	                	   pintarPescadoRojoBoolean = false;
	                	   pintarPescadoAzulBoolean = false;
	                	   
	                	   if(mayuscula){
	                		   uno = randonBurbujaMinuscula();
	                		   
	                		   dos = randonBurbujaMinuscula();
	                		   
	                		   tres = randonBurbujaMinuscula();
	                		  
	                		   cuatro = randonBurbujaMinuscula();
	                		  
	                		   cinco = randonBurbujaMinuscula();
	                		  
	                		   mayuscula = false;
	                	   }
	                	   else{
	                		      uno = randonBurbuja();
	                		      
	                	    	  dos = randonBurbuja();
	                	    	 
	                	    	  tres = randonBurbuja();
	                	    	 
	                	    	  cuatro = randonBurbuja();
	                	    	  
	                	    	  cinco = randonBurbuja();
	                	    	  
		                 	   mayuscula = true;
	                	   }
	                  	  
	              		   	sonidos.add(uno);
	              		   	sonidos.add(dos);
	              		   	sonidos.add(tres);
	              		   	sonidos.add(cuatro);
	              		   	sonidos.add(cinco);
	              		   	
	                 		segundaTanda = true;
	                 		
	                 		try {
								gameLoopThread.sleep(500);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								//e.printStackTrace();
							}
	                   }
	                   
	                   
	                
				   }
	    	  }
       }
  
  else if(!start){
	  
	  pescaditos.clear();
	  burbujitas.clear();
 	 
 	 if (star)
 	 {
 		 if(carita.isCollition(touchx, touchy))
 		 {
 			
 			 
 			 rompecabezas.clear();
 			 
 	 		 rompecabezasGris.clear();
 	 		 
 	 		 rompeUno = randonRompe();
 	    	  
 	    	 rompeDos = randonRompe();
 	    	 
 	    	 rompeTres = randonRompe();
 	    	  
 	    	 rompeCuatro = randonRompe();
 	    	 
 	    	 rompeCinco = randonRompe();
 	    	  	
 	    	 iniciaRompecabezas = true;
 	    	 
 	    	 star = false;
 	    	 
 	    	 starSoporte = true;
 	    	 
 	    	 toggle = false;
 	    	 
 	    	 
 	    	 
 	    	 
 		 }
 	 }
 	 
 	 if(rompecabezas.get(0).getInPlace() == true && rompecabezas.get(1).getInPlace() == true && rompecabezas.get(2).getInPlace() == true && rompecabezas.get(3).getInPlace() == true && rompecabezas.get(4).getInPlace() == true && starSoporte)
 	 {
 		 termineRompecabezas();
 		 starSoporte = false;
 		 
 		 
 	 }
 	 
 	 for (int i = rompecabezas.size()-1; i >= 0; i--) { 
	    		  
			   Rompe rompeva = rompecabezas.get(i); 
			   
			   
			  
			   
			   if (rompeva.isCollition(touchx, touchy))
		    	 {
		    		 rompeva.tocar = true;
		    		 iniciaRompecabezas = false;
		    		 toggle = true;
		    		 instruccionesBooleanOsito = false;
		    		 
		    		 if(sonidoLetra)
		    		 {
		    			 tocarDos(rompeva.getValue());
		    			 sonidoLetra = false;
		    		 }
		    		 
		    		
			   // tengo que corregir este codigo a algo asi:
			   //for (int i = 0; i < list.size(); i++) {
			   //for (int j = i+1; j < list.size(); j++) {
				    // compare list.get(i) and list.get(j)
			   //  }
			   //}
		    	 }	  
			    
			    
		    		 for (int j = 0; j < rompecabezasGris.size(); j++) 
		    		 {
		    			
		    			 
		    			 if(rompeva.isCollition( rompecabezasGris.get(j).x + (screenW/6) / 2, rompecabezasGris.get(j).y + (screenW/6) / 2) && rompeva.getValue() == rompecabezasGris.get(j).getValue() && toggle)
		    			 {
		    				 rompeva.x = rompecabezasGris.get(j).x;
		    				 rompeva.y = rompecabezasGris.get(j).y;
		    				 rompeva.setInPlace(true);
		    				 rompeva.tocar = false;
		    				 //Poner sonido aqui
		    				 //sounds.play(si, volume, volume, 1, 0,1);
		    				
		    				 
		    				 break;
		    				 
							   
		    			 }
		    			/* else if(rompeva.isCollition( rompecabezasGris.get(j).x + (screenW/6) / 2, rompecabezasGris.get(j).y + (screenW/6) / 2))
		    			 {
		    				 if(sonidono){
		    				 sounds.play(soundUU, volume, volume, 1, 0,1);
		    				 sonidono = false;
		    				 break;
		    				 }
		    			 }*/
		    			 
		    		 }
		    		 
		    		
			   

			   //
			   //comparando las figuras una con otra usando dos loops
			 
			   
			   	
		   }
 	 
 	 for (int i = 0; i < rompecabezas.size(); i++) {
 		  for (int j = i+1; j < rompecabezas.size(); j++) 
 		  {
 		    if (rompecabezas.get(i).x == rompecabezas.get(j).x && rompecabezas.get(i).y == rompecabezas.get(j).y)
 		    {
 		    	rompecabezas.get(i).tocar = false;
 		    }
 		  }
 		}


 	 
 	 
 	 
 	 
 	 
 	/* if (ra1.isCollition(touchx, touchy))
 	 {
 		 //vibrar();
 		 ra1.tocar = true;
   	 }*/
//////////////////////////////////////////////////////////////////////////////////
 	/* for (int i = 0; i < rompecabezas.size(); i++) {
 		 Rompe rompeva = rompecabezas.get(i); 
 		   for (int j = i+1; j < rompecabezasGris.size(); j++) {
 			     //compare list.get(i) and list.get(j)
 			      
 				   
 				   if (rompeva.isCollition(rompecabezasGris.get(j).x, rompecabezasGris.get(j).y))
 			    	 {
 					   sounds.play(soundA, volume, volume, 1, 0,1);
 			    		 //rompeva.tocar = true;
 			    		 //iniciaRompecabezas = false;
 			      	 }
 		     }
 		   }  */	 
////////////////////////////////////////////////////////////////////////////////// 	 
  }
  
  
}
  
  
  private void tocar(int i) {
		// TODO Auto-generated method stub
 	   int sound = 50;
		   
		   
		   switch (i) {
		   
        case 0:  sound = sonidos.get(0);
        			sonidos.remove(0);
                 break;
        case 1:  sound = sonidos.get(1);
					sonidos.remove(1); 
                 break;
        case 2:  sound = sonidos.get(2);
						sonidos.remove(2); 
                 break;
        case 3:  sound = sonidos.get(3);
						sonidos.remove(3); 
                 break;
        case 4:  sound = sonidos.get(4);
						sonidos.remove(4); 
                 break;
		   }
		   
		   switch (sound) {
        case 1:  
     	   		sounds.play(soundA, volume, volume, 1, 0,1);
                 break;
        case 2:  
     	   		sounds.play(soundB, volume, volume, 1, 0,1);
                 break;
        case 3:  
     	   		sounds.play(soundC, volume, volume, 1, 0,1);
                 break;
        case 4: 
     	   		sounds.play(soundD, volume, volume, 1, 0,1);
                 break;
        case 5:   
     	   		sounds.play(soundE, volume, volume, 1, 0,1);
                 break;
        case 6:  
     	   		sounds.play(soundF, volume, volume, 1, 0,1);
                 break;
        case 7:  
     	   		sounds.play(soundG, volume, volume, 1, 0,1);
                 break;
        case 8:  
     	   		sounds.play(soundH, volume, volume, 1, 0,1);
                 break;
        case 9:   
     	   		sounds.play(soundI, volume, volume, 1, 0,1);
                 break;
        case 10: 
     	   		sounds.play(soundJ, volume, volume, 1, 0,1);
                 break;
        case 11: 
     	   		sounds.play(soundK, volume, volume, 1, 0,1);
                 break;
        case 12:  
     	   		sounds.play(soundL, volume, volume, 1, 0,1);
                 break;
        case 13: 
     	   		sounds.play(soundM, volume, volume, 1, 0,1);
        		    break;
        case 14: 
     	   		sounds.play(soundN, volume, volume, 1, 0,1);
					break;
        case 15: 
     	   		sounds.play(soundO, volume, volume, 1, 0,1);
				        break;
        case 16: 
     	   		sounds.play(soundP, volume, volume, 1, 0,1);
		                break;
        case 17:  
     	   		sounds.play(soundQ, volume, volume, 1, 0,1);
                 break;
        case 18:  
     	   		sounds.play(soundR, volume, volume, 1, 0,1);
        		    break;
        case 19: 
     	   		sounds.play(soundS, volume, volume, 1, 0,1);
		            break;
        case 20:   
     	   		sounds.play(soundT, volume, volume, 1, 0,1);
                 break;
        case 21: 
     	   		sounds.play(soundU, volume, volume, 1, 0,1);
                 break;
        case 22: 
     	   		sounds.play(soundV, volume, volume, 1, 0,1);
        		    break;
        case 23: 
     	   		sounds.play(soundW, volume, volume, 1, 0,1);
        		    break;
        case 24: 
     	   		sounds.play(soundX, volume, volume, 1, 0,1);
		  		    break;
        case 25: 
     	   		sounds.play(soundY, volume, volume, 1, 0,1);
        		    break;
        case 26: 
     	   		sounds.play(soundZ, volume, volume, 1, 0,1);
	  		        break;
        default:  
        		    break;
		   
		   }
	}
  
  
  
  private void tocarDos(int i) {
		// TODO Auto-generated method stub
		   
		   switch (i) {
         case 1:  
      	   		sounds.play(soundA, volume, volume, 1, 0,1);
                  break;
         case 2:  
      	   		sounds.play(soundB, volume, volume, 1, 0,1);
                  break;
         case 3:  
      	   		sounds.play(soundC, volume, volume, 1, 0,1);
                  break;
         case 4: 
      	   		sounds.play(soundD, volume, volume, 1, 0,1);
                  break;
         case 5:   
      	   		sounds.play(soundE, volume, volume, 1, 0,1);
                  break;
         case 6:  
      	   		sounds.play(soundF, volume, volume, 1, 0,1);
                  break;
         case 7:  
      	   		sounds.play(soundG, volume, volume, 1, 0,1);
                  break;
         case 8:  
      	   		sounds.play(soundH, volume, volume, 1, 0,1);
                  break;
         case 9:   
      	   		sounds.play(soundI, volume, volume, 1, 0,1);
                  break;
         case 10: 
      	   		sounds.play(soundJ, volume, volume, 1, 0,1);
                  break;
         case 11: 
      	   		sounds.play(soundK, volume, volume, 1, 0,1);
                  break;
         case 12:  
      	   		sounds.play(soundL, volume, volume, 1, 0,1);
                  break;
         case 13: 
      	   		sounds.play(soundM, volume, volume, 1, 0,1);
         		    break;
         case 14: 
      	   		sounds.play(soundN, volume, volume, 1, 0,1);
					break;
         case 15: 
      	   		sounds.play(soundO, volume, volume, 1, 0,1);
				        break;
         case 16: 
      	   		sounds.play(soundP, volume, volume, 1, 0,1);
		                break;
         case 17:  
      	   		sounds.play(soundQ, volume, volume, 1, 0,1);
                  break;
         case 18:  
      	   		sounds.play(soundR, volume, volume, 1, 0,1);
         		    break;
         case 19: 
      	   		sounds.play(soundS, volume, volume, 1, 0,1);
		            break;
         case 20:   
      	   		sounds.play(soundT, volume, volume, 1, 0,1);
                  break;
         case 21: 
      	   		sounds.play(soundU, volume, volume, 1, 0,1);
                  break;
         case 22: 
      	   		sounds.play(soundV, volume, volume, 1, 0,1);
         		    break;
         case 23: 
      	   		sounds.play(soundW, volume, volume, 1, 0,1);
         		    break;
         case 24: 
      	   		sounds.play(soundX, volume, volume, 1, 0,1);
		  		    break;
         case 25: 
      	   		sounds.play(soundY, volume, volume, 1, 0,1);
         		    break;
         case 26: 
      	   		sounds.play(soundZ, volume, volume, 1, 0,1);
	  		        break;
         default:  
         		    break;
		   
		   }
	}
  

	private void termineRompecabezas() {
		// TODO Auto-generated method stub
 	 star = true;
 	// if(sound){
 	 sounds.play(yes, volume, volume, 1, 0,1);
 	// sound = false;
 	 //}
 	
 	//sounds.play(soundV, volume, volume, 1, 0,1);
		 
		
		
	}

	public void vibrar(){
  	
  	Context context = getContext(); 
  	Vibrator vb = (Vibrator)context.getSystemService(Context.VIBRATOR_SERVICE);             
  	vb.vibrate(100); 
  }

///////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////

    @Override
    protected void onDraw(Canvas canvas) {
 	   try{
 		   
 		   if(start)  
 		   { 
 			   canvas.drawColor(Color.BLACK);
 			   canvas.drawBitmap(bg, 0, 0 , null);
 			   cangrejo.onDraw(canvas);
 			   
 			   
 			   ////////////////////////////////////////////////
 			   
 			   octopulpo.onDraw(canvas);
 			   
 			   ////////////////////////////////////////////////
 			   
 			   if(pintarPescadoVerdeBoolean)
 			   {
 				   pescadoVerde.onDraw(canvas);
 			   }
 			   if(pintarPescadoAzulBoolean)
 			   {
 				   pescadoAzul.onDraw(canvas);
 			   }
 			   if(pintarPescadoRojoBoolean)
 			   {
 				   pescadoRojo.onDraw(canvas);
 			   }
 			   
 			   if(pintarPescadoChico)
 			   {
 				  for (Pescado pez : pescaditos) {
 		 	 			pez.onDraw(canvas);
 		 	 			
 		 	 		   }  
 			   }
 			   
 			   for (Burbujas burbuja : burbujitas) {
 	 			burbuja.onDraw(canvas);
 	 			
 	 		   }
 			   
 			  if(instruccionesBoolean)
			   {
				   instruccionesBitmap.onDraw(canvas);
			   }
 			   
 			  // flechita.onDraw(canvas);
 			   
 		   }
 		   
 		   else if(!start){
 			   canvas.drawColor(Color.WHITE);
 			   canvas.drawBitmap(bg2, 0, 0 , null);
 			   
 			   estrellaObject.onDraw(canvas);
 			   estrellaObject2.onDraw(canvas);
 			   estrellaObject3.onDraw(canvas);
 			   estrellaObject4.onDraw(canvas);
 			   estrellaObject5.onDraw(canvas);
 			   estrellaObject6.onDraw(canvas);
 			   
 			   
 			   
 			   int temp2 = 0;
 			   
 			   for (int i = rompecabezasGris.size()-1; i >= 0; i--) { 
 		    		  
 				   Rompe rompeva = rompecabezasGris.get(i);
 				   
 				   int ini = (screenW - (rompeva.getWidth() * 5)) / 2;
 				   
 				   if(iniciaRompecabezas)//&& rompeva.tocar == false
 				   {
 					   rompeva.x = ini + temp2;
 					   temp2 += rompeva.getWidth();
 					   rompeva.y = 0;
 				   }
 				   
 				   rompeva.onDraw(canvas);
 			   
 			   }
////////////////////////////////////////////////////////////////////////////////////
 			   
 			   int temp = 0;
 			   
 			   
 			   
 			   for (int i = rompecabezas.size()-1; i >= 0; i--) { 
 		    		  
 				   Rompe rompeva = rompecabezas.get(i);
 				   
 				   int ini = (screenW - (rompeva.getWidth() * 5)) / 2;
 				   
 				   if(iniciaRompecabezas && rompeva.tocar == false)
 				   {
 					   rompeva.x = ini + temp;
 					   temp += rompeva.getWidth();
 					   rompeva.y = screenH - rompeva.getHeight();
 				   }
 				   
 				   rompeva.onDraw(canvas);
 				   
 				 
 			   
 			   }
//Pintando el rompecabezas gris/////////////////////////////////////////////////////
 			  if(instruccionesBooleanOsito)
			   {
				   instruccionesBitmapOso.onDraw(canvas);
			   }
 			   
 			   
 			   if(star)
 			   {
 				   carita.onDraw(canvas);
 				   
 	     		   estrellaObject.onDraw(canvas);	     		   
 	     			  
 			   }
 			   
 		
 		   }
 		   collision();
 	   }
 	   catch (Exception e){
 		   
 	   }
    
    }

	
}


