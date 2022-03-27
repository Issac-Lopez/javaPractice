import java.util.Scanner;

/**
 * This program will print out a continent and the largest city in that
 * continent, based on the value of an integer from user input.
 * 
 * @author Issac Lopez
 * @Date 10/27/21
 */
public class Continents {
  public static void main(String[] args) {
    try (Scanner obj = new Scanner(System.in)) {
      System.out.println("Enter number number between 1-7: ");
      int continent = obj.nextInt();
      switch (continent) {
        case 1:
          System.out.println("North America: Mexico City, Mexico");
          break;
        case 2:
          System.out.println("South America: Sao Paulo, Brazil");
          break;
        case 3:
          System.out.println("Europe: Moscow, Russia");
          break;
        case 4:
          System.out.println("Africa: Lagos, Nigeria");
          break;
        case 5:
          System.out.println("Asia: Shanghai, China");
          break;
        case 6:
          System.out.println("Australia: Sydney, Australia");
          break;
        case 7:
          System.out.println("Antarctica: McMurdo Station, US");
          break;
        default:
          System.out.println("Undefine Contintent");

      }
    }
  }
}
