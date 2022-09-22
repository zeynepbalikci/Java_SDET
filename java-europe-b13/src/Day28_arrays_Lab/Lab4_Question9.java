package Day28_arrays_Lab;

import java.util.Arrays;

public class Lab4_Question9 {
  public static void main(String[] args) {

    int[] x = {4,5,6};
    int[] y = {1,2,3,5,7};

    System.out.println(Arrays.toString(sameElements(x)));
    System.out.println(Arrays.toString(sameElements(y)));

  }
  public static int[] sameElements (int[] arr){

    int[] newArray = new int[2* arr.length];
    newArray[newArray.length-1] = arr[arr.length-1];

    return newArray;

  }
}
