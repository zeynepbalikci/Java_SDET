package Day20_stringManipulation_part2;

public class String_IndexOf2 {
  public static void main(String[] args) {

    String list = "html-selenium-angular-jenkins-grid";
    int fisrtDash = list.indexOf("-");
    System.out.println(fisrtDash);

    int secondDash = list.indexOf("-",5);
    System.out.println(secondDash);
  }
}
