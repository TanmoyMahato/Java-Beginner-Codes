/* 

Program to print half pyramid using alphabets
A
B B
C C C
D D D D
E E E E E

*/

import java.util.*;
import java.io.*;

public class Pattern3 {

  public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter value of n: ");
      int n = sc.nextInt();
      
      int limit=65;
      limit = limit + (n-1);
      for(int i=65; i<=limit; i++){
          for(int j=65; j<=i; j++){
              
              System.out.print((char)i);
          }
          System.out.println();
      }
      
  }
}