package com.gameplanet2000.com;

import android.graphics.Bitmap;

public class Figura extends Flecha{

     public Figura(GameView gameView, Bitmap bmp)
     {	
    	 super(gameView, bmp);
    	 x = ((gameView.getWidth() - getWidth()) / 2);
         y = ((gameView.getHeight() - getHeight()) / 2);
         
//Aqui estaba nada mas width y height en lugar de getWidht() y getHeight() 
//por si hay algun problem a despues    	 
    	 
     }
     
     
}
