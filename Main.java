import java.util.*;

class Main {
  public static void main(String[] args) {
    Point console = new Point(2.0, 5.0); //Intialize

    System.out.println("________________________________");
    //Original Point
    System.out.println("Original Point: " + console.original());
    
    //Distance Formula
    System.out.println("\nDistance: " + console.distance(5, 5));

    //Translation
    String[] directions = {"up", "right"};
    double[] pos = {2, 3};
    System.out.println("\nTranslation: " + console.translate(directions, pos));

    //Reflection
    System.out.println("\nReflection: " + console.reflection("x"));

    //Quadrants
    System.out.println("\nQuadrants: " + console.quadrants(4,-3));



  }
}