//Java Program to Compute Quotient and Remainder

import java.util.*;
import java.io.*;

class QuotientRemainder {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Dividend: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Divisor: ");
        int num2 = sc.nextInt();
        
        System.out.print(" Quotient = " + (num1/num2) + "\n Remainder = " + (num1%num2));
    }
}