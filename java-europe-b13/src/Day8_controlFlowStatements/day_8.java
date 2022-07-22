package Day8_controlFlowStatements;

public class day_8 {
  public static void main(String[] args) {

    int x;
    x=11;
    if (x%2==0){
      System.out.println( x +": even number");
    }else{
      System.out.println( x +": odd number");
    }
    int a,b,c;
    int triangle;
    a =60;
    b = 40;
    c = 80;
    triangle = a+b+c;
    if (triangle==180){
      System.out.println("this is a valid triangle");
    }else{
      System.out.println("this is not a valid triangle");
    }
    int number1,number2,number3;
    number1 = 90;
    number2 = 8;
    number3 = 11;
    if (number1<number2 && number3<number2){
      System.out.println(number2);
    }else if (number2<number1 && number3<number1){
      System.out.println(number1);
    }else {
      System.out.println(number3);
    }

  }
}
