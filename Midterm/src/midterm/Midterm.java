
package midterm;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Midterm {
    public static void main(String[] args) throws FileNotFoundException {
        
       Scanner keyboard = new Scanner(System.in);
       
       PrintWriter outputFile = new PrintWriter("classes.txt");
       
       String classesToTake = ""; 
       
       while (!classesToTake.equalsIgnoreCase("STOP")){
           System.out.println("Enter a class that you need to take and we'll add it to a list, or 'STOP' to stop adding "
                   + "classes to the list.");
           classesToTake = keyboard.nextLine();
           outputFile.println(classesToTake);     
        }
       
       outputFile.close();   
    
    
    
    
    int result = plusMinusMultiply(2, 4, 5, 8);
        System.out.println(result);
    
    
    } 
       
    
    
    public static int plusMinusMultiply(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber){
        int result = ((firstNumber + secondNumber) - thirdNumber) * fourthNumber;
        return result;
    }
       
}
