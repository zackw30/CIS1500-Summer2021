
package project1;

import java.util.Scanner;

public class Project1 {

    public static void main(String[] args) {
        Scanner keyboard  = new Scanner(System.in);
        
        System.out.println("Hello there! What's your name?");
       
        String name = keyboard.nextLine();
        
        System.out.println("Hello " + name);
        System.out.println(name + ", how many total credits are required for you to complete your degree?");
        
        int totalCreditsForDegree = Integer.parseInt(keyboard.nextLine());
        
        System.out.println(name + ", How many credits have you already completed?");
        
        int creditsAlreadyCompleted = Integer.parseInt(keyboard.nextLine());
        
        int creditsLeftToComplete = (totalCreditsForDegree - creditsAlreadyCompleted);
        
        System.out.println("This means you have " + creditsLeftToComplete 
                + " credits left to complete before earning your degree." );
        
        System.out.println(name + ", how many credits do you normally take in each semester?");
        
        int creditsTakenPerSemester = Integer.parseInt(keyboard.nextLine());
        
        System.out.println(name + ", what is the total cost per credit at the college/ university that you attend?");
        
        double costPerCredit = Double.parseDouble(keyboard.nextLine());
        
        int semestersRemaining = (creditsLeftToComplete / creditsTakenPerSemester);
        double semestersRemainingRounded = Math.ceil(semestersRemaining);
        
        double totalCostRemaining = (creditsLeftToComplete * costPerCredit);
        
        System.out.println(name + ", in order to complete your degree, you will need to take " + semestersRemainingRounded
        + " more semesters."
                + " The total cost of the remaining credits is $" + totalCostRemaining );
        
    }
    
}
