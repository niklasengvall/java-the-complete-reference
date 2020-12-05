// Code examples from:
//
// Java The Complete Reference Eleventh Edition
// Comprehensive Coverage of the Java Language
// Author: Herbert Schildt
//
// Rewritten and tested with comments by Niklas Engvall
//
// Chapter: 2 - An overview of Java
// Page:    27
// Title:   A First Simple program
// File:    Example.java

/** 
    This is a simple Java program. 
    Call this file "Example.java"
*/
class Example { // Filename and class name should match each other exactly.
    // Your program begins with a call to main().
    // Keyword public tells the compiler that this class method is accessable by code from outside the class
    // Keyword static tells the compiler that this method wont need to be in an instance to be executed
    // Keyword void tells the compiler that main() doesn't return a value. 
    // String args[] is an array of args from class String
    public static void main(String args[]) { 
        // System is a predefined class that let us access systemspecific methods
        // out is the output stream to the console
        // println prints a line of text to the output stream
        System.out.println("This is a simple Java program.");
    }
}