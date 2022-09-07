package Day23_;

public class Question12 {
  public static void main(String[] args) {

    String str = "Catdog";
    int counterCat = 0, counterDog = 0;

    for (int i = 0; i < str.length()-2; i++) {

      if (str.substring(i,i+3).equalsIgnoreCase("cat")){
        counterCat++;
      }
      if (str.substring(i,i+3).equalsIgnoreCase("dog")){
        counterDog++;
      }
    }
    if (counterCat==counterDog){
      System.out.println(true);
    }else{
      System.out.println(false);
    }
  }
}
