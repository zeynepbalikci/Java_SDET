package Day8_controlFlowStatements;

public class task_34 {
  public static void main(String[] args) {

    int math,physics,filozofi;
    double average;
    math = 100;
    physics = 80;
    filozofi = 90;
    average = (math+physics+filozofi)/3;
    System.out.println("average = " + average);
    if (average>=0 && average<=59){
      System.out.println("Grade is : F");
    } else if (average>=60 && average<=69) {
      System.out.println("Grade is : D");
    } else if (average>=70 && average<=79) {
      System.out.println("Grade is : C");
    } else if (average>=80 && average<=89) {
      System.out.println("Grade is : B");
    } else if (average>=90 && average<=100) {
      System.out.println("Grade is : A");
      
    }
  }
}
