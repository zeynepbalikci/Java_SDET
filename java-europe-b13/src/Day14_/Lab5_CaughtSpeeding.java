package Day14_;

public class Lab5_CaughtSpeeding {
  public static void main(String[] args) {

    caughtSpeed(60,false);
    caughtSpeed(65,false);
    caughtSpeed(65,true);

  }
  public static void caughtSpeed( int speed,boolean isbirthday){
    if(isbirthday){
      if(speed<=65){
        System.out.println(0);
      } else if (speed>=65 && speed<=85) {
        System.out.println(1);
      }else if(speed>=86){
        System.out.println(2);
      }
    }else {
      if(speed<=60){
        System.out.println(0);
      } else if (speed>=61 && speed<=80) {
        System.out.println(1);
      }else if(speed>=81){
        System.out.println(2);
      }
    }

  }
}
