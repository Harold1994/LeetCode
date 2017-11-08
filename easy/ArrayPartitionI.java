package easy;

import java.util.Arrays;

/**
 * Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
 */
public class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        int sum=0;
        Arrays.sort(nums);
        for(int i = 0; i<nums.length;i = i+2)
            sum+=i=nums[i];
        return sum;
    }
}
