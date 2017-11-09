package easy;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.

 Note:

 The given integer is guaranteed to fit within the range of a 32-bit signed integer.
 You could assume no leading zero bit in the integer’s binary representation.

 */
public class NumberComplement {
    public static int findComplement(int num) {
//        String origin = Integer.toBinaryString(num);
//        StringBuilder sb = new StringBuilder();
//        for(char i : origin.toCharArray()){
//            if(i=='0')
//                sb.append('1');
//            else sb.append('0');
//        }
//        int result = Integer.parseInt(sb.toString().trim() ,2);
//        System.out.println(result);
//        return result;
       // return ~num & ((Integer.highestOneBit(num)<<1) - 1);
        int i =0;
        int j = 0;
        while(i<num){
            i+=Math.pow(2,j);
            j++;
        }
        return i-num;
    }
    public static void main(String[] args) {
        System.out.println(NumberComplement.findComplement(5));

    }
}
