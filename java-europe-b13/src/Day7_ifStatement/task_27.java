package Day7_ifStatement;

public class task_27 {
  public static void main(String[] args) {

    int hours;
    hours = 12;
    if (hours<12){
      System.out.println("Good Morning" );
    }
    if(hours>=12 && hours<3){
      System.out.println("Good Afternoon");
    }
    if(hours>=3){
      System.out.println("Good Evening");
    }
  }
}
