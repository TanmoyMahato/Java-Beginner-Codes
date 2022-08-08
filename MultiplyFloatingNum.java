//Java Program to Multiply two Floating Point Numbers

import java.util.*;
import java.io.*;

class FloatingProduct {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 1st Decimal Number: ");
        float num1 = sc.nextFloat();
        
        System.out.println("Enter 2nd Decimal Number: ");
        float num2 = sc.nextFloat();
        
        System.out.print("SUM = " + (num1*num2));
    }
}