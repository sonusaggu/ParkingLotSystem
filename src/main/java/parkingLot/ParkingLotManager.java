package parkingLot;

import vehicle.Vehicle;

public class ParkingLotManager{

  private static ParkingLotManager instance;
  private ParkingLot parkingLot;

  public ParkingLotManager(int numOfLevels, int spotsPerLevel){
    this.parkingLot = new ParkingLot(numOfLevels, spotsPerLevel);
  }

  public void parkVehicle(Vehicle vehicle){
    if(parkingLot.parkVehicle(vehicle)){
       System.out.println("Vehicle " + vehicle.getRegistrationNumber() + " parked successfully.");
    }else{
      System.out.println("Parking lot is full.");
    }
  }

  public void unparkVehicle(Vehicle vehicle){
    if(parkingLot.unparkVehicle(vehicle)){
       System.out.println("Vehicle " + vehicle.getRegistrationNumber() + " unparked successfully.");
    }else{
      System.out.println("Already parking spot is vacant.");
    }
  }

  public static ParkingLotManager getInstance(int numOfLevels, int spotsPerLevel){
    if(instance == null){
        instance = new ParkingLotManager(numOfLevels, spotsPerLevel);
        return instance;
    }

    return instance;
  }
}