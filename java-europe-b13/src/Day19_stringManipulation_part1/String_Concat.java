package Day19_stringManipulation_part1;

public class String_Concat {
  public static void main(String[] args) {

    String word = "Java";
    System.out.println(word.concat("+selenium"));
    System.out.println(word.concat(" in eclipe"));

    System.out.println(word);

    word = word.concat(" Automation");
    System.out.println(word);

    word = word.concat("123");
    System.out.println(word);

    word = word + true;
    System.out.println(word);

    String word2 = "Hi";
    word2 = word2.concat("-hey").concat("-how are you").concat("-good");
    System.out.println(word2);




  }
}
