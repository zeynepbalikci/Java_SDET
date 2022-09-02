package Day22_stringManipulation_Lab;

public class Question3 {
  public static void main(String[] args) {

    System.out.println(extraEnd("Hello"));
    System.out.println(extraEnd("ab"));
    System.out.println(extraEnd("Hi"));

  }
  public static String extraEnd(String str){

    if (str.length()<2){
      return "Invalid String";
    }
    String dummy = str.substring(str.length()-2);

    return dummy+dummy+dummy;
  }
}
