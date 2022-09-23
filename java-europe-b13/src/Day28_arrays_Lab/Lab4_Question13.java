package Day28_arrays_Lab;

import java.util.Arrays;

public class Lab4_Question13 {
  public static void main(String[] args) {

    int[] x ={1,2}; int[] y = {3,4};
    totals(x,y);
    int[] x1 = {2,4}; int[] y1 = {5,7};
    totals(x1,y1);
    int[] x2 ={5,2}; int[] y2 = {3,4};
    totals(x2,y2);


  }
  public static void totals (int[] arr, int[] arr2){

    int sum = 0;
    int sum2 = 0;
    for (int i = 0; i < arr.length; i++) {

      sum = sum + arr[i];
    }
    for (int i = 0; i < arr2.length; i++) {

      sum2 = sum2 + arr2[i];
    }
    if (sum>sum2){
      System.out.println(Arrays.toString(arr));
    } else if (sum2>sum) {
      System.out.println(Arrays.toString(arr2));
    }else {
      System.out.println("equal");
    }

  }
}
