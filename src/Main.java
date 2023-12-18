import Transport.Bicycle;
import Transport.Car;
import Transport.Transport;
import Transport.Truck;

public class Main {
  public static void main(String[] args) {
    Bicycle bicycle = new Bicycle("bicycle1");
    Car car = new Car("BMW");
    Truck truck = new Truck("Volvo", 10);

    Transport[] transports = new Transport[]{bicycle, car, truck};
    for (Transport transport : transports) {
      transport.check();

    }
  }
}