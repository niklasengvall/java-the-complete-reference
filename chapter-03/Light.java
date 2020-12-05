// Code examples from:
//
// Java The Complete Reference Eleventh Edition
// Comprehensive Coverage of the Java Language
// Author: Herbert Schildt
//
// Rewritten and tested with comments by Niklas Engvall
//
// Chapter: 3 - Data Types, Variables, and Arrays
// Page:    41
// Title:   long
// File:    Light.java

/** 
    Compute distance light travels using long variables.
    I changed the file from original as you can see below and when compiled
    the class file (bytecode) is smaller compared to the compiled original.
*/
class Light {
    public static void main(String args[]) {
    /* Removed this original lines so you see how you can shrink the code
    int lightspeed;
    long days;
    long seconds;
    long distance;
    */
        // approximate speed of light in miles/second and m/s
        int lightspeed = 186000, ls_metric = 299792458; // added metric value
        // specify days here, leave the rest it computes numbers of seconds and the distance
        long days = 1000, seconds = days * 24 * 60 * 60, distance = lightspeed * seconds, distance_metric = ls_metric * seconds;

        /* Removed this original lines and shrinked the code so it's more readable
        lightspeed = 186000; removed, declared and assigned above
        days = 1000; removed, declared and assigned above
        seconds = days * 24 * 60 * 60; removed, declared and assigned above
        distance = lightspeed * seconds; removed, declared and assigned above
        
        System.out.print("In " + days);
        System.out.print(" days light will travel about ");
        System.out.println(distance + " miles.");
        */

        System.out.println("In " + days + " days light will travel about " + distance + " miles.");
        System.out.println("In " + days + " days light will travel about " + distance_metric + " meters.");
    }
}