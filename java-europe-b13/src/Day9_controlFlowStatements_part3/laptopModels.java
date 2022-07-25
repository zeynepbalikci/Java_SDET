package Day9_controlFlowStatements_part3;

public class laptopModels {
  public static void main(String[] args) {
    String computer;
    computer = "dell";
    if (computer == "apple") {
      System.out.println("Apple-no virus");
    } else if (computer == "dell") {
      System.out.println("Tough one");
    } else if (computer == "acer") {
      System.out.println("Not recommended");
    } else {
      System.out.println("do not buy that one!");
    }
    switch (computer){
      case "apple":
        System.out.println("Apple-no virus");
        break;
      case "dell":
        System.out.println("Tough one");
        break;
      case "acer":
        System.out.println("Not recommended");
      default:
        System.out.println("do not buy that one!");
    }
  }
}
