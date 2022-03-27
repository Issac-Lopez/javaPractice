/**
 * This program determines whether there is a protein in a strand of DNA.
 * 
 * @author Issac lopez
 * @date 10/19/2021
 */
public class DNA {
  public static void main(String[] args) {
    // -. .-. .-. .-. .
    // \ \ / \ \ /
    // / \ \ / \ \
    // ~ `-~ `-` `-~ `-
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";

    String dna = dna1;
    // Test by uncommenting each one individually
    // String dna = dna2;
    // String dna = dna3;

    // Find the length of dna string
    int length = dna.length();
    System.out.println("Length: " + length);
    // Find start codon
    int start = dna.indexOf("ATG");
    System.out.println("Start: " + start);
    // Find stop codon
    int stop = dna.indexOf("TGA");
    System.out.println("Stop: " + stop);
    // For start, stop codon, and number of nucleotides between start and stop
    if (start != -1 && stop != -1 && (start - stop) % 3 == 0) {
      System.out.println("Conditions 1, 2, & 3 are met.");
      // Add 3 because the start is inclusive and the stop is exclusive
      String protein = dna.substring(start, stop + 3);
      System.out.println("Protein: " + protein);

    } else {
      System.out.println("No protein.");
    }
  }

}
