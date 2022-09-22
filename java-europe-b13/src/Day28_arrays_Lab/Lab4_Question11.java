package Day28_arrays_Lab;

import Day24_arrays_part1.Array;
import java.util.Arrays;

public class Lab4_Question11 {
  public static void main(String[] args) {

    int[] x = {1,2,3};
    int[] y = {2,3,4};
    int[] z = {11,2,13,3,2};

    System.out.println(Arrays.toString(change(x)));
    System.out.println(Arrays.toString(change(y)));
    System.out.println(Arrays.toString(change(z)));

    System.out.println(Arrays.toString(change2(x)));
    System.out.println(Arrays.toString(change2(z)));

  }
  public static int[] change (int[] arr){

    for (int i = 0; i < arr.length; i++) {

      if (arr[i]==3){
        arr[i]=0;
        return arr;
      }
    }
    return arr;
  }
  public static int[] change2 (int[] arr2){

    for (int i = 0; i < arr2.length; i++) {

      if (arr2[i]==2 && arr2[i+1]==3){

        arr2[i+1]=0;
      }
      
    }
    return arr2;
  }
}
