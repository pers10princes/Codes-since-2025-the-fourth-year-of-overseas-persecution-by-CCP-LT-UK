class Solution {
    public int compareBitonicSums(int[] nums) {
        final int n = nums.length;
        int i = 0;
        long a = 0;
        long d = 0;

        while (nums[i] < nums[++i]) {
            a += nums[i - 1];
        }

        while (i < n) {
            d += nums[i++];
        }

        if (a > d) {
            return 0;
        } else if (a < d) {
            return 1;
        } else {
            return -1;
        }
    }
}