//Java Program to Check Whether an Alphabet is Vowel or Consonant

import java.util.*;
import java.io.*;

class CheckVowel {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Character to check vowel: ");
        char value = sc.next().charAt(0);
        
        if(value=='a' || value=='e' || value=='i' || value=='o' || value=='u' || value=='A' || value=='E' || value=='I' || value=='O' || value=='U')
        {
         System.out.print(value + " is Vowel");
        }
        else
        {
         System.out.print(value + " is Consonant");
        }

    }
}