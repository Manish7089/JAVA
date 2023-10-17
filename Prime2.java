import java.util.Scanner;
public class Prime2
{
static void Checkprime(int n)
{   
    int i,flag=0;
    
    if(n==0 || n==1){
        System.out.println(n+" is not prime num. ");
    }
    else
    {
        for(i=2;i<=n/2;i++)
        { if(n%i==0){
            System.out.println(n+" is not prime num .");
            flag=1;
            break;
           }
        }
        if (flag==0){
            System.out.println(n+" is prime num .");
           }

    }
    }
public static void main (String args[])
    {
        
        Checkprime(2);
        Checkprime(9);
        Checkprime(13);
        Checkprime(17);
        Checkprime(20);
        Checkprime(22);
        Checkprime(1);
}
}