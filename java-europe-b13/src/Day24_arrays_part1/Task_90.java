package Day24_arrays_part1;

public class Task_90 {
  public static void main(String[] args) {

    String[] car = {"BMW","Audi","Mercedes","Honda","Toyota","Mazda"};

    boolean flag = false;

    for (int i = 0; i < car.length; i++) {

      if (car[i].equals("Honda")){
        flag = true;
        break;
      }
    }
    if (flag){
      System.out.println("Found it");
    }else {
      System.out.println("Not found it");
    }

  }
}
