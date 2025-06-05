package dp;

public class ClimbStairs
{
    public int getclimbStairs(int n) {
        int[] memo = new int[n + 1];

        return climbStairHelper(n,memo);
    }

    private int climbStairHelper(int n,int[] memo) {
        if(n == 0 || n== 1) {
            return n;
        }

        if (memo[n] != 0) {
            return memo[n];
        }

        memo[n] = climbStairHelper(n - 1,memo) + climbStairHelper(n - 2,memo);

        return memo[n];
    }

    public static void main(String[] args) {
        ClimbStairs climbStairs=new ClimbStairs();
        System.out.println(climbStairs.getclimbStairs(10));
    }
}
