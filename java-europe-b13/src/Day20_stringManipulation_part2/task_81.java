package Day20_stringManipulation_part2;

public class task_81 {
  public static void main(String[] args) {

    timeStamp();
  }
  public static void timeStamp(){

    String date = "10/10/2019 14:59:00";

    date = date.replace("/","").replace(" ","").replace(":","");

    System.out.println(date);
  }
}
