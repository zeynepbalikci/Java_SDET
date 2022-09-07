package Day22_stringManipulation_Lab;

public class Question6 {
  public static void main(String[] args) {

    System.out.println(withoutEnd("Hello"));
    System.out.println(withoutEnd("java"));
    System.out.println(withoutEnd("coding"));
    System.out.println(withoutEnd("ab"));
    System.out.println(withoutEnd("n"));

  }
  public static String withoutEnd(String str){

    if (str.length()<2){
      return "invalid String";
    }
    String with = str.substring(1,str.length()-1);
    return with;
  }
}
