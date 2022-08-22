package Day19_stringManipulation_part1;

public class task_77 {
  public static void main(String[] args) {

    String str = ";";
    if (str.length()!=2){
      System.out.println("invalid emoji");
    }else {
      if (str.charAt(0)==':') {
        if (str.charAt(1) == ')') {
          System.out.println(":) Smile");
        } else if (str.charAt(1) == '(') {
          System.out.println(":( Sad");
        } else if (str.charAt(1) == '/') {
          System.out.println(":/ Upset");
        } else if (str.charAt(1) == 'p') {
          System.out.println(":p Playful");
        } else {
          System.out.println("invalid emoji");
        }
      } else if (str.charAt(0)==';') {
        if (str.charAt(1)==')'){
          System.out.println(";) Wink");
        } else if (str.charAt(1)=='0') {
          System.out.println(";0 Surprised");
        }else{
          System.out.println("invalid emoji");
        }
      }
    }
  }
}
