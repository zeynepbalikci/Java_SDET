package Day18_readingUserInput;

import java.util.Scanner;

public class ChangeMaker {
  public static void main(String[] args) {

    Scanner number = new Scanner(System.in);
    System.out.println("Bir sayi giriniz:");
    int cent = number.nextInt();

    if(cent>1 && cent<100) {
      ChangerMaker(cent);
    }else {
      System.out.println("Invalid Data");
    }

  }
  public static void ChangerMaker(int cent){

    int quarter= cent/25;
    cent%=25;
    int dimes= cent/10;
    cent%=10;
    int nickles= cent/5;
    cent%=5;
    int pennies= cent;

    System.out.println(quarter+" quarter, "+dimes+ " dimes, "+nickles+" nickles, "+ pennies+ " pennies");

  }
}
