package uml;

public class Cube extends Bike {
  private String model;

  @Override
  public void printPrice() {
    System.out.println("Cube Price");
  }

  @Override
  public String getModel() {
    return model;
  }

  @Override
  public void setModel(String model) {
    this.model = model;
  }
}
