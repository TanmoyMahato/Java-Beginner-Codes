// Java program to check given number is positive or negative

import java.util.*;
import java.io.*;

class CheckPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number to check: ");
        int num = sc.nextInt();
        
        if(num>0)
        {
            System.out.println(num +" is Positive");
        }
        else
        {
            System.out.println(num +" is Negative");
        }
        
    }
}