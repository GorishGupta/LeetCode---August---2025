import java.util.*;

public class DS3446 {

    public int[][] sortMatrix(int[][] matrix) {
        Map<Integer, PriorityQueue<Integer>> diagonalMap = new HashMap<>();
        int rows = matrix.length, cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int key = i - j;
                diagonalMap.putIfAbsent(key, key < 0 ? new PriorityQueue<>()
                        : new PriorityQueue<>(Collections.reverseOrder()));
                diagonalMap.get(key).offer(matrix[i][j]);
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int key = i - j;
                matrix[i][j] = diagonalMap.get(key).poll();
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        DS3446 obj = new DS3446();
        int[][] matrix1 = {
                { 3, 3, 1, 1 },
                { 2, 2, 1, 2 },
                { 1, 1, 1, 2 }
        };
        int[][] sortedMatrix1 = obj.sortMatrix(matrix1);
        for (int[] row : sortedMatrix1) {
            System.out.println(Arrays.toString(row));
        }
        // Expected output:
        // [1, 1, 1, 1]
        // [2, 2, 2, 2]
        // [3, 3, 3, 2]

        int[][] matrix2 = {
                { 11, 25, 66, 1, 69, 7 },
                { 23, 55, 17, 45, 15, 52 },
                { 75, 31, 36, 44, 58, 8 },
                { 22, 27, 33, 25, 68, 4 },
                { 84, 28, 14, 11, 5, 50 }
        };
        int[][] sortedMatrix2 = obj.sortMatrix(matrix2);
        for (int[] row : sortedMatrix2) {
            System.out.println(Arrays.toString(row));
        }
        // Expected output:
        // [5, 7, 14, 1, 15, 50]
        // [11, 11, 25, 25, 52, 69]
        // [22, 23, 31, 36, 58, 66]
        // [27, 28, 33, 44, 55, 68]
        // [84, 75, 17 ,45 ,8 ,4]
    }
}
