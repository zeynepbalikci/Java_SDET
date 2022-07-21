package Day6_logicalOperators;

public class operatorsPrecedence {
  public static void main(String[] args) {

    int a1 = 20;
    int a2 = 30;
    int a3 = 30;
    boolean comp = a1<a2 || a2<=a3;
    System.out.println(comp);
    
    int b = 2;
    boolean res = ++b == 2 || --b == 2 && --b == 2 ; // F || T && F = F
    System.out.println("res = " + res);

  }
}
