public class DS3477 {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int length = fruits.length;
        int ans = length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (fruits[i] <= baskets[j]) {
                    ans--;
                    baskets[j] = 0;
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        DS3477 obj = new DS3477();
        int fruits[] = { 4, 2, 5 };
        int baskets[] = { 3, 5, 4 };
        System.out.println(obj.numOfUnplacedFruits(fruits, baskets));
    }
}
