package easy;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

/**
 *  Given an array with n integers, your task is to check if it could become non-decreasing by modifying at most 1 element.

 We define an array is non-decreasing if array[i] <= array[i + 1] holds for every i (1 <= i < n).
 */
public class Nondecreasing {
    public static boolean checkPossibility(int[] nums) {
        int flag = 0;
        for(int i = 1; i<nums.length && flag<=1; i++)
        {
            if(nums[i-1] > nums[i]){
               flag++;
            if(i-2>=0 && nums[i-2] > nums[i])
                nums[i] = nums[i-1];
            else nums[i-1] = nums[i];
            }
        }
        return flag<=1;
    }


    public static void main(String[] args) {
        int [] nums = new int[]{2,3,3,2,4};
        System.out.println(Nondecreasing.checkPossibility(nums));
    }
}
