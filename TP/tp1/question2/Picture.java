package question2;

import question1.Circle;
import question1.Square;
import question1.Triangle;

/**
 * This class represents a simple picture. You can draw the picture using the
 * draw method. But wait, there's more: being an electronic picture, it can be
 * changed. You can set it to black-and-white display and back to colors (only
 * after it's been drawn, of course).
 * 
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 1.1 (24 May 2001)
 */
public class Picture {
    private Square wall;
    private Square window;
    private Square earth;
    private Triangle roof;
    private Circle sun;
    private Circle sun2;
    private boolean laTerreEstFixe;
   /**
     * Constructor for objects of class Picture
     */
    public Picture() {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    
    public void draw() {
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();

        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("blue");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
        
        earth = new Square();
        earth.changeColor("green");
        earth.moveHorizontal(-70);
        earth.moveVertical(170);
        earth.changeSize(500);
        earth.makeVisible();
        
        sun2 = new Circle();
        sun2.changeColor("yellow");
        sun2.moveHorizontal(80);
        sun2.moveVertical(-30);
        sun2.changeSize(30);
        sun2.makeVisible();
    }
   
    /**
     * la terre est fixe => le soleil se couche.
     */
    public void TerreFixeSunset(){
        laTerreEstFixe=true;
    sun.slowMoveVertical(230);
    }
    
    public void TerreNonFixeSunset(){laTerreEstFixe=false;
    sun.slowMoveVertical(-85);
    }
    
    
//public void sunset(){

 //   if(laTerreEstFixe=true){
//sun.slowMoveVertical(230);
//
  //  }else{sun.slowMoveVertical(-10);}
//}
    
    
    
    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite() {
        if (wall != null) // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor() {
        if (wall != null) // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

    public static void main (String[] args){
    Picture p = new Picture();
    p.draw();
    //p.setBlackAndWhite();
    p.setColor();
    }
}
