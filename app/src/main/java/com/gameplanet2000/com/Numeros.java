package com.gameplanet2000.com;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.media.AudioManager;
import android.media.SoundPool;

 
public class Numeros {
    
    private GameView gameView;
    private Bitmap bmp;
    public int x = 0;
    public int y = 0;
    private int width;
    private int height;

    public Numeros(GameView gameView, Bitmap bmp) {
          this.width = bmp.getWidth(); 
          this.height = bmp.getHeight();
          this.gameView = gameView;
          this.bmp = bmp;
          
        
          x = (gameView.getWidth() - width) ;
          y = (gameView.getHeight() - height) / 2;
         
    }

   
    
    public boolean isCollition(int x2, int y2) { 
        return x2 + 5 > x  && x2 < x + width - 5  && y2 + 5 > y  && y2 < y + height - 5; 
  } 
    
    public void setX(int x){
 	   this.x = x;
    }
    
    public int getX(){
 	   return x;
    }
    
    public void setY(int y){
 	   this.y = y;
    }
    
    public int getY(){
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
    


    public void onDraw(Canvas canvas) {
          canvas.drawBitmap(bmp, x , y , null);
    }

   
}




