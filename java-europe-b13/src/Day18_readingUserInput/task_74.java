package Day18_readingUserInput;

import java.util.Scanner;

public class task_74 {
    public static void main(String[] args) {
        int total=0;
        int num;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Herhangi bir sayı giriniz.");
            num = sc.nextInt();
            if (num<0) {
                break;
            }else{
                total+=num;
            }

        }while (true);

        System.out.println("total= "+ total);

    }
}
