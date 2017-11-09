package easy;

/**
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */
public class ImplementstrStr {
    public static int strStr(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();
        for(int i = 0; i <=len1 - len2; i++){
            if(needle.equals(haystack.substring(i,i+len2)))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String l = new String("heoll");
        String l2 = new String("ll");
        int i = ImplementstrStr.strStr(l,l2);
        System.out.println(i);
    }
}
