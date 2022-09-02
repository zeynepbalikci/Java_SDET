package Day22_stringManipulation_Lab;

public class Question2 {
  public static void main(String[] args) {

    System.out.println(makeAbba("Hi","Bye"));
    System.out.println(makeAbba("Yo","Alice"));
    System.out.println(makeAbba("What","Up"));
  }

  public static String makeAbba(String str,String str2) {

    return str.concat(str2).concat(str2).concat(str);

  }

}
