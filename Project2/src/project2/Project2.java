
package project2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Project2 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Hello there! Welcome to my shopping application. Would you like to enter manage item mode "
                + "or shope mode? (m/s)");
        
        String mode = keyboard.nextLine();
              
          if (mode.equalsIgnoreCase("m")){
            System.out.println("Welcome to manage item mode! While in manage item mode, you can enter the name of any"
                    + " item that you'd like to sell.");
            
            String newItemForSale = "";
            
               while (!newItemForSale.equalsIgnoreCase("QUIT")) {
                    System.out.println("What item would you like to sell? or 'QUIT' to stop listing items for sale.");
                     newItemForSale = keyboard.nextLine();
                        
                      PrintWriter outputFile = new PrintWriter(newItemForSale);
                       
                      System.out.println("What price would you like to sell this item for?");
                       double newItemPrice = Double.parseDouble(keyboard.nextLine());
                       
                       System.out.println(newItemForSale + " was made available to purchase for " + newItemPrice);
                       
              
                    outputFile.println(newItemPrice);
                    outputFile.close();   
        }
               
                
          } else {
                System.out.println("Welcome to shop mode! By entering the name of an item you'd like to purchase, "
                        + "we can let you know if that item is available!");
                String itemToPurchase;
                itemToPurchase = "";
                int cartTotal = 0;
                while (!itemToPurchase.equalsIgnoreCase("QUIT")){
                    System.out.println("Enter the name of an item to purchase or 'QUIT' to checkout.");
                   itemToPurchase = keyboard.nextLine(); 
                File file = new File(itemToPurchase);
                Scanner inputFile = new Scanner(file);   
                     int price = inputFile.nextInt();
                     System.out.println("This item was just added to your cart for " + price);
                      cartTotal += price;
                inputFile.close();
          
              }
                 if (itemToPurchase.equals("QUIT")){
                  System.out.println("Welcome to checkout! Your total cost today will be $" + cartTotal + ". What's a "
                          + "valid credit card number that you'd like to use?");
                 int creditCardNumber = Integer.parseInt(keyboard.nextLine());
                 
                 Random randomConfirmationNumber = new Random();
                 int confirmationNumber = randomConfirmationNumber.nextInt(999999) + 000001;
                  System.out.println("Your credit card will be charged for $" + cartTotal + ". Thank you for shopping with "
                          + "us today! Your confirmation number is " + confirmationNumber + ".");
            }
}
}
}

    
