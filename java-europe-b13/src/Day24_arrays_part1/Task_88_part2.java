package Day24_arrays_part1;

import java.util.Random;
import java.util.Scanner;

public class Task_88_part2 {
  public static void main(String[] args) {

    String[] car = new String[7];
    car[0] = "Honda";
    car[1] = "Toyota";
    car[2] = "Nissan";
    car[3] = "BMW";
    car[4] = "Mercedes";
    car[5] = "Porsche";
    car[6] = "Ferrari";

    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of your dream car");
    int number = sc.nextInt();

    Random rn = new Random();

    int price = 0;
    String selectedCar = car[number];

    switch (selectedCar){
      case "Honda": case "Toyota": case "Nissan":
        price = rn.nextInt(40000-20000+1)+20000;
        break;
      case "BMW": case "Mercedes":
        price = rn.nextInt(80000-50000+1)+50000;
        break;
      case "Porsche": case "Ferrari":
        price = rn.nextInt(150000-100000+1)+100000;
        break;
      default:
        System.out.println("invalid car");
    }
    System.out.println("Price for selected car is " + price);





  }
}
