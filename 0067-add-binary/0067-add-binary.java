class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        
        StringBuilder sb = new StringBuilder();
        
        while (i >= 0 || j >= 0 || carry == 1) {
            int t1 = 0, t2 = 0;
            
            if (i >= 0) {
                t1 = a.charAt(i) - '0';
                i--;
            }
            
            if (j >= 0) {
                t2 = b.charAt(j) - '0';
                j--;
            }
            
            int sum = t1 + t2 + carry;
            carry = sum / 2;
            sb.append(sum % 2);
        }
        
        return sb.reverse().toString();
    }
}
