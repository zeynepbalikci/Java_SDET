package Day29_arrays_Lab;

public class Lab4_Question22 {
  public static void main(String[] args) {

    int[] x ={1,4,1};
    int[] y ={1,4,4,4,1};

    System.out.println(greater(x));
    System.out.println(greater(y));

  }
  public static boolean greater (int[] arr){

    int num1 = 0;
    int num4 = 0;

    for (int i = 0; i < arr.length; i++) {

      if (arr[i]==1){
        num1++;
      }else if (arr[i]==4){
        num4++;
      }
    }
    if (num1>num4){
      return true;
    }
    return false;
  }
}
