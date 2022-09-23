package Day28_arrays_Lab;

import java.util.Arrays;

public class Lab4_Question15 {
  public static void main(String[] args) {

    int[] x = {1,2,3,4};
    int[] y = {1,2,3};
    int[] z = {8,6,7,9,5};

    System.out.println(Arrays.toString(firstLast(x)));
    System.out.println(Arrays.toString(firstLast(y)));
    System.out.println(Arrays.toString(firstLast(z)));

  }
  public static int[] firstLast (int[] arr){

    int temp = 0;
    temp = arr[0];

    arr[0] = arr[arr.length-1];
    arr[arr.length-1]= temp;

    return arr;

  }
}
