package easy;

import com.sun.org.apache.xml.internal.resolver.readers.ExtendedXMLCatalogReader;

/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

 If the last word does not exist, return 0.
 */

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {

//        String [] a = s.split(" ");
//        return a.length>0 ? a[a.length-1].length() : 0;
        int length = s.length()-1;
        int count = 0;
        for(int i = length;i>0 && s.charAt(i)==' ';i--){
            length--;
        }
        for(int j = length;j>0&&s.charAt(j)!=' ';j--){
            count++;
        }
        return count;
        //return s.trim().length() - s.trim().lastIndexOf(" ") - 1;
    }

    public static void main(String[] args) {
        System.out.println(LengthOfLastWord.lengthOfLastWord(" "));
    }
}
