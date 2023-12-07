public class Q9_pallendrome {

  public static void main(String args[]) {
    int num = 135;
    int number;
    int reverse = 0;

    number = num;

    while (num != 0) {
      int reminder = num % 10;
      reverse = reverse * 10 + reminder;
      num = num / 10;
    }

    if (number == reverse) {
      System.out.println(number + " is palindrome number");
    } else {
      System.out.println(number + " is not palindrome number");
    }
  }
}
