import java.util.*;
public class Palind
{  
 public static void main(String args[])
 {  System.out.print("Enter a number to check palindrome :");
   Scanner b = new Scanner(System.in);
    int n = b.nextInt();
  int r,sum=0,temp;    
  //int n=3;//It is the number variable to be checked for palindrome  
  
  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println(temp+ " is palindrome number ");    
  else    
   System.out.println(temp+" is not palindrome");    
}  
}  