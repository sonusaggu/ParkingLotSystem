package parkingLot;

import java.util.*;
import vehicle.Vehicle;

public class Level {
  private int levelNumber;
  private List<ParkingSpot> parkingSpots;

  public Level(int levelNumber, int capacity) {
    this.levelNumber = levelNumber;
    this.parkingSpots = new ArrayList<ParkingSpot>();
    
    for (int i = 0; i < capacity; i++) {
      ParkingSpot parkingSpot = new ParkingSpot(i);
      this.parkingSpots.add(parkingSpot);
    }
  }

  public int getLevelNumber() {
    return this.levelNumber;
  }

  public List<ParkingSpot> getParkingSpots() {
    return this.parkingSpots;
  }

  
  public void setParkingSpots(List<ParkingSpot> parkingSpots){
    this.parkingSpots = parkingSpots;
  }

  public boolean park(Vehicle vehicle){
    for(ParkingSpot parkingSpot : this.parkingSpots){
      if(parkingSpot.isAvailable()){
        parkingSpot.setVehicle(vehicle);
        parkingSpot.setAvailable(false);
        return true;
      }
    }
    return false;
  }

  public boolean unpark(Vehicle vehicle){
    for(ParkingSpot parkingSpot : this.parkingSpots){
      if(parkingSpot.getVehicle() == vehicle){
        parkingSpot.setVehicle(null);
        parkingSpot.setAvailable(true);
        return true;
      }
    }
    return false;
  }

  
}