package easy;

import java.util.HashSet;

/**
 *  Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.

 Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 */
public class RemoveDuplicatesSortedArray {
    public static int removeDuplicates(int[] nums) {
        if(nums.length<=1)
            return nums.length;
        int i = 0;
        for(int j = 1;j<nums.length;j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int [] a = new int[]{1,1,1,2,2,3};
        int b = RemoveDuplicatesSortedArray.removeDuplicates(a);
        System.out.println(b);
    }
}
