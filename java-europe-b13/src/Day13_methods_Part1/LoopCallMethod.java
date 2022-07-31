package Day13_methods_Part1;

import static Day13_methods_Part1.SimpleMethod.displayMessage;

public class LoopCallMethod {
  public static void main(String[] args) {

    System.out.println("hello from the main method");
    for (int i = 0; i < 5; i++) {
      displayMessage();
      System.out.println("back in the main method");
      
    }
  }
}
