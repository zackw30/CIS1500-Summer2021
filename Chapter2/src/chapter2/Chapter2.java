package chapter2;

/*
multi
line
comment
 */
public class Chapter2 {

    // single line comment
    public static void main(String[] args) {
        System.out.println("Hi there!");
        System.out.print("printing without a new line");
        System.out.print("here's a second print without the new line");

        System.out.println("Here's a new line finally");

        System.out.print("You can have special characters for new lines \n");
        System.out.println("Billy said \"Hi there!\"");

        // variable named 'name'
        String name = "Eric Charnesky";

        System.out.println(name);

        int favoriteNumber = 42;

        System.out.println(favoriteNumber);

        // print line is smart enough to concatenate the int with the string, 
        //    not try to add
        System.out.println(name + "'s favorite number is: " + favoriteNumber);

        // int + int and you get arithmetic
        System.out.println(favoriteNumber + 10);

        // multi line strings, you NEED to append/concatenate/ use the + operator
        System.out.println("I'm going tell you a joke"
                + "\nWhat's a pirates favorite letter?"
                + "\nIt be the C!");

        System.out.println("Here's another pirate joke"
                + "\nWhere does a pirate keep their cookies?"
                + "\nIn a cookie jarrrrr!");

        System.out.println("10 * 10 == " + 10 * 10);

        // camel casing, each next word gets a capital letter
        String myFullName = "Eric Charnesky";
        String myfullname = "Eric Charnesky";
        String a = "Eric Charnesky";

        // characters in single quotes
        char firstNameInitial = 'E';

        int squaresOne = 1;
        int squaresTwo = 2;
        int squaresThree = 3;

        // the stuff on the right happens before the assignment to the left
        squaresOne = squaresOne * squaresOne;

        squaresTwo = squaresTwo * squaresTwo;

        // number with a decimal place - constant value, can't be changed
        final double PI_APROXIMATE = 3.1415926;

        System.out.println(PI_APROXIMATE);

        double circleRadius = 4;
        double circleCircumference = PI_APROXIMATE * circleRadius * 2;
        double circleArea = PI_APROXIMATE * circleRadius * circleRadius;

        System.out.println("The circumference of a circle with a radius of "
                + circleRadius + " is: " + circleCircumference
                + "\nand the area is: " + circleArea);

        float smallerNumberWithADecimal = 98.7f;
        System.out.println(Double.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);

        // integer division, gives integer results - no rounding, trucation of the decimal
        System.out.println("11 / 3 == " + 11 / 3);

        // double divided by integer, or int divided by a double, gives a double result
        System.out.println("10.0 / 3 == " + 10.0 / 3);

        boolean ericLikesJokes = true;

        char lastNameInitial = 'C';

        // characters are stored as 2 bytes, unicode value
        System.out.println(firstNameInitial);
        System.out.println(lastNameInitial);

        // 69 for E + 67 for C
        System.out.println(firstNameInitial + lastNameInitial);

        // string + charcter == string
        System.out.println(firstNameInitial + "" + lastNameInitial);

        // delcaring multile variables of the same type
        char middleNameInitial, hypenatedLastNameInitial;

        // assigining or initialzing the value
        middleNameInitial = 'T';
        hypenatedLastNameInitial = 'S';

        System.out.println(favoriteNumber);
        favoriteNumber = 101;
        System.out.println(favoriteNumber);

        int firstNumber = 34;
        int secondNumber = 8;
        
        // modulus - integer remainder
        System.out.println(firstNumber + " / " + secondNumber + 
                " == " + firstNumber / secondNumber +
                " remainder " + firstNumber % secondNumber );
        
        System.out.println("9 + 4 / 2 + 3 == " + (9 + 4 / 2 + 3));
        
        System.out.println("9 + 4 / 2(4) + 3 == " + (9 + 4 / 2 * 4 + 3));
        
        
        int result = firstNumber + secondNumber;
        
        result = result + 10;
        
        // combined assignment operator
        result += 10;
        
        
        System.out.println("The number of characters in 'Eric Charnesky' is: " 
                + name.length());
        
        // declares a strig variable - saves space the size of a memory address
        String anotherName;
        
        // gets enough memory to store "John Baugh" and stores the memeory address of that
        // in the anotherName variable
        anotherName = "John Baugh";
        
        // gets memory to store "Ian Leath" and updates the anotherName to store that address
        anotherName = "Ian Leath";
        
        String moreName = anotherName;
        
        moreName = "Bob";
        
        System.out.println(anotherName);
        System.out.println(moreName);
        
        
        System.out.println(firstNumber);
        
        int moreNumber = firstNumber;
        
        moreNumber += 10;
        
        System.out.println(moreNumber);
        System.out.println(firstNumber);
        
        
        
        
    }
}
