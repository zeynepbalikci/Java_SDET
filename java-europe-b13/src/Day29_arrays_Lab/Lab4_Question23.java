package Day29_arrays_Lab;

import java.util.Arrays;

public class Lab4_Question23 {
  public static void main(String[] args) {

    fizzArray(15);


  }
  public static void fizzArray(int x){

    int[] arr = new int[x];
    for (int i = 0; i < arr.length; i++) {

      arr[i] = i;
    }
    System.out.println(Arrays.toString(arr));
  }
}
