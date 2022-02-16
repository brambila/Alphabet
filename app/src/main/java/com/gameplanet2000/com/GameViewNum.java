package com.gameplanet2000.com;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.SurfaceHolder;

 
public class GameViewNum extends GameView   {
	
	   
	   boolean colisionArdilla = false;
	   boolean colisionArdilla2 = true;
	   boolean start = true;
	   boolean polloboolean = false;
	   boolean sueltaElHUevo = false;
	   boolean aguanta = false;
	   boolean huevoBoolean = false;
	   boolean pintaElNumero = false;
	   boolean principio = true;
	   boolean ardillaBoolean = true;
	   boolean ardillaBoolean2 = false;
	   boolean ensenaMenu = false;
	   boolean jugarDeNuez = true;
	   boolean jugarDeNuezlight = false;
	   
	   boolean sonidoArdilla = true;
	   boolean instruccionesBoolean = true;
	   boolean diElNumeroBoolean0 = true;
	   boolean diElNumeroBoolean1 = true;
	   boolean diElNumeroBoolean2 = true;
	   boolean diElNumeroBoolean3 = true;
	   boolean diElNumeroBoolean4 = true;
	   boolean diElNumeroBoolean5 = true;
	   boolean diElNumeroBoolean6 = true;
	   boolean diElNumeroBoolean7 = true;
	   boolean diElNumeroBoolean8 = true;
	   boolean diElNumeroBoolean9 = true;
	   boolean diElNumeroBoolean10 = true;
	   boolean diElNumeroBoolean11 = true;
	   boolean diElNumeroBoolean12 = true;
	   boolean diElNumeroBoolean13 = true;
	   boolean diElNumeroBoolean14 = true;
	   boolean diElNumeroBoolean15 = true;
	   boolean diElNumeroBoolean16 = true;
	   boolean diElNumeroBoolean17 = true;
	   boolean diElNumeroBoolean18 = true;
	   boolean diElNumeroBoolean19 = true;
	   boolean diElNumeroBoolean20 = true;
	   boolean diElNumeroBoolean21 = true;
	   boolean diElNumeroBoolean22 = true;
	   boolean diElNumeroBoolean23 = true;
	   boolean diElNumeroBoolean24 = true;
	   boolean diElNumeroBoolean25 = true;
	   boolean diElNumeroBoolean26 = true;
	   
	   
	   boolean diElNumeroBoolean27 = true;
	   boolean diElNumeroBoolean28 = true;
	   boolean diElNumeroBoolean29 = true;
	   boolean diElNumeroBoolean30 = true;
	   boolean diElNumeroBoolean31 = true;
	   boolean diElNumeroBoolean32 = true;
	   boolean diElNumeroBoolean33 = true;
	   boolean diElNumeroBoolean34 = true;
	   boolean diElNumeroBoolean35 = true;
	   boolean diElNumeroBoolean36 = true;
	   boolean diElNumeroBoolean37 = true;
	   boolean diElNumeroBoolean38 = true;
	   boolean diElNumeroBoolean39 = true;
	   boolean diElNumeroBoolean40 = true;
	   boolean diElNumeroBoolean41 = true;
	   boolean diElNumeroBoolean42 = true;
	   boolean diElNumeroBoolean43 = true;
	   boolean diElNumeroBoolean44 = true;
	   boolean diElNumeroBoolean45 = true;
	   boolean diElNumeroBoolean46 = true;
	   
	
	   boolean diElNumeroBoolean47 = true;
	   boolean diElNumeroBoolean48 = true;
	   boolean diElNumeroBoolean49 = true;
	   boolean diElNumeroBoolean50 = true;
	   boolean diElNumeroBoolean51 = true;
	   boolean diElNumeroBoolean52 = true;
	   boolean diElNumeroBoolean53 = true;
	   boolean diElNumeroBoolean54 = true;
	   boolean diElNumeroBoolean55 = true;
	   boolean diElNumeroBoolean56 = true;
	   boolean diElNumeroBoolean57 = true;
	   boolean diElNumeroBoolean58 = true;
	   boolean diElNumeroBoolean59 = true;
	   boolean diElNumeroBoolean60 = true;
	   boolean diElNumeroBoolean61 = true;
	   boolean diElNumeroBoolean62 = true;
	   boolean diElNumeroBoolean63 = true;
	   boolean diElNumeroBoolean64 = true;
	   boolean diElNumeroBoolean65 = true;
	   boolean diElNumeroBoolean66 = true;
	   
	  
	   boolean diElNumeroBoolean67 = true;
	   boolean diElNumeroBoolean68 = true;
	   boolean diElNumeroBoolean69 = true;
	   boolean diElNumeroBoolean70 = true;
	   boolean diElNumeroBoolean71 = true;
	   boolean diElNumeroBoolean72 = true;
	   boolean diElNumeroBoolean73 = true;
	   boolean diElNumeroBoolean74 = true;
	   boolean diElNumeroBoolean75 = true;
	   boolean diElNumeroBoolean76 = true;
	   boolean diElNumeroBoolean77 = true;
	   boolean diElNumeroBoolean78 = true;
	   boolean diElNumeroBoolean79 = true;
	   boolean diElNumeroBoolean80 = true;
	   boolean diElNumeroBoolean81 = true;
	   boolean diElNumeroBoolean82 = true;
	   boolean diElNumeroBoolean83 = true;
	   boolean diElNumeroBoolean84 = true;
	   boolean diElNumeroBoolean85 = true;
	   boolean diElNumeroBoolean86 = true;
	   boolean diElNumeroBoolean87 = true;
	   boolean diElNumeroBoolean88 = true;
	   boolean diElNumeroBoolean89 = true;
	   boolean diElNumeroBoolean90 = true;
	   boolean diElNumeroBoolean91 = true;
	   boolean diElNumeroBoolean92 = true;
	   boolean diElNumeroBoolean93 = true;
	   boolean diElNumeroBoolean94 = true;
	   boolean diElNumeroBoolean95 = true;
	   boolean diElNumeroBoolean96 = true;
	   boolean diElNumeroBoolean97 = true;
	   boolean diElNumeroBoolean98 = true;
	   boolean diElNumeroBoolean99 = true;
	   boolean diElNumeroBoolean100 = true;
	   
	   boolean fanfarrias = true;
	   
	   boolean globos = false;
	   
	   private Bitmap bg; 
    
    boolean image_down = true;
 
    private int screenW;
	   private int screenH;
	   private int tileX;
	   private int tileX2;
	   
	   private int numeroDelNumero;
  
    private SurfaceHolder holder;
    private GameLoopThread gameLoopThread;
    
    private Pajaros vajarus;
    private Ardilla ardilla1;
    private ArdillaS ardilla2;
    private Flecha pajaroh1;
    private Flecha jugar;
    private Flecha losGlobos;
    private Flecha jugarLight;
    private Flecha instruccionesBitmap;
    private Huevo huevon1;
    private Huevos huevosTile;
    
    private Numeros numero;
   
    float volume;
	   static SoundPool sounds;
	  
	   
	   private static int soundCuervo;
	   
	   private static int sonidoArd;
	   
