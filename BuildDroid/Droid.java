/**
 * This program builds a droid from scratch.
 * 
 * @Issac Lopez
 * @Date 10/27/2021
 */
public class Droid {
  int batteryLevel;
  String name = "";

  /**
   * Constructor
   * 
   * @param droidName name of the droid
   */
  public Droid(String droidName) {
    name = droidName;
    batteryLevel = 100;
  }

  /**
   * This method is a task that a droid completes effecting battery life.
   * 
   * @param task to be completed
   */
  public void performTask(String task) {
    batteryLevel = batteryLevel - 10;
    System.out.println(" task: " + task);
  }

  /**
   * This method creates instances of a droid.
   * 
   * @return name of the droid
   */
  public String toString() {
    return "\nDroid name is: " + name;
  }

  /**
   * This method reports the energy level in the battery of the droid.
   */
  public void energyReport() {
    System.out.println(" " + name + " battery level:" + batteryLevel + "%");
  }

  /**
   * This method exchanges the battery level between instances.
   * 
   * @newBatteryLevel level of the new battery
   */
  public void energyTransfer(int newBatteryLevel) {
    this.batteryLevel = newBatteryLevel;
    System.out.println(name + " battery level after energy transfer: " + newBatteryLevel);
  }

  public static void main(String[] args) {
    Droid codey = new Droid("Codey");
    Droid tom = new Droid("Tom");

    System.out.println(codey);
    codey.performTask("initializing");
    codey.performTask("dancing");
    codey.energyReport();
    codey.performTask("running");
    codey.performTask("computing");
    codey.energyReport();
    tom.energyTransfer(codey.batteryLevel);

    System.out.println(tom);
    tom.performTask("coding");
    tom.energyReport();
    codey.energyTransfer(tom.batteryLevel);
    tom.energyReport();
    codey.energyReport();
  }

}
