class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int val = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            val += nums[i] * i;
        }

        int ans = val;

        for (int i = n - 1; i > 0; i--) {
            val += sum - nums[i] * n;
            ans = Math.max(ans, val);
        }

        return ans;
    }
}