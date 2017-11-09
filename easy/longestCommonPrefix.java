package easy;

import org.omg.CORBA.INTERNAL;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 */
public class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE;
        int minStrIndex = 0;
        String minPrefix = "";
        for(String i:strs){
            if(i.length()<min)
                min = i.length();
                minPrefix = i;
        }

           while(!judge(strs,minPrefix)){
               minPrefix = minPrefix.substring(0,min--);
           }
           return minPrefix;
    }

    private boolean judge(String[] strs, String minPrefix) {
        for(String i : strs){
            if(!i.startsWith(minPrefix))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        longestCommonPrefix l = new longestCommonPrefix();
        String [] strs = new String[]{"abcdefg", "abcdefghijk", "abcdfghijk","abcef"};
        System.out.println(l.longestCommonPrefix(strs));
    }
}
