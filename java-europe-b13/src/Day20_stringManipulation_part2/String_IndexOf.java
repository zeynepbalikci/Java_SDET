package Day20_stringManipulation_part2;

public class String_IndexOf {
  public static void main(String[] args) {

    String word1 = "githup";
    System.out.println(word1.indexOf("g"));
    System.out.println(word1.indexOf("th"));
    System.out.println(word1.indexOf("hup"));
    System.out.println(word1.indexOf("java"));

    String url = "www.okta.com";
    int i = url.indexOf(".");
    System.out.println("Post of . " + i);
    System.out.println(url.charAt(i+1));

    String title = "Java - Google Search";
    int dash = title.indexOf("-");
    System.out.println(title.charAt(dash-1));
    System.out.println(title.charAt(dash+1));
    System.out.println("Apple");
  }
}
