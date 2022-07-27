package Day10_controlFollowStatement;

public class task_40_EvenNumber {
  public static void main(String[] args) {

    for (int i = 0; i <= 100 ; i+=2) {
      System.out.print(i+" ");
      
    }
    for (int i = 0; i <=100 ; i++) {
      if (i%2==0){
        System.out.print(i+" ");
      }

    }
  }
}
