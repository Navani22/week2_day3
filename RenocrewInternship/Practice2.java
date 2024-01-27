
class Call {

  public void ring() {
    System.out.println("Ringing...");
  }

  public void vibrate() {
    System.out.println("Vibrating...");
  }

  public void callAFriend() {
    System.out.println("Call A friend ...");
  }
}

public class Practice2 {
  public static void main(String[] args) {
    Call c = new Call();
    c.ring();
    c.vibrate();
    c.callAFriend();
  }

}