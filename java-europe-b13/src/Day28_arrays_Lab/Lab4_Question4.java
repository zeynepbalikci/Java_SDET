package Day28_arrays_Lab;

public class Lab4_Question4 {
  public static void main(String[] args) {

    int[] x = {1,2,3};
    int[] y = {5,11,2};
    int[] z = {7,0,0};
    int[] a = {3,-2,10,4};

    System.out.println(totals(x));
    System.out.println(totals(y));
    System.out.println(totals(z));
    System.out.println(totals(a));
  }

  public static int totals (int[] array){

    int sum = 0;
    for (int i = 0; i < array.length; i++) {

      sum = sum + array[i];
    }
    return sum;
  }
}
