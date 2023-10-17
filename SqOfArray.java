import java.util.*;
public class SqOfArray{
    public static void SqFn(int nums[]) {
        int n=nums.length;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        // for(int i=0; i<n-1;i++){
        // for(int j=0; j<n-1-i;j++){
        //     if(nums[j]>nums[j+1]){
        //         int t=nums[j];
        //         nums[j]=nums[j+1];
        //         nums[j+1]=t;
        //     }
        // }

        // }
        Arrays.sort(nums);
    System.out.println("Array :"+Arrays.toString(nums));
}
 public static void main(String[] args){
    // int nums[] = {9,-2,1,2,6,7,-3,9,10};
    int nums[] = {-4,-1,0,3,10};
    System.out.println(" Given Array :"+Arrays.toString(nums));


    SqFn(nums);
 }
}