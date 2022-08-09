// Java program to check given year is leap year

import java.util.*;
import java.io.*;

class CheckLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Year to check: ");
        int year = sc.nextInt();
        
        if(year%4==0 && year%100==0 && year%400==0)
        {
            System.out.print(year +" is Leap Year");
        }
        else
        {
            System.out.print(year +" is not Leap Year");
        }
        
    }
}