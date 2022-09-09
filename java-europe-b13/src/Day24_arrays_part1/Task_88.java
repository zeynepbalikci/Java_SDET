package Day24_arrays_part1;

import java.util.Random;
import java.util.Scanner;

public class Task_88 {
  public static void main(String[] args) {

    String[] cars = new String[7];
    cars[0] = "Honda";
    cars[1] = "Toyota";
    cars[2] = "Nissan";
    cars[3] = "BMW";
    cars[4] = "Mercedes";
    cars[5] = "Porsche";
    cars[6] = "Ferrari";

    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of your dream car");
    int number = sc.nextInt();

    Random rn = new Random();

    if (cars[number]=="Honda"||cars[number]=="Toyota"||cars[number]=="Nissan"){

      System.out.println(rn.nextInt(20001)+20000);
    }else if (cars[number]=="BMW"||cars[number]=="Mercedes"){

      System.out.println(rn.nextInt(30001)+50000);
    }else if (cars[number]=="Ferrari"||cars[number]=="Porsche"){
      System.out.println(rn.nextInt(50001)+100000);
    }else {
      System.out.println("invalid car");
    }


  }
}
