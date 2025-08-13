public class DS326 {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        DS326 obj = new DS326();
        int n = 27; // Example input
        boolean result = obj.isPowerOfThree(n);
        System.out.println("Is " + n + " a power of three? " + result);
    }
}
