//Java Program to Find ASCII Value of a character

import java.util.*;
import java.io.*;

class AsciiValue {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter character to find ASCII Value: ");
        char value = sc.next().charAt(0);
        
        int asciiValue = (int)value;
        System.out.print("ASCII Value = " + asciiValue);
    }
}