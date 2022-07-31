package Day13_methods_Part1;

public class task_61 {
    public static void main(String[] args) {

        calculateAge(2022,1986);

    }
    public static void calculateAge (int currentTear,int birthyear ){

        int age = currentTear-birthyear;

        System.out.println("calculateAge"+"("+birthyear+")"+" --> "+ age);

    }
}
