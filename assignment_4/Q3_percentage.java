public class Q3_percentage {

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

    // System.out.println(percentage);

    var result = (percentage > 90) ? "Out Standing"
        : (percentage < 90 && percentage > 80) ? "Excellent"
            : (percentage < 80 && percentage > 70) ? "Very Good"
                : (percentage < 70 && percentage > 60) ? "Good" : "Fair";

    System.out.println(result);

  }
}
