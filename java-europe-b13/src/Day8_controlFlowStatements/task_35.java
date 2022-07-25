package Day8_controlFlowStatements;

public class task_35 {
  public static void main(String[] args) {
    int n1 = 100;
    int n2 = 400;
    int n3 = 300;
    if (n1>n2 && n1>n3){
      System.out.println("n1 is biggest");
    } else if (n2>n3) {
      System.out.println("n2 is biggest");
    }else {
      System.out.println("n3 is biggest");
    }

  }
}
