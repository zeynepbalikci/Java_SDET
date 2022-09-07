package Day23_;

public class Question14 {
  public static void main(String[] args) {

    System.out.println(endsLy("oddly"));
    System.out.println(endsLy("y"));
    System.out.println(endsLy("oddy"));

  }
  public static boolean endsLy(String str){
    if (str.length()<2){
      return false;
    }
    return str.substring(str.length()-2).equals("ly");
  }
}
