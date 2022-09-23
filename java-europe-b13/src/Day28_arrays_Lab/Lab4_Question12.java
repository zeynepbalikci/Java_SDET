package Day28_arrays_Lab;

public class Lab4_Question12 {
  public static void main(String[] args) {

    int[] x = {1,2,3};
    int[] y = {1,3};
    int[] x1 = {7,2,3};
    int[] y1 = {1};
    int[] x2 = {3,2,4};
    int[] y2 = {4,2,5};

    System.out.println(twoArrays(x,y));
    System.out.println(twoArrays(x1,y1));
    System.out.println(twoArrays(x2,y2));


  }
  public static int twoArrays (int[] arr,int[] arr2){

    int counter = 0;
    if (arr[0]==1){
      counter++;
    }
    if (arr2[0]==1) {
      counter++;
    }
    return counter;

  }

}
