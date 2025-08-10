import java.util.Arrays;

public class DS869 {
    public boolean reorderedPowerOf2(int n) {
        String target = sortedString(n);
        for (int i = 0; i < 31; i++) {
            if (sortedString(1 << i).equals(target))
                return true;
        }
        return false;
    }

    private String sortedString(int x) {
        char[] arr = String.valueOf(x).toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    public static void main(String[] args) {
        DS869 obj = new DS869();

        int n = 46; // Example input
        System.out.println("Can " + n + " be reordered to a power of two? " + obj.reorderedPowerOf2(n));
    }
}
