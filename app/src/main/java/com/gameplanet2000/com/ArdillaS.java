package com.gameplanet2000.com;

import java.util.Random;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;

public class ArdillaS {
	   
	  
	  
    private GameView gameView;
    private int width;
    private int height;
    private Bitmap bmp;
    private int BMP_ROWS = 1; //para abajo
    private int BMP_COLUMNS = 6; //de lado
    private int currentFrame = 0;
    private int frames = 5;
   

    public int direction = 0;
    
    private int xSpeed;
    private int ySpeed;
    private static final int MAX_SPEED = 5;
    private int x; 
    private int y;
    public boolean remove = false;
    private Thread currentThread;
    private int ardillaCounter = 0;

    
    

    public ArdillaS(GameView gameView, Bitmap bmp) {
 	   
 	     this.width = bmp.getWidth() / BMP_COLUMNS;
 	     this.height = bmp.getHeight() / BMP_ROWS;
          this.gameView = gameView;
          this.bmp = bmp;
          
          Random rnd = new Random();
          x = gameView.getWidth() - (int)(width * 1.5);
          y = gameView.getHeight() - (int)(height * 2);
          //x = rnd.nextInt(gameView.getWidth() - width);
          //y = rnd.nextInt(gameView.getHeight() - height);
          xSpeed = 7; //rnd.nextInt(MAX_SPEED * 2) + 3; //- MAX_SPEED;
          //ySpeed = rnd.nextInt(MAX_SPEED); //- MAX_SPEED;
          
          
    }
    
    public void setRows(int a)
    {
    	BMP_ROWS = a;
    }
    
    public void setColumns(int a)
    {
    	BMP_COLUMNS = a;
    }
   
    public void setX(int a)
    {
    	x = a;
    }
    
    public int getX()
    {
    	return x;
    }
    
    public void setY(int a)
    {
    	y = a;
    }
    
    public int getY()
    {
    	return y;
    }
    
    public int getWidth()
    {
    	return width;
    }
    
    public int getHeight()
    {
    	return height;
    }
    public void setArdillaCounter(int a)
    {
    	ardillaCounter = a;
    }
    public int getArdillaCounter()
    {
    	return ardillaCounter;
    }
    
    public void setFrames(int a)
    {
    	frames = a;
    }
    
    public boolean isRemove()
    {
    	return remove;
    }
    
    private void update() {
 	  
 	   if(currentFrame >= frames)
 	   {
 		   currentFrame = 0;
 		 /*  direction +=1;
 		   
 		   if(direction >= 7)
 		   {
 			   direction = 0;
 		   }*/
 		  
 		   //remove = true;
 	   }
 	   
 	   else {
 		   currentFrame = ++currentFrame % BMP_COLUMNS;
 		   }
 	   
 	  if (x - (width) <= 0 ) {
 		  //remove = true;
          x = gameView.getWidth() - (int)(width * 1.5);
          ardillaCounter +=1;
          /*if(ardillaCounter == 3)
          {
        	  ardillaCounter = 0;
          }*/
 	   }
 	   
 	   
 	   x = x - xSpeed;
 	   
 	   
    }
    
    public boolean isCollition(int x2, int y2) { 
        return x2 + 5 > x  && x2 < x + width - 5  && y2 + 5 > y  && y2 < y + height - 5; 
  } 
    

    public void onDraw(Canvas canvas) {
 	
         update();
         
         direction = 0;   //Cero es la primera ilera, uno la segunda, dos la tercera, etc...
         
         int srcX = currentFrame * width;
         int srcY =  direction * height; // direccion e multiplica por la altura de la ilera
         
         Rect src = new Rect(srcX, srcY, srcX + width , srcY + height );
         
         Rect dst = new Rect(x, y, x + width, y + height);
         
     
        
        if(!remove){
        canvas.drawBitmap(bmp, src, dst, null);
        }
       }

   
}



