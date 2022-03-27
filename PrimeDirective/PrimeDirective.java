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
   * This method returns the prime numbers into a List.
   * 
   * @param numbers an array of integers
   * @return a List of integers
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

  /**
   * This method returns the even numbers into a List.
   * 
   * @param numbers an array of integers
   * @return an List of integers
   */
  public List<Integer> evenList(int[] numbers) {
    ArrayList<Integer> evens = new ArrayList<>();
    for (int number : numbers) {
      if (number % 2 == 0) {
        evens.add(number);
      }
    }
    return evens;
  }

  /**
   * This method returns the odd numbers into a List.
   * 
   * @param numbers an array of integers
   * @return an List of integers
   */
  public List<Integer> oddList(int[] numbers) {
    ArrayList<Integer> odds = new ArrayList<>();
    for (int number : numbers) {
      if (number % 2 != 0) {
        odds.add(number);
      }
    }
    return odds;
  }

  // Main method.
  public static void main(String[] args) {
    PrimeDirective pd = new PrimeDirective();
    int[] numbers = { 6, 29, 28, 33, 11, 100, 101, 43, 89 };

    System.out.println(pd.isPrime(6));
    System.out.println(pd.isPrime(28));
    System.out.println(pd.isPrime(2));
    System.out.println(pd.isPrime(5));
    System.out.println("Only Primes List: " + pd.onlyPrimes(numbers));
    System.out.println("Only Odds List: " + pd.oddList(numbers));
    System.out.println("Only Evens List: " + pd.evenList(numbers));
  }
}
