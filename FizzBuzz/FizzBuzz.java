public class FizzBuzz {
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      // i being multiples of 3 and 5
      if ((i % 3 == 0) && (i % 5 == 0)) {
        System.out.println("FizzBuzz");
      } else if (i % 3 == 0) {
        System.out.println("Fizz");
      } else if (i % 5 == 0) {
        System.out.println("Buzz");
      } else {
        System.out.println(i + " is not a multiple of 3 or 5.");
      }
    }
  }
}