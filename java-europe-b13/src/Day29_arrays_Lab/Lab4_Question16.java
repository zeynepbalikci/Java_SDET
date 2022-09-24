package Day29_arrays_Lab;

public class Lab4_Question16 {
  public static void main(String[] args) {

    int[] x = {2,1,2,3,4};
    int[] y = {2,2,0};
    int[] z = {1,3,5};

    evenNumbers(x);
    evenNumbers(y);
    evenNumbers(z);

  }
  public static void evenNumbers(int[] arr){

    int num = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i]%2==0){
        num++;
      }
    }
    System.out.println(num);
  }
}
