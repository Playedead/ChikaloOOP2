public class Main {
  public static void main(String[] args) {
    Car car = new Car("carOne", 4);
    Car car2 = new Car("carTwo", 4);

    Truck truck = new Truck("truckOne", 6);
    Truck truck1 = new Truck("truckTwo", 10);

    Bicycle bicycle = new Bicycle("bicycleOne", 2);
    Bicycle bicycle1 = new Bicycle("bycicleTwo", 3);

    ServiceStation station = new ServiceStation();
    station.check(car);
    station.check(car2);
    station.check(truck);
    station.check(truck1);
    station.check(bicycle);
    station.check(bicycle1);

  }
}