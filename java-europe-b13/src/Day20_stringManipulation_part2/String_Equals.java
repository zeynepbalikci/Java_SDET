package Day20_stringManipulation_part2;

public class String_Equals {
  public static void main(String[] args) {

    String str1 = "Apple";
    String str2 = new String("Apple");

    System.out.println(str1==str2);  // false
    System.out.println(str1.equals(str2));  //true
  }
}
