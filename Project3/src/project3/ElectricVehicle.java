
package project3;

public class ElectricVehicle {
    
    private String make;
    private String model;
    private String color;
    private double kilometersPerKilowattHour;
    private double maxKilowattHoursInBattery;
    private double currentKilowattHoursInBattery;
    
    
    
    public String getMake(){
            return make;          
    }
    
    public String getModel(){
            return model;  
    }
    
    public String getColor(){
            return color; 
    }
    
    public void setColor(String color){
            this.color = color;     
    }
    
    public double getKilometersPerKilowattHour(){
            return kilometersPerKilowattHour;
    }
    
    public double getMaxKilowattHoursInBattery(){
            return maxKilowattHoursInBattery;
    }
    
    public double getCurrentKilowattHoursInBattery(){
            return currentKilowattHoursInBattery;
    }

    
    
    public ElectricVehicle(String make, String model, String color, double kilometersPerKilowattHour, 
            double maxKilowattHoursInBattery){
     this.make = make;
     this.model = model;
     setColor(color);
     this.kilometersPerKilowattHour = kilometersPerKilowattHour;
     this.maxKilowattHoursInBattery = maxKilowattHoursInBattery; 
     currentKilowattHoursInBattery = 0;
    }
    
    
    
    public void charge(int kilowattHoursGainedFromCharging){
        if (kilowattHoursGainedFromCharging < 0) {
            kilowattHoursGainedFromCharging = 0; 

    }    else{   
            currentKilowattHoursInBattery += kilowattHoursGainedFromCharging;
            
            if (currentKilowattHoursInBattery > maxKilowattHoursInBattery || 
                    kilowattHoursGainedFromCharging > maxKilowattHoursInBattery){
                currentKilowattHoursInBattery = maxKilowattHoursInBattery;

            }
        }
    }
    
    
    public boolean drive(int kilometersToDrive){
       boolean ableToDriveTheDistance = true;
       
        if (kilometersToDrive < 0){
         kilometersToDrive = 0;
         ableToDriveTheDistance = true;
        } 
        else{
            if (kilometersToDrive <= (currentKilowattHoursInBattery * kilometersPerKilowattHour)) {           
           currentKilowattHoursInBattery -= (kilometersToDrive / kilometersPerKilowattHour);
           ableToDriveTheDistance = true;
            }
            if (kilometersToDrive > (currentKilowattHoursInBattery * kilometersPerKilowattHour)){
          currentKilowattHoursInBattery = 0;
          ableToDriveTheDistance = false;
            }
        }
        return ableToDriveTheDistance;
    }



}
