import java.util.ArrayList;
import java.util.List;

/**
 * This project finds prime numbers and is a common interview question.
 * 
 * @author Issac Lopez
 * @date 10/27/2021
 */
public class PrimeDirective {

  /**
   * This method determines whether a number is prime.
   * 
   * @param number given number
   * @return true if number is prime and false if number not prime
   */
  public boolean isPrime(int number) {
    if (number < 2) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }

  /**
   * This method returns the prime numbers into an ArrayList.
   * 
   * @param numbers an array of integers
   * @return an ArrayList of integers
   */
  public List<Integer> onlyPrimes(int[] numbers) {
    ArrayList<Integer> primes = new ArrayList<>();
    for (int number : numbers) {
      if (isPrime(number)) {
        primes.add(number);
      }
    }
    return primes;
  }

  // Main method.
  public static void main(String[] args) {
    PrimeDirective pd = new PrimeDirective();
    int[] numbers = { 6, 29, 28, 33, 11, 100, 101, 43, 89 };

    System.out.println(pd.isPrime(6));
    System.out.println(pd.isPrime(28));
    System.out.println(pd.isPrime(2));
    System.out.println(pd.isPrime(5));
    System.out.println(pd.onlyPrimes(numbers));
  }
}
