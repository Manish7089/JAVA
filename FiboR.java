class FiboR{
   static int n1=0,n2=1,n3=0;
   static void fibonacciFn(int c) // Fibonacci series
    {
        if(c>0)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
            fibonacciFn(c-1);
        }
    }
    public static void main (String args[])
    {
       int count=10;
       System.out.print(n1+" "+n2);
       fibonacciFn(count-2);
    }
}