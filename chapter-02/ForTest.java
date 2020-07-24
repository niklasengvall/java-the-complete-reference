// Code examples from:
//
// Java The Complete Reference Eleventh Edition
// Comprehensive Coverage of the Java Language
// Author: Herbert Schildt
//
// Rewritten and tested with comments by Niklas Engvall
//
// Chapter: 2 - An overview of Java
// Page:    33
// Title:   The for Loop
// File:    ForTest.java

/*
    Demonstrate the for loop. 
    Call this file "ForTest.java".
*/
class ForTest {
    public static void main(String args[]) {
        // int x;  I removed this line, you can declare and assign a value 
        //         to a variable directly inside the for loop, se below

        // Old for loop 
        // for (x = 0; x < 10; x = x + 1)
        //     System.out.println("This is x: " + x);
        
        // For loops four sections:
        // Initialization; Declare and assign a start value to a variable
        // Condition; in this case run the loop as long as x is lesser than 10
        // Itteration; in this case increase x value by 1
        // Indented statement or block of code to run several times in this case print value of x
        for (int x = 0; x < 10; x++)
            System.out.println("This is x: " + x);
    }
}