package Day22_stringManipulation_Lab;

public class Question10 {
  public static void main(String[] args) {

    System.out.println(frontAgain("edited"));
    System.out.println(frontAgain("edit"));
    System.out.println(frontAgain("ed"));

    System.out.println(frontAgain2("edited"));
    System.out.println(frontAgain2("edit"));
    System.out.println(frontAgain2("ed"));

  }
  public static boolean frontAgain(String str){
    boolean name = true;
    if (str.substring(0,2).equals(str.substring(str.length()-2))){
      name = true;
    }else {
      name = false;
    }
    return name;
  }
  public static boolean frontAgain2(String str2){

    String first2 = str2.substring(0,2);
    String last2 = str2.substring(str2.length()-2);

    return first2.equals(last2);
  }
}
