package Day14_;

public class task_69 {
  public static void main(String[] args) {

    int number = 41;
    if (isPrime(number)){
      System.out.println(number + " is a prime number");

    }else {
      System.out.println(number + " is not a prime number");
    }

  }
  public static boolean isPrime (int number){
    boolean i = true;
    if (number==0 || number==1 ){
      i=false;
    }else {
      for (int j = 2; j < number; j++) {
        if (number%j==0){
          i=false;
          break;
        }
      }
    }
    return i ;
  }
}
