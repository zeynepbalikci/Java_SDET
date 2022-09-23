package Day28_arrays_Lab;

import java.util.Arrays;

public class Lab4_Question14 {
  public static void main(String[] args) {

    int[] x = {1,2}; int[] y = {3,4};
    int[] x1 = {4,4}; int[] y1 = {2,2};
    int[] x2 = {9,2}; int[] y2 = {3,4};

    twoElements(x,y);
    twoElements(x1,y1);
    twoElements(x2,y2);

  }
  public static void twoElements (int[] arr, int[] arr2){

    int[] total = new int[arr.length+ arr2.length];

    for (int i = 0; i < arr.length; i++) {

      total[i] = arr[i];
    }
    int a = 0;
    for (int j = arr.length; j < total.length ; j++) {

      total[j] = arr2[a];
      a++;
    }
    System.out.println(Arrays.toString(total));

  }

}
