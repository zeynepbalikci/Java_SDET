package Day14_;

public class Lab1_StringTimes {
    public static void main(String[] args) {

        stringTimes("Hi",3);

    }
    public static void stringTimes(String a,int number){
        String b = "";

        for (int i = 1; i <=number ; i++) {

            b = b + a;

        }
        System.out.println(b);


    }
}
