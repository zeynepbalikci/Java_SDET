package Day5_unary_assignment_relational_Operators;

public class task_19 {

  public static void main(String[] args) {

    int a=50;
    int result = --a + a++ + a-- + a++;
     // result  = 49 + 49 + 50+ 49 = 197

    System.out.println("result = " + result);
    System.out.println("a = " + a );
  }
}
