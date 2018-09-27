import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution 
{
    public static void main(String[] args)
    {
      Scanner kb = new Scanner(System.in);
      
      
      System.out.print("How many numbers would you like to input: ");
      int n = kb.nextInt();
      System.out.println("");
      
      System.out.print("How many left rotations would you like to make: ");
      int d = kb.nextInt();
      System.out.println("");
      
      int[] a1 = new int[n];
      int[] a2 = new int[n];
      
      System.out.println("Enter " + n + " integers: " );
      for(int counter = 0; counter < n; counter++)
      {
       a1[counter] = kb.nextInt(); 
      }
      
      for(int i = 0; i < n; i++)
      {
       if((i-d)<0)
       {
         a2[n+i-d] = a1[i];
       }
       else
       {
        a2[i-d] = a1[i]; 
       }
      }
      
      System.out.println("Your rotated array is: ");
      for(int i = 0; i < n; i++)
      {
       System.out.print(a2[i] + " "); 
      }
      
      System.out.println("");
      
       kb.close();
    } 
}
