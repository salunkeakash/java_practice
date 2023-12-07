class selling_price_of_book {

  public static void main(String args[]) {
    int price = 200;
    int discount = 10;
    double selling_price = price - (price * discount / 100);

    System.out.println(
      "selling price of book after discount is " + selling_price
    );
  }
}
