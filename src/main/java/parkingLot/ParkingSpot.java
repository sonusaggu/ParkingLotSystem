package parkingLot;

import vehicle.Vehicle;

public class ParkingSpot {

  private Vehicle vehical;
  private int spotNumber;
  private boolean isAvailable;

  public ParkingSpot(int spotNumber) {
    this.vehical = null;
    this.spotNumber = spotNumber;
    this.isAvailable = true;
  }

  public Vehicle getVehicle() {
    return this.vehical;
  }

  public int getSpotNumber() {
    return this.spotNumber;
  }

  public boolean isAvailable() {
    return this.isAvailable;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehical = vehicle;
  }

  public void setAvailable(boolean available) {
    this.isAvailable = available;
  }

}