package Day22_stringManipulation_Lab;

public class Question7 {
  public static void main(String[] args) {

    System.out.println(comboString("Hello","hi"));
    System.out.println(comboString("hi","Hello"));
    System.out.println(comboString("aaa","b"));
    System.out.println(comboString("java","code"));

  }
  public static String comboString(String str,String str2){

    if (str.length()<str2.length()){
      return str+str2+str;
    } else if (str.length()>str2.length()) {
      return str2+str+str2;
    }else {
      return str+str2+str;
    }
  }
}
