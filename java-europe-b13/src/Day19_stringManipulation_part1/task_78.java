package Day19_stringManipulation_part1;

public class task_78 {
  public static void main(String[] args) {

    String sc = "zeynepbalikci";
    int word = 0;
    char myChar = 'e';

    for (int i = 0; i < sc.length(); i++) {

      if (sc.charAt(i) == myChar) {
        word++;
      }
    }
    System.out.println("word = " + word);
  }
}
