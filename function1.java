public class function1{
   public static int addition(int a, int b){
        return (a+b);
    }
    public static int subs(int a, int b){
        return (a-b);
    }
    public static int multiply(int a, int b){
        return (a*b);
    }
    public static int division(int a, int b){
        return (a/b);
    }
    public static void modulo(int a, int b){
        System.out.println("Remainder="+(a%b));
    }
    public static void main(String args[]){
        int n1=8;
        int n2=3;
        int sum=addition(n1,n2);
        // System.out.println(addition(n1,n2));
        int sub=subs(n1,n2);
        int mul=multiply(n1,n2);
        int div=division(n1,n2);
        int a1=-9;
        int a2=5;

        modulo(a1,a2);
        System.out.println("Sum="+sum+", Subs="+sub+", Multiply="+mul+", Division="+div);




    }
}