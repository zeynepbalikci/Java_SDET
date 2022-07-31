package Day13_methods_Part1;

public class task_62 {
    public static void main(String[] args) {

        calculateGreatest(7,9,4);

    }
    public static void calculateGreatest(int num1,int num2,int num3){

        if (num1<num2 && num3<num2){
            System.out.println("the greatest number = "+ num2);
        }else if(num1<num3 && num2<num3){
            System.out.println("the greatest number = "+ num3);
        }else if(num2<num1 && num3<num1){
            System.out.println("the greatest number = "+ num1);

        }else {
            System.out.println("numbers are not different ");
        }


    }
}
