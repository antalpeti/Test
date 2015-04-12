package uml;

public class Bike implements BikeInf {
  private String model;

  @Override
  public void printPrice() {}

  @Override
  public String getModel() {
    return model;
  }

  @Override
  public void setModel(String model) {
    this.model = model;
  }
}
