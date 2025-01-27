// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import parkingLot.*;
import vehicle.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello Welcome To Parking Lot System!!");

    ParkingLotManager parkingLotManager = new ParkingLotManager(1, 2);

    Vehicle vehical1 = VehicleFactory.getVehicle("KA-01-HH-1234", VehicleType.CAR);
    Vehicle vehical2 = VehicleFactory.getVehicle("KA-01-HH-1235", VehicleType.CAR);
    Vehicle vehical3 = VehicleFactory.getVehicle("KA-01-HH-1236", VehicleType.TRUCK);

    parkingLotManager.parkVehicle(vehical1);
    parkingLotManager.parkVehicle(vehical2);
    parkingLotManager.parkVehicle(vehical3);

    parkingLotManager.unparkVehicle(vehical2);

    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}