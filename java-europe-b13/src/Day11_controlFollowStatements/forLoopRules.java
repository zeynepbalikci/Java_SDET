package Day11_controlFollowStatements;

public class forLoopRules {
    public static void main(String[] args) {

        // Adding multiple terms to the for statement.

        int x=0;
        for (long y=0,z=4 ;x<5 && y<10 ; x++,y++){
            System.out.print(y + " ");
        }
        System.out.println(x);

        // Redeclaring a varaible in the init block.


        long y = 0;
        for (y=1,x=4; x<5 && y<10; y++,x++) {
            System.out.println("Hello");
        }


    }
}
