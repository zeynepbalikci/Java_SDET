package Day15_Methods_Part3;

public class task71 {
  public static void main(String[] args) {
    /*
    - calcFeetAndInchesToCentimeters isminde bir method yaz
    - iki tane parametresi olsun
    - ilk parametre Feet, ikincisi inches isimlerinde olsun
    - feet parametresi -> feet >= 0 olmali
    - inches parametresi -> 0 <= inches <= 12 olmali
    - parametrelerden herhangä biri bu sartlari saglamiyorsa -1 sayisini return etsin
    - degerler gecerliyse santimetreye donusturme islemini yap

    - ayni isimde ikinci bir metod olustur
    - bunun sadece bir tane parametresi olsun: inches
    - inches >= 0 olmali, degilse -1 sayisini return etsin
    - eger sayi gecerliyse inches degerini feete donustur
    - ilk metodu ikinci metodun icinde cagir
    - ikincinin icinde yaptigin hesaplamadan cikan feet ve inches sonuclarini ilk metoda parametre olarak ver.

ipuclari:
    - data turu olarak double kullan
    - 1 inch = 2,54 cm ve 1 feet = 12 inch'tir.
     */
//    calcFeetAndInchesToCentimeters(10, 9);
//    System.out.println(calcFeetAndInchesToCentimeters(10,9));
    calcFeetAndInchestoCentimeters(100);

  }
  public static double calcFeetAndInchesToCentimeters(double feet,double inches){

    double centimeters=0;

    if (feet<0 || inches<0 || inches>12){
      return -1;

    }else {
      centimeters=(feet*12*2.54)+(inches*2.54);

    }
    System.out.println("centimeters = " + centimeters);
      return centimeters;

  }
  public static double calcFeetAndInchestoCentimeters(double inches){


    if (inches<0){
      return -1;
    }

      double feet=(int) inches/12;
      double inchesfinal=inches%12;
      System.out.println(inches+" inches= "+ feet + " feet and "+ inchesfinal+" inches");
      return calcFeetAndInchesToCentimeters(feet,inchesfinal);





  }

}
