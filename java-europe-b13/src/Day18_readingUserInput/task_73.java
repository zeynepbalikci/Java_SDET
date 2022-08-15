package Day18_readingUserInput;

import java.util.Scanner;

public class task_73 {
  public static void main(String[] args) {

    int num1= 19;
    int num;

    Scanner sc = new Scanner(System.in);


    do {
      System.out.println("1-20 arasinda bir sayi giriniz.");
       num = sc.nextInt();

       if (num==num1){
          System.out.println("Congrat,you got it");
        } else if (num<num1) {
          System.out.println("too small");
        }else{
          System.out.println("too lange");
        }

    }while (num!=num1);
  }
}
