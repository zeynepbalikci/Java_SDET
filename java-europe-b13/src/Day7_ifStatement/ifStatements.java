package Day7_ifStatement;

public class ifStatements {
  public static void main(String[] args) {

    int score = 80;

    if(score>=70) {

      System.out.println("Excellent");
      System.out.println("You passed with grade A");

    }
    int sales, bonus;
    double commisionRate,salary;
    sales = 5200;
    salary = 10000;
    if(sales>5000){
      bonus = 500;
      commisionRate = 1.12;
      salary = salary*commisionRate+bonus;

    }
    System.out.println("salary = " + salary);
    
    int x,y;
    y=20;
    if(y==20) {
      x = 5;
      System.out.println("x = " + x);
    }

    

  }
  
}
