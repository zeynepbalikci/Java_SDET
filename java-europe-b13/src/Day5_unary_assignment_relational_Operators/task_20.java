package Day5_unary_assignment_relational_Operators;

public class task_20 {

  public static void main(String[] args) {

    int a = 1;
    a = -a-- + a++ / -a-- * --a;
    System.out.println("a = " + a);
  }
}
