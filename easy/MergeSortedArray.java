package easy;

import java.util.Arrays;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * <p>
 * Note:
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 */
public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        int []temp = new int[m];
//        for(int i = 0; i< m;i++)
//            temp[i] = nums1[i];
//        int i = 0;
//        int j = 0;
//        int k = 0;
//        while(i<m&&j<n){
//            nums1[k++] = temp[i]>nums2[j]?nums2[j++]:temp[i++];
//        }
//        while (j<n){
//            nums1[k++] = nums2[j++];
//        }
//        while (i<m){
//            nums1[k++] = temp[i++];
//        }
        int i = m - 1, j = n - 1, size = m + n - 1;
        while (i > -1 && j > -1) {
            nums1[size--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }
        while (j > -1) {
            nums1[size--] = nums2[j--];
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{2, 0};
        int[] nums2 = new int[]{1};
        MergeSortedArray.merge(nums1, 1, nums2, 1);
    }
}
