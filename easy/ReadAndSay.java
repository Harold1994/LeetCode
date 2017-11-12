package easy;

import java.util.Queue;

/**
 * The count-and-say sequence is the sequence of integers with the first five terms as following:

 1.     1
 2.     11
 3.     21
 4.     1211
 5.     111221

 1 is read off as "one 1" or 11.
 11 is read off as "two 1s" or 21.
 21 is read off as "one 2, then one 1" or 1211.

 Given an integer n, generate the nth term of the count-and-say sequence.

 Note: Each term of the sequence of integers will be represented as a string.
 */
public class ReadAndSay {
    public static String countAndSay(int n) {
        StringBuilder curr = new StringBuilder("1");
        StringBuilder prev;
        char say;
        int count;
        for(int i = 1;i<n;i++){
            prev = curr;
            say = prev.charAt(0);
            curr = new StringBuilder();
            count = 1;

            for(int j = 1;j<prev.length();j++){
                if(prev.charAt(j) != prev.charAt(i)){
                    curr.append(count).append(say);
                    say = prev.charAt(j);
                    count = 1;
                }
                else count++;
            }
            curr.append(count).append(say);
        }
        return curr.toString();
    }

    public static void main(String[] args) {
        System.out.println(ReadAndSay.countAndSay(2));
    }
}
