// Code examples from:
//
// Java The Complete Reference Eleventh Edition
// Comprehensive Coverage of the Java Language
// Author: Herbert Schildt
//
// Rewritten and tested with comments by Niklas Engvall
//
// Chapter: 3 - Data Types, Variables, and arrays
// Page:    39 
// Title:   The Primitive Types 
// File:    TestBoundaries.java

/**
    Prints all primitive datatypes boundaries on the console. 
*/

public class TestBoundaries { 
    public static void main(String[] args) {
        String s = "";
 
        // Byte
        // Format description %-27d = prints decimal integer as left justified 27 characters 
        s = String.format("min = %-27d, max = %d", Byte.MIN_VALUE, Byte.MAX_VALUE); 
        System.out.println(s);
 
        // Short
        s = String.format("min = %,-27d, max = %d", Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.println(s);
 
        // Integer
        s = String.format("min = %,-27d, max = %d", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println(s);
 
        // Long
        s = String.format("min = %,-27d, max = %d", Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.println(s);
 
        // Float
        // Format description %-27s = prints float and double as string, left justified 27 characters 
        s = String.format("min = %-27s, max = %s", Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.println(s);
 
        // Double
        s = String.format("min = %-27s, max = %s", Double.MIN_VALUE, Double.MAX_VALUE);
        System.out.println(s);
 
        // Boolean
        // Format description %-27b = prints boolean value, left justified 27 characters 
        s = String.format("min = %-27b, max = %b", Boolean.FALSE, Boolean.TRUE);
        System.out.println(s);
    }
}