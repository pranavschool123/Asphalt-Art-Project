import org.code.neighborhood.*;

/**
* The MuralPainter class extends PainterPlus and provides the methods to
* paint a mural.
*/
public class MuralPainter extends PainterPlus {

/**
  * Paints the background for the Stanford S
  */
  public void paintBackground(String color, int size) {
    while (canMove()) {
      paintLine(color, size);
      nextRow();
      }
  }

  /**
  * Moves to the next row
  */
 public void nextRow() {
    if(canMove("South")) {
      if(isFacingEast()) {
        turnRight();
        move();
        turnRight();
      }
      else {
        turnLeft();
        move();
        turnLeft();
      }
    }
  }
  
  /**
  * Paints a line for the amount of spaces given
  */
  public void paintLine(String color, int spaces) {
    setPaint(spaces);

    while (hasPaint()) {
      paint(color);

      if (canMove()) {
        move();
      }
    }   
  }

  /**
  * Turns the object to the west side
  */
  public void turnToWest() {
    if (isFacingEast()) {
      turnRight();
      move();
      turnRight();
    }
  }

/**
  * Turns the object to the East
  */
  public void turnToEast() {
    if (isFacingWest()) {
      turnLeft();
      move();
      turnLeft();
    }
  }

/**
  * Turns the object around 180 degrees
  */
  public void turnAround() {
    turnLeft();
    turnLeft();
  }

/**
  * Resets the position of the object back to its original one
  */
  public void resetPosition() {
    if (isFacingEast()) {
      turnLeft();

      while(canMove()) {
        move();
      }

      turnLeft();

      while (canMove()) {
        move();
      }

      turnAround();
     }
   }


  /**
  * Moves the object to the corner of the 16x16 square
  */
  public void moveToCorner() {
    while (canMove()) {
      move();
    }

    turnRight();

    while(canMove()) {
      move();
    }
  }


  }
  