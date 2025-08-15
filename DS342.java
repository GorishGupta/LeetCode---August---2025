class DS342 {
    public boolean isPowerOfFour(int n) {
        if (n == 1) {
            return true;
        }
        if (n == 0) {
            return false;
        }
        if (n % 4 != 0) {
            return false;
        }
        return isPowerOfFour(n / 4);
    }

    public static void main(String[] args) {
        DS342 obj = new DS342();
        int n = 16; // Example input
        boolean result = obj.isPowerOfFour(n);
        System.out.println(n + " is a power of four: " + result);
    }
}