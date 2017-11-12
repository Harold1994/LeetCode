package easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

 You may assume the integer do not contain any leading zero, except the number 0 itself.

 The digits are stored such that the most significant digit is at the head of the list.
 */
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int c=1;
        int result = 0;
        for(int i = digits.length-1;i>=0&&c==1;i--){
            result = digits [i] + c;
            if(result>=10){
                digits[i] = result % 10;
                c = 1;
                continue;
            }else {
                digits[i] = result;
                c=0;
                break;
            }
        }
        if(c == 0)
            return digits;
        else {
            int [] a =new int[digits.length+1];
            a[0] = 1;
            int k = 1;
            for(int i=0;i<digits.length;i++){
                a[k++] = digits[i];

            }
            return a;
        }
    }

    public static void main(String[] args) {
        int [] nums = new int[]{9,9,9};
        System.out.println(Arrays.toString(PlusOne.plusOne(nums)));
    }
}
