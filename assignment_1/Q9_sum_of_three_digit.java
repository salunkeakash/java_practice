class sum_of_three_digit {

    public static void main(String args[]) {
        int num = 235;
        int a, b, c, sum;

        a = num / 100;
        b = ((num / 10) % 10);
        c = num % 10;

        sum = a + b + c;

        System.out.println("sum of three digits are " + sum);
    }
}
