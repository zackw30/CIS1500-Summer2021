
package project3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ElectricVehicleTest {

    public ElectricVehicleTest() {
    }
    

    @Test
    public void testGetMake() {
        ElectricVehicle firstCar = new ElectricVehicle("Honda", "Accord", "Charcoal", 30, 50); 
        String expectedMake = "Honda";
        
        String actualMake = firstCar.getMake();
        
        assertEquals(expectedMake, actualMake);
    }

    
    @Test
    public void testGetModel() {
        ElectricVehicle firstCar = new ElectricVehicle("Honda", "Accord", "Charcoal", 30, 50); 
        String expectedModel = "Accord";
        
        String actualModel = firstCar.getModel();
        
        assertEquals(expectedModel, actualModel);
    }

    
    @Test
    public void testSetColor() {
        // Arrange 
        ElectricVehicle firstCar = new ElectricVehicle("Honda", "Accord", "Charcoal", 30, 50); 
        String expectedColor = "Charcoal";
        
        // Act - call the code we're testing 
        firstCar.setColor(expectedColor);
        String actualColor = firstCar.getColor();
            
        // Assert - compare values
        assertEquals(expectedColor, actualColor);
    }
    

    
    @Test
    public void testGetKilometersPerKilowattHour() {
        ElectricVehicle firstCar = new ElectricVehicle("Honda", "Accord", "Charcoal", 30, 50); 
        double expectedKilometersPerKilowattHour = 30;
        
        double actualKilometersPerKilowattHour = firstCar.getKilometersPerKilowattHour();
        
        assertEquals(expectedKilometersPerKilowattHour, actualKilometersPerKilowattHour, 0);
    }

    
    @Test
    public void testGetMaxKilowattHoursInBattery() {
        ElectricVehicle firstCar = new ElectricVehicle("Honda", "Accord", "Charcoal", 30, 50); 
        double expectedMaxKilowattHoursInBattery = 50;
        
        double actualMaxKilowattHoursInBattery = firstCar.getMaxKilowattHoursInBattery();
        
        assertEquals(expectedMaxKilowattHoursInBattery, actualMaxKilowattHoursInBattery, 0);
    }

    
    @Test
    public void testGetCurrentKilowattHoursInBattery() {
        ElectricVehicle firstCar = new ElectricVehicle("Honda", "Accord", "Charcoal", 30, 50); 
        double expectedCurrentKilowattHoursInBattery = 0;
        
        double actualCurrentKilowattHoursInBattery = firstCar.getCurrentKilowattHoursInBattery();
        
        assertEquals(expectedCurrentKilowattHoursInBattery, actualCurrentKilowattHoursInBattery, 0);
    }

    
    @Test
    public void testChargeWithNegativeValue() {
        // Arrange - setup all variables needed to run method
        ElectricVehicle firstCar = new ElectricVehicle("Honda", "Accord", "Charcoal", 30, 50);
        firstCar.charge(-1);
        double expectedKilowattHoursGainedFromCharging = 0;
        
        // Act - call the code we're testing 
        double actualKilowattHoursGainedFromCharging = firstCar.getCurrentKilowattHoursInBattery();
        
        // Assert - compare values
        assertEquals(expectedKilowattHoursGainedFromCharging, actualKilowattHoursGainedFromCharging, 0);
    }

    @Test
    public void testChargeWithValidValue() {
        // Arrange - setup all variables needed to run method
        ElectricVehicle firstCar = new ElectricVehicle("Honda", "Accord", "Charcoal", 30, 50);
        firstCar.charge(10);
        int expectedCurrentKilowattHoursInBattery = 10;
        
        // Act - call the code we're testing 
        double actualCurrentKilowattHoursInBattery = firstCar.getCurrentKilowattHoursInBattery();
        
        // Assert - compare values
        assertEquals(expectedCurrentKilowattHoursInBattery, actualCurrentKilowattHoursInBattery, 0);
    }
    
    @Test
    public void testChargeWithOverMaxValue() {
        // Arrange - setup all variables needed to run method
        ElectricVehicle firstCar = new ElectricVehicle("Honda", "Accord", "Charcoal", 30, 50);
        firstCar.charge(51);
        int expectedCurrentKilowattHoursInBattery = 50;
        
        // Act - call the code we're testing 
        double actualCurrentKilowattHoursInBattery = firstCar.getCurrentKilowattHoursInBattery();
        
        // Assert - compare values
        assertEquals(expectedCurrentKilowattHoursInBattery, actualCurrentKilowattHoursInBattery, 0);
    }
    
    @Test
    public void testDriveWithNegativeValue() {
        ElectricVehicle firstCar = new ElectricVehicle("Honda", "Accord", "Charcoal", 30, 50);
        firstCar.drive(-1);
        boolean expectedBoolean = true;
        
        
        boolean actualBoolean = firstCar.drive(-1);
        
        assertEquals(expectedBoolean, actualBoolean);
    }
   
    @Test
    public void testDriveWithValidValue() {
        ElectricVehicle firstCar = new ElectricVehicle("Honda", "Accord", "Charcoal", 30, 50);
        firstCar.drive(0);
        boolean expectedBoolean = true;
        
        
        boolean actualBoolean = firstCar.drive(0);
        
        assertEquals(expectedBoolean, actualBoolean);
    }

  @Test
    public void testDriveWithOverMaxValue() {
        ElectricVehicle firstCar = new ElectricVehicle("Honda", "Accord", "Charcoal", 30, 50);
        firstCar.drive(50000);
        boolean expectedBoolean = false;
        
        
        boolean actualBoolean = firstCar.drive(50000);
        
        assertEquals(expectedBoolean, actualBoolean);
    }
    
}
