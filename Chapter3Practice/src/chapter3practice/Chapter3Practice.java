
package chapter3practice;

import java.util.Random;
import java.util.Scanner;

public class Chapter3Practice {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
       
        System.out.println("What's your favorite number?");
        int favNumber = Integer.parseInt(keyboard.nextLine());
        
        System.out.println("that means your fav number is " + favNumber + "?");
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        
        int cartTotal = 0;
        System.out.println("Welcome to checkout! Your total cost today will be " + cartTotal + ". What's a "
                          + "valid credit card number that you'd like to use?");
                 int creditCardNumber = Integer.parseInt(keyboard.nextLine());
                 
                 Random randomConfirmationNumber = new Random();
                 int confirmationNumber = randomConfirmationNumber.nextInt(999999) + 000001;
                  System.out.println("Your credit card will be charged for " + cartTotal + ". Thank you for shopping with "
                          + "us today! Your confirmation number is " + confirmationNumber + ".");
    }
              
  } 
