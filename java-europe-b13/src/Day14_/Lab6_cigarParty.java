package Day14_;

public class Lab6_cigarParty {
  public static void main(String[] args) {
    cigarparty(30,false);
    cigarparty(50,false);
    cigarparty(70,true);

  }
  public static void cigarparty (int cigar,boolean weekend){
    if (weekend){
      if (cigar>=40){
        System.out.println(true);
      }else {
        System.out.println(false);
      }
    }else {
      if(cigar>=40 && cigar<=60){
        System.out.println(true);
      }else {
        System.out.println(false);
      }
    }


  }
}
