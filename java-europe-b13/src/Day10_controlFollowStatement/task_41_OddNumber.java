package Day10_controlFollowStatement;

public class task_41_OddNumber {
  public static void main(String[] args) {

    for (int i = 5; i <=140 ; i+=2) {

      System.out.print(i+" ");
    }
    for (int i = 5; i <=140 ; i++) {
      if (i%2==1){
        System.out.print(i+" ");
      }

    }
  }
}
