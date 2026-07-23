class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int prefix =1;
        int suffix = 1;
        int max_ans = Integer.MIN_VALUE;
        for(int i = 0 ; i<n;i++){
           if(prefix == 0) prefix = 1;
           if(suffix == 0) suffix =1;

           prefix*=nums[i];
           suffix*=nums[n-i-1];

           max_ans = Math.max(max_ans,Math.max(prefix,suffix));
        }
        return max_ans;
        
    }
}