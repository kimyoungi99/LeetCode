class Solution {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        for(int i = 0; i < dp.length; i++)
            dp[i] = 999999999;
        dp[0] = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = 1; j <= nums[i]; j++) {
                if(i + j < dp.length) {
                    if(dp[i + j] > dp[i] + 1)
                        dp[i + j] = dp[i] + 1;
                }
            }
        }
        return dp[nums.length - 1];
    }
}