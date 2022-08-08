//Java Program to Swap Two Numbers

import java.util.*;
import java.io.*;

class Swapping {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter value of A: ");
        int a = sc.nextInt();
        System.out.println("Enter value of B: ");
        int b = sc.nextInt();
        
        a = a+b;
        b = a-b;
        a = a-b;
        
        System.out.print(" value of A = " + a + "\n Value of B = " + b);
    }
}