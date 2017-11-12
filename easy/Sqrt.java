package easy;

/**
 * Implement int sqrt(int x).
 * <p>
 * Compute and return the square root of x.
 * <p>
 * x is guaranteed to be a non-negative integer.
 */
public class Sqrt {
    public static int mySqrt(int x) {
        //Newton’s Iteration (牛顿迭代法)。x_new = ( x_old + y/x_old )/2
        //http://blog.punkid.org/2008/02/28/compute-the-square-root-via-newtons-iteration/
//        long r = x;
//        while (r*r > x)
//            r = (r + x/r) / 2;
//        return (int) r;
        //二分法
        if (0 == x) return 0;
        int ans = 0;
        int left = 1, right = x;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (mid <= (x / mid)) {
                left = mid + 1;
                ans = mid;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Sqrt.mySqrt(2147483647));
    }
}
