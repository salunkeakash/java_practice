public class Q1_check_leap_year {

  public static void main(String args[]) {
    int year = 2024;

    var result = (year % 4 == 0) ? "Leap Year" : "Not a Leap Year";

    System.out.println(year + " is " + result);
  }
}
