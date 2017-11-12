package easy;

/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 * <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * <p>
 * Note: Given n will be a positive integer.
 */
public class ClimbStairs {
    public int climbStairs(int n) {
//        if(n <= 2)
//            return n;
//        int [] steps = new int[n + 1];
//        steps[1] = 1;
//        steps[2] = 2;
//        for(int i = 3;i<=n;i++){
//            steps[i] = steps[i-1] + steps[i-2];
//        }
//        return steps[n];
        int pre = 1;
        int cur = 2;
        for (int i = 2; i < n; i++) {
            int tmp = cur;
            cur = cur + pre;
            pre = tmp;
        }
        return cur;
    }
}
