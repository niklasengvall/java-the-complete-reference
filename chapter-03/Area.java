// Code examples from:
//
// Java The Complete Reference Eleventh Edition
// Comprehensive Coverage of the Java Language
// Author: Herbert Schildt
//
// Rewritten and tested with comments by Niklas Engvall
//
// Chapter: 3 - Data Types, Variables, and arrays
// Page:    42
// Title:   double 
// File:    Area.java

/**
    Compute the area of a circle and use double datatype to maintain accuracy. 
*/
public class Area {

    public static void main(String[] args) {
        double pi, r, a; // double keyword uses 64 bits to store a value

        r = 10.8;        // radius of circle
        pi = 3.1416;     // define the pi constant approximately
        a = pi * r * r;  // calculate the area and store it i the "a" variable

        System.out.println("Area of circle is " + a);
    }
}