package Day28_arrays_Lab;

public class Lab4_Question10 {
  public static void main(String[] args) {

    int[] x = {2,2};
    int[] y = {3,3};
    int[] a = {2,3};
    int[] b = {12,20,42};
    int[] c = {2,2,2};
    System.out.println(elements(x));
    System.out.println(elements(y));
    System.out.println(elements(a));


  }
  public static boolean elements (int[] array){

    int counter2 = 0;
    int counter3 = 0;

    for (int value : array){

      if(value==2){
        counter2++;
      } else if (value==3) {
        counter3++;
      }
    }
    if (counter2==2 || counter3==2){
      return true;
    }else {
      return false;
    }
  }
}
