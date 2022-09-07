package Day23_;

public class Question11 {
  public static void main(String[] args) {

    String str = "abc hi hohi";                     //hihello = substring(0,2)
                                                    //xhihello = substring(1,3)
    int counter = 0;                                //xxhihello = substring(2,4)
    for (int i = 0; i < str.length()-1; i++) {

      if (str.substring(i,i+2).equals("hi")){

        counter++;
      }
    }
    System.out.println(counter);
  }

}