	   private static int sonido0;
	   private static int sonido1;
	   private static int sonido2;
	   private static int sonido3;
	   private static int sonido4;
	   private static int sonido5;
	   private static int sonido6;
	   private static int sonido7;
	   private static int sonido8;
	   private static int sonido9;
	   private static int sonido10;
	   private static int sonido11;
	   private static int sonido12;
	   private static int sonido13;
	   private static int sonido14;
	   private static int sonido15;
	   private static int sonido16;
	   private static int sonido17;
	   private static int sonido18;
	   private static int sonido19;
	   private static int sonido20;
	   private static int sonido21;
	   private static int sonido22;
	   private static int sonido23;
	   private static int sonido24;
	   private static int sonido25;
	   private static int sonido26;
	   
	  
	   private static int sonido27;
	   private static int sonido28;
	   private static int sonido29;
	   private static int sonido30;
	   private static int sonido31;
	   private static int sonido32;
	   private static int sonido33;
	   private static int sonido34;
	   private static int sonido35;
	   private static int sonido36;
	   private static int sonido37;
	   private static int sonido38;
	   private static int sonido39;
	   private static int sonido40;
	   private static int sonido41;
	   private static int sonido42;
	   private static int sonido43;
	   private static int sonido44;
	   private static int sonido45;
	   private static int sonido46;
	   
	  
	   private static int sonido47;
	   private static int sonido48;
	   private static int sonido49;
	   private static int sonido50;
	   private static int sonido51;
	   private static int sonido52;
	   private static int sonido53;
	   private static int sonido54;
	   private static int sonido55;
	   private static int sonido56;
	   private static int sonido57;
	   private static int sonido58;
	   private static int sonido59;
	   private static int sonido60;
	   private static int sonido61;
	   private static int sonido62;
	   private static int sonido63;
	   private static int sonido64;
	   private static int sonido65;
	   private static int sonido66;
	   
	   	  
	   private static int sonido67;
	   private static int sonido68;
	   private static int sonido69;
	   private static int sonido70;
	   private static int sonido71;
	   private static int sonido72;
	   private static int sonido73;
	   private static int sonido74;
	   private static int sonido75;
	   private static int sonido76;
	   private static int sonido77;
	   private static int sonido78;
	   private static int sonido79;
	   private static int sonido80;
	   private static int sonido81;
	   private static int sonido82;
	   private static int sonido83;
	   private static int sonido84;
	   private static int sonido85;
	   private static int sonido86;
	   
	   
	   private static int sonido87;
	   private static int sonido88;
	   private static int sonido89;
	   private static int sonido90;
	   private static int sonido91;
	   private static int sonido92;
	   private static int sonido93;
	   private static int sonido94;
	   private static int sonido95;
	   private static int sonido96;
	   private static int sonido97;
	   private static int sonido98;
	   private static int sonido99;
	   private static int sonido100;
	   
	   //private static int sonidofanfa;
	   private static int sonidoninos;
    
   
    //Paint mPaint = new Paint();     
       
    //FontMetricsInt fm = mPaint.getFontMetricsInt(); 
    
    public GameViewNum(Context context) {
          super(context);
          
          
          sounds = new SoundPool(5, AudioManager.STREAM_MUSIC, 0); 
          
          soundCuervo = sounds.load(mycontext, R.raw.birds001, 1);
          
          
          AudioManager audioManager = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);
   		  volume = (float)audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
   		
     
          gameLoopThread = new GameLoopThread(this);
          holder = getHolder();
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
 
 	
 	  bg = BitmapFactory.decodeResource(getResources(), R.drawable.bkhongos1);
 	  bg = Bitmap.createScaledBitmap(bg, screenW, screenH, true);
 	  
 	  vajarus = createPajaro(R.drawable.pverde);
 	  pajaroh1 = createPajaroh(R.drawable.pajarohv);
 	  
 	  ardilla1 = createArdilla(R.drawable.ardilla6);
 	  ardilla2 = createArdilla2(R.drawable.ardilla9);
 	  
 	  huevosTile = createHuevos(R.drawable.huevoc);
 	  numero = createNumero(R.drawable.numero0);
 	  
 	  jugar = createSenal(R.drawable.starto);
 	  jugarLight = createSenal(R.drawable.starto2);
 	  
 	  losGlobos = createGlobos(R.drawable.globos);
 	  losGlobos.setX((screenW - losGlobos.getWidth()) / 2);
 	  losGlobos.setY((screenH - losGlobos.getHeight()) / 2);
 	
 	  instruccionesBitmap = createInstrucciones(R.drawable.instrccion1);
	  instruccionesBitmap.setX(0);
	  instruccionesBitmap.setY(0);
 	  
