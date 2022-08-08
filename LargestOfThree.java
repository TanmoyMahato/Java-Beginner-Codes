//Java Program to Find the Largest Among Three Numbers

import java.util.*;
import java.io.*;

class LargestOfThree {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 1st NUmber: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd Number: ");
        int c = sc.nextInt();
        
        if(a>b)
        {
         if(a>c)
          System.out.print(a + " is Largest");
         else
          System.out.print(c + " is Largest");
        }
        else
        {
         if(b>c)
          System.out.print(b + " is Largest");
         else
          System.out.print(c + " is Largest");
        }

    }
}