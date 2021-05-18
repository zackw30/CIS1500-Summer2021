package chapter2.inputexamples;

import java.util.Scanner;

public class Chapter2InputExamples {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Hello World!");

        System.out.println("What's your name?");
        String name = keyboard.nextLine();

        System.out.println("Hello " + name);

        System.out.println(name + ", please enter a temperature in Farenheit");
        int temperatureInFarenheit = Integer.parseInt(keyboard.nextLine());

        System.out.println("That is " + ((temperatureInFarenheit - 32) / 9 * 5)
                + " in Celcius");

        System.out.println("What's the radius of your circle?");
        double radius = Double.parseDouble(keyboard.nextLine());

        System.out.println("The circumference is: " + Math.PI * radius * 2);
        System.out.println("The area is: " + Math.PI * radius * radius);

        System.out.println("Enter a number, including decimal places");
        double number = Double.parseDouble(keyboard.nextLine());
        
        System.out.println("Your number rounded is: " + Math.round(number));
        System.out.println("Your number rounded down: " + Math.floor(number));
        System.out.println("Your number rounded up: " + Math.ceil(number));
        
        

    }

}
