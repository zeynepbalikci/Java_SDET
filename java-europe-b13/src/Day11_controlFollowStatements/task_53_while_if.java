package Day11_controlFollowStatements;

public class task_53_while_if {
  public static void main(String[] args) {

    int i=1;
    int sum=0;
    while (i<100){
      if (i%2==0){
        sum=sum+i;
      }
      i++;
    }
    System.out.println("sum = "+ sum);
  }
}
