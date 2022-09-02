package Day22_stringManipulation_Lab;

public class String_StartsEndsWith {
  public static void main(String[] args) {

    String word1 = "eclipe";

    System.out.println(word1.startsWith("e"));
    System.out.println(word1.startsWith("ec"));
    System.out.println(word1.startsWith("ex"));

    System.out.println(word1.endsWith("e"));
    System.out.println(word1.endsWith("lipe"));
    System.out.println(word1.endsWith("epe"));

    String name = "Dr. Jackson";
    if (name.startsWith("Mr.")){
      System.out.println("married man");
    } else if (name.startsWith("Mrs.")) {
      System.out.println("married woman");
    } else if (name.startsWith("Ms.")) {
      System.out.println("some woman");
    } else if (name.startsWith("Dr.")) {
      System.out.println("doctor man or woman");
    }else {
      System.out.println("Unknow status");
    }
  }
}
