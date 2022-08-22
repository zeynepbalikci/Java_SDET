package Day19_stringManipulation_part1;

import java.util.Scanner;

public class String_Length {
  public static void main(String[] args) {

    Scanner scr = new Scanner(System.in);
    System.out.print("Enter your first name: ");
    String firstname = scr.nextLine();
    System.out.print("enter your last name: ");
    String lastname = scr.nextLine();

    System.out.println("Total characters in your first and last name: " +(firstname.length()+lastname.length()));
  }
}
