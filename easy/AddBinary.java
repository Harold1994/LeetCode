package easy;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Stack;

public class AddBinary {
    public static String addBinary(String a, String b) {
//        int i = a.length()-1;
//        int j = b.length()-1;
//        int c = 0;
//        int sum = 0;
////        Stack<Integer> stack = new Stack<>();
//       while (i>=0&&j>=0){
//           sum = (int) a.charAt(i--) + (int) b.charAt(j--) + c - 96;
//           c = 0;
//           if(sum > 1){
//               c=1;
////               stack.push(sum%2);
//           }
//           else
//               stack.push(sum);
//       }
//
//       while (i>=0){
//           sum = (int)a.charAt(i--) + c - 48;//0 的Ascii码
//           c = 0;
//           if(sum>1){
//               c = 1;
//               stack.push(sum%2);
//           }
//           else stack.push(sum);
//       }
//
//        while (j>=0){
//            sum = (int)b.charAt(j--) + c - 48;
//            c = 0;
//            if(sum>1){
//                c = 1;
//                stack.push(sum%2);
//            }
//            else stack.push(sum);
//        }
//        if (c==1)
//            stack.push(c);
//        StringBuilder result = new StringBuilder();
//
//        while (!stack.isEmpty()){
//            result.append(stack.pop());
//        }
//        return result.toString();
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0) sum += b.charAt(j--) - '0';
            if (i >= 0) sum += a.charAt(i--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }


    public static void main(String[] args) {
        String a =  "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
        System.out.println(AddBinary.addBinary(a,b));
    }
}
