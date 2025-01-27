package vehicle;

public class VehicleFactory{

  public static Vehicle getVehicle(String registrationNumber, VehicleType vehicleType){
    switch(vehicleType){
      case CAR:
        return new Car(registrationNumber, vehicleType);
      case TRUCK:
        return new Truck(registrationNumber, vehicleType);
      default:
        return null;
    }
  }
}