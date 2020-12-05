// Code examples from:
//
// Java The Complete Reference Eleventh Edition
// Comprehensive Coverage of the Java Language
// Author: Herbert Schildt
//
// Rewritten and tested with comments by Niklas Engvall
//
// Chapter: 3 - Data Types, Variables, and arrays
// Page:    44
// Title:   Booleans  
// File:    BoolTest.java

/**
    Demonstrate boolean values 
*/
public class BoolTest {

    public static void main(String[] args) {
        // Assign boolean values and print the result with the boolean notation
        boolean b = false; // set variable b to boolean value false
        System.out.println("b is " + b);
        b = !b; // Same as b = true, we invert the value with !
        System.out.println("b is " + b);

        // Test if value of b is true, if so, execute the row beneath the if statement
        if(b)
            System.out.println("This is executed.");

        b = false; 
        if(b) // The simplest if condition just executes if its a value above zero or true
            System.out.println("This is not executed."); // Won't be printed, b is false

        System.out.println("10 > 9 is " + (10 > 9)); // Prints the result of the logical test, true
    }
}