import org.code.neighborhood.*;

/**
  * The StanfordPainter class is responsible for painting the S design on the
  * mural using the methods that were inherited from the MuralPainter class
  */
public class StanfordPainter extends MuralPainter {


  /**
  * Paints the Stanford logo
  */
  public void paintStanford(String mainColor) {
    startProgram();
      paintProgram(mainColor);


  }

  /**
  * Begins the program that will paint
  * the background
  */
  public void startProgram() {
  }

  /**
  * Begins painting the program which paints
  * the red S and the green tree
  */
  public void paintProgram(String color) {
    
    paintLine(color, 15);
    turnRight();
    paintLine(color, 16);
    turnRight();
    paintLine(color, 16);
    turnRight();
    paintLine(color, 16);
    resetPosition();
    moveToCorner();
    moveToCorner();
    moveToCorner();
    
    
  }

  
}