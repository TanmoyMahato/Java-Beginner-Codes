// Java program to print day of week name using switch case

import java.util.*;
import java.io.*;

class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter day number: ");
        int day = sc.nextInt();
        
        switch(day){
            case 1:
                System.out.print("Monday");
            break;
            case 2:
                System.out.print("Tuesday");
            break;
            case 3:
                System.out.print("Wednesday");
            break;
            case 4:
                System.out.print("Thursday");
            break;
            case 5:
                System.out.print("Friday");
            break;
            case 6:
                System.out.print("Saturday");
            break;
            case 7:
                System.out.print("Sunday");
            break;
            default:
               System.out.print("Wrong Input");
            break;
        }
        
    }
}