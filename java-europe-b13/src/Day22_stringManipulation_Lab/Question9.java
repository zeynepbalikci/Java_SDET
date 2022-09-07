package Day22_stringManipulation_Lab;

public class Question9 {
  public static void main(String[] args) {
    System.out.println(right2("Hello"));
    System.out.println(right2("java"));
    System.out.println(right2("Hi"));
    System.out.println(right2("x"));

  }
  public static String right2(String str){

    if (str.length()>=2){
      return str.substring(str.length()-2).concat(str.substring(0,str.length()-2));
    }else {
      return "invalid String";
    }
  }
}

