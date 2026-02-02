import java.util.*;

class Solution {
    public long minimumCost(int[] nums, int k, int dist) {
        int n = nums.length;
        int need = k - 1;
        
        TreeMap<Integer, Integer> small = new TreeMap<>();
        TreeMap<Integer, Integer> large = new TreeMap<>();
        long sumSmall = 0;
        int sizeSmall = 0;  // Track size directly
        int sizeLarge = 0;  // Track size directly
        
        // Initial window: indices [1, dist+1]
        for (int i = 1; i <= Math.min(dist + 1, n - 1); i++) {
            large.put(nums[i], large.getOrDefault(nums[i], 0) + 1);
            sizeLarge++;
        }
        
        // Move smallest 'need' elements to small
        while (sizeSmall < need && sizeLarge > 0) {
            int x = large.firstKey();
            int count = large.get(x);
            
            if (count == 1) large.remove(x);
            else large.put(x, count - 1);
            sizeLarge--;
            
            small.put(x, small.getOrDefault(x, 0) + 1);
            sizeSmall++;
            sumSmall += x;
        }
        
        long ans = sumSmall + nums[0];
        
        // Slide the window
        for (int i = dist + 2; i < n; i++) {
            // Remove outgoing element
            int out = nums[i - dist - 1];
            if (small.containsKey(out)) {
                int count = small.get(out);
                if (count == 1) small.remove(out);
                else small.put(out, count - 1);
                sizeSmall--;
                sumSmall -= out;
            } else {
                int count = large.get(out);
                if (count == 1) large.remove(out);
                else large.put(out, count - 1);
                sizeLarge--;
            }
            
            // Add incoming element to large
            int in = nums[i];
            large.put(in, large.getOrDefault(in, 0) + 1);
            sizeLarge++;
            
            // Rebalance: move from large to small if needed
            while (sizeSmall < need && sizeLarge > 0) {
                int x = large.firstKey();
                int count = large.get(x);
                
                if (count == 1) large.remove(x);
                else large.put(x, count - 1);
                sizeLarge--;
                
                small.put(x, small.getOrDefault(x, 0) + 1);
                sizeSmall++;
                sumSmall += x;
            }
            
            // Rebalance: move from small to large if needed
            while (sizeSmall > need) {
                int x = small.lastKey();
                int count = small.get(x);
                
                if (count == 1) small.remove(x);
                else small.put(x, count - 1);
                sizeSmall--;
                sumSmall -= x;
                
                large.put(x, large.getOrDefault(x, 0) + 1);
                sizeLarge++;
            }
            
            // Optimize: swap if small has larger element than large's smallest
            if (!small.isEmpty() && !large.isEmpty() && small.lastKey() > large.firstKey()) {
                int fromSmall = small.lastKey();
                int fromLarge = large.firstKey();
                
                int countSmall = small.get(fromSmall);
                if (countSmall == 1) small.remove(fromSmall);
                else small.put(fromSmall, countSmall - 1);
                
                int countLarge = large.get(fromLarge);
                if (countLarge == 1) large.remove(fromLarge);
                else large.put(fromLarge, countLarge - 1);
                
                small.put(fromLarge, small.getOrDefault(fromLarge, 0) + 1);
                large.put(fromSmall, large.getOrDefault(fromSmall, 0) + 1);
                
                sumSmall = sumSmall - fromSmall + fromLarge;
            }
            
            ans = Math.min(ans, sumSmall + nums[0]);
        }
        
        return ans;
    }
}