package parkingLot;

import java.util.*;
import vehicle.*;

public class ParkingLot{

  private List<Level> levels;

  public ParkingLot(int numberOfLevels, int spotsPerLevel){
      this.levels = new ArrayList<Level>();
      for (int i = 1; i <= numberOfLevels; i++) {
          levels.add(new Level(i, spotsPerLevel));
      }
  }

  public List<Level> getLevels(){
    return this.levels;
  }
  public void setLevels(List<Level> levels){
    this.levels = levels;
  }

  public boolean parkVehicle(Vehicle vehicle){
    for( Level level : levels){
        if(level.park(vehicle)){
            return true;
        }
    }
    return false;
  }

  public boolean unparkVehicle(Vehicle vehicle){
    for( Level level : levels){
        if(level.unpark(vehicle)){
            return true;
        }
    }
    return false;
  }
  
}