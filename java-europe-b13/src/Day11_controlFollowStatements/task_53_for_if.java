package Day11_controlFollowStatements;

public class task_53_for_if {
  public static void main(String[] args) {
    int i ;
    int sum=0;
    for ( i = 0 ; i <100; i++) {

      if (i % 2 == 0) {
        sum=sum+i;
      }
    }
    System.out.println("sum = "+ sum);


  }
}
