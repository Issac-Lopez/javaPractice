public class Language {
  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

  // constructor
  public Language(String langName, int speakers, String regions, String wdOrder) {
    this.name = langName;
    this.numSpeakers = speakers;
    this.regionsSpoken = regions;
    this.wordOrder = wdOrder;
  }

  public void getInfo() {
    System.out.println(this.name + " is spoken by " + this.numSpeakers +
        " people mainly in " + this.regionsSpoken + ".");
    System.out.println("The language follows the word order: " + this.wordOrder);

  }

  // main method
  public static void main(String[] args) {
    Language eng = new Language("English", 5, "North America & Europe", "The right word order.");
    Mayan chontal = new Mayan("Chontal", 38000);
    SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 2000000);
    SinoTibetan burmese = new SinoTibetan("Burmese", 10000000);
    eng.getInfo();
    System.out.println();
    chontal.getInfo();
    System.out.println();
    mandarin.getInfo();
    System.out.println();
    burmese.getInfo();

  }
}