package Day26_arrays_part3;

public class Task94 {
  public static void main(String[] args) {

    String info1 = "This info is used for creation password : xxxCD132Gxxx . Please do not share with anyone";
    String info2 = "This info is used for creation password : xxx00ABC!xxx . Please do not share with anyone";

    String[] array = info1.split(" ");
    String[] array2 = info2.split(" ");

    System.out.println(array[8]);
    System.out.println(array2[8]);

    String password1 = array[8];
    String password2 = array2[8];

    // System.out.println(password1.replace("x", ""));
    System.out.println(password1.substring(3,9).concat(password2.substring(3,9)));











  }
}
