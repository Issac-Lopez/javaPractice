/**
 * This is a simple car loan payment calculator from Codecadamy Learn Java
 * 
 * @author Issac Lopez
 * @Date 10/27/2021
 */
public class CarLoan {
  public static void main(String[] args) {
    int carLoan = 10000;
    int loanLength = 3; // In years
    int interestRate = 5; // Percentage
    int downPayment = 2000;

    if (loanLength <= 0 || interestRate <= 0) {
      System.out.println("Error! Must take out a calid car loan!!");
    } else if (downPayment >= carLoan) {
      System.out.println("The car can be paid in full.");

    } else {
      int remainingBalance = carLoan - downPayment;
      int months = loanLength * 12;
      int monthlyBalance = remainingBalance / months;
      int interest = (monthlyBalance * interestRate) / 100;
      int monthlyPayment = monthlyBalance + interest;

      System.out.println(monthlyPayment);

    }

  }

}
