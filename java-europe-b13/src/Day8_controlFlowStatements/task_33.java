package Day8_controlFlowStatements;

public class task_33 {
  public static void main(String[] args) {

    int marks;
    marks = 110;
    if (marks<60){
      System.out.println("Fail");
    }else if (marks>=60 && marks<90){
      System.out.println("Pass");
    } else if (marks>=90) {
      System.out.println("Passed with Distinction");
      
    }
  }
}
