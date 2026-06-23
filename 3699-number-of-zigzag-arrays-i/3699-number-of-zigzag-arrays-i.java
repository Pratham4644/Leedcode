class Solution {
    public int zigZagArrays(int n, int l, int r) {
        int MOD = 1_000_000_007;
        int m = r - l + 1;
        
        // dp[dir][x]
        // dir = 0: next move must be DOWN (< current x)
        // dir = 1: next move must be UP (> current x)
        long[][] dp = new long[2][m];
        
        // Base case: For length 1, each element can be chosen in 1 way.
        // Since it's the first element, it can transition either UP or DOWN next.
        for (int x = 0; x < m; x++) {
            dp[0][x] = 1;
            dp[1][x] = 1;
        }
        
        // Process for lengths from 2 to n
        for (int i = 2; i <= n; i++) {
            long[][] nextDp = new long[2][m];
            
            // To optimize transitions, compute prefix sums for dir=1 and suffix sums for dir=0
            long[] prefUp = new long[m];
            long currentPref = 0;
            for (int x = 0; x < m; x++) {
                currentPref = (currentPref + dp[1][x]) % MOD;
                prefUp[x] = currentPref;
            }
            
            long[] suffDown = new long[m];
            long currentSuff = 0;
            for (int x = m - 1; x >= 0; x--) {
                currentSuff = (currentSuff + dp[0][x]) % MOD;
                suffDown[x] = currentSuff;
            }
            
            // Fill the next DP layer
            for (int y = 0; y < m; y++) {
                // To have a next move DOWN (dir=0), the current transition to y must have been UP.
                // y must be > x, so x ranges from 0 to y-1.
                if (y > 0) {
                    nextDp[0][y] = prefUp[y - 1];
                }
                
                // To have a next move UP (dir=1), the current transition to y must have been DOWN.
                // y must be < x, so x ranges from y+1 to m-1.
                if (y < m - 1) {
                    nextDp[1][y] = suffDown[y + 1];
                }
            }
            
            dp = nextDp;
        }
        
        // Sum up all valid arrays of length n. 
        // Note: For length n, it doesn't matter what the *next* required direction would be,
        // but we must count each unique array exactly once. 
        // To avoid double-counting arrays of length n >= 2:
        // An array ending with an UP move satisfies the condition and is stored in dp[0][y].
        // An array ending with a DOWN move satisfies the condition and is stored in dp[1][y].
        long totalCount = 0;
        for (int x = 0; x < m; x++) {
            totalCount = (totalCount + dp[0][x] + dp[1][x]) % MOD;
        }
        
        return (int) totalCount;
    }
}