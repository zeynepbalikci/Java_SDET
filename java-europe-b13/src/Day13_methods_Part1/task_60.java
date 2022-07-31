package Day13_methods_Part1;

public class task_60 {

    public static void main(String[] args) {

        calculator(5,6,"*");
        calculator(8,9,"+");
        calculator(39,23,"-");
        calculator(90,3,"/");
    }
    public static void calculator (int num1,int num2,String operator){

        switch (operator){
            case"*":
                System.out.println(num1*num2);
                break;
            case "/":
                System.out.println(num1/num2);
                break;
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            default:
                System.out.println("Invalid operator");
        }


    }
}
