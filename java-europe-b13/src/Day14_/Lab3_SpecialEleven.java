package Day14_;

public class Lab3_SpecialEleven {
  public static void main(String[] args) {

    specialEleven(22);
    specialEleven(23);
    specialEleven(24);


  }
  public static void specialEleven(int number){

    if (number%11==0 || (number-1)%11==0 || number%11==1){
      System.out.println(true);
    }else {
      System.out.println(false);
    }
  }
}
