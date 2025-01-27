package vehicle;

public abstract class Vehicle {

  String registrationNumber;
  VehicleType vehicleType;

  public Vehicle(String registrationNumber, VehicleType vehicleType){
    this.registrationNumber = registrationNumber;
    this.vehicleType = vehicleType;
  }


  public String getRegistrationNumber() {
    return registrationNumber;
  }

  public VehicleType getVehicleType() {
    return vehicleType;
  }
  
}