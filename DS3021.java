public class DS3021 {
    public long flowerGame(int n, int m) {
        return 1L * n * m / 2;
    }

    public static void main(String[] args) {
        DS3021 obj = new DS3021();
        System.out.println(obj.flowerGame(3, 3)); // Output: 4
        System.out.println(obj.flowerGame(2, 2)); // Output: 2
        System.out.println(obj.flowerGame(3, 2)); // Output: 3
    }
}
