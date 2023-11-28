package assignment_2;

public class Q3_smallest_no {

  public static void main(String args[]) {
    int a = 10;
    int b = 15;
    int c = 20;

    if (a < b) {
      if (a < c) {
        System.out.println(a + " is smallest no.");
      } else { 
        System.out.println(c + " is smallest no.");
      }
    } else {
      if (b < c) {
        System.out.println(b + " is smallest no.");
      } else {
        System.out.println(c + " is smallet no.");
      }
    }
  }
}
