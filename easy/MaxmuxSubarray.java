package easy;

/**
 *  Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

 For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 */
public class MaxmuxSubarray {
    public int maxSubArray(int[] nums) {
       int maxEndingHere = nums[0],maxSoFar = nums[0]; //动态规划
       for(int i = 1;i<nums.length;i++){
           maxEndingHere = Math.max(maxEndingHere+nums[i],nums[i]);
           maxSoFar = Math.max(maxEndingHere,maxSoFar);
       }
       return maxSoFar;
    }



        private static int FindMaximumSubarray(int[] array, int low, int high) {
            if(high == low)
                return  array[low];
            int leftsum,rightsum,crosssum,max;
            int mid = (high + low)/2;
            leftsum = FindMaximumSubarray(array,low,mid);
            rightsum = FindMaximumSubarray(array,mid+1,high);
            crosssum = FindMaxCrossingSubarray(array,low,mid,high);
            if(leftsum >=rightsum && leftsum >=crosssum)
                return leftsum;
            else if(rightsum > leftsum && rightsum > crosssum)
                return rightsum;
            else
                return crosssum;

        }

        private static int FindMaxCrossingSubarray(int[] array, int low, int mid, int high) {
            int leftSum = -12767;
            int sum = 0;
            for(int i = mid; i >= low; i--){
                sum = sum + array[i];
                if(sum > leftSum){
                    leftSum = sum;
                }
            }
            int rightSum = -12767;
            sum = 0;
            for(int j = mid+1; j <= high; j++){
                sum += array[j];
                if(sum > rightSum)
                    rightSum = sum;
            }

            return leftSum+rightSum;
        }


    public static void main(String[] args) {
        int [] a = new int[]{-1,-1,-2,-2};
        MaxmuxSubarray m = new MaxmuxSubarray();
        System.out.println(FindMaximumSubarray(a,0,a.length-1));
    }

}
