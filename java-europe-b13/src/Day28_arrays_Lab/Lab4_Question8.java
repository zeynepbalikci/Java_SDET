package Day28_arrays_Lab;

public class Lab4_Question8 {
  public static void main(String[] args) {

    int[] x = {2,5};
    int[] y = {4,3};
    int[] z = {4,5};

    System.out.println(elments(x));
    System.out.println(elments(y));
    System.out.println(elments(z));


  }
  public static boolean elments (int[] arr){


    for (int i = 0; i < arr.length; i++) {

      if (arr[i]==2 || arr[i]==3){

        return true;

      }
    }
    return false;
  }
}
