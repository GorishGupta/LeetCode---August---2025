public class DS2348 {
    public long zeroFilledSubarray(int[] nums) {
        long cnt = 0, streak = 0;
        for (int num : nums) {
            streak = (num == 0) ? streak + 1 : 0;
            cnt += streak;
        }
        return cnt;
    }

    public static void main(String[] args) {
        DS2348 obj = new DS2348();
        int[] nums = { 1, 0, 0, 2, 0, 0, 0 }; // Example input
        long result = obj.zeroFilledSubarray(nums);
        System.out.println("Total zero-filled subarrays: " + result);
    }
}
