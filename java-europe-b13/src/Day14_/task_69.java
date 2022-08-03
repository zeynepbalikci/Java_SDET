package Day14_;

public class task_69 {
  public static void main(String[] args) {
  //  isPrime(7);
  //  isPrime(9);
    System.out.println(isPrime(2));
    System.out.println(isPrime(7));

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
