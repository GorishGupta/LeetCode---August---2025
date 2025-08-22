class DS3195 {
    public int minimumArea(int[][] grid) {
        int minRow = grid.length, maxRow = -1;
        int minCol = grid[0].length, maxCol = -1;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    minRow = Math.min(minRow, i);
                    maxRow = Math.max(maxRow, i);
                    minCol = Math.min(minCol, j);
                    maxCol = Math.max(maxCol, j);
                }
            }
        }

        return (maxRow - minRow + 1) * (maxCol - minCol + 1);
    }

    public static void main(String[] args) {
        DS3195 obj = new DS3195();
        int[][] grid = {
                { 0, 0, 1, 0 },
                { 0, 1, 1, 1 },
                { 1, 1, 0, 0 },
                { 0, 0, 0, 1 }
        }; // Example input
        int result = obj.minimumArea(grid);
        System.out.println("Minimum area of rectangle enclosing all ones: " + result);
    }
}