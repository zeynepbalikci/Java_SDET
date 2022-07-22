package Day8_controlFlowStatements;

public class smallTasks {
    public static void main(String[] args) {

    int x,y;
    x = 100;
        if (x > 100) {
            y = 20;
            System.out.println("y = " + y);
        }else {
            y = 0;
            System.out.println("y = " + y);
        }
        if(y == 100){
            x=1;
            System.out.println("x = " + x);
        }else {
            x = 0;
            System.out.println("x = " + x);
        }
        int a,b,c;
        a = 12;
        b = 2;
        c = 3;
        if(a<10){
            b = 0;
            c = 1;
        }else{
            b = -99;
            c = 0;
        }
        System.out.println("b = " + b);
        System.out.println("c = " + c);




    }
}
