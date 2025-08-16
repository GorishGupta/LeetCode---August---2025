class DS1323 {
    public int maximum69Number(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == '6') {
                digits[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(digits));
    }

    public static void main(String[] args) {
        DS1323 obj = new DS1323();
        int num = 9669; // Example input
        int result = obj.maximum69Number(num);
        System.out.println("Maximum number after changing one digit: " + result);
    }
}