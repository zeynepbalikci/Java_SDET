package Day16_classObjects;

public class Contact {

  String name;
  long phoneNumber;
  String email;

  public void call(){
    System.out.println("Calling"+ name+" ...");
  }
  public  void sendMessage(){
    System.out.println("Sending  message to" + phoneNumber + "| name: "+ name);
  }
  public void sendMail(){
    System.out.println("sending email to"+ email+ "....");
  }
}
