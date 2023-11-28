class vowal_or_consonant {

  public static void main(String args[]) {
    char letter = 'b';

    if (
      letter == 'a' ||
      letter == 'A' ||
      letter == 'e' ||
      letter == 'E' ||
      letter == 'i' ||
      letter == 'I' ||
      letter == 'o' ||
      letter == 'O' ||
      letter == 'u' ||
      letter == 'U'
    ) {
      System.out.println(letter + " is a vowel");
    } else {
      System.out.println(letter + " is a conconant");
    }
  }
}
