package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class FindSumIndices {
//    public static int[] twoSum(int[] nums, int target) {
//        int [] result = new int[2];
//
//        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
//        for(int i = 0; i<nums.length; i++){
//            map.put(nums[i],i);
//        }
//        for(int i = 0; i<nums.length; i++){
//            int a = target - nums[i];
//            if(map.containsKey(a) && i != map.get(a)){
//
//                result[0] = i;
//                result[1] = map.get(a);
//                return result;
//            }
//        }
//        return null;
//    }

    public static int[] twoSum(int [] nums,int target){
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
        for(int i = 0; i<nums.length; i++){
            int r = target - nums[i];
            if(map.containsKey(r))
                 return new int[]{map.get(r),i};
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("no solution found");
    }

    public static void main(String[] args) {
        int [] nums = new int[]{3,2,4};

        System.out.println(Arrays.toString(FindSumIndices.twoSum(nums,6)));
    }
}
