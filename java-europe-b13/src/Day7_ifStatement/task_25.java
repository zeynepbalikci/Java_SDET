package Day7_ifStatement;

public class task_25 {
  public static void main(String[] args) {

    int a,b,c;
    a=11;
    b=30;
    c=25;
    if (a<b && c<b) {
      System.out.println("max = " + b);
    }
    if (b<a && c<a){
      System.out.println("max = " + a);
    }
    if (a<c && b<c){
      System.out.println("max = " + c);
    }
  }
}
