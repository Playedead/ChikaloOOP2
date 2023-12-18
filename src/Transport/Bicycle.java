package Transport;

public class Bicycle extends Transport {

  public static final Integer WHEELS =2;

  public Bicycle(String modelName) {
    super(modelName, WHEELS);
  }

  @Override
  public void check() {
    updateTyre();
  }
}