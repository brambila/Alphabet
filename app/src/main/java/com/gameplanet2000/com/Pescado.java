package com.gameplanet2000.com;

import java.util.Random;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;



public class Pescado {
   
  
  
    private GameView gameView;
    private int width;
    private int height;
    private Bitmap bmp;
    private int BMP_ROWS = 3;
    private int BMP_COLUMNS = 3;
    private int currentFrame = 0;
    private int frames = 2;

    public int direction = 0;
    
    private int x; 
    private int y;
    public boolean remove = false;
    private Thread currentThread;

    private int xSpeed;
    private int ySpeed;
    private static final int MAX_SPEED = 3;
    

    public Pescado(GameView gameView, Bitmap bmp) {
 	   
 	      this.width = bmp.getWidth() / BMP_COLUMNS;
 	      this.height = bmp.getHeight() / BMP_ROWS;
          this.gameView = gameView;
          this.bmp = bmp;
          
          Random rnd = new Random();
          //x = rnd.nextInt(gameView.getWidth() - width);
          //y = rnd.nextInt(gameView.getHeight() - height);
          xSpeed = rnd.nextInt(MAX_SPEED * 2) + 1; //- MAX_SPEED;
          ySpeed = rnd.nextInt(MAX_SPEED * 2) + 1; //- MAX_SPEED;
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
    
    public void setFrames(int a)
    {
    	frames = a;
    }
    public void setDirection(int a)
    {
    	direction = a;
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
 	   if (x >= gameView.getWidth() - width - xSpeed) {
 		  direction = 1;
         
 	   }
 	   
 	   if (x + xSpeed <= 0) {
		  direction = 0;
        
	   }
 	   if (x >= gameView.getWidth() - width - xSpeed || x + xSpeed <= 0) {
          xSpeed = -xSpeed;
         
 	   }
 	   
 	   
 	   x = x + xSpeed;
 	   
 	   if (y >= gameView.getHeight() - height - ySpeed || y + ySpeed <= 0) {
          ySpeed = -ySpeed;
          
 	   }
 	   y = y + ySpeed;
    	}

    public void onDraw(Canvas canvas) {
 	
         update();
        // direction = 0;   //Cero es la primera ilera, uno la segunda, dos la tercera, etc...
         
         int srcX = currentFrame * width;
         int srcY =  direction * height; // direccion e multiplica por la altura de la ilera
         
         Rect src = new Rect(srcX, srcY, srcX + width , srcY + height );
         
         Rect dst = new Rect(x, y, x + width, y + height);
         
     
         
        if(!remove){
        canvas.drawBitmap(bmp, src, dst, null);
        }
       }

   
}



