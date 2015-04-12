package uml;

import java.util.ArrayList;

public class Pilot {
  private MotorBike[] vehicles;
  ArrayList<MotorBike> MotorBikeList = new ArrayList<MotorBike>();

  public Pilot() {
    vehicles = new MotorBike[2];
    vehicles[0] = new MotorBike("Yamaha");
    vehicles[1] = new MotorBike("Suzuki");

    MotorBikeList.add(new MotorBike("BMW"));
    MotorBikeList.add(new MotorBike("MDK"));
  }
}
