//Java Program to Print an Integer (Entered by the User)

import java.util.*;
import java.io.*;

class TakeInput {
    public static void main(String[] args) {
        System.out.println("Enter an Integer: ");
        
        Scanner sc = new Scanner(System.in);
        int integerInput = sc.nextInt();
        
        System.out.print("You Entered: " + integerInput);
    }
}