package Day23_;

public class Question13 {
  public static void main(String[] args) {
    System.out.println(doubleChar("abc"));
    System.out.println(doubleChar("The"));
    System.out.println(doubleChar("Hi-There"));


  }
  public static String doubleChar(String str){
    String x ="";
    for (int i = 0; i < str.length(); i++) {

      char name = str.charAt(i);
      x += name;
      x += name;
    }
    return x;
  }
}
