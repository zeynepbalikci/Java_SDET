package Day5_unary_assignment_relational_Operators;

public class reationalOperators {
  public static void main(String[] args) {

    byte b1 = 1;
    byte b2 = 2;
    double d1 = 3.5;
    int i1 = 17;
    float f1 = (float)67.0;

    boolean test1 = b1<b2;
    System.out.println(test1);

    boolean test2 = b1>b2;
    System.out.println(test2);

    boolean test3 =(d1!=b1);
    System.out.println(test3);

    boolean test4 = (i1*d1)>=(f1-42);
    System.out.println(test4);







  }
}
