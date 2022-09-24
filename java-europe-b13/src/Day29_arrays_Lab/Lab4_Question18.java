package Day29_arrays_Lab;

public class Lab4_Question18 {
  public static void main(String[] args) {

    int[] x = {1,2,2,1};
    int[] y = {1,1};
    int[] z = {1,2,2,1,13};

    System.out.println(totals(x));
    System.out.println(totals(y));
    System.out.println(totals(z));

  }
  public static int totals (int[] arr) {

    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i]!=13) {
        sum = sum + arr[i];
      }
    }
    return sum;
  }
}
