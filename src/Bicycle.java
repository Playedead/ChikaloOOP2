public class Bicycle extends Truck implements UpdateTyre {

  public void updateTyre() {
    System.out.println("Меняем покрышку");
  }

  public Bicycle(String modelName, int wheelsCount) {
    super(modelName, wheelsCount);
  }
}