 	  new Thread() {
 	        public void run() {
 	            try {
 	            	//sonidofanfa = sounds.load(mycontext, R.raw.ninos, 1);
 	            	sonidoninos = sounds.load(mycontext, R.raw.cheering, 1);
 	            	sonidoArd = sounds.load(mycontext, R.raw.wheel4, 1);
 	            	sonido0 = sounds.load(mycontext, R.raw.sonido0, 1);
 	                sonido1= sounds.load(mycontext, R.raw.sonido1, 1);
 	                sonido2= sounds.load(mycontext, R.raw.sonido2, 1);  
 	                sonido3= sounds.load(mycontext, R.raw.sonido3, 1);
 	                sonido4= sounds.load(mycontext, R.raw.sonido4, 1);
 	                sonido5= sounds.load(mycontext, R.raw.sonido5, 1);
 	                sonido6= sounds.load(mycontext, R.raw.sonido6, 1);
 	                sonido7= sounds.load(mycontext, R.raw.sonido7, 1);
 	                sonido8= sounds.load(mycontext, R.raw.sonido8, 1);
 	                sonido9= sounds.load(mycontext, R.raw.sonido9, 1);
 	            	sonido10= sounds.load(mycontext, R.raw.sonido10, 1);
 	            	sonido11= sounds.load(mycontext, R.raw.sonido11, 1);
 	            	sonido12= sounds.load(mycontext, R.raw.sonido12, 1);
 	            	sonido13= sounds.load(mycontext, R.raw.sonido13, 1);
 	            	sonido14= sounds.load(mycontext, R.raw.sonido14, 1);
 	            	sonido15= sounds.load(mycontext, R.raw.sonido15, 1);
 	            	sonido16= sounds.load(mycontext, R.raw.sonido16, 1);
 	            	sonido17= sounds.load(mycontext, R.raw.sonido17, 1);
 	            	sonido18= sounds.load(mycontext, R.raw.sonido18, 1);
 	            	sonido19= sounds.load(mycontext, R.raw.sonido19, 1);
 	            	sonido20= sounds.load(mycontext, R.raw.sonido20, 1);
 	            	sonido21= sounds.load(mycontext, R.raw.sonido21, 1);
 	            	sonido22= sounds.load(mycontext, R.raw.sonido22, 1);
 	            	sonido23= sounds.load(mycontext, R.raw.sonido23, 1);
 	            	sonido24= sounds.load(mycontext, R.raw.sonido24, 1);
 	            	sonido25= sounds.load(mycontext, R.raw.sonido25, 1);
 	            	sonido26= sounds.load(mycontext, R.raw.sonido26, 1);
 	            	    
 	            	sonido27= sounds.load(mycontext, R.raw.sonido27, 1);
 	            	sonido28= sounds.load(mycontext, R.raw.sonido28, 1);
 	            	sonido29= sounds.load(mycontext, R.raw.sonido29, 1);
 	            	sonido30= sounds.load(mycontext, R.raw.sonido30, 1);
 	            	sonido31= sounds.load(mycontext, R.raw.sonido31, 1);
 	            	sonido32= sounds.load(mycontext, R.raw.sonido32, 1);
 	            	sonido33= sounds.load(mycontext, R.raw.sonido33, 1);
 	            	sonido34= sounds.load(mycontext, R.raw.sonido34, 1);
 	            	sonido35= sounds.load(mycontext, R.raw.sonido35, 1);
 	            	sonido36= sounds.load(mycontext, R.raw.sonido36, 1);
 	            	sonido37= sounds.load(mycontext, R.raw.sonido37, 1);
 	            	sonido38= sounds.load(mycontext, R.raw.sonido38, 1);
 	            	sonido39= sounds.load(mycontext, R.raw.sonido39, 1);
 	            	sonido40= sounds.load(mycontext, R.raw.sonido40, 1);
 	            	sonido41= sounds.load(mycontext, R.raw.sonido41, 1);
 	            	sonido42= sounds.load(mycontext, R.raw.sonido42, 1);
 	            	sonido43= sounds.load(mycontext, R.raw.sonido43, 1);
 	            	sonido44= sounds.load(mycontext, R.raw.sonido44, 1);
 	            	sonido45= sounds.load(mycontext, R.raw.sonido45, 1);
 	            	sonido46= sounds.load(mycontext, R.raw.sonido46, 1);
 	            	    
 	            	sonido47= sounds.load(mycontext, R.raw.sonido47, 1);
 	            	sonido48= sounds.load(mycontext, R.raw.sonido48, 1);
 	            	sonido49= sounds.load(mycontext, R.raw.sonido49, 1);
 	            	sonido50= sounds.load(mycontext, R.raw.sonido50, 1);
 	            	sonido51= sounds.load(mycontext, R.raw.sonido51, 1);
 	            	sonido52= sounds.load(mycontext, R.raw.sonido52, 1);
 	            	sonido53= sounds.load(mycontext, R.raw.sonido53, 1);
 	            	sonido54= sounds.load(mycontext, R.raw.sonido54, 1);
 	            	sonido55= sounds.load(mycontext, R.raw.sonido55, 1);
 	            	sonido56= sounds.load(mycontext, R.raw.sonido56, 1);
 	            	sonido57= sounds.load(mycontext, R.raw.sonido57, 1);
 	            	sonido58= sounds.load(mycontext, R.raw.sonido58, 1);
 	            	sonido59= sounds.load(mycontext, R.raw.sonido59, 1);
 	            	sonido60= sounds.load(mycontext, R.raw.sonido60, 1);
 	            	sonido61= sounds.load(mycontext, R.raw.sonido61, 1);
 	            	sonido62= sounds.load(mycontext, R.raw.sonido62, 1);
 	            	sonido63= sounds.load(mycontext, R.raw.sonido63, 1);
 	            	sonido64= sounds.load(mycontext, R.raw.sonido64, 1);
 	            	sonido65= sounds.load(mycontext, R.raw.sonido65, 1);
 	            	sonido66= sounds.load(mycontext, R.raw.sonido66, 1);
 	            	    
 	            	sonido67= sounds.load(mycontext, R.raw.sonido67, 1);
 	            	sonido68= sounds.load(mycontext, R.raw.sonido68, 1);
 	            	sonido69= sounds.load(mycontext, R.raw.sonido69, 1);
 	            	sonido70= sounds.load(mycontext, R.raw.sonido70, 1);
 	            	sonido71= sounds.load(mycontext, R.raw.sonido71, 1);
 	            	sonido72= sounds.load(mycontext, R.raw.sonido72, 1);
 	            	sonido73= sounds.load(mycontext, R.raw.sonido73, 1);
 	            	sonido74= sounds.load(mycontext, R.raw.sonido74, 1);
 	            	sonido75= sounds.load(mycontext, R.raw.sonido75, 1);
 	            	sonido76= sounds.load(mycontext, R.raw.sonido76, 1);
 	            	sonido77= sounds.load(mycontext, R.raw.sonido77, 1);
 	            	sonido78= sounds.load(mycontext, R.raw.sonido78, 1);
 	            	sonido79= sounds.load(mycontext, R.raw.sonido79, 1);
 	            	sonido80= sounds.load(mycontext, R.raw.sonido80, 1);
 	            	sonido81= sounds.load(mycontext, R.raw.sonido81, 1);
 	            	sonido82= sounds.load(mycontext, R.raw.sonido82, 1);
 	            	sonido83= sounds.load(mycontext, R.raw.sonido83, 1);
 	            	sonido84= sounds.load(mycontext, R.raw.sonido84, 1);
 	            	sonido85= sounds.load(mycontext, R.raw.sonido85, 1);
 	            	sonido86= sounds.load(mycontext, R.raw.sonido86, 1);
 	            	    
 	            	sonido87= sounds.load(mycontext, R.raw.sonido87, 1);
 	            	sonido88= sounds.load(mycontext, R.raw.sonido88, 1);
 	            	sonido89= sounds.load(mycontext, R.raw.sonido89, 1);
 	            	sonido90= sounds.load(mycontext, R.raw.sonido90, 1);
 	            	sonido91= sounds.load(mycontext, R.raw.sonido91, 1);
 	            	sonido92= sounds.load(mycontext, R.raw.sonido92, 1);
 	            	sonido93= sounds.load(mycontext, R.raw.sonido93, 1);
 	            	sonido94= sounds.load(mycontext, R.raw.sonido94, 1);
 	            	sonido95= sounds.load(mycontext, R.raw.sonido95, 1);
 	            	sonido96= sounds.load(mycontext, R.raw.sonido96, 1);
 	            	sonido97= sounds.load(mycontext, R.raw.sonido97, 1);
 	            	sonido98= sounds.load(mycontext, R.raw.sonido98, 1);
 	            	sonido99= sounds.load(mycontext, R.raw.sonido99, 1);
 	            	sonido100= sounds.load(mycontext, R.raw.onehundred, 1);
 	            	    
 	                
 	            } catch (Exception e) {
 	            }
 	            
 	        }
 	    }.start();
 	  
 	  
   
 	  
  }

    
    
 	   
    public boolean onTouchEvent(MotionEvent event) 
    {    
 	   
 	   
 	   if (event.getAction() == android.view.MotionEvent.ACTION_DOWN) 
          {
 		  
 		   touchx = (int)event.getX();
	   	       touchy = (int)event.getY();
 		   
 		/* //  sprite.move((int)event.getX(), (int)event.getY());  
 		   if(vajarus.isCollition((int)event.getX(), (int)event.getY()))
 			 {
 			   
 			   pajaroh1.setX(vajarus.getX());
 			   pajaroh1.setY(vajarus.getY());
 			   
 			   aguanta = true;
 			   
 			   //pintaElNumero = true;
 			   //numeroDelNumero += 1;
 			   
 			   sueltaElHUevo = true;
 			   
 			   if(!huevoBoolean) //huevoBoolean pinta el huevo cunado es verdadero
 			   {
 				   huevon1.setX(pajaroh1.getX() + ((pajaroh1.getWidth() - (huevon1.getWidth() / 4))) / 2);
 				   huevon1.setY(pajaroh1.getY() + (pajaroh1.getHeight() / 2));
 				   huevosTile.tileMap[huevosTile.endTileY - 1][tileX] = 1;
 				   numeroDelNumero += 1;
 				   //diElNumeroBoolean = true;
 				   
 			   }
 			   else if(huevoBoolean && huevon1.getRemove())
 			   {
 				   huevoBoolean = false;
 				   huevon1 = createHuevo(R.drawable.sphuevo);
 				   huevon1.setX(pajaroh1.getX() + ((pajaroh1.getWidth() - (huevon1.getWidth() / 4))) / 2);
 				   huevon1.setY(pajaroh1.getY() + (pajaroh1.getHeight() / 2));
 				   numeroDelNumero += 1;
 				   //diElNumeroBoolean = true;
 				   
 				   if(tileX < 50)
 				   {
 					   tileX += 1;
 					   huevosTile.tileMap[huevosTile.endTileY - 1][tileX] = 1;
 					  
 				   }
 				   else if(tileX >= 50)
 				   {
 					   int tileX2 = 0;
 					   
 					   if(tileX2 < 50)
     				   {
     					   tileX += 1;
     					   huevosTile.tileMap[huevosTile.endTileY - 2][tileX] = 1;
     					  
     				   }
 				   }
 				   else
 				   {
 					   //Your done!
 				   }
 			   }
 			   sounds.play(soundCuervo, volume, volume, 1, 0,1);
 			   
 		     }
 		  */
 		  
    }
          
 	   
 	   else if (event.getAction() == android.view.MotionEvent.ACTION_UP) 
 	   {     
 		   jugarDeNuezlight = false;
 		   
 		   pajaroh1.setX(vajarus.getX());
			   pajaroh1.setY(vajarus.getY());
			   
			   aguanta = false;
			   sueltaElHUevo = false;
			   touchx = -400;
	   	       touchy = -400;
 	   }   
 	       	       	     	   
 	   return true;
    } 
