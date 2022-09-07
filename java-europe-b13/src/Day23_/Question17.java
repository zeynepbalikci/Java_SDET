package Day23_;

public class Question17 {
  public static void main(String[] args) {

   // String str = "madam";
    String str = "Taco cat";
    String dummy = "";

    // m+a+d+a+m
    // 4 3 2 1 0

    for (int i = str.length()-1; i >= 0; i--) {

      dummy = dummy + str.charAt(i);
    }
    if (str.replace(" ","").equalsIgnoreCase(dummy.replace(" ",""))){
      System.out.println(true);
    }else {
      System.out.println(false);
    }
  }
}
