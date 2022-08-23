package Day20_stringManipulation_part2;

public class String_Replace2 {
  public static void main(String[] args) {

    String sentence = "Coding is fun, it is my hobby! !";
    String withNoSpace = sentence.replace(" ","");
    System.out.println(withNoSpace);
    System.out.println(sentence);

    String mixed = "j$a-v|a";
    System.out.println(mixed);
    mixed = mixed.replace("$","").replace("-","").replace("|","");
    System.out.println(mixed);
  }
}
