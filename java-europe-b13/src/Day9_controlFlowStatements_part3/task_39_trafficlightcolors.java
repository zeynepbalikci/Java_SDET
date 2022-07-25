package Day9_controlFlowStatements_part3;

public class task_39_trafficlightcolors {
  public static void main(String[] args) {

    char colors ='g';
    switch (colors){
      case'R': case'r':
        System.out.println("Red");
        break;
      case'O': case'o':
        System.out.println("Orange");
        break;
      case'G': case'g':
        System.out.println("Green");
        break;
      default:
        System.out.println("Invalid Light");
    }


  }
}
