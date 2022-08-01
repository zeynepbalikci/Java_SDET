package Day14_;

public class Lab2_love6 {
    public static void main(String[] args) {

        love6(9,-3);
        love6(1,5);
        love6(11,2);
        love6(6,8);

    }
    public static void love6 (int num1,int num2){
        boolean yes = true;

        if (num1 == 6 || num2==6 || num1+num2==6 || num1-num2==6 || num2-num1==6) {

            yes=true;

        }else{
            yes=false;
        }
        System.out.println(yes);



    }
}
