package Day10_controlFollowStatement;

public class task_45 {
  public static void main(String[] args) {

    int num1 = 10;
    int num2 = 60;
    int repeat = 3;

    for (int i = 1; i <= repeat; i++) {

      if (num1>num2){
        System.out.println("Number1 is greater than Num2");
      } else if (num1 <num2) {
        System.out.println("Number2 is greater than Num1");
      } else if (num1==num2) {
        System.out.println("Num1 is equal Num2");

      }
    }
  }
}
