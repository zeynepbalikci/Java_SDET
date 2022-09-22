package Day28_arrays_Lab;

import java.util.Arrays;

public class Lab4_Question7 {
  public static void main(String[] args) {

    int[] x = {1,2,3};
    int[] y = new int[2];

    int[] x1 = {7,4,6,2};
    int[] y1 = new int[2];

    System.out.println(Arrays.toString(fistlast(x,y)));
    System.out.println(Arrays.toString(fistlast(x1,y1)));
  }
  public static int[] fistlast (int[] arr,int[] arr2){

    arr2[0] = arr[0];
    arr2[1] = arr[arr.length-1];

    return arr2;
  }
}
