package Day29_arrays_Lab;

public class Lab4_Question21 {
  public static void main(String[] args) {

    int[] x = {2,3,2,2,4,2};
    int[] y = {2,3,2,2,4,2,2};

    System.out.println(total8(x));
    System.out.println(total8(y));


  }
  public static boolean total8 (int[] arr){

    int num = 0;
    boolean flag = false;
    for (int i = 0; i < arr.length; i++) {

      if (arr[i]==2){
        num++;
      }
    }
    if (num==4){
       flag = true;
    }
    return flag;
  }
}
