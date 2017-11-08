package easy;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.math.BigInteger;

/**
    Given a 32-bit signed integer, reverse digits of an integer.
 **/
public class reverseInteger {
    //    public static int reverse(int x) {
//        int isNegtive = 1;
//        if (x < 0){
//            isNegtive = -1;
//            x *= -1;
//        }
//
//       int result = 0;
//        StringBuilder sb = new StringBuilder();
//        while(x != 0){
//            sb.append(x%10);
//            x/=10;
//        }
//        String a = sb.toString();
//        try {
//            result = Integer.parseInt(a.trim());
//        }catch (Exception e){
//           return 0;
//        }
//        return (result*isNegtive);
//
//    }
    public static int reverse(int x) {
//        boolean neg = false;
//        if (x < 0)
//            neg = true;
//        x = Math.abs(x);
//        String a = Integer.valueOf(x).toString();
//        StringBuilder sb = new StringBuilder();
//        for (int i = a.length()-1;i>=0; i--) {
//            sb.append(a.charAt(i));
//        }
//        try {
//            int result = Integer.parseInt(sb.toString().trim()) * (neg ? -1 : 1);
//            return result;
//        } catch (Exception e) {
//            return 0;
//        }

        long result = 0;
        while (x != 0){
            result = result*10 + x%10;
            x/=10;
        }
        result = (result >Integer.MAX_VALUE  || result < Integer.MIN_VALUE)? 0 : result;
        return (int)result;
    }



    public static void main(String[] args) {
        System.out.println(reverseInteger.reverse(-2147483648));
    }
}