////////////////////////////////////////////////////////////////////////// 
    
    
    private Pajaros createPajaro(int resouce) {
 	   Bitmap bmp = BitmapFactory.decodeResource(getResources(), resouce);
        bmp = Bitmap.createScaledBitmap(bmp, (int)(screenW/ 1.5), (int)(screenW/1.5 / 2.1), true);
 	  
        return new Pajaros(this, bmp);
        
  }     	  
    
    private Flecha createPajaroh(int resouce) {
 	   Bitmap bmp = BitmapFactory.decodeResource(getResources(), resouce);
        bmp = Bitmap.createScaledBitmap(bmp, (int)(screenW/6.5), (int)((screenW/6.5) * 1.5), true);
 	  
        return new Flecha(this, bmp);
  } 
   
    private Huevo createHuevo(int resouce) {
 	   Bitmap bmp = BitmapFactory.decodeResource(getResources(), resouce);
        bmp = Bitmap.createScaledBitmap(bmp, (int)(screenW/5 * 1.6), (screenW/5), true);
 	  
        return new Huevo(this, bmp);
        
  }    
    
    private Huevos createHuevos(int resouce) {
 	   Bitmap bmp = BitmapFactory.decodeResource(getResources(), resouce);
        bmp = Bitmap.createScaledBitmap(bmp, (screenW/50 ), (int)((screenW/50) * 1.6), true);
 	  
        return new Huevos(this, bmp);
        
  }    
    
    private Numeros createNumero(int resouce) {
 	   Bitmap bmp = BitmapFactory.decodeResource(getResources(), resouce);
        bmp = Bitmap.createScaledBitmap(bmp, (screenW/4), (int)(screenW/4 / 1.3), true);
 	  
        return new Numeros(this, bmp);
  } 
    
    private Ardilla createArdilla(int resouce) {
 	   Bitmap bmp = BitmapFactory.decodeResource(getResources(), resouce);
        bmp = Bitmap.createScaledBitmap(bmp, (int)(screenW/3), (int)(((screenW/3) / 4) * 1.15), true);
 	  
        return new Ardilla(this, bmp);
  } 
    
    private ArdillaS createArdilla2(int resouce) {
 	   Bitmap bmp = BitmapFactory.decodeResource(getResources(), resouce);
        bmp = Bitmap.createScaledBitmap(bmp, (int)(screenW/1.65), (int)(((screenW/1.65) / 7) * 1.15), true);
 	  
        return new ArdillaS(this, bmp);
  } 
    
    private Flecha createSenal(int resouce) {
 	   Bitmap bmp = BitmapFactory.decodeResource(getResources(), resouce);
        bmp = Bitmap.createScaledBitmap(bmp, (int)(screenW/3), (int)((screenW/3) / 4.5), true);
 	  
        return new Flecha(this, bmp);
  } 
    
    private Flecha createGlobos(int resouce) {
  	   Bitmap bmp = BitmapFactory.decodeResource(getResources(), resouce);
         bmp = Bitmap.createScaledBitmap(bmp, (screenW/2), (screenW/2), true);
  	  
         return new Flecha(this, bmp);
   } 
    
    private Flecha createInstrucciones(int resouce) {
   	   Bitmap bmp = BitmapFactory.decodeResource(getResources(), resouce);
          bmp = Bitmap.createScaledBitmap(bmp, (int)(screenW/3), (int)((screenW/3) / 2), true);
   	  
          return new Flecha(this, bmp);
    } 
