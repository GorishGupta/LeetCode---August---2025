class DS1277 {
    public int countSquares(int[][] matrix) {
        // Get dimensions of the matrix
        int n = matrix.length; // number of rows
        int m = matrix[0].length; // number of columns
        int[][] dp = new int[n][m];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            dp[i][0] = matrix[i][0];
            ans += dp[i][0];
        }
        for (int j = 1; j < m; j++) {
            dp[0][j] = matrix[0][j];
            ans += dp[0][j];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == 1) {
                    dp[i][j] = 1 + Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]), dp[i - 1][j - 1]);
                }
                ans += dp[i][j];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        DS1277 obj = new DS1277();
        int[][] matrix = {
                { 0, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 0, 1, 1, 0 }
        }; // Example input
        int result = obj.countSquares(matrix);
        System.out.println("Total squares: " + result);
    }
}