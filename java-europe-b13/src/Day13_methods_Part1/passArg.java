package Day13_methods_Part1;

public class passArg {
  public static void main(String[] args) {

    displayValue( 7 );
    int x = 10;
    displayValue(x);

  }
  public static void displayValue (int num) {

    System.out.println(" The value is " + num*2 );

  }
}
