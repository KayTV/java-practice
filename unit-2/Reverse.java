public class Reverse {
  public static void main(String [] args) {
    String word = args[0];
    String reversedString = "";

    for ( int i = word.length() - 1; i >= 0; i-- ) {
      reversedString += word.charAt(i);
    }
    System.out.println(reversedString);
  }
}
