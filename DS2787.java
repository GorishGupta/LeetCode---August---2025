public class DS2787 {
    private static final int MOD = 1_000_000_007;

    public int numberOfWays(int n, int x) {
        long[] dp = new long[n + 1];
        dp[0] = 1;
        for (int i = 1; Math.pow(i, x) <= n; i++) {
            int power = (int) Math.pow(i, x);
            for (int sum = n; sum >= power; sum--) {
                dp[sum] = (dp[sum] + dp[sum - power]) % MOD;
            }
        }
        return (int) dp[n];
    }

    // main Function to test the implementation
    // This function is not part of the original problem but is added for testing
    // purposes.
    public static void main(String[] args) {
        DS2787 obj = new DS2787();
        int n = 10;
        int x = 2;
        int result = obj.numberOfWays(n, x);
        System.out.println("Number of ways to express " + n + " as the sum of unique integers raised to the power of "
                + x + ": " + result);
    }
}