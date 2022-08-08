//Java Program to Add Two Integers

import java.util.*;
import java.io.*;

class AddTwoInteger {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 1st Integer: ");
        int num1 = sc.nextInt();
        
        System.out.println("Enter 2nd Integer: ");
        int num2 = sc.nextInt();
        
        System.out.print("SUM = " + (num1+num2));
    }
}