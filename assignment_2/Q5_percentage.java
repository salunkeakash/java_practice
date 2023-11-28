public class Q5_percentage {

  public static void main(String args[]) {
    int sub1 = 80;
    int sub2 = 45;
    int sub3 = 70;
    int sub4 = 50;
    int sub5 = 75;

    int total, avg;
    double percentage;

    total = sub1 + sub2 + sub3 + sub4 + sub5;

    avg = total / 5;

    percentage = (float) total / 500 * 100.0;

    System.out.println(percentage);

    if (percentage > 90) {
      System.out.println("Out Standing");
    } else if (percentage < 90 && percentage > 80) {
      System.out.println("Excellent");
    } else if (percentage < 80 && percentage > 70) {
      System.out.println("Very Good");
    } else if (percentage < 70 && percentage > 60) {
      System.out.println("Good");
    } else {
      System.out.println("Fair");
    }
  }
}
