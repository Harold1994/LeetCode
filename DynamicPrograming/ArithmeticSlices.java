package DynamicPrograming;

/**
 A sequence of number is called arithmetic if it consists of at least three elements and if the difference between any two consecutive elements is the same.

 For example, these are arithmetic sequence:

 1, 3, 5, 7, 9
 7, 7, 7, 7
 3, -1, -5, -9

 The following sequence is not arithmetic.

 1, 1, 2, 5, 7

 A zero-indexed array A consisting of N numbers is given. A slice of that array is any pair of integers (P, Q) such that 0 <= P < Q < N.

 A slice (P, Q) of array A is called arithmetic if the sequence:
 A[P], A[p + 1], ..., A[Q - 1], A[Q] is arithmetic. In particular, this means that P + 1 < Q.

 The function should return the number of arithmetic slices in the array A.
 */
public class ArithmeticSlices {
    //此方法会不断重复计算，数据量大时会超时，打败24.9
    public static int numberOfArithmeticSlices(int[] A) {
        int diff = 0;
        int num = 2;
        int result = 0;
        int len = A.length;
        int c = 0;
        if (len <=2)
            return  0;
        for (int i = 1; i<len; i++) {
            diff = A[i] - A[i-1];
            for (int j = i+1; j<len; j++) {
                if (diff == A[j] - A[j-1]) {
                    num++;
                    if (num >= 3)
                        result++;
                } else {
                    break;
                }
            }
            num = 2;
        }
        return result;
    }
    //只遍历一遍，击败100%
    public static int numberOfArithmeticSlices2(int[] A) {
        int diff = 0;
        int num = 2;
        int result = 0;
        int len = A.length;
        int i = 1;
        int j = 0;
        int count = 0;
        if (len <=2)
            return  0;
        while (i<len){
            diff = A[i] - A[i-1];
            count = 0;
            for (j = i+1; j<len; j++) {
                if (diff == A[j] - A[j-1]) {
                    num++;
                    if (num >= 3)
                        count += num - 2;
                } else {
                    break;
                }
            }
            result += count;
            i = j;
            num = 2;
        }
        return result;
    }





    public static void main(String[] args) {
        int [] a = new int[]{1,2,3,4,5,6,64,66,68};
        System.out.println(numberOfArithmeticSlices2(a));
    }
}
