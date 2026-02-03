class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (n < 4) return false; // Needs at least four elements

        // Step 1: find the end of the first increasing segment
        int p = 0;
        while (p < n - 2 && nums[p] < nums[p + 1]) {
            p++;
        }
        // If no increase segment found (p == 0), fail
        if (p == 0) {
            return false;
        }

        // Step 2: find the end of the decreasing segment
        int q = p;
        while (q < n - 1 && nums[q] > nums[q + 1]) {
            q++;
        }
        // If no decrease or no room for final segment, fail
        if (q == p || q == n - 1) {
            return false;
        }

        // Step 3: check third strictly increasing segment
        while (q < n - 1 && nums[q] < nums[q + 1]) {
            q++;
        }

        return q == n - 1;
    }
}
