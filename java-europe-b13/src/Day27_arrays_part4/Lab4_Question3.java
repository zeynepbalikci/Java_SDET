package Day27_arrays_part4;

public class Lab4_Question3 {
  public static void main(String[] args) {

    int[] x = {1,2,3};
    int[] y = {7,3};
    int[] x1 = {1,2,3};
    int[] y1 = {7,3,2};
    int[] x2 = {1,2,3};
    int[] y2 = {1,3};
    int[] x3 = {1};
    int[] y3 = {7,3};
    int[] x4 = {1,2,3};
    int[] y4 = {1};

    System.out.println(samefirstlast(x,y));
    System.out.println(samefirstlast(x1,y1));
    System.out.println(samefirstlast(x2,y2));
    System.out.println(samefirstlast(x3,y3));
    System.out.println(samefirstlast(x4,y4));


  }
  public static String samefirstlast(int[] array1,int[] array2){

    if (array1.length<=1 || array2.length<=1){
      return "Array is not valid";
    }
    if (array1[0]==array2[0] || array1[array1.length-1]==array2[array2.length-1]){
      return "true";
    }else {
      return "false";
    }
  }
}
