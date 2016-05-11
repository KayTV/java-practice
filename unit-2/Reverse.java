public class Reverse {
  public String other(String x) {
    String reversedString = x;
    for(int i = x.length; i > 0; i--) {
      reversedString += x[i];
    }
    return reversedString;
  }
  public static void main(String [] args) {
    System.out.println( other('hello world') );
  }
}
