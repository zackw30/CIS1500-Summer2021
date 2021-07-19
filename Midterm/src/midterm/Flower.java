
package midterm;

public class Flower {
    
    private String name;
    private String color;
    private String smell;
    private int numberOfPetals;
    
    
    
    public String getName(){
        return name;
    }
    
    
    public String getColor(){
        return color;
    }
     
    
    public String getSmell(){
        return smell;
    } 
    
    
    public int getNumberOfPetals(){
        return numberOfPetals;
    }
        
    
    public void pickAPetal(){
        if (numberOfPetals > 0){
            numberOfPetals -= 1;
        } else {
            numberOfPetals = 0;
        }   
    }
    
}
