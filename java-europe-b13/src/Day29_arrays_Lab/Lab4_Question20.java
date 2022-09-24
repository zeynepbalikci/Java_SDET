package Day29_arrays_Lab;

public class Lab4_Question20 {
  public static void main(String[] args) {

    int[] x = {1,2,2};
    int[] y = {1,2,1,2};
    int[] a = {2,1,2};
    int[] b = {2,2,1,2};

    twoArray(x);
    twoArray(y);
    twoArray(a);
    twoArray(b);
  }
  public static void twoArray (int[] arr){

    boolean flag = false;

    for (int i = 0; i < arr.length-1; i++) {

      if (arr[i]==2 && arr[i+1]==2){
       flag = true;
       break;
      }
    }
    if (flag){
      System.out.println(true);
    }else {
      System.out.println(false);
    }

  }
}
