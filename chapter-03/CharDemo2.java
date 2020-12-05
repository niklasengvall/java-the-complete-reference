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
// Title:   Characters 
// File:    CharDemo2.java

/**
    Demonstrate that char variables can behave like integers in arithmetic operations. 
*/
public class CharDemo2 {
    public static void main(String[] args) {
        char ch1 = 'A'; // Declaration and initiation on one row, changed X to A
        System.out.println("ch1 contains " + ch1); // Prints an A

        ch1++; // Add 1 to ch1
        System.out.println("ch1 is now " + ch1); // Prints an B
    }
}