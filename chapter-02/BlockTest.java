// Code examples from:
//
// Java The Complete Reference Eleventh Edition
// Comprehensive Coverage of the Java Language
// Author: Herbert Schildt
//
// Rewritten and tested with comments by Niklas Engvall
//
// Chapter: 2 - An overview of Java
// Page:    34
// Title:   Using Blocks of Code
// File:    BlockTest.java

/*
    Demonstrates a block of code
    Call this file "BlockTest.java"
*/
class BlockTest {
    public static void main(String[] args) {
        // int x, y;
        // y = 20;
        int y = 20; // Declare and assign a value to y, commented the orginal lines above
        
        // the target of this loop is a block
        // for (x = 0; x < 10; x++) - reemoved this for a better line below
        for (int x = 0; x < 10; x++) { // code block starts here with curly bracers
            // Run all the indented lines below for every itteration until condition is true
            System.out.println("This is x: " + x);
            System.out.println("This is y: " + y);
            // y = y - 2; using a simpler syntax below
            y -= 2; // Same as above
        } // code block ends here
    }
}