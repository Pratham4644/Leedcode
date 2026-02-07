class Solution {
    public int minimumDeletions(String s) {
        int n = s.length();
        int deletions = 0;
        int countB = 0; // number of 'b's we've seen so far
        
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'b') {
                // Keep the 'b', no deletion needed
                countB++;
            } else {
                // Current char is 'a'
                // Option 1: Delete all previous 'b's to keep this 'a'
                // Option 2: Delete this 'a' to maintain the 'b' section
                // We choose the minimum
                deletions = Math.min(deletions + 1, countB);
            }
        }
        
        return deletions;
    }
}