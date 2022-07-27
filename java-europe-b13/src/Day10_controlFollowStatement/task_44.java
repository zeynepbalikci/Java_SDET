package Day10_controlFollowStatement;

public class task_44 {
  public static void main(String[] args) {
    System.out.println("KPH            MPH");
    System.out.println("------------------");

    for (int i = 60; i <=130 ; i+=10) {

      System.out.println( i + "\t\t\t\t\t\t" + ( i * 0.6214 ));
    }

  }
}
