public class Q12_factorial {

  public static void main(String args[]) {
    int fact = 1;
    int i = 1;
    int num = 123;

    while (i <= num) {
      fact = fact * i;
      i++;
    }

    System.out.println("\nFactorial of " + num + " is: " + fact);
  }
}
