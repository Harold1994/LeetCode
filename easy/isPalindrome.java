package easy;

import java.util.HashSet;

/**
 * Determine whether an integer is a palindrome. Do this without extra space.

 click to show spoilers.
 Some hints:

 Could negative integers be palindromes? (ie, -1)

 If you are thinking of converting the integer to string, note the restriction of using extra space.

 You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?
 */
public class isPalindrome {
    public static boolean Palindrome(int x) {
//        if(x<0)
//            return false;
//        String str = Integer.valueOf(x).toString();
//        if(str.length() == 1)
//            return true;
//       if(str.length()%2 == 0) {
//           for (int i = 0; i < str.length() / 2; i++)
//               if (str.charAt(i) != str.charAt(str.length() - i - 1))
//                   return false;
//           return true;
//       }else {
//           int mid = str.length() / 2;
//           for (int i = str.length() / 2; i > 0; i--)
//               if (str.charAt(mid - i) != str.charAt(mid + i))
//                   return false;
//           return true;
//       }
        if(x<0 || (x%10 ==0 && x!=0))
            return false;
        int revertedNum = 0;
        while(x > revertedNum){
            revertedNum = revertedNum*10 + x%10;
            x /= 10;
        }
        return (x == revertedNum || x == revertedNum/10);
    }

    public static void main(String[] args) {

       System.out.println(isPalindrome.Palindrome(-123454321));
    }
}
