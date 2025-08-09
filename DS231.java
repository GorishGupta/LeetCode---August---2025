public class DS231 {
    public boolean isPowerOfTwo(int n) {
        if (n < 1) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        while (n > 1) {
            if (n % 2 != 0) {
                return false;
            }
            n /= 2;
        }
        return true;
    }

    public static void main(String[] args) {
        DS231 obj = new DS231();

        int n = 16; // Example input
        System.out.println("Is " + n + " a power of two? " + obj.isPowerOfTwo(n));
    }
}
