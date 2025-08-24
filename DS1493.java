public class DS1493 {

    public int longestSubarray(int[] nums) {
        int i = 0, j = 0, n = nums.length;
        int maxi = 0, count = 0;
        while (j < n) {
            if (nums[j] == 0) {
                count++;
            }
            while (count > 1) {
                if (nums[i] == 0) {
                    count--;
                }
                i++;
            }
            maxi = Math.max(maxi, j - i);
            j++;
        }

        return maxi;
    }

    public static void main(String[] args) {
        DS1493 obj = new DS1493();
        System.out.println(obj.longestSubarray(new int[] { 1, 1, 0, 1 }));
        System.out.println(obj.longestSubarray(new int[] { 0, 1, 1, 1, 0, 1, 1, 0, 1 }));
        System.out.println(obj.longestSubarray(new int[] { 1, 1, 1 }));
        System.out.println(obj.longestSubarray(new int[] { 1, 1, 0, 0, 1, 1, 1, 0, 1 }));
        System.out.println(obj.longestSubarray(new int[] { 0, 0, 0 }));
    }
}