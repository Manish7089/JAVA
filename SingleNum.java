import java.util.*;
public class SingleNum
{
    public static int Solution(int[] nums) {
        int result=0;
        for(int n :nums){
            result=result^n;
        }
       
        return result;
    }
    public static void main (String args[])
    {
//    int a[5]=[1,2,3,1,3];
   int[] numbers = new int[5];
    numbers[0] = 10;
        numbers[1] = 10;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 30;
 Solution(numbers);
}
}