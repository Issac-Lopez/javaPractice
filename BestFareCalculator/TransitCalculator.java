/**
 * This program determines the best fare to use in the NYC transit system.
 * 
 * @author Issac Lopez
 * @date 3/26/21
 */
public class TransitCalculator {

  int totalDays;
  int totalRides;
  String[] ridePass = { "Single Ride", "7 Day Unlimited", "30 Day Unlimited" };
  double[] passCost = { 2.75, 33, 127 };

  /**
   * This constructor is used to accept the number of days and rides.
   * Sets the values for the corresponding fields.
   * 
   * @param numDays  days a person is using transit system
   * @param numRides rides person expects to take in given time
   */
  public TransitCalculator(int numDays, int numRides) {
    if (numDays > 0 && numDays < 30 && numRides > 1) {
      totalDays = numDays;
      totalRides = numRides;
    } else
      System.out.println("Invalid settings.");
  }

  /**
   * This method returns the cost of a 7-day Unlimited option.
   * 
   * @return overall price of 7-day Unlimited option
   */
  public double unlimitedSevenDayPrice() {
    double multipler = Math.ceil((double) totalDays / 7);
    // calculate the cost of each ride
    return (passCost[1] * multipler) / totalRides;
  }

  /**
   * This method returns the cost of a 30-day Unlimited option.
   * 
   * @return overall price of 30-day Unlimited option
   */
  public double unlimitedThirtyDayPrice() {
    double multipler = Math.ceil((double) totalDays / 30);
    // calculate the cost of each ride
    return (passCost[2] * multipler) / totalRides;
  }

  /**
   * This method calculates price per ride for each fare option.
   * 
   * @return array of price per ride for the options
   */
  public double[] getRidePrices() {
    double[] ridePrices = { 0, 0, 0 };
    double payPerPrice = passCost[0] * totalDays;
    double sevenDayPrice = unlimitedSevenDayPrice();
    double thirtyDayPrice = unlimitedThirtyDayPrice();

    ridePrices[0] = payPerPrice;
    ridePrices[1] = sevenDayPrice;
    ridePrices[2] = thirtyDayPrice;
    // Print statements to check if RidePrices are correct
    // System.out.println(ridePrices[0]);
    // System.out.println(ridePrices[1]);
    // System.out.println(ridePrices[2]);
    return ridePrices;
  }

  /**
   * Find the best fare to take.
   * 
   * @return fare to buy and how much it will cost per ride
   */
  public String getBestFare() {
    double[] ridePrices = getRidePrices();
    int cheapestIndex = 0;
    for (int i = 0; i < ridePrices.length; i++) {
      // if the current cheapest is bigger than current, make it the new cheapest
      if (ridePrices[i] < ridePrices[cheapestIndex]) {
        cheapestIndex = i;
      }
    }
    return "You should get the " + ridePass[cheapestIndex] + " option at $" + ridePrices[cheapestIndex]
        + " per ride.";
  }

  /**
   * The main method.
   * 
   * @param args
   */
  public static void main(String[] args) {
    TransitCalculator passengerOne = new TransitCalculator(29, 76);
    TransitCalculator passengerTwo = new TransitCalculator(1, 5);
    TransitCalculator passengerThree = new TransitCalculator(7, 32);
    passengerOne.getBestFare();
    passengerTwo.getBestFare();
    passengerThree.getBestFare();
    System.out.println(passengerOne.getBestFare());
    System.out.println(passengerTwo.getBestFare());
    System.out.println(passengerThree.getBestFare());

  }
}
