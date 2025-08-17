public class DS837 {
    public double new21Game(int N, int K, int maxPts) {
        if (K == 0 || N >= K - 1 + maxPts)
            return 1.0;

        double[] dp = new double[maxPts];
        dp[0] = 1.0;
        double windowSum = 1.0, result = 0.0;

        for (int i = 1; i <= N; i++) {
            double prob = windowSum / maxPts;

            if (i < K) {
                windowSum += prob;
            } else {
                result += prob;
            }

            if (i >= maxPts) {
                windowSum -= dp[i % maxPts];
            }

            dp[i % maxPts] = prob;
        }

        return result;
    }

    public static void main(String[] args) {
        DS837 obj = new DS837();
        int N = 10; // Example input
        int K = 1; // Example input
        int maxPts = 10; // Example input
        double result = obj.new21Game(N, K, maxPts);
        System.out.println("Probability of winning: " + result);
    }
}
