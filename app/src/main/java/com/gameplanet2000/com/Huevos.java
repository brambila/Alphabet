package com.gameplanet2000.com;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
 
public class Huevos {
      
	public static final int NO_TILE = 0;
	public static final int WALL_TILE = 1;
	
	private Bitmap bmpWall;
	
	int x =0;
	int y =0;
	
	public int startTileX;
	public int startTileY;
	
	private int width;
    private int height;
	
	public int endTileY;
	public int endTileX;
	
	public int tileMap[][];
	
	int viewX = 0;
	int viewY = 0;
 
       public Huevos(GameView gameView, Bitmap bmp) {
            
    	   
    	   //calculate which tile to start at
    	    
    	   
    	    this.bmpWall = bmp;
    	    
    	    this.width = bmp.getWidth();
    	    this.height = bmp.getHeight();
    	    
    	    startTileX = 0;
    	    startTileY = 0;
    	    
    	    endTileX = gameView.getWidth() / width;
    	    endTileY = gameView.getHeight() / height;
    	    
    	    tileMap = new int[endTileY ][endTileX]; 
             }
      
 
       private void update() {
    	   
    	   for(int tileY = 0; tileY < endTileY; tileY++){
    		   
    		   tileMap[tileY][0] = NO_TILE;
    		   tileMap[tileY][endTileX - 1] = NO_TILE;
    		   
    // Set the array elements down the left and right sides of the world
    		   
    	  }
    	   
    	   for(int tileX = 0; tileX < endTileX; tileX++){
    		   
    		   tileMap[0][tileX] = NO_TILE;
    		   tileMap[endTileY - 1][tileX] = NO_TILE;
    		   tileMap[endTileY - 2][tileX] = NO_TILE;
    		   
    		   
    // Set the array elements across the top and bottom
    		   
    	   }
            
       }
       
      
 
 
       public void onDraw(Canvas canvas) {
            // update();
             
             int tileType = 0;
             
             for(int tileY = startTileY; tileY < endTileY; tileY++){
            	 
            	 for(int tileX = startTileX; tileX < endTileX; tileX++){
            		 
            		 tileType = tileMap[tileY][tileX];
            		 
            		 switch(tileType)
            		 
            		 {
            		 	case NO_TILE: continue;
            		 	
            		 	case WALL_TILE: canvas.drawBitmap(bmpWall, tileX * width, tileY * height, null);
            		 		            break;
            		 }
            		 
            	 }
            
             
             
             }
       }
 
      
}




