class Solution {
    public int maxNumberOfBalloons(String text) {
        // Step 1: Initialize counters for the 5 required characters
        int b = 0, a = 0, l = 0, o = 0, n = 0;
        
        // Step 2: Count frequencies in the given text
        for (char ch : text.toCharArray()) {
            if (ch == 'b') b++;
            else if (ch == 'a') a++;
            else if (ch == 'l') l++;
            else if (ch == 'o') o++;
            else if (ch == 'n') n++;
        }
        
        // Step 3 & 4: Divide 'l' and 'o' by 2, then find the absolute minimum
        l = l / 2;
        o = o / 2;
        
        return Math.min(b, Math.min(a, Math.min(l, Math.min(o, n))));
    }
}