public class Q10_armstrong {

  public static void main(String args[]) {
    int num = 125;
    int reverse;
    int res = 0;
    int input;
    input = num;

    while (num != 0) {
      int reminder = num % 10;
      num = num / 10;
      reverse = reminder * reminder * reminder;
      res = res + reverse;
    }

    if (input == res) {
      System.out.println(input + "is an angstrom number");
    } else {
      System.out.println(input + "is not  an angstrom number");
    }
  }
}
