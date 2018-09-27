import java.util.*;

public class TwoStrings
{
 public static void main(String[] args) 
 {
   Scanner kb = new Scanner(System.in); 
   int num;
   String str1;
   String str2;
   
  //System.out.println("How many pairs would you like to make: ");
   num = kb.nextInt();
   
   //System.out.println("Enter " + 2*num + " strings: ");
   testCase:
     
   for(int counter = 0; counter < num; counter++)
   {
     
     str1 = kb.next();
     str2 = kb.next();
     boolean [] charSet = new boolean[26];
   
     for(int counter2 = 0; counter2 < str1.length(); counter2++)
     {
       charSet[str1.charAt(counter2)-'a'] = true;
     }
     
     for(int counter3 = 0; counter3 < str2.length(); counter3++)
     {
       if(charSet[str2.charAt(counter3) - 'a'])
       {
         System.out.println("YES");
         continue testCase;
       }
     }
         System.out.println("NO");
   }
   kb.close();
 }
}