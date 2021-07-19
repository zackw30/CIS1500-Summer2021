
package project3;

import java.util.Scanner;

public class Project3 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("What is the color of the car?");
        String color = keyboard.nextLine();
        
            ElectricVehicle firstCar = new ElectricVehicle("Honda", "Accord", "Charcoal", 30, 50);        
            
            firstCar.setColor(color);
        
        System.out.println("Your car is " + firstCar.getColor());
        
 
     firstCar.charge(90);
        System.out.println("your car's battery is at " + firstCar.getCurrentKilowattHoursInBattery());
    
     firstCar.getMake();
        System.out.println("Your car's make is " + firstCar.getMake());
                
        
    }
    
   
  
    
    
     
        
        
    
    
    
    }
    

