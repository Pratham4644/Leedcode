class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            // Find the middle index (prevents integer overflow)
            int mid = left + (right - left) / 2;
            
            // Check if the target is at the middle
            if (nums[mid] == target) {
                return mid;
            }
            
            // If target is greater, ignore the left half
            if (nums[mid] < target) {
                left = mid + 1;
            } 
            // If target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }
        
        // Target was not found in the array
        return -1;
    }
}