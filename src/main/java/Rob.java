public class Rob {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int n = nums.length + 1;
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i - 1]);
        }
        return dp[n - 1];
    }
}
