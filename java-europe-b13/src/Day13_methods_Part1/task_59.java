package Day13_methods_Part1;

public class task_59 {
    public static void main(String[] args) {

        pricing( 5,40);
        pricing(6.5,45);

    }
    public static void pricing (double hour,double hourly){

        double total = hour*hourly;
        System.out.println("total = " + total);
    }
}