//////////////////////////////////////////////////////////////////////////   
    @Override
    protected void onDraw(Canvas canvas) {
 	   try{
 	   
 		   if(start)  
 		   { 
 			   canvas.drawColor(Color.BLACK);
 			   canvas.drawBitmap(bg, 0, 0 , null);
 			   huevosTile.onDraw(canvas);
 			   
 			   pintarLosNumeros();
 			   numero.onDraw(canvas); 
 			   
 			   if(!aguanta)
 			   {
 				   vajarus.onDraw(canvas); // pajaro volando
 			   }
 			   
 			   if(instruccionesBoolean)
			   {
				   instruccionesBitmap.onDraw(canvas);
			   }
 			   
 			   if(huevoBoolean)  
 			   {
 				   huevon1.onDraw(canvas); // huevo 
 			   }
 			   
 			   if(sueltaElHUevo)
 			   {
 				   pajaroh1.onDraw(canvas); //pajaro estatico
 				   //huevoBoolean = true;
 				  // pintarHuevos();
 				   
 			   }
 			   
 			   if(ardillaBoolean)
 			   {
 				   ardilla1.onDraw(canvas); // ardilla
 			   }
 			   
 			   if(ardillaBoolean2)
 			   {
 				   ardilla2.onDraw(canvas); // ardilla
 			   }
 			   
 			   if(jugarDeNuezlight)
 			   {
 				   jugarLight.onDraw(canvas);		   
 			   }
 			   
 			   else
 			   {
 				   jugar.onDraw(canvas); 
 			   }
 			   
 			  if(globos)
			   {
				   losGlobos.onDraw(canvas);		   
			   }
 			  
 			  
 			   colision();
 		   }
 	   }
 	   catch (Exception e){
 		   
 	   }
    
    }

	private void colision() {
		// TODO Auto-generated method stub
		
		if(globos)
		{
			if(losGlobos.isCollition(touchx, touchy))
			{
				
				if(fanfarrias)
				{
					sounds.play(sonidoninos, volume, volume, 1, 0,1); fanfarrias = false;
				}
			}
		}
		
		if(jugarDeNuez)
		{
			if(jugar.isCollition(touchx, touchy))
			{
				globos = false;
				jugarDeNuezlight = true;
				
				for(int i = 0; i <= 49 ; i++)
		         {
		           huevosTile.tileMap[huevosTile.endTileY - 1][i] = 0;

		           huevosTile.tileMap[huevosTile.endTileY - 2][i] = 0;
		         }
		           tileX = 0;
      	   	   tileX2 = 0;
      	   	   principio = true;
      	   	   
      	       
      	       ardillaBoolean = true;
      	       ardillaBoolean2 = false;
      	       sonidoArdilla = true;
      	       colisionArdilla2 = true;
      	       
      	       
      	       
      	       
      	       diElNumeroBoolean0 = true;
      	       diElNumeroBoolean1 = true;
      	 	    diElNumeroBoolean2 = true;
      	 	   diElNumeroBoolean3 = true;
      	 	    diElNumeroBoolean4 = true;
      	 	   diElNumeroBoolean5 = true;
      	 	    diElNumeroBoolean6 = true;
      	 	    diElNumeroBoolean7 = true;
      	 	    diElNumeroBoolean8 = true;
      	 	  diElNumeroBoolean9 = true;
      	 	    diElNumeroBoolean10 = true;
      	 	   diElNumeroBoolean11 = true;
      	 	   diElNumeroBoolean12 = true;
      	 	    diElNumeroBoolean13 = true;
      	 	   diElNumeroBoolean14 = true;
      	 	    diElNumeroBoolean15 = true;
      	 	    diElNumeroBoolean16 = true;
      	 	   diElNumeroBoolean17 = true;
      	 	    diElNumeroBoolean18 = true;
      	 	   diElNumeroBoolean19 = true;
      	 	    diElNumeroBoolean20 = true;
      	 	    diElNumeroBoolean21 = true;
      	 	  diElNumeroBoolean22 = true;
      	 	    diElNumeroBoolean23 = true;
      	 	   diElNumeroBoolean24 = true;
      	 	   diElNumeroBoolean25 = true;
      	 	   diElNumeroBoolean26 = true;
      	 	   
      	 	   
      	 	    diElNumeroBoolean27 = true;
      	 	    diElNumeroBoolean28 = true;
      	 	   diElNumeroBoolean29 = true;
      	 	    diElNumeroBoolean30 = true;
      	 	    diElNumeroBoolean31 = true;
      	 	   diElNumeroBoolean32 = true;
      	 	   diElNumeroBoolean33 = true;
      	 	    diElNumeroBoolean34 = true;
      	 	   diElNumeroBoolean35 = true;
      	 	    diElNumeroBoolean36 = true;
      	 	  diElNumeroBoolean37 = true;
      	 	    diElNumeroBoolean38 = true;
      	 	   diElNumeroBoolean39 = true;
      	 	    diElNumeroBoolean40 = true;
      	 	   diElNumeroBoolean41 = true;
      	 	   diElNumeroBoolean42 = true;
      	 	    diElNumeroBoolean43 = true;
      	 	   diElNumeroBoolean44 = true;
      	 	   diElNumeroBoolean45 = true;
      	 	    diElNumeroBoolean46 = true;
      	 	   
      	 	
      	 	    diElNumeroBoolean47 = true;
      	 	   diElNumeroBoolean48 = true;
      	 	    diElNumeroBoolean49 = true;
      	 	    diElNumeroBoolean50 = true;
      	 	   diElNumeroBoolean51 = true;
      	 	    diElNumeroBoolean52 = true;
      	 	   diElNumeroBoolean53 = true;
      	 	   diElNumeroBoolean54 = true;
      	 	   diElNumeroBoolean55 = true;
      	 	   diElNumeroBoolean56 = true;
      	 	   diElNumeroBoolean57 = true;
      	 	   diElNumeroBoolean58 = true;
      	 	   diElNumeroBoolean59 = true;
      	 	  diElNumeroBoolean60 = true;
      	 	  diElNumeroBoolean61 = true;
      	 	   diElNumeroBoolean62 = true;
      	 	   diElNumeroBoolean63 = true;
      	 	  diElNumeroBoolean64 = true;
      	 	   diElNumeroBoolean65 = true;
      	 	  diElNumeroBoolean66 = true;
      	 	   
      	 	  
      	 	  diElNumeroBoolean67 = true;
      	 	   diElNumeroBoolean68 = true;
      	 	  diElNumeroBoolean69 = true;
      	 	  diElNumeroBoolean70 = true;
      	 	  diElNumeroBoolean71 = true;
      	 	  diElNumeroBoolean72 = true;
      	 	  diElNumeroBoolean73 = true;
      	 	  diElNumeroBoolean74 = true;
      	 	  diElNumeroBoolean75 = true;
      	 	  diElNumeroBoolean76 = true;
      	 	  diElNumeroBoolean77 = true;
      	 	 diElNumeroBoolean78 = true;
      	 	  diElNumeroBoolean79 = true;
      	 	  diElNumeroBoolean80 = true;
      	 	   diElNumeroBoolean81 = true;
      	 	  diElNumeroBoolean82 = true;
      	 	  diElNumeroBoolean83 = true;
      	 	  diElNumeroBoolean84 = true;
      	 	 diElNumeroBoolean85 = true;
      	 	  diElNumeroBoolean86 = true;
      	 	 diElNumeroBoolean87 = true;
      	 	  diElNumeroBoolean88 = true;
      	 	 diElNumeroBoolean89 = true;
      	 	  diElNumeroBoolean90 = true;
      	 	 diElNumeroBoolean91 = true;
      	 	  diElNumeroBoolean92 = true;
      	 	  diElNumeroBoolean93 = true;
      	 	  diElNumeroBoolean94 = true;
      	 	  diElNumeroBoolean95 = true;
      	 	  diElNumeroBoolean96 = true;
      	 	  diElNumeroBoolean97 = true;
      	 	  diElNumeroBoolean98 = true;
      	 	  diElNumeroBoolean99 = true;
      	 	  diElNumeroBoolean100 = true;
       	        fanfarrias = true; 
      	 	  numeroDelNumero = 0;
      	 	  touchx = -400;
 	   	      touchy = -400;
      	 	   
		         }
		         			
		 			
		         			
			}
		
		if(ardillaBoolean2 && ardilla2.getArdillaCounter() >= 2)
		{
			ardilla1.setX(ardilla2.getX());
			ardillaBoolean = true;
			ardillaBoolean2 = false;
			
		}
		
		if(!ardillaBoolean2 && colisionArdilla && colisionArdilla2 && ardilla1.isCollition(huevon1.getX() + ((huevon1.getWidth() / 4) /2), huevon1.getY() + ((huevon1.getHeight() / 2))))
		{
			//colisionArdilla nada mas indica que el object huevo ya ha sido creado
			ardilla2.setX(ardilla1.getX());
			ardillaBoolean = false;
			ardillaBoolean2 = true;
			ardilla2.setArdillaCounter(0);
			if(sonidoArdilla)
			{
				sounds.play(sonidoArd, (float)(.1), (float)(.1), 1, 0,1);
			}
		}

		   if(vajarus.isCollition(touchx, touchy))
			 {
			   instruccionesBoolean = false;
			   pajaroh1.setX(vajarus.getX());
			   pajaroh1.setY(vajarus.getY());
			   
			   aguanta = true; //detiene la pintada del pajaro volando
			   
			   //pintaElNumero = true;
			   //numeroDelNumero += 1;
			   
			   sueltaElHUevo = true; //pinta el pajaro estatico y aqui en la pinatada cambia 
			   huevoBoolean = true;
			   
			   if(huevoBoolean && principio) //huevoBoolean pinta el huevo cunado es verdadero
			   {
				   huevon1 = createHuevo(R.drawable.sphuevo);
				   huevon1.setX(pajaroh1.getX() + ((pajaroh1.getWidth() - (huevon1.getWidth() / 4))) / 2);
				   huevon1.setY(pajaroh1.getY() + (pajaroh1.getHeight() / 2));
				   huevosTile.tileMap[huevosTile.endTileY - 1][tileX] = 1;
				   sounds.play(soundCuervo, (float)(.1), (float)(.1), 1, 0,1);
				   numeroDelNumero += 1;
				   //diElNumeroBoolean = true;
				   //huevoBoolean = false;
				   principio = false;
				   colisionArdilla = true;
			   }
			   else if(huevoBoolean && huevon1.getRemove())
			   {
				  // huevoBoolean = false;
				   huevon1 = createHuevo(R.drawable.sphuevo);
				   huevon1.setX(pajaroh1.getX() + ((pajaroh1.getWidth() - (huevon1.getWidth() / 4))) / 2);
				   huevon1.setY(pajaroh1.getY() + (pajaroh1.getHeight() / 2));
				   numeroDelNumero += 1;
				   //diElNumeroBoolean = true;
				   
				   if((tileX < 49) && !(tileX >=50))
				   {
					   tileX += 1;
					   huevosTile.tileMap[huevosTile.endTileY - 1][tileX] = 1;
					   
					  
				   }
				   else if(tileX >= 49 && !(tileX >=99))
				   {
					   tileX += 1;
					   huevosTile.tileMap[huevosTile.endTileY - 2][tileX2] = 1;
					   tileX2 += 1;
					   
				   }   
				   else if(tileX >= 100)
				   {
					   
					  //your done
					  
				   }
				
				   sounds.play(soundCuervo, (float)(.1), (float)(.1), 1, 0,1);
				   
			   }
			   
			   touchx = -400;
	   	       touchy = -400;
			   
		     }
		  
	}

	private void pintarLosNumeros() {
		// TODO Auto-generated method stub
		 
	    
		 switch (numeroDelNumero) 
		 {
		 case 0:    numero = createNumero(R.drawable.numero0); 
		 			if(diElNumeroBoolean0)
		 			{
		 				sounds.play(sonido0, volume, volume, 1, 0,1); 
		 				diElNumeroBoolean0 = false;
				
		 			}
		 break;
      case 1:    
      			
      			numero = createNumero(R.drawable.numero1);     			
      			if(diElNumeroBoolean1)
      			{
      				 sounds.play(sonido1, volume, volume, 1, 0,1); diElNumeroBoolean1 = false;
      				//ardillaBoolean = true;
      				//ardillaBoolean2 = true;
      			}
                 break;
      case 2:    
      			numero = createNumero(R.drawable.numero2);
      			
      if(diElNumeroBoolean2){sounds.play(sonido2, volume, volume, 1, 0,1); diElNumeroBoolean2 = false;}
                 break;
      case 3:  	
      			numero = createNumero(R.drawable.numero3);
      if(diElNumeroBoolean3){sounds.play(sonido3, volume, volume, 1, 0,1); diElNumeroBoolean3 = false;}
                 
                 break;
      case 4:    
      			numero = createNumero(R.drawable.numero4);
      if(diElNumeroBoolean4){sounds.play(sonido4, volume, volume, 1, 0,1); diElNumeroBoolean4 = false;}
                 break;
      case 5:    
      			numero = createNumero(R.drawable.numero5);
      if(diElNumeroBoolean5){sounds.play(sonido5, volume, volume, 1, 0,1); diElNumeroBoolean5 = false;}
                 break;
      case 6:    
      			numero = createNumero(R.drawable.numero6);
      if(diElNumeroBoolean6){sounds.play(sonido6, volume, volume, 1, 0,1); diElNumeroBoolean6 = false;}
     
                 break;
      case 7:     
      			numero = createNumero(R.drawable.numero7);
      if(diElNumeroBoolean7){sounds.play(sonido7, volume, volume, 1, 0,1); diElNumeroBoolean7 = false;}
      
                 break;
      case 8:    
      			numero = createNumero(R.drawable.numero8);
      if(diElNumeroBoolean8){sounds.play(sonido8, volume, volume, 1, 0,1); diElNumeroBoolean8 = false;}
                 break;
      case 9:     
      			numero = createNumero(R.drawable.numero9);
      if(diElNumeroBoolean9){sounds.play(sonido9, volume, volume, 1, 0,1); diElNumeroBoolean9 = false;}
                 break;
      case 10:   numero = createNumero(R.drawable.numero10);
      if(diElNumeroBoolean10){sounds.play(sonido10, volume, volume, 1, 0,1); diElNumeroBoolean10 = false;}
                 break;
      case 11:   numero = createNumero(R.drawable.numero11);
      if(diElNumeroBoolean11){sounds.play(sonido11, volume, volume, 1, 0,1); diElNumeroBoolean11 = false;}
                 break;
      case 12:   numero = createNumero(R.drawable.numero12);
      if(diElNumeroBoolean12){sounds.play(sonido12, volume, volume, 1, 0,1); diElNumeroBoolean12 = false;}
                 break;
      case 13:   numero = createNumero(R.drawable.numero13);
      if(diElNumeroBoolean13){sounds.play(sonido13, volume, volume, 1, 0,1); diElNumeroBoolean13 = false;}
      		    break;
      case 14:   numero = createNumero(R.drawable.numero14);
      if(diElNumeroBoolean14){sounds.play(sonido14, volume, volume, 1, 0,1); diElNumeroBoolean14 = false;}
					break;
      case 15:   numero = createNumero(R.drawable.numero15);
      if(diElNumeroBoolean15){sounds.play(sonido15, volume, volume, 1, 0,1); diElNumeroBoolean15 = false;}
				    break;
      case 16:   numero = createNumero(R.drawable.numero16);
      if(diElNumeroBoolean16){sounds.play(sonido16, volume, volume, 1, 0,1); diElNumeroBoolean16 = false;}
		            break;
      case 17:   numero = createNumero(R.drawable.numero17);
      if(diElNumeroBoolean17){sounds.play(sonido17, volume, volume, 1, 0,1); diElNumeroBoolean17 = false;}
                 break;
      case 18:   numero = createNumero(R.drawable.numero18);
      if(diElNumeroBoolean18){sounds.play(sonido18, volume, volume, 1, 0,1); diElNumeroBoolean18 = false;}
      		    break;
      case 19:   numero = createNumero(R.drawable.numero19);
      if(diElNumeroBoolean19){sounds.play(sonido19, volume, volume, 1, 0,1); diElNumeroBoolean19 = false;}
		            break;
      case 20:   
      numero = createNumero(R.drawable.numero20);
      if(diElNumeroBoolean20){sounds.play(sonido20, volume, volume, 1, 0,1); diElNumeroBoolean20 = false;}
                 break;
      case 21:   
      			numero = createNumero(R.drawable.numero21);
      if(diElNumeroBoolean21){sounds.play(sonido21, volume, volume, 1, 0,1); diElNumeroBoolean21 = false;}
                 break;
      case 22:   
      numero = createNumero(R.drawable.numero22);
      if(diElNumeroBoolean22){sounds.play(sonido22, volume, volume, 1, 0,1); diElNumeroBoolean22 = false;}
      		    break;
      case 23:   
      			numero = createNumero(R.drawable.numero23);
      if(diElNumeroBoolean23){sounds.play(sonido23, volume, volume, 1, 0,1); diElNumeroBoolean23 = false;}
      		    break;
      case 24:   
      			numero = createNumero(R.drawable.numero24);
      if(diElNumeroBoolean24){sounds.play(sonido24, volume, volume, 1, 0,1); diElNumeroBoolean24 = false;}
		  		    break;
      case 25:   
      			numero = createNumero(R.drawable.numero25);
      if(diElNumeroBoolean25){sounds.play(sonido25, volume, volume, 1, 0,1); diElNumeroBoolean25 = false;}
      		    break;
      case 26:   numero = createNumero(R.drawable.numero26);
      if(diElNumeroBoolean26){sounds.play(sonido26, volume, volume, 1, 0,1); diElNumeroBoolean26 = false;}
	  		        break;
	  	case 27:    numero = createNumero(R.drawable.numero27);
    	if(diElNumeroBoolean27){sounds.play(sonido27, volume, volume, 1, 0,1); diElNumeroBoolean27 = false;}
               break;
    case 28:    numero = createNumero(R.drawable.numero28);
    if(diElNumeroBoolean28){sounds.play(sonido28, volume, volume, 1, 0,1); diElNumeroBoolean28 = false;}
               break;
    case 29:  	numero = createNumero(R.drawable.numero29);
    if(diElNumeroBoolean29){sounds.play(sonido29, volume, volume, 1, 0,1); diElNumeroBoolean29 = false;}
               break;
    case 30:    numero = createNumero(R.drawable.numero30);
    if(diElNumeroBoolean30){sounds.play(sonido30, volume, volume, 1, 0,1); diElNumeroBoolean30 = false;}
               break;
    case 31:    numero = createNumero(R.drawable.numero31);
    if(diElNumeroBoolean31){sounds.play(sonido31, volume, volume, 1, 0,1); diElNumeroBoolean31 = false;}
               break;
    case 32:    numero = createNumero(R.drawable.numero32);
    if(diElNumeroBoolean32){sounds.play(sonido32, volume, volume, 1, 0,1); diElNumeroBoolean32 = false;}
               break;
    case 33:    numero = createNumero(R.drawable.numero33);
    if(diElNumeroBoolean33){sounds.play(sonido33, volume, volume, 1, 0,1); diElNumeroBoolean33 = false;}
               break;
    case 34:    numero = createNumero(R.drawable.numero34);
    if(diElNumeroBoolean34){sounds.play(sonido34, volume, volume, 1, 0,1); diElNumeroBoolean34 = false;}
               break;
    case 35:    numero = createNumero(R.drawable.numero35);
    if(diElNumeroBoolean35){sounds.play(sonido35, volume, volume, 1, 0,1); diElNumeroBoolean35 = false;}
               break;
    case 36:   numero = createNumero(R.drawable.numero36);
    if(diElNumeroBoolean36){sounds.play(sonido36, volume, volume, 1, 0,1); diElNumeroBoolean36 = false;}
               break;
    case 37:   numero = createNumero(R.drawable.numero37);
    if(diElNumeroBoolean37){sounds.play(sonido37, volume, volume, 1, 0,1); diElNumeroBoolean37 = false;}
               break;
    case 38:   numero = createNumero(R.drawable.numero38);
    if(diElNumeroBoolean38){sounds.play(sonido38, volume, volume, 1, 0,1); diElNumeroBoolean38 = false;}
               break;
    case 39:   numero = createNumero(R.drawable.numero39);
    if(diElNumeroBoolean39){sounds.play(sonido39, volume, volume, 1, 0,1); diElNumeroBoolean39 = false;}
    		    break;
    case 40:   numero = createNumero(R.drawable.numero40);
    if(diElNumeroBoolean40){sounds.play(sonido40, volume, volume, 1, 0,1); diElNumeroBoolean40 = false;}
					break;
    case 41:   numero = createNumero(R.drawable.numero41);
    if(diElNumeroBoolean41){sounds.play(sonido41, volume, volume, 1, 0,1); diElNumeroBoolean41 = false;}
				    break;
    case 42:   numero = createNumero(R.drawable.numero42);
    if(diElNumeroBoolean42){sounds.play(sonido42, volume, volume, 1, 0,1); diElNumeroBoolean42 = false;}
		            break;
    case 43:   numero = createNumero(R.drawable.numero43);
    if(diElNumeroBoolean43){sounds.play(sonido43, volume, volume, 1, 0,1); diElNumeroBoolean43 = false;}
               break;
    case 44:   numero = createNumero(R.drawable.numero44);
    if(diElNumeroBoolean44){sounds.play(sonido44, volume, volume, 1, 0,1); diElNumeroBoolean44 = false;}
    		    break;
    case 45:   numero = createNumero(R.drawable.numero45);
    if(diElNumeroBoolean45){sounds.play(sonido45, volume, volume, 1, 0,1); diElNumeroBoolean45 = false;}
		            break;
    case 46:   numero = createNumero(R.drawable.numero46);
    if(diElNumeroBoolean46){sounds.play(sonido46, volume, volume, 1, 0,1); diElNumeroBoolean46 = false;}
               break;
    case 47:   numero = createNumero(R.drawable.numero47);
    if(diElNumeroBoolean47){sounds.play(sonido47, volume, volume, 1, 0,1); diElNumeroBoolean47 = false;}
               break;
    case 48:   numero = createNumero(R.drawable.numero48);
    if(diElNumeroBoolean48){sounds.play(sonido48, volume, volume, 1, 0,1); diElNumeroBoolean48 = false;}
    		    break;
    case 49:   numero = createNumero(R.drawable.numero49);
    if(diElNumeroBoolean49){sounds.play(sonido49, volume, volume, 1, 0,1); diElNumeroBoolean49 = false;}
    		    break;
    case 50:   numero = createNumero(R.drawable.numero50);
    if(diElNumeroBoolean50){sounds.play(sonido50, volume, volume, 1, 0,1); diElNumeroBoolean50 = false;}
		  		    break;
    case 51:   numero = createNumero(R.drawable.numero51);
    if(diElNumeroBoolean51){sounds.play(sonido51, volume, volume, 1, 0,1); diElNumeroBoolean51 = false;}
    		    break;
    case 52:   numero = createNumero(R.drawable.numero52);
    if(diElNumeroBoolean52){sounds.play(sonido52, volume, volume, 1, 0,1); diElNumeroBoolean52 = false;}
	  		        break;
	   case 53:    numero = createNumero(R.drawable.numero53);
    if(diElNumeroBoolean53){sounds.play(sonido53, volume, volume, 1, 0,1); diElNumeroBoolean53 = false;}
               break;
    case 54:    numero = createNumero(R.drawable.numero54);
    if(diElNumeroBoolean54){sounds.play(sonido54, volume, volume, 1, 0,1); diElNumeroBoolean54 = false;}
               break;
    case 55:  	numero = createNumero(R.drawable.numero55);
    if(diElNumeroBoolean55){sounds.play(sonido55, volume, volume, 1, 0,1); diElNumeroBoolean55 = false;}
               break;
    case 56:    numero = createNumero(R.drawable.numero56);
    if(diElNumeroBoolean56){sounds.play(sonido56, volume, volume, 1, 0,1); diElNumeroBoolean56 = false;}
               break;
    case 57:    numero = createNumero(R.drawable.numero57);
    if(diElNumeroBoolean57){sounds.play(sonido57, volume, volume, 1, 0,1); diElNumeroBoolean57 = false;}
               break;
    case 58:    numero = createNumero(R.drawable.numero58);
    if(diElNumeroBoolean58){sounds.play(sonido58, volume, volume, 1, 0,1); diElNumeroBoolean58 = false;}
               break;
    case 59:    numero = createNumero(R.drawable.numero59);
    if(diElNumeroBoolean59){sounds.play(sonido59, volume, volume, 1, 0,1); diElNumeroBoolean59 = false;}
               break;
    case 60:    numero = createNumero(R.drawable.numero60);
    if(diElNumeroBoolean60){sounds.play(sonido60, volume, volume, 1, 0,1); diElNumeroBoolean60 = false;}
               break;
    case 61:    numero = createNumero(R.drawable.numero61);
    if(diElNumeroBoolean61){sounds.play(sonido61, volume, volume, 1, 0,1); diElNumeroBoolean61 = false;}
               break;
    case 62:   numero = createNumero(R.drawable.numero62);
    if(diElNumeroBoolean62){sounds.play(sonido62, volume, volume, 1, 0,1); diElNumeroBoolean62 = false;}
               break;
    case 63:   numero = createNumero(R.drawable.numero63);
    if(diElNumeroBoolean63){sounds.play(sonido63, volume, volume, 1, 0,1); diElNumeroBoolean63 = false;}
               break;
    case 64:   numero = createNumero(R.drawable.numero64);
    if(diElNumeroBoolean64){sounds.play(sonido64, volume, volume, 1, 0,1); diElNumeroBoolean64 = false;}
               break;
    case 65:   numero = createNumero(R.drawable.numero65);
    if(diElNumeroBoolean65){sounds.play(sonido65, volume, volume, 1, 0,1); diElNumeroBoolean65 = false;}
    		    break;
    case 66:   numero = createNumero(R.drawable.numero66);
    if(diElNumeroBoolean66){sounds.play(sonido66, volume, volume, 1, 0,1); diElNumeroBoolean66 = false;}
					break;
    case 67:   numero = createNumero(R.drawable.numero67);
    if(diElNumeroBoolean67){sounds.play(sonido67, volume, volume, 1, 0,1); diElNumeroBoolean67 = false;}
				    break;
    case 68:   numero = createNumero(R.drawable.numero68);
    if(diElNumeroBoolean68){sounds.play(sonido68, volume, volume, 1, 0,1); diElNumeroBoolean68 = false;}
		            break;
    case 69:   numero = createNumero(R.drawable.numero69);
    if(diElNumeroBoolean69){sounds.play(sonido69, volume, volume, 1, 0,1); diElNumeroBoolean69 = false;}
               break;
    case 70:   numero = createNumero(R.drawable.numero70);
    if(diElNumeroBoolean70){sounds.play(sonido70, volume, volume, 1, 0,1); diElNumeroBoolean70 = false;}
    		    break;
    case 71:   numero = createNumero(R.drawable.numero71);
    if(diElNumeroBoolean71){sounds.play(sonido71, volume, volume, 1, 0,1); diElNumeroBoolean71 = false;}
		            break;
    case 72:   numero = createNumero(R.drawable.numero72);
    if(diElNumeroBoolean72){sounds.play(sonido72, volume, volume, 1, 0,1); diElNumeroBoolean72 = false;}
               break;
    case 73:   numero = createNumero(R.drawable.numero73);
    if(diElNumeroBoolean73){sounds.play(sonido73, volume, volume, 1, 0,1); diElNumeroBoolean73 = false;}
               break;
    case 74:   numero = createNumero(R.drawable.numero74);
    if(diElNumeroBoolean74){sounds.play(sonido74, volume, volume, 1, 0,1); diElNumeroBoolean74 = false;}
    		    break;
    case 75:   numero = createNumero(R.drawable.numero75);
    if(diElNumeroBoolean75){sounds.play(sonido75, volume, volume, 1, 0,1); diElNumeroBoolean75 = false;}
    		    break;
    case 76:   numero = createNumero(R.drawable.numero76);
    if(diElNumeroBoolean76){sounds.play(sonido76, volume, volume, 1, 0,1); diElNumeroBoolean76 = false;}
		  		    break;
    case 77:   numero = createNumero(R.drawable.numero77);
    if(diElNumeroBoolean77){sounds.play(sonido77, volume, volume, 1, 0,1); diElNumeroBoolean77 = false;}
    		    break;
    case 78:   numero = createNumero(R.drawable.numero78);
    if(diElNumeroBoolean78){sounds.play(sonido78, volume, volume, 1, 0,1); diElNumeroBoolean78 = false;}
	  		        break;
	  	case 79:    numero = createNumero(R.drawable.numero79);
  	if(diElNumeroBoolean79){sounds.play(sonido79, volume, volume, 1, 0,1); diElNumeroBoolean79 = false;}
             break;
  case 80:    numero = createNumero(R.drawable.numero80);
  if(diElNumeroBoolean80){sounds.play(sonido80, volume, volume, 1, 0,1); diElNumeroBoolean80 = false;}
             break;
  case 81:  	numero = createNumero(R.drawable.numero81);
  if(diElNumeroBoolean81){sounds.play(sonido81, volume, volume, 1, 0,1); diElNumeroBoolean81 = false;}
             break;
  case 82:    numero = createNumero(R.drawable.numero82);
  if(diElNumeroBoolean82){sounds.play(sonido82, volume, volume, 1, 0,1); diElNumeroBoolean82 = false;}
             break;
  case 83:    numero = createNumero(R.drawable.numero83);
  if(diElNumeroBoolean83){sounds.play(sonido83, volume, volume, 1, 0,1); diElNumeroBoolean83 = false;}
             break;
  case 84:    numero = createNumero(R.drawable.numero84);
  if(diElNumeroBoolean84){sounds.play(sonido84, volume, volume, 1, 0,1); diElNumeroBoolean84 = false;}
             break;
  case 85:    numero = createNumero(R.drawable.numero85);
  if(diElNumeroBoolean85){sounds.play(sonido85, volume, volume, 1, 0,1); diElNumeroBoolean85 = false;}
             break;
  case 86:    numero = createNumero(R.drawable.numero86);
  if(diElNumeroBoolean86){sounds.play(sonido86, volume, volume, 1, 0,1); diElNumeroBoolean86 = false;}
             break;
  case 87:    numero = createNumero(R.drawable.numero87);
  if(diElNumeroBoolean87){sounds.play(sonido87, volume, volume, 1, 0,1); diElNumeroBoolean87 = false;}
             break;
  case 88:   numero = createNumero(R.drawable.numero88);
  if(diElNumeroBoolean88){sounds.play(sonido88, volume, volume, 1, 0,1); diElNumeroBoolean88 = false;}
             break;
  case 89:   numero = createNumero(R.drawable.numero89);
  if(diElNumeroBoolean89){sounds.play(sonido89, volume, volume, 1, 0,1); diElNumeroBoolean89 = false;}
             break;
  case 90:   numero = createNumero(R.drawable.numero90);
  if(diElNumeroBoolean90){sounds.play(sonido90, volume, volume, 1, 0,1); diElNumeroBoolean90 = false;}
             break;
  case 91:   numero = createNumero(R.drawable.numero91);
  if(diElNumeroBoolean91){sounds.play(sonido91, volume, volume, 1, 0,1); diElNumeroBoolean91 = false;}
  		    break;
  case 92:   numero = createNumero(R.drawable.numero92);
  if(diElNumeroBoolean92){sounds.play(sonido92, volume, volume, 1, 0,1); diElNumeroBoolean92 = false;}
					break;
  case 93:   numero = createNumero(R.drawable.numero93);
  if(diElNumeroBoolean93){sounds.play(sonido93, volume, volume, 1, 0,1); diElNumeroBoolean93 = false;}
				    break;
  case 94:   numero = createNumero(R.drawable.numero94);
  if(diElNumeroBoolean94){sounds.play(sonido94, volume, volume, 1, 0,1); diElNumeroBoolean94 = false;}
		            break;
  case 95:   numero = createNumero(R.drawable.numero95);
  if(diElNumeroBoolean95){sounds.play(sonido95, volume, volume, 1, 0,1); diElNumeroBoolean95 = false;}
             break;
  case 96:   numero = createNumero(R.drawable.numero96);
  if(diElNumeroBoolean96){sounds.play(sonido96, volume, volume, 1, 0,1); diElNumeroBoolean96 = false;}
  		    break;
  case 97:   numero = createNumero(R.drawable.numero97);
  if(diElNumeroBoolean97){sounds.play(sonido97, volume, volume, 1, 0,1); diElNumeroBoolean97 = false;}
		            break;
  case 98:   numero = createNumero(R.drawable.numero98);
  if(diElNumeroBoolean98){sounds.play(sonido98, volume, volume, 1, 0,1); diElNumeroBoolean98 = false;}
             break;
  case 99:   numero = createNumero(R.drawable.numero99);
  if(diElNumeroBoolean99){sounds.play(sonido99, volume, volume, 1, 0,1); diElNumeroBoolean99 = false;}
             break;
  case 100:   numero = createNumero(R.drawable.numero100);
  if(diElNumeroBoolean100){sounds.play(sonido100, volume, volume, 1, 0,1); diElNumeroBoolean100 = false;
  	ardillaBoolean = false;
		ardillaBoolean2 = false;
		sonidoArdilla = false;
		//colisionArdilla = false;
		colisionArdilla2 = false;
		
		globos = true;
		//sounds.play(sonidofanfa, volume, volume, 1, 0,1); 
		//sounds.play(sonidoninos, volume, volume, 1, 0,1);
  }
  		    break;
	  		        
      default:   numero = createNumero(R.drawable.numero100);
      //if(diElNumeroBoolean){sounds.play(sonido0, volume, volume, 1, 0,1); diElNumeroBoolean = false;}
      
      			
      		    break;
		   
		 }
		   
		
	}

	
}



