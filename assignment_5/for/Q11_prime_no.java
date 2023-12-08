public class Q11_prime_no {

  public static void main(String args[]) {
    //done
    int num = 20;
    int i = 2;
    int flag = 1;

    // loop to iterate through 2 to N/2
    // for (int i = 2; i <= num / 2; i++)
    while (i <= num / 2) {
      if (num % i == 0) {
        flag = 0;
        break;
      }
    }

    if (flag == 1) {
      System.out.println("the number " + num + " is a Prime number");
    } else {
      System.out.println("the number " + num + " is not a Prime number");
    }
  }
}
