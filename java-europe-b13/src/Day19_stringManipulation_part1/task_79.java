package Day19_stringManipulation_part1;

public class task_79 {
  public static void main(String[] args) {

    String str = "CybertekSchool";

    for (int i = 0; i < str.length(); i++) {
      char myChar = str.charAt(i);
      if (myChar=='a' || myChar=='e' || myChar=='i'|| myChar=='o'|| myChar=='u'){
        System.out.print(myChar);
        if (i != str.length()-2){
          System.out.print(",");
        }
      }

    }
  }
}
