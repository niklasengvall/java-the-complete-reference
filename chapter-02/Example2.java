// Code examples from:
//
// Java The Complete Reference Eleventh Edition
// Comprehensive Coverage of the Java Language
// Author: Herbert Schildt
//
// Rewritten and tested with comments by Niklas Engvall
//
// Chapter: 2 - An overview of Java
// Page:    30
// Title:   A Second Short program
// File:    Example2.java

/*
    Here is another short example. 
    Call this file "Example2.java"
 */
class Example2 {

    public static void main(String[] args) {
        int num; // declares a variable called num

        num = 100; // Assigns num the value of 100

        // print some text and the value of num on the console
        System.out.println("This is num: " + num);

        num = num * 2; // multiplies num with 2 and assign the new value to num

        // print some text without a newline
        System.out.print("The value of num * 2 is ");
        // print the value of variable num right beside the text printed on the line above
        // remark the difference between print and println methods
        System.out.println(num);
    }
}