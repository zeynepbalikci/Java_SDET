package Day7_ifStatement;

public class Tasks {
  public static void main(String[] args) {
    double hours,y;
    hours = 41;
    y=40;

    if(hours>40){
       y =y*1.5;
    }
    System.out.println("y = " + y);

    int fee;
    boolean max;
    max=false;
    fee = 30;
    if(!max){
      fee=50;
    }
    System.out.println("fee = " + fee);
    int a,b,c;
    a=1; b=50; c=110;
    if (b==50 && c>=100){
      a=20;
    }
    System.out.println("a = " + a);

    double temp;
    temp = 75.5;
    if (temp>70 && temp<80){
      System.out.println("Ideal Temps ");
    }
      
  }
}
