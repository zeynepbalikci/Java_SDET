package Day22_stringManipulation_Lab;

public class Question8 {
  public static void main(String[] args) {

    System.out.println(left2("Hello"));
    System.out.println(left2("java"));
    System.out.println(left2("Hi"));

  }
  public static String left2(String str){

    if (str.length()>=2){

      return str.substring(2).concat(str.substring(0,2));
    }else {

      return "invalid String";
    }
  }
}
