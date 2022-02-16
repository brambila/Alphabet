package com.gameplanet2000.com;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;



public class Estrella {
   
  
  
    private GameView gameView;
    private int width;
    private int height;
    private Bitmap bmp;
    private int BMP_ROWS = 2; //para abajo
    private int BMP_COLUMNS = 3; //de lado
    private int currentFrame = 0;
    private int frames = 5;

    public int direction = 0;
    
    private int x; 
    private int y;
    public boolean remove = false;
    private Thread currentThread;

    
    

    public Estrella(GameView gameView, Bitmap bmp) {
 	   
 	     this.width = bmp.getWidth() / BMP_COLUMNS;
 	     this.height = bmp.getHeight() / BMP_ROWS;
          this.gameView = gameView;
          this.bmp = bmp;
          
          
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

