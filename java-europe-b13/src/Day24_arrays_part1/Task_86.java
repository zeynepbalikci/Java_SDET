package Day24_arrays_part1;

import java.util.Scanner;

public class Task_86 {
  public static void main(String[] args) {

    String[] MonthName = new String[12];

    MonthName[0] = "January";
    MonthName[1] = "February";
    MonthName[2] = "March";
    MonthName[3] = "April";
    MonthName[4] = "May";
    MonthName[5] = "June";
    MonthName[6] = "July";
    MonthName[7] = "August";
    MonthName[8] = "September";
    MonthName[9] = "October";
    MonthName[10] = "November";
    MonthName[11] = "December";


    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your month index number");
    int month = sc.nextInt();
    System.out.println("The month name is : "+ MonthName[month]);








  }
}
