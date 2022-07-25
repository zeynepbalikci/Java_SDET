package Day8_controlFlowStatements;

public class task_36 {
  public static void main(String[] args) {

    double num1 = 1500;
    int num2 = 10;
    String operator ="sq";
    double result = 0;

    switch (operator){
      case "+":
        result = num1+num2;
        break;
      case "-":
        result = num1-num2;
        break;
      case "*":
        result = num1*num2;
        break;
      case "/":
        result = num1/num2;
        break;
      case "sin":
        result = Math.sin(num1);
        break;
      case "cos":
        result = Math.cos(num1);
        break;
      case "tan":
        result = Math.tan(num1);
        break;
      case "sq":
        result = Math.sqrt(num1);
        break;
    }
    System.out.println("result = " + result);
  }

}
