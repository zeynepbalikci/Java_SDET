package Day23_;

public class Question15 {
  public static void main(String[] args) {

    System.out.println(hasBad("badxx"));
    System.out.println(hasBad("xbadxx"));
    System.out.println(hasBad("xxbadxx"));

  }
  public static boolean hasBad(String str){

    if (str.substring(0,3).equals("bad") || str.substring(1,4).equals("bad")){
      return true;
    }else {
      return false;
    }

  }
}
