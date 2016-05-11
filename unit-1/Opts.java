public class Opts {
  public static int sum(int x, int y) {
    return x + y;
  }
  public static int multiply(int x, int y) {
    return x * y;
  }
  public static int divide(int x, int y) {
    return x / y;
  }
  public static int power(int x) {
    int y = 2;
    for(int i = 0; i < y; i++) {
      x = x * x;
    }
    return x;
  }
  public static void main(String [] args){
    // int first =1;
    // int second =2;
    // int result = sum(first, second);
    // System.out.println( result );
    // System.out.println( multiply(3, 2) );
    // System.out.println( divide(10, 2) );
    System.out.println( power(3) );
  }
}
