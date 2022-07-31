package Day13_methods_Part1;

public class task_58 {
  public static void main(String[] args) {
    bigSmall ();
  }
  public static void bigSmall () {

    int num1=10;
    int num2=10;

    if (num1<num2){
      System.out.println("the bigger number = " + num2);
    }else if (num2<num1){
      System.out.println("the bigger number = " + num1);
    }else {
      System.out.println("numbers are equal");
    }

  }
}
