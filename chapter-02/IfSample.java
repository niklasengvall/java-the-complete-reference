// Code examples from:
//
// Java The Complete Reference Eleventh Edition
// Comprehensive Coverage of the Java Language
// Author: Herbert Schildt
//
// Rewritten and tested with comments by Niklas Engvall
//
// Chapter: 2 - An overview of Java
// Page:    32
// Title:   The If Statement
// File:    IfSample.java

/*
    Demonstrate the if. 
    Call this file "IfSample.java".
*/
public class IfSample {
    public static void main(String args[]) {
        int x, y; // declare two variables of same type with , separator

        x = 10; // assign values to the variables
        y = 20;

        // Control statement If checks if value of variable x is lesser than the value of variable y
        // If it's true it will run the indented line right beneath the if statement
        // otherwise the jvm will just go ahead to the next line 
        if (x < y)
            System.out.println("x is less than y");

        x = x * 2; // multiply x with 2 and assign the new value to x, x is now 20

        // Check if x is equal to y and print the indented line if so
        if (x == y)
            System.out.println("x now equal to y");

        x = x * 2; // multiply x again, x is now 40

        // Check if x is greater than y and if true, run the indented line
        if (x > y)
            System.out.println("x now greater than y");
        
        // x is bigger now, x = 40 and y = 20, so this if statemant won't be true
        if (x == y)
            System.out.println("you won't see this");
    }
}