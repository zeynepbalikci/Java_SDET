package Day20_stringManipulation_part2;

public class String_Replace {
  public static void main(String[] args) {

    String str = "Moscow is a capital of Russia";
    str = str.replace("Moscow","Bakü").replace("Russia","Azerbaijan");

    System.out.println(str);

    String email = "firstName_LastName@gmail.com";
    String company = "capitalone";
    String newMail = email.replace("gmail",company);

    System.out.println(newMail);
  }
}
