package Day28_arrays_Lab;

import java.util.Arrays;

public class Lab4_Question6 {
  public static void main(String[] args) {

    int[] x = {1,2,3};
    int[] y = {11,5,9};
    int[] z = {110,5,98,0,1200};
    System.out.println(Arrays.toString(elements(x)));
    System.out.println(Arrays.toString(elements(y)));
    System.out.println(Arrays.toString(elements(z)));

  }
  public static int[] elements (int[] arr){

    int num = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i]>num){
        num = arr[i];
      }
    }
    for (int i = 0; i < arr.length ; i++) {
      arr[i] = num ;
    }
    return arr;
  }
}
