package Day29_arrays_Lab;

public class Lab4_Question17 {
  public static void main(String[] args) {

    int[] x = {10,3,5,6};
    int[] y = {7,2,10,9};
    int[] z = {2,10,7,2};

    System.out.println(difference(x));
    System.out.println(difference(y));
    System.out.println(difference(z));

  }
  public static int difference (int[] arr){

    int num = Integer.MIN_VALUE;
    int num2 = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i]>num){
        num = arr[i];
      }
    }
    for (int j = 0; j < arr.length; j++) {
      if (arr[j]<num2){
        num2=arr[j];
      }
    }
    return num-num2;
  }
}
