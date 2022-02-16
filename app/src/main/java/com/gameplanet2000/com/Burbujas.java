package com.gameplanet2000.com;

import java.util.Random;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
 
public class Burbujas {
       // direction = 0 up, 1 left, 2 down, 3 right,
       // animation = 3 back, 1 left, 0 front, 2 right
       int[] DIRECTION_TO_ANIMATION_MAP = { 3, 1, 0, 2 };
       private static final int BMP_ROWS = 1;
       private static final int BMP_COLUMNS = 1;
       private static final int MAX_SPEED = 3;
       private GameView gameView;
       private Bitmap bmp;
       public int x = 0;
       public int y = 0;
       int xSpeed;
       int ySpeed;
       private int currentFrame = 0;
       private int width;
       private int height;
       private boolean direccion;
 
       public Burbujas(GameView gameView, Bitmap bmp) {
             this.width = bmp.getWidth(); 
             this.height = bmp.getHeight();
             this.gameView = gameView;
             this.bmp = bmp;
 
             Random rnd = new Random();
             x = rnd.nextInt(gameView.getWidth() - width);
             y = rnd.nextInt(gameView.getHeight() - height);
             xSpeed = rnd.nextInt(MAX_SPEED * 3) - MAX_SPEED;
             ySpeed = rnd.nextInt(MAX_SPEED * 3) - MAX_SPEED;
       }
 
       private void update() {
             if (x >= gameView.getWidth() - width - xSpeed || x + xSpeed <= 0) {
                    xSpeed = -xSpeed;
                    ////////////////////////////
                    if(xSpeed < 0)
                    {
                    	direccion = false;
                    }
                    else{ direccion = true;}
                    ////////////////////////////
             }
            
             x = x + xSpeed;
             
             if (y >= gameView.getHeight() - height - ySpeed || y + ySpeed <= 0) {
                    ySpeed = -ySpeed;
             }
             y = y + ySpeed;
             
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
 
       public void setDireccion(boolean dire){
    	   direccion = dire;
       }
       
       public boolean getDireccion(){
    	   return direccion;
       }
 
       public void onDraw(Canvas canvas) {
             update();
             canvas.drawBitmap(bmp, x , y , null);
       }
 
      
}



