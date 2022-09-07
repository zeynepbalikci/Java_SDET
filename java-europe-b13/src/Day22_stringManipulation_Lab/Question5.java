package Day22_stringManipulation_Lab;

public class Question5 {
  public static void main(String[] args) {

    System.out.println(firstHalf("WooHoo"));
    System.out.println(firstHalf("abcde"));
    System.out.println(firstHalf("HelloThere"));


  }
  public static String firstHalf (String str){

      if (str.length()%2==0) {
        int x = str.length() / 2;

        String half = str.substring(0, x);

        return half;
      }else {
        return "";
      }
  }
}
