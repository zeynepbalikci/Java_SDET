package Day18_readingUserInput;

import java.util.Scanner;

public class Task_72 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    /*System.out.println("Bir sayi giriniz.");
    int num1 = sc.nextInt();


    System.out.println("Bir sayi giriniz.");
    int num2 = sc.nextInt();


    System.out.println("Bir sayi giriniz.");
    int num3 = sc.nextInt();*/
    //int total = num1+num2+num3;
    int total=0;

    for (int i = 0; i < 3; i++) {

      System.out.println("Bir sayi giriniz.");
      int num = sc.nextInt();

      total+=num;

    }
    System.out.println("total= "+ total);


  }
}
