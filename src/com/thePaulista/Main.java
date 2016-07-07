package com.thePaulista;

public class Main {

    public static void main(String[] args) {
	 // width of 16 (2 bytes)
        char myChar = '\u00A9';
        System.out.println(myChar);

        // Primitve Types in Java - there are 8, possibly 9 w String

        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        // string (the 9th)

        String myString = "This is a string";
        System.out.printf("myString is equal to %s%n", myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + myChar;
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is " + numberString);

        String lastString = "10";
        int myInt = 50; // this gets converted to a string below
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
            // LastString is equal to 1050

        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("LastString value: " + lastString);
            // LastString value: 1050120.47
    }
}
