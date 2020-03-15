import TurtleGraphics.*;
public class TestPens
{
  public static void main (String [] args) {
      //declare three variables of interface type pen
      Pen p1, p2, p3;
      //instantiate three diff types of pens and asscoiate them with 
      //pen variables
      p1 = new StandardPen();
      p2 = new WigglePen();
      p3 = new RainbowPen();
      //draw square 
      drawSquare(p1);
      drawSquare(p2);
      drawSquare(p3);
     
    }
   
  static private void drawSquare(Pen p){
      //draw a square with any pen 
        for (int i = 1; i <= 4; i++){
            p.move(50);
            p.turn(90);
        }
    }
}

