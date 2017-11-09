package easy;

/**
 * Given an array and a value, remove all instances of that value in-place and return the new length.

 Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

 The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */
public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
//        int i = nums.length;
//        int change = 0;
//        for(int j = nums.length-1;j>=0;j--){
//            if(nums[j] == val){
//                i--;
//                change++;
//                nums[j] = nums[i];
//            }
//        }
//        return nums.length-change;
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int [] a = new int[]{3,3};
        System.out.println(RemoveElement.removeElement(a,3));
    }

}
