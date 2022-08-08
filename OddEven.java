//Java Program to Check Whether a Number is Even or Odd

import java.util.*;
import java.io.*;

class OddEven {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number to check for Even/Odd: ");
        int num = sc.nextInt();
        
        if(num % 2 == 0)
        {
         System.out.print(num + " is Even");
        }
        else
        {
         System.out.print(num + " is Odd");
        }

    }
}