public class Car extends Truck implements UpdateTyre, CheckEngine {

  public void updateTyre() {
    System.out.println("Меняем покрышку");
  }

  public void checkEngine() {
    System.out.println("Проверяем двигатель");
  }

  public Car(String modelName, int wheelsCount) {
    super(modelName, wheelsCount);
  }
}