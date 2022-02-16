package com.gameplanet2000.com;

import android.graphics.Bitmap;
import android.graphics.Canvas;

 
public class Rompe {
      
       private GameView gameView;
       private Bitmap bmp;
       public int x = 0;
       public int y = 0;
       private int width;
       private int height;
       boolean tocar = false;
       boolean inPlace = false;
       private int value;
 
       public Rompe(GameView gameView, Bitmap bmp) {
             this.width = bmp.getWidth(); 
             this.height = bmp.getHeight();
             this.gameView = gameView;
             this.bmp = bmp;
             
           
             x = (gameView.getWidth() - width);
             y = (gameView.getHeight() - height);
            
       }
 
      
       
       public boolean isCollition(int x2, int y2) { 
           return x2 + 5 > x  && x2 < x + width - 5  && y2 + 5 > y  && y2 < y + height - 5; 
     } 
      
       
       public int getWidth(){
    	   return width;
       }
       
       public int getHeight(){
    	   return height;
       }
       
       public int getValue()
       {
    	   return value;
       }
       
       public void setValue(int a)
       {
    	   value = a;
       }
       
       public boolean getInPlace()
       {
    	   return inPlace;
       }
       
       public void setInPlace(boolean a)
       {
    	   inPlace = a;
       }
       
       
       
       public void setX(int x){
    	   this.x = x;
    	   if(this.x > (gameView.getWidth() - width))
    	   {
    		   this.x = gameView.getWidth() - width;
    	   }
    	   else if(this.x < 0)
    	   {
    		   this.x = 0;
    	   }
       }  
       
       public int getX(){
    	   return x;
       }
       
       public void setY(int y){
    	   this.y = y;
    	   if(this.y > (gameView.getHeight() - height))
    	   {
    		   this.y = (gameView.getHeight() - height);
    	   }
    	   else if(this.y < 0)
    	   {
    		   this.y = 0;
    	   }
       }
       
       public int getY(){
    	   return y;
       }
 
 
       public void onDraw(Canvas canvas) {
             canvas.drawBitmap(bmp, x , y , null);
       }
 
      
}




