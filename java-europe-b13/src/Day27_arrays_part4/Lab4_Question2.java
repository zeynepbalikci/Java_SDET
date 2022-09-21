package Day27_arrays_part4;

public class Lab4_Question2 {
  public static void main(String[] args) {

    int[] x ={1,2,3};
    int[] y ={1,2,3,1};
    int[] z ={1,2,1};
    int[] k ={1};

    System.out.println(fistlast(x));
    System.out.println(fistlast(y));
    System.out.println(fistlast(z));
    System.out.println(fistlast(k));


  }
  public static String fistlast ( int[] array){

    if (array.length<=1){
      return "not a valid array";
    }
    if (array[0]==array[array.length-1]){
      return "true";
    }else {
      return "false";
    }
  }
}
