// Code examples from:
//
// Java The Complete Reference Eleventh Edition
// Comprehensive Coverage of the Java Language
// Author: Herbert Schildt
//
// Rewritten and tested with comments by Niklas Engvall
//
// Chapter: 3 - Data Types, Variables, and arrays
// Page:    43
// Title:   Characters 
// File:    CharDemo.java

/**
    Demonstrate char data type with a swedish twist 
*/
public class CharDemo {

    public static void main(String[] args) {
        char ch1, ch2, ch3;

        ch1 = 88;
        ch2 = 'Y';
        ch3 = 0x00E4; // swedish letter ä phonetic equals to ae, note I use hexadecimal literal 0x 

        System.out.print("ch1, ch2 and ch3 ");
        System.out.println(ch1 + " " + ch2 + " " + ch3);
    }
}