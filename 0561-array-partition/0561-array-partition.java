class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i+=2){
            if(i+1<nums.length){
                sum+=nums[i];
            }
        }
        return sum;
        
    }
    
}